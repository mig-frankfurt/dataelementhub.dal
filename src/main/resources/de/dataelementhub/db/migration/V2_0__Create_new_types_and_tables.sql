CREATE TYPE validation_datatype_type AS ENUM (
    'NONE',
    'BOOLEAN',
    'STRING',
    'NUMERIC',
    'DATE',
    'ENUMERATED',
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

-- This constraint is no longer viable when removing element type from the scoped identifier table
-- It has to be dropped before trying to insert the hidden flag in the next script, so it is done here
-- To re-enable the "old" functionality, a trigger should be written before insert on the scoped
-- identifier table.
-- The function "getelementtype" was only used by this constraint, so it can also be dropped
ALTER TABLE scoped_identifier DROP CONSTRAINT et_check;
DROP FUNCTION getelementtype;

ALTER TABLE concepts RENAME TO concept;
ALTER TABLE concept_element_associations RENAME TO concept_element_association;

ALTER TABLE scoped_identifier ADD COLUMN hidden bool;
ALTER TABLE scoped_identifier RENAME COLUMN version TO revision;

ALTER TABLE import ADD FOREIGN KEY (created_by) REFERENCES dehub_user (id) ON DELETE CASCADE;
ALTER TABLE import ADD FOREIGN KEY (namespace_id) REFERENCES element (id) ON DELETE CASCADE;

ALTER TABLE staging ADD FOREIGN KEY (converted_by) REFERENCES dehub_user (id) ON DELETE CASCADE;
ALTER TABLE staging ADD FOREIGN KEY (scoped_identifier_id) REFERENCES scoped_identifier (id) ON DELETE CASCADE;

ALTER TABLE concept ADD FOREIGN KEY (created_by) REFERENCES dehub_user (id) ON DELETE CASCADE;

ALTER TABLE concept_element_association ADD FOREIGN KEY (created_by) REFERENCES dehub_user (id) ON DELETE CASCADE;
