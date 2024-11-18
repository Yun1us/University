.sqlite3
.tables
.mode tables
select * from bank;
select geschaeftssitz from bank: 

select mname, wohnort from Mitarbeiter where anstellungsdatum > "1998-04-28" order by mname;

select mname, wohnort, bname, blz from Mitarbeiter, bank where arbeitgeber_bank = bname and monatsgehalt < 2500;
select mname, wohnort, bname, blz from Mitarbeiter join bank on arbeitgeber_bank = bname where monatsgehalt < 2500;

select kontoart, kontonummer from konto, unterhaelt, kunde where kontonummer = kontonr and inhaber = kname and betreuer = "Olafson";
SELECT kontonr, kontoart from konto JOIN unterhaelt ON kontonr = kontonummer JOIN kunde ON inhaber = kname WHERE betreuer = 'Olafson';

select kname, kontonr, guthaben from konto, unterhaelt, kunde, mitarbeiter, bank where kontoart = 'Tagesgeld' and kontonr = kontonummer and inhaber = kname and betreuer = mname and arbeitgeber_bank = bname and geschaeftssitz = 'Frankfurt';

select kontonr, guthaben, kname from konto join unterhaelt on kontonummer = kontonr join kunde on kname = inhaber and inhaber_gebdat = geburtsdatum join filiale on fname = zustaendige_filiale join bank on mutterbank = bname where geschaeftssitz = 'Frankfurt' order by inhaber, kontonr;

select count(*) from mitarbeiter where wohnort = 'Hamburg'

select mname, monatsgehalt from mitarbeiter where monatsgehalt > (select avg(monatsgehalt) from mitarbeiter);

select mname, arbeitgeber_bank from mitarbeiter where exists (select betreuer from kunde where wohnort = 'Leipzig' and mname=betreuer);

select k.kontonr, k.guthaben from konto k join Filiale on anlage_filiale = fname where mutterbank = 'BlackBank' and kontoart = 'Giro' order by kontonr desc;

select kontonr, guthaben from konto where kontoart = 'Giro' and anlage_filiale in (select fname from filiale where mutterbank = 'BlackBank') order by kontonr desc;