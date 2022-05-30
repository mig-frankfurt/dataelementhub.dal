update scoped_identifier set element_type = 'VALUE_DOMAIN' where element_type like '%VALUE_DOMAIN%';

-- migrate the "hidden" flag from element to scoped_identifier
update scoped_identifier set hidden = e.hidden
from element as e
where scoped_identifier.element_id = e.id;
