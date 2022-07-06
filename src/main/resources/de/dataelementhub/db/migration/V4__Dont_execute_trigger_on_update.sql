drop trigger no_duplicate_valuedomain_identifiers_trigger on scoped_identifier;

create trigger no_duplicate_valuedomain_identifiers_trigger
    before insert
    on scoped_identifier
    for each row
execute procedure no_duplicate_valuedomain_identifiers();
