create table lieferant (
   lnummer int,
   lname char(20),
   jahreink int,
   stadt char(20),
   primary key (lnummer)
);

create table teil (
   tnummer int,
   tname char(20),
   gewicht int,
   farbe char(10),
   stadt char(20),
   primary key (tnummer)
);

create table projekt (
   pnummer int,
   pname char(20),
   budget int,
   stadt char(20),
   primary key (pnummer)
);

create table lpt (
   ln int,
   tn int,
   pn int,
   menge int,
   primary key (ln, tn, pn),
   foreign key (ln) references lieferant,
   foreign key (tn) references teil,
   foreign key (pn) references projekt
);
