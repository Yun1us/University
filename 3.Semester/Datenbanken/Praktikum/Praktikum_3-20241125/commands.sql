sqlite3 
.open Datenbankenprak03
.read creates.sql 
.read inserts.sql

AUFGABEN: 
1.
select tnummer from teil, lieferant where tnummer = lnummer and Lieferant.stadt = 'Landshut';

join1:
select tnummer from teil join lpt on tnummer = tn join lieferant on ln = lnummer where lieferant.stadt = 'Landshut';

join2:
select tnummer from teil join lpt on tnummer = tn join lieferant on ln = lnummer join projekt on pn = pnummer where lieferant.stadt = 'Landshut';

geschachteltes select:
select tn from lpt where ln in ( select lnummer from lieferant where stadt = 'Landshut');

2.
select tname from Teil join lpt on tnummer = tn where menge > 1000;

3.
SELECT l.stadt FROM lieferant l UNION SELECT p.stadt FROM projekt p;

4. 
select lname from lieferant where jahreink > ( select jahreink from lieferant where lname = 'Zymi') order by lname desc;

5. 
(1)
select lname from lieferant l where l.stadt > 'Landshut' collate nocase order by l.lname asc;

(2)
select lname from lieferant l where l.stadt > ( select p.stadt from projekt p order by p.stadt desc limit 1) order by lname asc;

6. 
select pname from projekt where budget < ( select jahreink from lieferant order by jahreink desc limit 1) order by pname asc;

7.
(1)
select t.tname from teil t where t.stadt not in( select l.stadt from lieferant l union select p.stadt from projekt p);

(2)
select t.tname from teil t where t.stadt not in( select l.stadt from lieferant l inner join lpt on ln = lnummer inner join projekt on pn = pnummer);

(3)
select t.tname from teil t where t.stadt not in( select t.stadt from teil t where t.stadt in( select l.stadt from lieferant l inner join lpt on ln = lnummer inner join projekt on pn = pnummer));

8. 
select tnummer, gewicht, farbe, lpt.menge from teil join lpt on tnummer = tn where (farbe = 'red' or farbe = 'green') and menge > 2000;

9.
create table nine as select ln, tn, pn from lpt where pn = 3;

10.
update teil set stadt = (select l.stadt from lieferant l where lname = 'Jones') where farbe = 'red';

11. 
sqlite> delete from lpt where ln = (select lnummer from lieferant where stadt = 'Landshut');

12. 
drop table lieferant;