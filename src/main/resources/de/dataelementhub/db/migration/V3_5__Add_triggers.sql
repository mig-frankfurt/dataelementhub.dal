-- Delete entries from the element_relation table when one of the local scoped identifiers is deleted
CREATE OR REPLACE FUNCTION remove_element_relations() RETURNS trigger AS
$$
BEGIN
    DELETE
    FROM element_relation er
    WHERE left_urn NOT IN (SELECT urn(si) FROM scoped_identifier si) AND
          left_source = (SELECT id
                         FROM "source" s
                         WHERE s.prefix = 'local' AND s.name = 'local' AND s.base_url = 'local')
       OR right_urn NOT IN (SELECT urn(si) FROM scoped_identifier si) AND
          right_source = (SELECT id
                          FROM "source" s
                          WHERE s.prefix = 'local' AND s.name = 'local' AND s.base_url = 'local');
    RETURN NULL;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER remove_element_relations
    AFTER DELETE
    ON "scoped_identifier"
EXECUTE PROCEDURE remove_element_relations();

-- Add a trigger to avoid duplicate identifiers on db level

CREATE OR REPLACE FUNCTION check_duplicate_scoped_identifier_element_types() RETURNS trigger AS
$$
BEGIN
    IF (SELECT count(*)
        FROM scoped_identifier_simplified
        WHERE identifier = NEW.identifier
        AND revision = NEW.revision
        AND namespace_id = NEW.namespace_id
        AND element_type = (
            SELECT element_type from element where id = NEW.element_id
            )
       ) > 0
    THEN
        RAISE EXCEPTION 'Identifier for this element type already used';
    END IF;

    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER forbid_duplicate_identifiers
    BEFORE INSERT
    ON "scoped_identifier"
FOR EACH ROW EXECUTE PROCEDURE check_duplicate_scoped_identifier_element_types();
