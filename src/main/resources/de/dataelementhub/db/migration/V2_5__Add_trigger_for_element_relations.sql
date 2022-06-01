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
