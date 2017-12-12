
create database library;
use library;

CREATE TABLE osoby (
	id_osoby int,
    name varchar (25) NOT NULL,
    last varchar(25) NOT NULL,
    login varchar(25) NOT NULL,
    pass varchar(15) NOT NULL,
    active boolean, 
    PRIMARY KEY (id_osoby)
);

create table lokalizacja (
id_lok int,
miejsce varchar(30),
opis varchar(100),
primary key (id_lok)
);

create table gatunek (
id_gat int,
gatunek varchar(30),
primary key (id_gat)
);

create table role (
id_roli int,
rola varchar(10),
primary key (id_roli)
);

create table wydawnictwo (
id_wyd int,
name_wyd varchar(200),
primary key(id_wyd)
);

create table stan (
id_stan int,
stan varchar(50),
primary key(id_stan)
);

create table osoba_rola (
id_osoby int,
id_roli int,
foreign key(id_osoby) references osoby(id_osoby),
foreign key(id_roli) references role(id_roli) 
);

CREATE table books (
	id_book int,
	title varchar(150) NOT NULL,
    author varchar(150) NOT NULL,
    wyd int,
    ISBN varchar(50),
    price double(5,2),
    stan int,
    lokalizacja int,
    primary key(id_book),
    foreign key(wyd) references wydawnictwo(id_wyd),
    foreign key(stan) references stan(id_stan),
	foreign key(lokalizacja) references lokalizacja(id_lok)
);


create table books_gat (
id_book int,
id_gat int,
foreign key(id_gat) references gatunek(id_gat),
foreign key(id_book) references books(id_book)
);

create table prezent (
id int,
id_book int,
osoba varchar(250),
opis varchar(250),
primary key(id),
foreign key(id_book) references books(id_book)
);

create table pozyczone (
id int,
id_book int,
osoba varchar(250),
data date,
oddana boolean,
opis varchar(250),
primary key(id),
foreign key(id_book) references books(id_book)
);


create table przeczytana (
id int,
id_book int,
id_osoby int,
data date,
opis varchar(250),
primary key(id),
foreign key(id_book) references books(id_book),
foreign key(id_osoby) references osoby(id_osoby)
);


/* insert into book(id_book, title, author, wyd, ISBN, price) values 
(1, "Winlandia", "George Mackay Brown", "Wiatr od morza", "978-83-943523-5-6", 	27.73),
(2, "Ten i tamten las", "Magdalena Tulli", "Wilk&Król", "978-83-650891-2-0", 36.43), 
(3, "Couchsurfing w Iranie. (Nie)codzienne życie Persów", "Stephan Orth", "Wydawnictwo Uniwersytetu Jagiellońskiego", "978-83-233-4244-1", 30.39), 
(4, "Inni niż my", "Tommi Kinnunen", "W.A.B. / GW Foksal", "978-83-280-4759-4", 24.69), 
(5, "Frida Kahlo prywatnie", "Suzanne Barbezat", "Marginesy", "978-83-65780-49-2", 36.99), 
(6, "Jeden dzień", "Aleksandra Mizielińska,  Daniel Mizieliński", "Dwie siostry", "978-83-643470-1-6", 36.99); */




