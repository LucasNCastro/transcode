# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table auth_providers (
  id                        integer not null,
  name                      varchar(50) not null,
  constraint pk_auth_providers primary key (id))
;

create table conversions (
  id                        integer not null,
  date                      timestamp not null,
  size                      integer not null,
  url                       varchar(255) not null,
  provided_media_id         integer,
  converted_media_id        integer,
  user_id                   integer,
  constraint pk_conversions primary key (id))
;

create table medias (
  id                        integer not null,
  type                      varchar(10),
  constraint pk_medias primary key (id))
;

create table payments (
  id                        integer not null,
  date                      timestamp not null,
  amount                    float not null,
  user_id                   integer,
  promotion_id              integer,
  constraint pk_payments primary key (id))
;

create table promotions (
  id                        integer not null,
  name                      varchar(255) not null,
  price                     float,
  credits                   integer,
  created_on                timestamp not null,
  expired_on                timestamp,
  constraint pk_promotions primary key (id))
;

create table users (
  id                        integer not null,
  name                      varchar(255) not null,
  email                     varchar(255) not null,
  password                  varchar(1024),
  last_login                timestamp not null,
  created_on                timestamp not null,
  memory_left               float,
  auth_provider_id          integer,
  constraint uq_users_name unique (name),
  constraint uq_users_email unique (email),
  constraint pk_users primary key (id))
;

create sequence auth_provider_id_seq;

create sequence conversion_id_seq;

create sequence media_id_seq;

create sequence payment_id_seq;

create sequence promotion_id_seq;

create sequence user_id_seq;

alter table conversions add constraint fk_conversions_providedMedia_1 foreign key (provided_media_id) references medias (id);
create index ix_conversions_providedMedia_1 on conversions (provided_media_id);
alter table conversions add constraint fk_conversions_convertedMedia_2 foreign key (converted_media_id) references medias (id);
create index ix_conversions_convertedMedia_2 on conversions (converted_media_id);
alter table conversions add constraint fk_conversions_user_3 foreign key (user_id) references users (id);
create index ix_conversions_user_3 on conversions (user_id);
alter table payments add constraint fk_payments_user_4 foreign key (user_id) references users (id);
create index ix_payments_user_4 on payments (user_id);
alter table payments add constraint fk_payments_promotion_5 foreign key (promotion_id) references promotions (id);
create index ix_payments_promotion_5 on payments (promotion_id);
alter table users add constraint fk_users_authProvider_6 foreign key (auth_provider_id) references auth_providers (id);
create index ix_users_authProvider_6 on users (auth_provider_id);



# --- !Downs

drop table if exists auth_providers cascade;

drop table if exists conversions cascade;

drop table if exists medias cascade;

drop table if exists payments cascade;

drop table if exists promotions cascade;

drop table if exists users cascade;

drop sequence if exists auth_provider_id_seq;

drop sequence if exists conversion_id_seq;

drop sequence if exists media_id_seq;

drop sequence if exists payment_id_seq;

drop sequence if exists promotion_id_seq;

drop sequence if exists user_id_seq;

