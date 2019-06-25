create database usuario;
use usuario;

create table usuario (
    primary key(id),
	id varchar(10) not null,
    login varchar(60) not null,
    senha varchar(10) not null

);
Insert into usuario values(1,"daniel","daniel");
