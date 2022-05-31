update scoped_identifier set element_type = 'VALUE_DOMAIN' where element_type::text ilike '%value_domain%';

-- migrate the "hidden" flag from element to scoped_identifier
update scoped_identifier set hidden = e.hidden
from element as e
where scoped_identifier.element_id = e.id;

insert into validation (
    element_id,
    datatype,
    subtype,
    format,
    unit_of_measure,
    maximum_characters
) select id,
    case
        when datatype = 'BOOLEAN' then 'BOOLEAN'::validation_datatype_type
        when datatype = 'TBD' then 'TBD'::validation_datatype_type
        when datatype = 'NUMERIC' then 'NUMERIC'::validation_datatype_type
        when datatype = 'DATE' then 'DATE'::validation_datatype_type
        when datatype = 'DATETIME' then 'DATE'::validation_datatype_type
        when datatype = 'STRING' then 'STRING'::validation_datatype_type
        when datatype = 'ENUMERATED' then 'NONE'::validation_datatype_type
    end,
    case
        when validation_type = 'INTEGER' then 'INTEGER'::validation_subtype_type
        when validation_type = 'INTEGERRANGE' then 'INTEGERRANGE'::validation_subtype_type
        when validation_type = 'FLOAT' then 'FLOAT'::validation_subtype_type
        when validation_type = 'FLOATRANGE' then 'FLOATRANGE'::validation_subtype_type
        when validation_type = 'DATE' then 'DATE'::validation_subtype_type
        when validation_type = 'DATETIME' then 'DATETIME'::validation_subtype_type
        when validation_type = 'REGEX' then 'REGEX'::validation_subtype_type
        when validation_type = 'NONE' and datatype = 'STRING' then 'PLAIN_TEXT'::validation_subtype_type
        when validation_type = 'TIME' then 'TIME'::validation_subtype_type
    end,
    case
        when validation_type = 'INTEGERRANGE' or datatype = 'FLOATRANGE' then replace(format, '<=', ':')
        when datatype = 'BOOLEAN' or "datatype" = 'TBD'  then null
        when validation_type = 'NONE' and datatype = 'STRING' then null
        else format
    end,
    unit_of_measure,
    case
        when datatype = 'STRING' then maximum_characters
    end
from element where element_type::text ilike '%value_domain%';
