create table book (
  id int generated by default as identity (start with 1) primary key,
  name varchar(25) not null
);