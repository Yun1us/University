-- Datenbank Banken - Tabellendefinitionen

CREATE TABLE Bank (
	bname char(20),
	gruendungsdatum date,
	geschaeftssitz char(20),
	umsatz int,
	gewinn int,
	blz int,
	Primary Key(bname)
);

CREATE TABLE Filiale(
	fname char(20),
	mutterbank char(20) not null,
	standort char(20),
	Primary Key(fname),
	foreign key (mutterbank) references Bank
);

CREATE TABLE Mitarbeiter(
	mname char(20),
	arbeitgeber_bank char(20),
	anstellungsdatum date,
	monatsgehalt decimal (7,2),
	wohnort char(20),
	Primary Key(mname),
	Foreign Key(arbeitgeber_bank) references Bank
);

CREATE TABLE Kunde(
	kname char(20),
	geburtsdatum date,
	zustaendige_filiale char(20) not null,
	betreuer char(20),
	wohnort char(20),
	Primary Key(kname, geburtsdatum),
	Foreign Key(zustaendige_filiale) references Filiale,
	Foreign Key(betreuer) references Mitarbeiter
);

CREATE TABLE Konto(
	kontonr int,
	kontoart char(10),
	guthaben decimal (10,2),
	kredit decimal (7,2),
	zinssatz decimal (3,1),
	anlage_filiale char(20) not null,
	Primary Key(kontonr),
	Foreign Key(anlage_filiale) references Filiale
);

create table zugeteilt (
	filialname char(20),
	mitarbeiter char(20),
	primary key (filialname, mitarbeiter),
	foreign key (filialname) references Filiale,
	foreign key (mitarbeiter) references Mitarbeiter
);

create table unterhaelt (
	inhaber char(20),
	inhaber_gebdat date,
	kontonummer int,
	anlagedatum date,
	primary key (inhaber, inhaber_gebdat, kontonummer),
	foreign key (inhaber, inhaber_gebdat) references Kunde,
	foreign key (kontonummer) references Konto
);

/*
Bemerkungen:

Die Tabelle Kunde hat einen PK mit zwei Komponenten (kname und geburtsdatum).
Daher hat die Tabelle unterhaelt als M:N-Beziehungstabelle einen PK mit drei Komponenten:
kname, geburtsdatum und kontonr. Diese drei Komponenten in der Tabelle unterhaelt sind
automatisch NOT NULL, da sie zum PK gehoeren.
Weiterhin hat die Tabelle unterhaelt einen FK mit zwei Komponenten, einen mit einer Komponente.

Bei M:N-Beziehungen ist es im relationalen DB-Modell nicht moeglich, zwischen optionalen und totalen
Beteiligungseinschränkungen zu unterscheiden.  Alle M:N-Beziehungen, egal ob sie nun (teilweise) optionale
oder totale Beteiligungsenschränkungen enthalten, werden also gleich modelliert: mit einem PK, dessen
Komponenten FKs sind, keine weiteren NOT NULL Einschränkungen.

Bei 1:N-Beziehungen ist es im relationalen DB-Modell nicht möglich, eine totale Beteiligungseinschränkung
auf der 1-Seite zu modellieren (siehe die 1:N-Beziehung zwischen den Tabellen Bank und Mitarbeiter).

*/
