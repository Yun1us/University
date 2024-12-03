--AUFGABEN: 
--1.
SELECT DISTINCT tnummer FROM teil JOIN lpt ON teil.tnummer = lpt.tn JOIN lieferant ON lpt.ln = lieferant.lnummer WHERE lieferant.stadt = 'Landshut' ORDER BY teil.tnummer;

--join1:
SELECT DISTINCT tnummer FROM teil t JOIN lpt l ON t.tnummer = l.tn JOIN lieferant lf ON l.ln = lf.lnummer WHERE lf.stadt = 'Landshut' ORDER BY t.tnummer;

--join2:
SELECT DISTINCT teil.tnummer FROM teil INNER JOIN lpt ON teil.tnummer = lpt.tn INNER JOIN lieferant ON lpt.ln = lieferant.lnummer WHERE lieferant.stadt = 'Landshut' ORDER BY teil.tnummer;

--geschachteltes select:
select tn from lpt where ln in ( select lnummer from lieferant where stadt = 'Landshut');

--2.
select tname
from teil
join lpt on tn = tnummer
where menge > 1000;

--3.
SELECT l.stadt FROM lieferant l UNION SELECT p.stadt FROM projekt p;

--4. 
select lname from lieferant where jahreink > ( select jahreink from lieferant where lname = 'Zymi') order by lname desc;

--5. 
--(1)
select lname from lieferant l where l.stadt > 'Landshut' collate nocase order by l.lname asc;

--(2)
select lname from lieferant where not exists( select 1 from projekt where lieferant.stadt < projekt.stadt) order by lname;

--6. 
select pname from projekt where budget < ( select jahreink from lieferant order by jahreink desc limit 1) order by pname asc;

--7.
--(1)
select t.tname
from teil t
where t.stadt not in(
select l.stadt from lieferant l
union
select p.stadt from projekt p);

--(2)
select distinct tname from teil where teil.stadt != (select stadt from lieferant union select stadt from projekt);

--8. 
select tnummer, gewicht, farbe, max(menge) from teil join lpt on lpt.tn = teil.tnummer where teil.farbe in ("red","green") group by tnummer, gewicht, farbe having sum(lpt.menge)>2000 order by tnummer;
--9.
--create table nine as select ln, tn, pn from lpt where pn = 3;

--10.
--update teil set stadt = (select l.stadt from lieferant l where lname = 'Jones') where farbe = 'red';

--11. 
--delete from lpt where ln = (select lnummer from lieferant where stadt = 'Landshut');

--12. 
--drop table lieferant;