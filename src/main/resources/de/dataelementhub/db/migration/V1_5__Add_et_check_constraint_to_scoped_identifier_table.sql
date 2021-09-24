-- The functions are created after the tables, so the function is not known on table creation
ALTER TABLE scoped_identifier ADD CONSTRAINT et_check CHECK (element_type = getelementtype(element_id));