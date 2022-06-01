CREATE OR REPLACE VIEW identified_element AS
SELECT si.id                as si_id,
       si.identifier        as si_identifier,
       si.version           as si_version,
       si.status            as si_status,
       si.namespace_id      as si_namespace_id,
       e.id                 as e_id,
       e.element_type       as e_element_type,
       e.created_by         as e_created_by,
       e.element_id         as e_element_id,
       e.permitted_value    as e_permitted_value,
       e.uuid               as e_uuid,
       e.external_id        as e_external_id,
       v.id                 as v_id,
       v.element_id         as v_element_id,
       v.datatype           as v_datatype,
       v.subtype            as v_subtype,
       v.format             as v_format,
       v.unit_of_measure    as v_unit_of_measure,
       v.maximum_characters as v_maximum_characters
FROM scoped_identifier si
         LEFT JOIN element ns
                   ON si.namespace_id = ns.id
         LEFT JOIN ELEMENT e
                   ON e.id = si.element_id
         LEFT JOIN validation v
                   ON e.id = v.element_id;

CREATE OR REPLACE VIEW listview_element AS
SELECT si.id                as si_id,
       si.identifier        as si_identifier,
       si.version           as si_version,
       si.status            as si_status,
       si.namespace_id      as si_namespace_id,
       e.id                 as e_id,
       e.element_type       as e_element_type,
       e.created_by         as e_created_by,
       e.element_id         as e_element_id,
       e.permitted_value    as e_permitted_value,
       e.uuid               as e_uuid,
       e.external_id        as e_external_id,
       v.id                 as v_id,
       v.element_id         as v_element_id,
       v.datatype           as v_datatype,
       v.subtype            as v_subtype,
       v.format             as v_format,
       v.unit_of_measure    as v_unit_of_measure,
       v.maximum_characters as v_maximum_characters
FROM scoped_identifier si
         LEFT JOIN element ns
                   ON si.namespace_id = ns.id
         LEFT JOIN ELEMENT e
                   ON e.id = si.element_id
         LEFT JOIN ELEMENT vd
                   ON e.element_id = vd.id
         LEFT JOIN validation v
                   ON e.id = v.element_id;
