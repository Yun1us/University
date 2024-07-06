public class Aufgabe02_1 {
    public static void main(String[] args){
        if (args.length > 3){
            throw new IllegalArgumentException("Anzahl der Argumente darf nicht 3 überschreiten!");
        }
        switch(args.length){
            case 0:
                System.out.println("Aufruf: Java Flaechenberechner"
                                + "Verfügbare Berechnungen:"
                                + "Kugel: Radius"
                                + "Pyramide: Grundseite Höhe"
                                + "Quader: Länge Breite Höhe");
            case 1: 
                System.out.println("Kreis: Radius r bitte eingeben");
                double radius = Double.parseDouble(args[0]);
                double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
                System.out.println("Kreisvolumen beträgt: " + volumen);
            case 2:
                System.out.println("Pyramide: Grundseite g und Höhe h");
                double grundseite = Double.parseDouble(args[0]);
                double hoehe = Double.parseDouble(args[1]);
                double volumen2 = (1.0 / 3.0) * Math.pow(grundseite, 2) * hoehe;
                System.out.println("Pyramidenvolumen beträgt: " + volumen2);
        }
    }
}
