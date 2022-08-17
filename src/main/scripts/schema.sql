create schema if not exists bookschema;


drop table if exists bookschema.book;
--


CREATE TABLE bookschema.book
(
    id bigint NOT NULL,
    isbn character varying(255) COLLATE pg_catalog."default",
    publisher character varying(255) COLLATE pg_catalog."default",
    title character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT book_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS bookschema.book
    OWNER to bookadmin;

 CREATE SEQUENCE IF NOT EXISTS bookschema.hibernate_sequence
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE bookschema.hibernate_sequence
    OWNER TO bookadmin;
