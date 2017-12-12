create database library;
use library;
CREATE TABLE logowanie (
    login varchar(25) NOT NULL,
    pass varchar(15) NOT NULL,
    PRIMARY KEY (login)
);

insert into logowanie values ('admin', 'admin');
select * from logowanie;

CREATE table book (
	id_book int,
	title varchar(150) NOT NULL,
    author varchar(150) NOT NULL,
    wyd varchar(150),
    ISBN varchar(50),
    price double(5,2),
    primary key(id_book)
);

insert into book(id_book, title, author, wyd, ISBN, price) values 
(1, "Winlandia", "George Mackay Brown", "Wiatr od morza", "978-83-943523-5-6", 	27.73),
(2, "Ten i tamten las", "Magdalena Tulli", "Wilk&Król", "978-83-650891-2-0", 36.43), 
(3, "Couchsurfing w Iranie. (Nie)codzienne życie Persów", "Stephan Orth", "Wydawnictwo Uniwersytetu Jagiellońskiego", "978-83-233-4244-1", 30.39), 
(4, "Inni niż my", "Tommi Kinnunen", "W.A.B. / GW Foksal", "978-83-280-4759-4", 24.69), 
(5, "Frida Kahlo prywatnie", "Suzanne Barbezat", "Marginesy", "978-83-65780-49-2", 36.99), 
(6, "Jeden dzień", "Aleksandra Mizielińska,  Daniel Mizieliński", "Dwie siostry", "978-83-643470-1-6", 36.99);

select * from book;
drop table book;
drop table books;
select title, author from books;

