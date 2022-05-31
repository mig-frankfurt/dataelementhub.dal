CREATE TYPE validation_datatype_type AS ENUM (
    'NONE',
    'BOOLEAN',
    'STRING',
    'NUMERIC',
    'DATE',
    'TBD'
    );

CREATE TYPE validation_subtype_type AS ENUM (
    'PLAIN_TEXT',
    'REGEX',
    'INTEGER',
    'FLOAT',
    'INTEGERRANGE',
    'FLOATRANGE',
    'DATE',
    'DATETIME',
    'TIME'
    );

ALTER TYPE element_type ADD VALUE 'VALUE_DOMAIN';

CREATE TABLE IF NOT EXISTS validation
(
    id                 serial primary key,
    element_id         integer                  not null,
    datatype           validation_datatype_type not null,
    subtype            validation_subtype_type,
    format             text,
    unit_of_measure    text,
    maximum_characters integer,
    CONSTRAINT element_id_fkey FOREIGN KEY (element_id) REFERENCES element (id) ON DELETE CASCADE
);

ALTER TABLE scoped_identifier
    add column hidden bool;

-- The element type constraint has to be modified to allow just "VALUE_DOMAIN" in the scoped identifier table

CREATE OR REPLACE FUNCTION getelementtype(id integer)
    RETURNS element_type
    LANGUAGE sql
AS
$function$
SELECT
    CASE
        WHEN "element_type"::TEXT ilike '%value_domain%' then 'VALUE_DOMAIN'
        ELSE "element_type"
    END
from "element"
WHERE "id" = $1
$function$
;
