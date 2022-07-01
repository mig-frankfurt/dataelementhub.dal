create or replace function no_duplicate_valuedomain_identifiers() returns trigger as
$$
begin
    IF lower(NEW.element_type::text) like '%_value_domain'
        and NEW.version > 0
        and exists(
               SELECT *
               from scoped_identifier
               where lower(element_type::text) like '%_value_domain'
                 and identifier = new.identifier
                 and namespace_id = new.namespace_id
                 and "version" = new.version
           ) then
        raise exception 'duplicate identifier';
    else
        return new;
    end if;
end;
$$ language plpgsql;

create trigger no_duplicate_valuedomain_identifiers_trigger
    before insert or update
    on scoped_identifier
    for each row
execute procedure no_duplicate_valuedomain_identifiers();
