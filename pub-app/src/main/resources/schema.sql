create table PUB (
  id integer not null primary key auto_increment,
  name varchar2(64) not null,
  type varchar2(64) not null,
  rating integer not null,
  lat number,
  lon number,
  postalcode varchar2(8),
);
create table INFO (
  id integer not null primary key auto_increment,
  type varchar2(64) not null,
  info varchar2(64) not null ,
);