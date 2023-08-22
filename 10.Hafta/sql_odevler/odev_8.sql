-- test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

CREATE TABLE employee
(
	id INTEGER PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	email VARCHAR(100)NOT NULL,
	birthday DATE
);


-- Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
insert into employee (id, name, birthday, email) values (1, 'Sibbie', '1972-12-28', 'scarthy0@yandex.ru');
insert into employee (id, name, birthday, email) values (2, 'Janek', '1968-09-27', 'jcutts1@angelfire.com');
insert into employee (id, name, birthday, email) values (3, 'Silvan', '1983-08-02', 'sbaterip2@dailymail.co.uk');
insert into employee (id, name, birthday, email) values (4, 'Roxy', '1984-10-09', 'rhourahan3@51.la');
insert into employee (id, name, birthday, email) values (5, 'Tildie', '1950-09-23', 'tmuro4@reuters.com');
insert into employee (id, name, birthday, email) values (6, 'Alaine', '1956-04-26', 'acottee5@163.com');
insert into employee (id, name, birthday, email) values (7, 'Elden', '1955-01-05', 'elindeboom6@artisteer.com');
insert into employee (id, name, birthday, email) values (8, 'Marla', '1960-05-27', 'mmaciver7@forbes.com');
insert into employee (id, name, birthday, email) values (9, 'Arin', '1973-09-23', 'agoodbourn8@webeden.co.uk');
insert into employee (id, name, birthday, email) values (10, 'Myriam', '1969-08-05', 'mfaiers9@ted.com');
insert into employee (id, name, birthday, email) values (11, 'Stacee', '1972-11-12', 'sshimuka@pbs.org');
insert into employee (id, name, birthday, email) values (12, 'Amitie', '2000-12-24', 'adionisib@networksolutions.com');
insert into employee (id, name, birthday, email) values (13, 'Sal', '1969-04-15', 'spridec@businessinsider.com');
insert into employee (id, name, birthday, email) values (14, 'Fabian', '1973-02-03', 'fwakehamd@zdnet.com');
insert into employee (id, name, birthday, email) values (15, 'Hamel', '1992-08-10', 'hdarmodye@businessinsider.com');
insert into employee (id, name, birthday, email) values (16, 'Bebe', '1985-09-15', 'bcuttellf@mediafire.com');
insert into employee (id, name, birthday, email) values (17, 'Caroljean', '1972-03-17', 'cvernong@redcross.org');
insert into employee (id, name, birthday, email) values (18, 'Claire', '1956-08-10', 'cpettecrewh@macromedia.com');
insert into employee (id, name, birthday, email) values (19, 'Margit', '1957-03-10', 'mcallaghani@ebay.co.uk');
insert into employee (id, name, birthday, email) values (20, 'Roda', '1957-08-02', 'rvolagej@indiegogo.com');
insert into employee (id, name, birthday, email) values (21, 'Ddene', '1952-12-23', 'dfaillk@skype.com');
insert into employee (id, name, birthday, email) values (22, 'Shaylynn', '1986-10-14', 'sdodwelll@youtube.com');
insert into employee (id, name, birthday, email) values (23, 'Roseann', '1960-01-24', 'rdominecm@sfgate.com');
insert into employee (id, name, birthday, email) values (24, 'Theodor', '1969-04-28', 'thubboldn@people.com.cn');
insert into employee (id, name, birthday, email) values (25, 'Harmonie', '1984-07-30', 'hgiacomuzzio@blogs.com');
insert into employee (id, name, birthday, email) values (26, 'Isidor', '1970-10-31', 'imaurop@springer.com');
insert into employee (id, name, birthday, email) values (27, 'Marya', '1955-04-28', 'mbastonq@baidu.com');
insert into employee (id, name, birthday, email) values (28, 'Lonnie', '1997-02-10', 'lbrindedr@europa.eu');
insert into employee (id, name, birthday, email) values (29, 'Max', '1965-08-19', 'mwhittys@marketwatch.com');
insert into employee (id, name, birthday, email) values (30, 'Almira', '1990-02-27', 'acarot@uiuc.edu');
insert into employee (id, name, birthday, email) values (31, 'Dede', '1951-09-05', 'dgrestieu@nba.com');
insert into employee (id, name, birthday, email) values (32, 'Adena', '1974-03-26', 'aflearv@go.com');
insert into employee (id, name, birthday, email) values (33, 'Malissa', '1979-09-08', 'mmatchamw@cpanel.net');
insert into employee (id, name, birthday, email) values (34, 'Kendell', '1980-02-27', 'klockex@jalbum.net');
insert into employee (id, name, birthday, email) values (35, 'Dorothy', '1953-12-01', 'dcatanheiray@independent.co.uk');
insert into employee (id, name, birthday, email) values (36, 'Barnard', '1997-06-23', 'bbreffitz@ft.com');
insert into employee (id, name, birthday, email) values (37, 'Myrtia', '1990-05-25', 'mduny10@chron.com');
insert into employee (id, name, birthday, email) values (38, 'Karlee', '1987-08-21', 'kcattemull11@nhs.uk');
insert into employee (id, name, birthday, email) values (39, 'Davey', '1975-12-21', 'dpucknell12@liveinternet.ru');
insert into employee (id, name, birthday, email) values (40, 'Hildegarde', '1969-09-29', 'hbogies13@webnode.com');
insert into employee (id, name, birthday, email) values (41, 'Gawain', '1989-02-09', 'gbadger14@bigcartel.com');
insert into employee (id, name, birthday, email) values (42, 'Gretta', '1997-05-27', 'ghaskur15@dion.ne.jp');
insert into employee (id, name, birthday, email) values (43, 'Maddy', '1974-05-17', 'mlusgdin16@unc.edu');
insert into employee (id, name, birthday, email) values (44, 'Edmon', '1950-06-26', 'egladhill17@weebly.com');
insert into employee (id, name, birthday, email) values (45, 'Liza', '1971-04-05', 'lkeely18@dmoz.org');
insert into employee (id, name, birthday, email) values (46, 'Fairlie', '1962-05-13', 'fgarvan19@mashable.com');
insert into employee (id, name, birthday, email) values (47, 'Janina', '1986-10-19', 'jgreenhough1a@nature.com');
insert into employee (id, name, birthday, email) values (48, 'Lucille', '1980-02-03', 'lmawer1b@yahoo.com');
insert into employee (id, name, birthday, email) values (49, 'Miof mela', '1999-09-28', 'mkester1c@engadget.com');
insert into employee (id, name, birthday, email) values (50, 'Pauly', '1984-03-24', 'pspringtorpe1d@biblegateway.com');

--Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

UPDATE employee
SET name = 'ahmet'
WHERE email ='scarthy0@yandex.ru'
RETURNING*;

UPDATE employee
SET email = 'can.kirtas@okul.edu.tr'
WHERE id = 1
RETURNING*;

UPDATE employee
SET birthday = '1999-05-26'
WHERE name = 'hatay'
RETURNING*;

UPDATE employee
SET name= 'Sema'
WHERE name LIKE 'R___'
RETURNING*;

UPDATE employee
SET name= 'Adam'
WHERE birthday = (select min(birthday) from employee)
RETURNING*;


--Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

DELETE FROM employee
WHERE name ='Adam'
RETURNING*;

DELETE FROM employee
WHERE id=24
RETURNING*;

DELETE FROM employee
WHERE email = 'tmuro4@reuters.com'
RETURNING*;

DELETE FROM employee
WHERE birthday in (select birthday from employee order by birthday asc limit 5 )
RETURNING*;

DELETE FROM employee
WHERE length(name)>(select avg(length(name)) from employee)
RETURNING*;