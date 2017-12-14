alter table logowanie add role int;
alter table logowanie add active boolean;
alter table logowanie add imie varchar(20);
alter table logowanie add nazzwisko varchar(20);
select * from logowanie;

ALTER TABLE logowanie MODIFY imie VARCHAR(20) after login;
ALTER TABLE logowanie change column nazzwisko nazwisko varchar(30);

alter table logowanie MODIFY nazwisko VARCHAR(20)  AFTER imie;

alter table logowanie MODIFY login varchar(20)  AFTER pass;
select * from role;
select * from osoby;
select * from osoba_rola;

select login, rola from osoby u inner join osoba_rola ur on ur.id_osoby=u.id_osoby 
inner join role r on r.id_roli=ur.id_roli;
#where u.login=?")

use blog;
select u.email, r.name from user u inner join user_role ur on u.id=ur.user_id 
inner join role r on r.id=ur.roles_id;