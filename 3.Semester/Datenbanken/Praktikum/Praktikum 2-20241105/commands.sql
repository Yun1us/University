.sqlite3
.tables
.mode tables
select * from bank;
select geschaeftssitz from bank: 
select mname, wohnort from Mitarbeiter where anstellungsdatum > "1998-04-28" order by mname;
select mname, wohnort, bname, blz from Mitarbeiter, bank where arbeitgeber_bank = bname and monatsgehalt < 2500;