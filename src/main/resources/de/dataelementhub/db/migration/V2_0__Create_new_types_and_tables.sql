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
    id              serial primary key,
    element_id      integer                  not null,
    datatype        validation_datatype_type not null,
    subtype         validation_subtype_type,
    format          text,
    unit_of_measure text,
    CONSTRAINT element_id_fkey FOREIGN KEY (element_id) REFERENCES element (id) ON DELETE CASCADE
);

ALTER TABLE scoped_identifier add column hidden bool;
