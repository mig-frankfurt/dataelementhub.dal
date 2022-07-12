DROP VIEW identified_element;
DROP VIEW listview_element;

DROP TABLE config;
DROP TABLE permissible_code;

ALTER TABLE scoped_identifier DROP COLUMN url;
ALTER TABLE scoped_identifier DROP COLUMN element_type;
ALTER TABLE scoped_identifier DROP COLUMN uuid;

ALTER TABLE element DROP COLUMN hidden;
ALTER TABLE element DROP COLUMN scoped_identifier_id;
ALTER TABLE element DROP COLUMN code;
ALTER TABLE element DROP COLUMN is_valid;
ALTER TABLE element DROP COLUMN format;
ALTER TABLE element DROP COLUMN datatype;
ALTER TABLE element DROP COLUMN unit_of_measure;
ALTER TABLE element DROP COLUMN maximum_characters;
ALTER TABLE element DROP COLUMN description;
ALTER TABLE element DROP COLUMN validation_type;
ALTER TABLE element DROP COLUMN validation_data;
ALTER TABLE element DROP COLUMN data;
ALTER TABLE element DROP COLUMN uuid;
ALTER TABLE element DROP COLUMN external_id;

ALTER TABLE import DROP COLUMN uuid;
