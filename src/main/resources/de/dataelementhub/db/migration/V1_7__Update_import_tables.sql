CREATE TYPE process_status AS ENUM (
    'PROCESSING',
    'INTERRUPTED',
    'DONE');

ALTER TABLE staging ADD COLUMN converted_at timestamp;
ALTER TABLE staging ADD COLUMN converted_by INTEGER;
ALTER TABLE staging ADD COLUMN staged_element_id text;
ALTER TABLE staging ADD COLUMN members text;
ALTER TABLE staging DROP COLUMN parent_id;
ALTER TABLE staging DROP CONSTRAINT staging_element_fkey;
ALTER TABLE staging RENAME element_id TO scoped_identifier_id;

ALTER TABLE import ADD COLUMN status process_status;
