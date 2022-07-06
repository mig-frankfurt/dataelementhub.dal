-- migrate the "hidden" flag from element to scoped_identifier
UPDATE scoped_identifier
SET hidden = e.hidden
FROM element AS e
WHERE scoped_identifier.element_id = e.id;

INSERT INTO validation (
    element_id,
    datatype,
    subtype,
    format,
    unit_of_measure,
    maximum_characters
) SELECT id,
    case
        WHEN datatype = 'BOOLEAN' THEN 'BOOLEAN'::validation_datatype_type
        WHEN datatype = 'TBD' THEN 'TBD'::validation_datatype_type
        WHEN datatype = 'NUMERIC' THEN 'NUMERIC'::validation_datatype_type
        WHEN datatype = 'DATE' THEN 'DATE'::validation_datatype_type
        WHEN datatype = 'DATETIME' THEN 'DATE'::validation_datatype_type
        WHEN datatype = 'STRING' THEN 'STRING'::validation_datatype_type
        WHEN datatype = 'ENUMERATED' THEN 'ENUMERATED'::validation_datatype_type
    end,
    case
        WHEN validation_type = 'INTEGER' THEN 'INTEGER'::validation_subtype_type
        WHEN validation_type = 'INTEGERRANGE' THEN 'INTEGERRANGE'::validation_subtype_type
        WHEN validation_type = 'FLOAT' THEN 'FLOAT'::validation_subtype_type
        WHEN validation_type = 'FLOATRANGE' THEN 'FLOATRANGE'::validation_subtype_type
        WHEN validation_type = 'DATE' THEN 'DATE'::validation_subtype_type
        WHEN validation_type = 'DATETIME' THEN 'DATETIME'::validation_subtype_type
        WHEN validation_type = 'REGEX' THEN 'REGEX'::validation_subtype_type
        WHEN validation_type = 'NONE' AND datatype = 'STRING' THEN 'PLAIN_TEXT'::validation_subtype_type
        WHEN validation_type = 'TIME' THEN 'TIME'::validation_subtype_type
    end,
    case
        WHEN validation_type = 'INTEGERRANGE' OR datatype = 'FLOATRANGE' THEN replace(format, '<=', ':')
        WHEN datatype = 'BOOLEAN' OR "datatype" = 'TBD'  THEN NULL
        WHEN validation_type = 'NONE' AND datatype = 'STRING' THEN NULL
        WHEN format = 'ENUMERATED' THEN NULL
        ELSE format
    end,
    unit_of_measure,
    case
        WHEN datatype = 'STRING' AND maximum_characters > 0 THEN maximum_characters
    end
FROM element WHERE element_type::TEXT ILIKE '%value_domain%';
