-- The identified_element view was changed so that all rows got the prefix from their respective table
-- (formerly, the entries from the element table were not prefixed). This need to be reflected in the
-- functions using those tables

CREATE OR REPLACE FUNCTION urn(sc "scoped_identifier") RETURNS TEXT AS
$$
DECLARE var_element_type TEXT;
BEGIN
    var_element_type := lower((SELECT element_type FROM element e WHERE e.id = sc.element_id)::TEXT);

    IF (right((var_element_type), 13 ) = '_value_domain' ) THEN
        RETURN 'urn:' || (SELECT si_identifier FROM identified_element WHERE e_id = sc."namespace_id") ||
               ':' || 'valuedomain' || ':' || sc."identifier" || ':' || sc."revision";
    elsif (var_element_type = 'permissible_value' ) THEN
        RETURN 'urn:' || (SELECT si_identifier FROM identified_element WHERE e_id = sc."namespace_id") ||
               ':' || 'permittedvalue' || ':' || sc."identifier" || ':' || sc."revision";
    else
        RETURN 'urn:' || (SELECT si_identifier FROM identified_element WHERE e_id = sc."namespace_id") ||
               ':' || var_element_type || ':' || sc."identifier" || ':' || sc."revision";
    end if;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION get_scoped_identifier_by_urn(urn text) returns setof scoped_identifier AS
$$
begin
    return query
        SELECT *
        FROM scoped_identifier si
        WHERE si.id = (
                SELECT id from scoped_identifier_simplified sis where sis.urn = $1
            )
        limit 1
    ;
end;
$$ LANGUAGE plpgsql;

-- This is no longer needed and the "standard" function (get_scoped_identifier_by_urn) can be used
DROP FUNCTION get_namespace_scoped_identifier_by_urn;


CREATE OR REPLACE FUNCTION get_value_domain_scoped_identifier_by_dataelement_urn(urn text) RETURNS SETOF scoped_identifier AS
$$
SELECT *
FROM scoped_identifier si
WHERE si.element_id = (SELECT id from get_value_domain_by_urn($1))
  AND si.namespace_id IN (
    SELECT e_id
    from identified_element
    where e_element_type = 'NAMESPACE'
      and si_identifier::text = SPLIT_PART($1, ':', 2)
)
$$ LANGUAGE SQL;

CREATE OR REPLACE FUNCTION unique_identifier() RETURNS trigger AS
$body_start$
BEGIN
    IF lower(NEW.element_type::text) = 'namespace' THEN
        SELECT NEW.id,
               NEW.element_type,
               1,
               COALESCE(MAX(identifier) + 1, 1),
               'none'::text,
               NEW.created_by,
               NEW.status,
               NEW.element_id,
               NEW.namespace_id
        INTO NEW
        FROM "scoped_identifier_simplified"
        WHERE element_type = NEW.element_type;
        RETURN NEW;
    ELSIF lower(NEW.element_type::text) like '%_value_domain' THEN
        SELECT NEW.id,
               NEW.element_type,
               1,
               COALESCE(MAX(identifier) + 1, 1),
               'none'::text,
               NEW.created_by,
               NEW.status,
               NEW.element_id,
               NEW.namespace_id
        INTO NEW
        FROM "scoped_identifier_simplified"
        WHERE lower(element_type::text) like '%_value_domain'
          AND namespace_id = NEW.namespace_id;
        RETURN NEW;
    ELSE
        SELECT NEW.id,
               NEW.element_type,
               1,
               COALESCE(MAX(identifier) + 1, 1),
               'none'::text,
               NEW.created_by,
               NEW.status,
               NEW.element_id,
               NEW.namespace_id
        INTO NEW
        FROM "scoped_identifier_simplified"
        WHERE element_type = NEW.element_type
          AND namespace_id = NEW.namespace_id;
        RETURN NEW;
    END IF;
END;
$body_start$ LANGUAGE plpgsql;
