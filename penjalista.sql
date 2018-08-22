drop database if exists penjalista;

create database penjalista default character set utf8;

use penjalista;

create table penjaliste(
sifra int not null primary key auto_increment,
naziv varchar(50) not null,
lat decimal (10,8),
lon decimal (11,8)
);

create table sektor(
sifra int not null primary key auto_increment,
naziv varchar(50) not null,
lat decimal (10,8),
lon decimal (11,8),
penjaliste int
);

create table smjer(
sifra int not null primary key auto_increment,
naziv varchar(50) not null,
ocjena varchar(3),
duzina int,
sektor int,
autor int
);

create table autor(
sifra int not null primary key auto_increment,
ime varchar(50),
prezime varchar(50)
);

create table penjac(
sifra int not null primary key auto_increment,
ime varchar(50) not null,
prezime varchar(50) not null,
rezultat varchar(100)
);

create table s_p(
smjer int,
penjac int
);

alter table s_p add foreign key (smjer) references smjer(sifra);
alter table s_p add foreign key (penjac) references penjac(sifra);
alter table smjer add foreign key (autor) references autor(sifra);
alter table sektor add foreign key (penjaliste) references penjaliste(sifra);
alter table smjer add foreign key (sektor) references sektor(sifra);



