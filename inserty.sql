insert into role(rola) values ("admin"), ("user");
insert into sklep(sklep) values ("Bonito"), ("Allegro"), ("Empik"), ("Targi");
insert into lokalizacja(miejsce) values ("Aleje"), ("Kinowa"), ("Gdańsk");
insert into stan(stan) values ("w domu"), ("pożyczona"), ("oddana"), ("prezent");
insert into osoby(name, last, login, pass, active) values ("Iga", "Konińska", "iga.koninska@gmail.com", "admin", 1), 
("Alicja", "Konińska", "miga5@wp.pl", "kolnierz5", 1);
insert into osoba_rola(id_osoby, id_roli) values (1, 1), (2,2);

insert into wydawnictwo(name_wyd) values ("Format"),
("Babaryba"),
("Pascal"),
("Czwarta Strona"),
("Wydawnictwo Literackie"),
("Dolnośląskie"),
("Filo"),
("Egmont"),
("Znak"),
("Dwie siostry"),
("Otwarte"),
("Wydawnictwo Kobiece"),
("W.A.B. / GW Foksal"),
("Sonia Draga"),
("Albatros"),
("Muza"),
("Świat Książki"),
("PIW"),
("Elipsa"),
("Wielka Litera"),
("Agora"),
("Kwiaty Orientu"),
("Handy Books"),
("Karakter"),
("Prószyński"),
("Wydawnictwo Uniwersytetu Jagiellońskiego"),
("Powergraph"),
("Smak słowa"),
("Poradnia K"),
("Książkowe Klimaty"),
("Czarne"),
("Wydawnictwo MG"),
("Biuro Literackie"),
("Burda książki"),
("Insignis"),
("Wiatr od morza"),
("Drzewo Babel"),
("Marginesy"),
("Olesiejuk Sp. z o.o."),
("Dom Wydawniczy PWN"),
("Zeszyty Literackie"),
("Rebis"),
("Wydawnictwo Krytyki Politycznej"),
("Fundacja Instytutu Reportażu"),
("Czytelnik"),
("W drodze"),
("Arbitror"),
("Amaltea"),
("Magnum"),
("Sine Qua Non"),
("Sic"),
("Od Do"),
("Mamania"),
("Iskry"),
("Wydawnictwo Debit"),
("Zysk i S-ka"),
("Wilk&Król"),
("Wydawnictwo Naukowe PWN"),
("IVV Media"),
("Feeria"),
("Fundacja 'ABCXXI - Cała Polska czyta dzieciom'"),
("Nasza Księgarnia"),
("Czarna Owca"),
("In Rock");
select * from wydawnictwo;
select * from books;
insert into books(title, author, id_wyd, ISBN, price) values ("Szczęśliwi rodzice","Laetitia Bourget, Emmanuelle Houdart",1,"9788361488330",26.30),
("Naciśnij mnie","Hervé Tullet",2," 9788362965175",21.31),
("Kuba. Pascal 360°","Filip Jacobson",3," 978-83-7642-618-1",28.43),
("Syn","Philipp Meyer",4," 9788379763993",35.56),
("Piękno to bolesna rana","Eka Kurniawan",5," 978-83-08-06234-0",30.82),
("Moja walka. Powieść 5","Karl Ove Knausgard",5," 9788308062364",33.91),
("Muza","Jessie Burton",5," 9788308062357",29.64),
("Burza. Czarci pomiot","Margaret Atwood",6,"978-83-271-5575-7",24.64),
("Obfitość","Yotam Ottolenghi",7," 9788362903160",43.17),
("ABC Gotowania","Marieta Marecka",8," 978-83-281-0903-2",42.61),
("Najlepiej w życiu ma twój kot. Listy","Wisława Szymborska, Kornel Filipowicz",9," 978-83-240-4361-3",35.56),
("Jeden dzień","Aleksandra Mizielińska, Daniel Mizieliński",10," 9788364347016",21.56),
("Wielbłądzica baletnica i inne bajki","Arnold Lobel",5," 978-83-08-06233-3",21.56),
("Sekretne życie drzew (edycja ilustrowana)","Peter Wohlleben",11," 9788375154306",27.73),
("Złota godzina","Sara Donati",12," 978-83-65506-18-4",27.73),
("Złota dama","Anne Marie O'Connor",13," 978-83-280-2126-6",30.87),
("Naciśnij mnie","Hervé Tullet",2," 9788362965175",18.47),
("My, marzyciele","Imbolo Mbue",14," 978-83-7999-803-6",24.80),
("Dopóki życie trwa. Nowy sekretny dziennik Hendrika Groena, lat 85","Hendrik Groen",15," 978-83-7985-892-7",24.64),
("Sympatyk","Viet Thanh Nguyen",16," 9788328703964",27.73),
("Słowik","Kristin Hannah",17," 9788380313712",22.79),
("Zima","Karl Ove Knausgard",5," 978-83-08-06237-1",21.56),
("Piękno to bolesna rana","Eka Kurniawan",5," 978-83-08-06234-0",30.82),
("Alfred i Ginewra","James Schuyler",18," 978-83-64822-63-6",15.38),
("Smitten Kitchen, czyli Nowy Jork na talerzu","Deb Perelman",9," 978-83-240-4349-1",43.17),
("Rozdarta zasłona","Maryla Szymiczkowa, Jacek Dehnel. Piotr Tarczyński",9," 978-83-240-3687-5",23.41),
("Centuria. Sto krótkich powieści rzek","Giorgio Manganelli",18," 978-83-64822-64-3",18.47),
("1001 filmów, które musisz zobaczyć","praca zbiorowa",19," 9788324596195",61.13),
("Czy miałaś kiedyś rodzinę?","Bill Clegg",13," 9788328027503",24.69),
("Przypomnij mi, kim jestem","Matthew Thomas",20," 978-83-3032-065-9",27.73),
("Czasem czuły, czasem barbarzyńca","Tomasz Kwaśniewski, Jacek Masłowski",21," 9788326824807",28.49),
("Wegetarianka","Han Kang",22," 978-83-935271-4-4",20.66),
("Gramatyka angielska dla początkujących","Maciej Matasek",23," 9788391923757",19.94),
("Jak pokochać centra handlowe","Natalia Fiedorczuk",20," 978-83-8032-128-1",26.30),
("Tokimeki. Magia sprzątania w praktyce","Marie Kondo",16," 9788328704633",24.87),
("Wróżba","Agneta Pleijel",24," 9788365271273",24.80),
("Oszust","Javier Cercas",5," 978-83-7392-612-7",25.93),
("Pragnienie","Richard Flanagan",5," 978-83-08-06294-4",21.56),
("Oryks i Derkacz","Margaret Atwood",25," 978-83-8097-033-5",23.46),
("Kot, który spadł z nieba","Takashi Hiraide",26," 9788323341932",21.37),
("Zagroda zębów","Wit Szostak",27," 9788364384585",17.91),
("Trylogia Diny. Tom 2. Syn szczęścia","Herbjorg Wassmo",28," 978-83-64846-84-7",30.82),
("Araf","Elif Shafak",9," 978-83-240-4565-5",27.73),
("Burdubasta albo skapcaniały osioł czyli łacina dla snobów","Stanisław Tekieli",29," 9788363960070",24.64),
("Scherzo capriccioso. Wesoła fantazja na temat Dvořáka","Josef Škvorecký",30," 9788364887307",30.82),
("Jak podróżować z łososiem","Umberto Eco",5," 978-83-65613-04-2",21.61),
("Pozwól rzece płynąć","Michał Cichy",31," 978-83-8049-428-2",21.56),
("Jamnikarium","Agata Tuszyńska",32," 978837779-293-3",27.73),
("Muza","Jessie Burton",5," 9788308062357",29.64),
("Grzesiuk. Król życia","Bartosz Janiszewski",25," 978-83-8097-037-3",29.92),
("Nie wiedzą, co czynią","Jussi Valtonen",13," 9788328021242",37.04),
("Nie ma się czego bać. Rozmowy z mistrzami","Justyna Dąbrowska",21," 9788326824005",24.69),
("Pozwól rzece płynąć","Michał Cichy",31," 978-83-8049-428-2",21.56),
("Zimowe królestwo","Philip Larkin",33," 9788365125453",24.80),
("Świat w płomieniach","Siri Hustvedt",13," 978-83-280-2602-5",30.87),
("Nostalgia","Mircea Cărtărescu",30," 9788364887376",27.79),
("Droga do domu","Yaa Gyasi",5," 9788308061596",26.50),
("Lady Day śpiewa bluesa","Billie Holiday, William Dufty",31," 978-83-8049-430-5",24.64),
("Ósme życie (dla Brilki). Tom 2","Nino Haratischwili",11," 978-83-7515-406-1",27.73),
("Wiosna","Karl Ove Knausgard",5," 978-83-08-06303-3",21.56),
("Ćma","Katja Kettu",17," 9788380316638",22.79),
("Ala ma kota. A Ali? Zdanka pierwsza klasa","Jolanta Nowaczyk",10," 9788364347962",17.94),
("Spacerem po Londynie","Sara Calian",34," 978-83-7596-736-4",21.56),
("Londyn. Przewodnik National Geographic","Louise Nicholson",34," 978-83-7596-746-3",24.64),
("Gotuj zdrowo dla całej rodziny","Jamie Oliver",35," 978-83-65315-69-4",43.22),
("Zapomniany walc","Anne Enright",36," 9788394352325",24.69),
("Odgłosy rosnących bananów","Ece Temelkuran",30," 978-8-3648-8729-1",24.64),
("Chrapiący ptak. Rodzinna podróż przez stulecie biologii","Heinrich Bernd",31," 978-83-8049-274-5",27.73),
("Spokój ducha. Co zyskujemy z wiekiem","Wilhelm Schmid",13," 9788328037359",18.52),
("Inna od siebie","Brygida Helbig",13," 978-83-280-2137-2",24.69),
("Lista moich zachcianek","Delacourt Gregoire",37," 9788389933744",22.23),
("Arkadia","Lauren Groff",9," 978-83-240-4540-2",26.50),
("W skorupce orzecha","Ian McEwan",15," 9788379859665",20.89),
("Pamięć","Peter Nadas",33," 978-83-65125-67-5",39.52),
("Głośniej niż śnieg","Stefan Hertmans",38," 9788365780010",24.64),
("Lepiej byś tam umarł","Szczepan Twardoch, Mamed Khalidov",13," 9788328037328",24.69),
("Szlaki marzeń","Ulrike Schober",39," 978-83-274-4061-7",24.69),
("Amelia Bedelia","Peggy Parish",5," 978-83-08-06295-1",19.94),
("Świat w płomieniach","Siri Hustvedt",13," 978-83-280-2602-5",35.62),
("Sto nóg stonogi Fruzi","Agnieszka Horubała, Zosia Dzierżawska",10," 978-83-63696-74-0",16.80),
("Jak przejąć kontrolę nad światem, nie wychodząc z domu","Dorota Masłowska",5," 978-83-08-06336-1",28.43),
("Pociąg linii M","Patti Smith",31," 978-83-8049-376-6",30.82),
("Pedant w kuchni","Julian Barnes",17," 9788380316294",18.47),
("Miasto w ogniu","Garth Risk Hallberg",9," 978-83-240-3733-9",36.99),
("Dzikusy. Tom 1. Francuskie wesele","Sabri Louatah",13," 9788328043459",24.69),
("Teatr Sabata","Philip Roth",5," 978-83-08-06339-2",30.82),
("Oto jestem","Jonathan Safran Foer",13," 9788328036987",30.87),
("Taniec w rytmie rewolucji","Temelkuran Ece",40," 9788377056721",19.95),
("Jak przejąć kontrolę nad światem, nie wychodząc z domu","Dorota Masłowska",5," 978-83-08-06336-1",24.64),
("Galicyanie","Stanisław Aleksander Nowak",13," 978-83-280-2676-6",43.22),
("Małe miłosziana","Renata Gorczyńska",41," 9788364648564",20.89),
("J jak jastrząb","Helen Macdonald",31," 978-83-8049-297-4",24.64),
("Opowieść podręcznej","Margaret Atwood",20," 9788380321717",24.64),
("Leonora","Elena Poniatowska",14," 978-83-7999-929-3",24.64),
("MaddAddam","Margaret Atwood",25," 978-83-8097-141-7",24.64),
("Kobieta na schodach","Bernhard Schlink",42," 978-83-8062-024-7",21.56),
("Georgia. Powieść o Georgii O’Keeffe","Dawn Tripp",42," 978-83-8062-160-2",24.64),
("Sznurówki","Domenico Starnone",13," 978-83-280-4435-7",21.60),
("Koniec samotności","Benedict Wells",16," 9788328706118",24.64),
("Całe życie","Robert Seethaler",11," 978-83-751-5441-2",21.56),
("Międzymorze","autor:  Ziemowi Szczerek",21,"",24.69),
("Lato","Karl Ove Knausgard",5," 978-83-08-06344-6",23.46),
("Wzgórze psów","Jakub Żulczyk",17," 978-83-8031-350-7",26.50),
("Kartagina","Joyce Carol Oates",42," 978-83-8062-027-8",27.73),
("Rzeczy, których nie wyrzuciłem","Marcin Wicha",24," 978-83-65271-38-9",22.79),
("Gen. Ukryta historia","Siddhartha Mukherjee",31," 978-83-8049-493-0",36.99),
("Ma być czysto","Anna Cieplak",43," 978-83-65369-31-4",21.31),
("Turcja: obłęd i melancholia","Ece Temelkuran",30," 9788365595430",28.43),
("Śpij dobrze","Nick Littlehales",21," 9788326825248",20.61),
("Wspomnienia. Druga księga","Nadieżda Mandelsztam",21," 9788326824043",35.33),
("Utracony dar słonej krwi","Alistair MacLeod",36," 9788394352332",24.69),
("Gorące mleko","Deborah Levy",9," 978-83-240-4555-6",24.64),
("Patrick Melrose. Tom 1. Nic takiego / Złe wieści / Jakaś nadzieja","Edward St Aubyn",13," 9788328044821",30.87),
("Na pierwszy rzut oka","Gregoire Delacourt",37," 9788364488214",22.23),
("Głośniej niż śnieg","Stefan Hertmans",38," 9788365780010",24.64),
("Dziedzictwo","Ann Patchett",9," 978-83-240-3744-5",24.64),
("Droga do domu","Yaa Gyasi",5," 978-83-08-06363-7",23.46),
("Busola","Mathias Énard",5," 978-83-08-06238-8",30.82),
("Pieczeń dla Amfy","Salcia Hałas",16,"",24.64),
("Kolej podziemna. Czarna krew Ameryki","Colson Whitehead",15," 978-83-6578-101-7",22.79),
("Tęsknota","Gal Faye",13," 9788328044791",24.69),
("Prześniona rewolucja. Ćwiczenia z logiki historycznej","Andrzej Leder",43," 978-83-63855-61-1",24.64),
("Mokradełko","Katarzyna Surmiak-Domańska",31," 978-8375-363-64-7",22.23),
("Dzienniki 1953","Agnieszka Osiecka",25," 978-83-8097-163-9",30.82),
("Siostra","Márai Sándor",41," 9788364648533",22.23),
("Foucault w Warszawie","Remigiusz Ryziński",44," 978-83-947254-4-0",22.23),
("Nauczycielka","Judith W. Taschler",13," 9788328015784",21.60),
("Poznać kobietę","Amos Oz",42," 978-83-8062-198-5",27.73),
("Diavolina","György Spiró",45," 978-83-07-03413-3",22.35),
("Między murami","Bassani Giorgio",41," 9788364648526",22.23),
("Pocałunki składane na chlebie","Almudena Grandes",14," 978-83-7999-953-8",23.46),
("Matki","Brit Bennett",15," 978-83-7985-865-1",21.56),
("Jedz. Mała księga szybkich dań","Nigel Slater",7," 978-83-62903-31-3",36.43),
("Między walizkami","Paulina Wilk",46," 978-83-7906-146-4",17.29),
("Dzielnym będzie przebaczone","Chris Cleave",17," 9788380316287",22.79),
("Wielki marynarz","Catherine Poulain",5," 978-83-08-06359-0",24.64),
("Ruiny i zgliszcza","Wells Tower",24," 978-83-65271-35-8",24.80),
("Powieść bez O","Judith W. Taschler",13," 9788328044807",24.69),
("Po trochu","Weronika Gogola",30," 978-83-65595-51-5",20.32),
("Chrząszcze na wyginięciu","Diego Vargas Geate",45," 978-83-07-03418-8",19.39),
("Macierewicz i jego tajemnice","Tomasz Piątek",47," 9788394833107",28.43),
("Dzikie łabędzie. Trzy córki Chin","Jung Chang",9," 978-83-240-3643-1",30.82),
("Przyczynek do historii radości","Radka Denemarkova",48," 978-83-934672-7-3",28.80),
("Locus Solus","Raymond Roussel",18," 9788306033946",21.56),
("Tylko Lola","Jarosław Kamiński",13," 9788328026315",24.69),
("Niech tak będzie","Dawn French",14," 9788379999170",22.20),
("Umami","Laia Jufresa",13," 978-83-280-4588-0",24.69),
("Romanowowie 1613–1918","Simon Sebag Montefiore",49," 978-83-65257-13-0",49.34),
("Jankeski fajter","Aura Xilonen",9," 978-83-240-4952-3",22.79),
("Jak przejąć kontrolę nad światem, nie wychodząc z domu","Dorota Masłowska",5," 978-83-08-06336-1",24.64),
("Dziwna myśl w mej głowie","Orhan Pamuk",5," 978-83-08-06041-4",30.82),
("Berthe Morisot. Tajemnica kobiety w czerni","Dominique Bona",5," 978-83-65613-06-6",20.38),
("Ślady","Jakub Małecki",50," 978-83-7924-701-1",24.54),
("Rudowłosa","Orhan Pamuk",5," 978-83-08-06385-9",24.64),
("Historia moich zębów","Valeria Luiselli",13," 978-83-280-4602-3",21.60),
("Sztuka powieści 2. Wywiady z pisarkami","praca zbiorowa",30," 9788364887482",30.87),
("Kaprysik","Mariusz Szczygieł",21," 9788326825699",20.61),
("Jankeski fajter","Aura Xilonen",9," 978-83-240-4952-3",26.30),
("Lesbos","Renata Lis",51," 9788365459107",22.23),
("Serce","Radka Franczak",38," 9788365282682",23.41),
("Spałem w pokoju Hitlera","Tuvia Tenenbom",52," 9788393407590",25.93),
("Kaprysik","Mariusz Szczygieł",21," 9788326825699",24.93),
("Dni króla","Filip Florian",48," 978-83-934672-6-6",21.56),
("Akcja adaptacja. Jak pomóc dziecku i sobie w zaprzyjaźnieniu się z przedszkolem","Agnieszka Stein",53," 978-83-65087-86-7",21.56),
("Yoro","Marina Perezagua",25," 978-83-8097-226-1",27.17),
("Nora Webster","Colm Tóibín",13," 978-83-280-2772-5",24.69),
("Książka o Unie","Faruk Sehić",33," 9788365125231",20.99),
("Wyspiański. Dopóki starczy życia","Monika Śliwińska",54," 978-83-244-0487-2",30.82),
("Palinka. Prozy z Banatu","Matěj Hořava",30," 9788365595362",19.46),
("Moja kochana, dumna prowincja","Kornel Filipowicz",9," 978-83-240-4966-0",27.73),
("Niksy","Nathan Hill",9," 978-83-240-4958-5",33.91),
("Pape Satan aleppe. Kroniki płynnego społeczeństwa","Umberto Eco",42," 978-83-8062-051-3",30.82),
("Kiedy była porządną dziewczyną","Philip Roth",5," 978-83-08-06332-3",26.50),
("Miasto Archipelag. Polska mniejszych miast","Filip Springer",24," 978-83-65271-20-4",34.91),
("Ludzie na drzewach","Hanya Yanagihara",13," 9788328046290",30.87),
("Inne ochoty","Jerzy Pilch, Ewelina Pietrowiak",5," 9788308063965",24.64),
("Mężczyźni objaśniają mi świat","Rebecca Solnit",24," 978-83-65271-53-2",22.85),
("Gombrowicz. Ja, geniusz (tom 1 i 2)","Klementyna Suchanow",31," 978-83-8049-557-9",73.48),
("Petersburg. Miasto snu","Joanna Czeczott",31," 978-83-8049-541-8",24.64),
("Iłła. Opowieść o Kazimierze Iłłakowiczównie","Joanna Kuciel-Frydryszak",38," 9788365780546",27.73),
("To, co możliwe","Elizabeth Strout",20," 978-83-8032-190-8",24.64),
("Patrick Melrose. Tom 2. Mleko matki. W końcu","Edward St. Aubyn",13," 978-83-280-4764-8",30.87),
("Budowniczy ruin","Herbert Rosendorfer",18," 9788306033991",24.64),
("Kobieta z Isla Negra","María Fasce",14," 978-83-7999-950-7",22.85),
("Nikt mnie nie ma","Asa Linderborg",13," 9788328043442",21.60),
("Wymazane","Michał Witkowski",9," 978-83-240-4663-8",24.64),
("Bogini tańca. Z autografem","Ewa Stachniak",9," 5901752781214",26.94),
("Masz na imię Camille","Agnieszka Stabro",32," 9788377794272",30.82),
("Dżentelmen w Moskwie","Amor Towles",9," 978-83-240-3753-7",30.82),
("Otello. Ten nowy","Tracy Chevalier",6," 978-83-271-5598-6",24.64),
("Opowieści na dobranoc dla młodych buntowniczek","Elena Favilli, Francesca Cavallo",55," 9788380572010",36.99),
("Ministerstwo niezrównanego szczęścia","Arundhati Roy",56," 978-83-8116-140-4",28.44),
("Bóg Rzeczy Małych","Arundhati Roy",56," 978-83-8116-119-0",25.65),
("Swing Time","Zadie Smith",9," 978-83-240-5013-0",27.73),
("Księga nocnych kobiet","Marlon James",5," 978-83-08-06426-9",27.73),
("Zulejka otwiera oczy","Guzel Jachina",5," 9788365613417",24.80),
("Córka","Elena Ferrante",14," 978-83-8110-150-9",21.56),
("Drwale","Annie Proulx",4," 9788379767533",36.99),
("Frida Kahlo prywatnie","Suzanne Barbezat",38," 978-83-65780-49-2",36.99),
("Dzikusy. Tom 2. Upiór nawiedził Europę","Sabri Louatah",13," 978-83-280-4765-5",24.69),
("Córki Wawelu. Opowieść o jagiellońskich królewnach","Anna Brzezińska",5," 978-83-08-06393-4",36.99),
("Zapach mężczyzny","Agneta Pleijel",24," 978-83-65271-57-0",24.80),
("Poliglotyczni kochankowie","Lina Wolff",38," 978-83-65780-70-6",23.41),
("Zgiełk czasu","Julian Barnes",17," 978-83-8031-587-7",21.56),
("Stancje","Wioletta Grzegorzewska",13," 978-83-280-4596-5",18.52),
("Nie mówcie, że nie mamy niczego","Madeleine Thien",5," 978-83-08-06424-5",30.82),
("Pogromca grzeszników","Grzegorz Kalinowski",16," 9788328707603",24.64),
("Jeden dzień","Aleksandra Mizielińska, Daniel Mizieliński",10," 9788364347016",21.56),
("Winlandia","George Mackay Brown",36," 978-83-943523-5-6",27.73),
("Ten i tamten las","Magdalena Tulli",57," 9788365089120",36.43),
("Couchsurfing w Iranie. (Nie)codzienne życie Persów","Stephan Orth",26," 978-83-233-4244-1",30.39),
("Inni niż my","Tommi Kinnunen",13," 978-83-280-4759-4",24.69),
("Frida Kahlo prywatnie","Suzanne Barbezat",38," 978-83-65780-49-2",36.99),
("Pojutrze. O miastach przyszłości","Paulina Wilk",5," 978-83-08-06448-1",24.64),
("Przeprowadzka","Jenny Eclair",13," 9788328046832",24.69),
("Kanada. Ulubiony kraj świata","Katarzyna Wężyk",21," 978-83-268-2559-0",24.69),
("Zgubiona dusza","Olga Tokarczuk, Joanna Concejo",1," 978-83-61488-743",30.82),
("Dom polski. Meblościanka z pikasami","Małgorzata Czyńska",31," 978-83-8049-598-2",24.64),
("Mikrotyki","Paweł Sołtys",31," 978-83-8049-586-9",21.56),
("Lata powyżej zera","Anna Cieplak",9," 978-83-240-4675-1",25.21),
("Gdzie ci mężczyźni","Philip Zimbardo, Nikita Coulombe",58," 9788301181871",34.91),
("Wszyscy powinniśmy być feministami","Chimamanda Ngozi Adichie",56," 978-83-8116-196-1",19.88),
("Kiedy będziemy wolne. Moja walka o prawa człowieka","Szirin Ebadi",9," 978-83-240-4240-1",26.53),
("Portugalia przewodnik po winach","Tomasz Prange Barczyński, Ewa Wieleżyńska",59," 978-83-63364-04-5",26.53),
("Notes. Agnieszka Osiecka","praca zbiorowa",21," 9788326825231",33.24),
("Wszystkie przygody Żabka i Ropucha","Arnold Lobel",5," 978-83-08-06451-1",33.18),
("Dziwne przypadki ludzkiego mózgu","Sam Kean",60," 9788372296474",29.86),
("Delfin w malinach. Snobizmy i obyczaje ostatniej dekady","praca zbiorowa",31," 978-83-8049-596-8",26.53),
("Pierwsza Książka Mojego Dziecka","praca zbiorowa",61," 978-8363869-07-6",19.90),
("Pucio uczy się mówić. Zabawy dźwiękonaśladowcze dla najmłodszych","Marta Galewska-Kustra",62," 978-83-10-13081-5",26.53),
("Pucio mówi pierwsze słowa","Marta Galewska-Kustra",62," 978-83-10-13153-9",26.53),
("Jak pokochać centra handlowe","Natalia Fiedorczuk",20," 978-83-8032-128-1",24.54),
("Instrukcja dla pań sprzątających. Opowiadania","Lucia Berlin",13," 978-83-280-4755-6",33.24),
("Śmierć frajerom","Grzegorz Kalinowski",16," 9788328706934",8.94),
("Śmierć frajerom. Złota maska","Grzegorz Kalinowski",16," 9788328706941",8.94),
("Śmierć Frajerom. Tajemnica skarbu Ala Capone","Grzegorz Kalinowski",16," 9788328704145",29.86),
("W ciemni","Susan Faludi",43," 978-83-65853-21-9",33.18),
("Herezje chwalebne","Lisa McInerney",63," 978-83-8015-627-2",26.59),
("Sapiens. Od zwierząt do bogów","Yuval Noah Harari",40," 9788377059968",32.58),
("Świat wczorajszy","Stefan Zweig",18," 9788364822346",30.40),
("Podwójne życie reporterki. Fallaci. Torańska","Remigiusz Grzela",25," 978-83-8123-058-2",31.25),
("Frida Kahlo prywatnie","Suzanne Barbezat",38," 978-83-65780-49-2",39.83),
("Justyna. Kwartet aleksandryjski","Lawrence Durrell",56," 978-88116-192-3",29.92),
("Galeria szubrawców. Narodziny (i sporadyczne upadki) profesji marszandów, ukrytych aktorów na scenie dziejów sztuki","Philip Hook",9," 978-83-240-4989-9",29.86),
("Piosenka musi posiadać tekst. I muzykę. 200 najważniejszych utworów polskiego rocka","Jan Skaradziński, Konrad Wojciechowski",64," 9788364373541",66.43),
("Gala-Dali","Carmen Domingo",17," 978-83-8031-654-6",26.30);
insert into gatunek(gatunek) values ("biografia"), ("reportaż");
insert into books_gat values (241, 1), (241, 2), (242, 1);
insert into przeczytana values (1, "2017-02-07",0, "porywająca", 1, 1);
select * from books_gat;