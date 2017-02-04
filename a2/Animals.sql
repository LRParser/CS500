drop table Animals;
drop table Habitats;

create table Habitats (
  hid integer  primary key,
  name varchar(64) not null unique
);

create table Animals (
  aid integer primary key,
  name varchar(64) not null,
  hid integer,
  foreign key (hid) references Habitats (hid)
);

insert into Habitats (hid, name) values (101, 'African savanna');
insert into Habitats (hid, name) values (102, 'North Pacific ocean');
insert into Habitats (hid, name) values (103, 'Eurasian tundra');

insert into Animals (aid, name, hid) values (1, 'elephant', 101);
insert into Animals (aid, name, hid) values (2, 'giraffe', 101);
insert into Animals (aid, name, hid) values (3, 'whale', 102);
insert into Animals (aid, name, hid) values (4, 'dolphin', 102);
insert into Animals (aid, name) values (5, 'okapi');


