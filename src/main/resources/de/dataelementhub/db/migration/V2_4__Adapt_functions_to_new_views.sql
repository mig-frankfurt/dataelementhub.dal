-- The identified_element view was changed so that all rows got the prefix from their respective table
-- (formerly, the entries from the element table were not prefixed). This need to be reflected in the
-- functions using those tables

CREATE OR REPLACE FUNCTION urn(sc "scoped_identifier") RETURNS TEXT AS
$$
begin
    if (right((lower(sc."element_type"::text)), 13 ) = '_value_domain' ) THEN
        RETURN 'urn:' || (SELECT si_identifier FROM identified_element WHERE e_id = sc."namespace_id") ||
               ':' || 'valuedomain' || ':' || sc."identifier" || ':' || sc."version";
    elsif (lower(sc."element_type"::text) = 'permissible_value' ) THEN
        RETURN 'urn:' || (SELECT si_identifier FROM identified_element WHERE e_id = sc."namespace_id") ||
               ':' || 'permittedvalue' || ':' || sc."identifier" || ':' || sc."version";
    else
        RETURN 'urn:' || (SELECT si_identifier FROM identified_element WHERE e_id = sc."namespace_id") ||
               ':' || lower(sc."element_type"::text) || ':' || sc."identifier" || ':' || sc."version";
    end if;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_scoped_identifier_by_urn(urn text) returns setof scoped_identifier AS
$$
begin
    if (lower(SPLIT_PART(urn, ':', 3)) = 'permittedvalue' ) then
        return query
            SELECT *
            FROM scoped_identifier si
            WHERE si.element_type::text = 'PERMISSIBLE_VALUE'
              AND si.identifier::text = SPLIT_PART(urn, ':', 4)
              AND si.version::text = SPLIT_PART(urn, ':', 5)
              AND si.namespace_id IN (
                SELECT e_id
                from identified_element
                where e_element_type = 'NAMESPACE'
                  and si_identifier::text = SPLIT_PART(urn, ':', 2)
            )
            limit 1
        ;
    else
        return query
            SELECT *
            FROM scoped_identifier si
            WHERE si.element_type::text = UPPER(SPLIT_PART(urn, ':', 3))
              AND si.identifier::text = SPLIT_PART(urn, ':', 4)
              AND si.version::text = SPLIT_PART(urn, ':', 5)
              AND si.namespace_id IN (
                SELECT e_id
                from identified_element
                where e_element_type = 'NAMESPACE'
                  and si_identifier::text = SPLIT_PART(urn, ':', 2)
            )
            limit 1
        ;
    end if;
end;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_value_domain_scoped_identifier_by_dataelement_urn(urn text) RETURNS SETOF scoped_identifier AS
$$
SELECT *
FROM scoped_identifier si
WHERE si.element_id = (SELECT id from get_value_domain_by_urn(urn))
  AND si.namespace_id IN (
    SELECT e_id
    from identified_element
    where e_element_type = 'NAMESPACE'
      and si_identifier::text = SPLIT_PART(urn, ':', 2)
)
$$ LANGUAGE SQL;
