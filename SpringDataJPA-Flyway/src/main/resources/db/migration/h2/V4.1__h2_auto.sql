drop table if exists book;
drop table if exists author;
drop table if exists author_uuid;
drop table if exists book_uuid;

create table book
(
    id        BIGINT GENERATED BY DEFAULT AS IDENTITY not null,
    isbn      varchar(255),
    publisher varchar(255),
    title     varchar(255),
    author_id BIGINT,
    primary key (id)
);

create table author
(
    id         BIGINT GENERATED BY DEFAULT AS IDENTITY not null,
    first_name varchar(255),
    last_name  varchar(255),
    primary key (id)
);

create table author_uuid(
	id         varchar(36) not null,
    first_name varchar(255),
    last_name varchar(255),
    primary key (id)
);
create table book_uuid (
                      id varbinary(16) not null,
                      isbn varchar(255),
                      publisher varchar(255),
                      title varchar(255),
                      primary key (id)
);