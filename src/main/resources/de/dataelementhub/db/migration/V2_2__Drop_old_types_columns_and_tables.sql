drop view identified_element;
drop view listview_element;

drop table config;
drop table permissible_code;

alter table scoped_identifier drop column url;

alter table element drop column hidden;
alter table element drop column scoped_identifier_id;
alter table element drop column code;
alter table element drop column is_valid;
alter table element drop column format;
alter table element drop column datatype;
alter table element drop column unit_of_measure;
alter table element drop column maximum_characters;
alter table element drop column description;
alter table element drop column validation_type;
alter table element drop column validation_data;
alter table element drop column data;
