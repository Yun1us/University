--## 1 ##--
--# Alle Informationen über alle Banken in der Tabelle Bank.
--SELECT * FROM bank;

--## 2 ##--
--# Alle Informationen über die Banken mit Geschäftssitz Hamburg in der Tabelle Bank.
--SELECT * FROM bank WHERE geschaeftssitz = 'Hamburg';

--## 3 ##--
--# Die Namen und Wohnorte der Mitarbeiter, die ab dem 28.4.1998 angestellt wurden, geordnet nach Namen.
--SELECT mname, wohnort FROM mitarbeiter WHERE anstellungsdatum >= '1998-04-28' ORDER BY mname

--## 4 ##--
--# Join in zwei Notationen (Komma-Schreibweise und Join-Schreibweise):
--# Die Namen und Wohnorte der Bank-mitarbeiter, mit dem Namen und der Bankleitzahl ihrer Bank,
--# aber nur, wenn die Mitarbeiter ein niedriges Monatsgehalt (< 2500€) haben.
--SELECT mname, wohnort, bname, blz FROM mitarbeiter, bank WHERE arbeitgeber_bank = bname AND monatsgehalt < 2500
--SELECT mname, wohnort, bname, blz FROM mitarbeiter JOIN bank ON arbeitgeber_bank = bname WHERE monatsgehalt < 2500

--## 5 ##--
--# Join über drei Tabellen: Die Nummern und Arten der Konten, die Kunden unterhalten,
--# die durch den Mitarbeiter Olafson betreut werden.
--SELECT kontonr, kontoart from konto, unterhaelt, kunde WHERE kontonr = kontonummer AND inhaber = kname AND betreuer = 'Olafson';
--SELECT kontonr, kontoart from konto JOIN unterhaelt ON kontonr = kontonummer JOIN kunde ON inhaber = kname WHERE betreuer = 'Olafson';

--## 6a ##--
--# Die Besitzer, Nummern und Guthaben der Tagesgeldkonten, die Kunden unterhalten,
--# die durch Mitarbeiter von Frankfurter Banken betreut werden,
--# geordnet nach den Kontobesitzern, bei gleichem Kontobesitzer nach Kontonummer.
--SELECT kname, kontonr, guthaben FROM konto, unterhaelt, kunde, mitarbeiter, bank WHERE kontoart = 'Tagesgeld'
--AND kontonr = kontonummer AND inhaber = kname AND betreuer = mname AND arbeitgeber_bank = bname AND geschaeftssitz = 'Frankfurt'
--ORDER BY kname, kontonr;

--## 6b ##--
--# Die Besitzer, Nummern und Guthaben der Tagesgeldkonten, die Kunden unterhalten,
--# die bei Filialen von Frankfurter Banken geführt werden, wiederum
--# geordnet nach den Kontobesitzern, bei gleichem Kontobesitzer nach Kontonummer.
--SELECT kname, kontonr, guthaben FROM konto, unterhaelt, kunde, filiale, bank WHERE kontoart = 'Tagesgeld'
--AND kontonr = kontonummer AND inhaber = kname AND zustaendige_filiale = fname AND mutterbank = bname AND geschaeftssitz = 'Frankfurt'
--ORDER BY kname, kontonr;

--## 7 ##--
--# Die Anzahl der Mitarbeiter aus Hamburg.
--SELECT COUNT(*) AS anz_ma_hamburg FROM mitarbeiter WHERE wohnort = 'Hamburg';

--## 8 ##--
--# Die Namen der Mitarbeiter mit überdurchschnittlichem Monatsgehalt, und ihre Monatsgehälter
--SELECT mname, monatsgehalt FROM mitarbeiter WHERE monatsgehalt > (
--	SELECT AVG(monatsgehalt) FROM mitarbeiter);

--## 9 ##--
--# Die Namen der Mitarbeiter und ihrer Bank, die das folgende Kriterium erfüllen:
--# sie betreuen Kunden aus Leipzig
--SELECT mname, arbeitgeber_bank FROM mitarbeiter WHERE mname IN (
--	SELECT betreuer FROM kunde WHERE wohnort = 'Leipzig');

--## 10 ##--
--# Zwei äquivalente Selects: ein geschachteltes Select und ein
--# Select mit einem Join über zwei Tabellen:
--# Die Kontonummern und Guthaben aller Girokonten der Filialen der BlackBank,
--# absteigend geordnet nach Kontonummer
--SELECT kontonr, guthaben FROM konto WHERE kontoart = 'Giro' AND anlage_filiale IN (
--	SELECT fname from filiale WHERE mutterbank = 'BlackBank')
--ORDER BY kontonr DESC;
--SELECT kontonr, guthaben FROM konto JOIN filiale ON anlage_filiale = fname
--WHERE kontoart = 'Giro' AND mutterbank = 'BlackBank' ORDER BY kontonr DESC;
