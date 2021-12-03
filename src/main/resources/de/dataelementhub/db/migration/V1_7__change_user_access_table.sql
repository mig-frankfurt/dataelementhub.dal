CREATE TYPE access_type AS ENUM (
    'READ',
    'WRITE',
    'ADMIN');

CREATE TABLE user_namespace_access
(
    user_id      INTEGER    NOT NULL,
    namespace_id INTEGER    NOT NULL,
    "access_type" access_type NULL,
    CONSTRAINT user_namespace_access_unique UNIQUE (user_id, namespace_id)
);

CREATE INDEX user_namespace_access_namespace_id_idx ON public.user_namespace_access USING btree (namespace_id);
CREATE INDEX user_namespace_access_user_id_idx ON public.user_namespace_access USING btree (user_id);

ALTER TABLE user_namespace_access
    ADD CONSTRAINT user_namespace_access_namespace_fkey FOREIGN KEY (namespace_id) REFERENCES element (id) ON DELETE CASCADE;
ALTER TABLE user_namespace_access
    ADD CONSTRAINT user_namespace_access_user_fkey FOREIGN KEY (user_id) REFERENCES dehub_user (id) ON DELETE CASCADE;

INSERT INTO user_namespace_access (user_id, namespace_id, access_type)
SELECT user_id, namespace_id, grant_type::TEXT::access_type from user_namespace_grants;

drop table user_namespace_grants;
drop type grant_type;
