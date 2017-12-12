alter table logowanie add role int;
alter table logowanie add active boolean;
alter table logowanie add imie varchar(20);
alter table logowanie add nazzwisko varchar(20);
select * from logowanie;

ALTER TABLE logowanie MODIFY imie VARCHAR(20) after login;
ALTER TABLE logowanie change column nazzwisko nazwisko varchar(30);

alter table logowanie MODIFY nazwisko VARCHAR(20)  AFTER imie;

alter table logowanie MODIFY login varchar(20)  AFTER pass;
