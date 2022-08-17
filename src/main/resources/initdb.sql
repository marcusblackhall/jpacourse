CREATE ROLE bookadmin LOGIN SUPERUSER PASSWORD 'marcus';

CREATE DATABASE bookdb WITH OWNER bookadmin;

create schema bookschema;
