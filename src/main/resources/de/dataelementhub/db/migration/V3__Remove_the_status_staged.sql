drop view if exists listview_element;
drop view if exists identified_element;

ALTER TYPE status RENAME TO status_old;
CREATE TYPE status AS ENUM (
    'DRAFT',
    'RELEASED',
    'OUTDATED');
ALTER TABLE scoped_identifier ALTER COLUMN status TYPE status USING status::text::status;
DROP TYPE status_old;

CREATE OR REPLACE VIEW identified_element AS
SELECT si.id           as si_id,
       si.identifier   as si_identifier,
       si.version      as si_version,
       si.status       as si_status,
       si.namespace_id as si_namespace_id,
       e.*
FROM scoped_identifier si
         LEFT JOIN element ns
                   ON si.namespace_id = ns.id
         LEFT JOIN ELEMENT e
                   ON e.id = si.element_id;

CREATE OR REPLACE VIEW listview_element AS
SELECT si.id           as si_id,
       si.identifier   as si_identifier,
       si.version      as si_version,
       si.status       as si_status,
       si.namespace_id as si_namespace_id,
       vd.datatype     as vd_datatype,
       e.*
FROM scoped_identifier si
         LEFT JOIN element ns
                   ON si.namespace_id = ns.id
         LEFT JOIN ELEMENT e
                   ON e.id = si.element_id
         LEFT JOIN ELEMENT vd
                   ON e.element_id = vd.id;