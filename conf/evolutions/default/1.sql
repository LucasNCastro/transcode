# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table conversion (
  id                        integer not null,
  date                      timestamp not null,
  size                      integer not null,
  url                       varchar(255) not null,
  provided_media_id         integer,
  converted_media_id        integer,
  user_id                   integer,
  constraint pk_conversion primary key (id))
;

create table media (
  id                        integer not null,
  type                      varchar(10),
  price_schema_id           integer,
  constraint pk_media primary key (id))
;

create table price_schema (
  id                        integer not null,
  price                     float,
  constraint pk_price_schema primary key (id))
;

create table user_account (
  id                        integer not null,
  name                      varchar(255),
  email                     varchar(255) not null,
  password                  varchar(1024) not null,
  last_login                timestamp,
  constraint pk_user_account primary key (id))
;

create sequence conversion_seq;

create sequence media_seq;

create sequence price_schema_seq;

create sequence user_account_seq;

alter table conversion add constraint fk_conversion_providedMedia_1 foreign key (provided_media_id) references media (id);
create index ix_conversion_providedMedia_1 on conversion (provided_media_id);
alter table conversion add constraint fk_conversion_convertedMedia_2 foreign key (converted_media_id) references media (id);
create index ix_conversion_convertedMedia_2 on conversion (converted_media_id);
alter table conversion add constraint fk_conversion_user_3 foreign key (user_id) references user_account (id);
create index ix_conversion_user_3 on conversion (user_id);
alter table media add constraint fk_media_priceSchema_4 foreign key (price_schema_id) references price_schema (id);
create index ix_media_priceSchema_4 on media (price_schema_id);



# --- !Downs

drop table if exists conversion cascade;

drop table if exists media cascade;

drop table if exists price_schema cascade;

drop table if exists user_account cascade;

drop sequence if exists conversion_seq;

drop sequence if exists media_seq;

drop sequence if exists price_schema_seq;

drop sequence if exists user_account_seq;

