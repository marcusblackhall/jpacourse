GRANT CONNECT ON DATABASE bookdb TO readwrite;

create schema if not exists bookschema
GRANT USAGE ON SCHEMA bookschema TO readwrite

GRANT SELECT, INSERT, UPDATE, DELETE ON ALL TABLES IN SCHEMA bookschema TO readwrite

grant readwrite to bookuser

grant all privileges on database bookdb to bookadmin

select count(*) as nobooks from book