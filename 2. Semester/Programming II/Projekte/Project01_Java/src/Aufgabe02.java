public class Aufgabe02 {
    public static void main(String[] args){
        switch(args.length){
            case 0:
                System.out.println("Verfügbare Berechnungen: Kugel, Pyramide, Quader");
                break;
            case 1:
                double radius = Double.parseDouble(args[0]);
                double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
                System.out.println("Kugelvolumen beträgt: " + volumen);
                break;
            case 2:
                double grundseite = Double.parseDouble(args[0]);
                double hoehe = Double.parseDouble(args[1]);
                double volumen2 = (1.0 / 3.0) * Math.pow(grundseite, 2) * hoehe;
                System.out.println("Pyramidenvolumen beträgt: " + volumen2 );
                break;
            case 3:
                double laenge = Double.parseDouble(args[0]);
                double breite = Double.parseDouble(args[1]);
                double hoehe2 = Double.parseDouble(args[2]);
                double volumen3 = laenge * breite * hoehe2;
                System.out.println("Quadervolumen beträgt: " + volumen3);
                break;
            default:
                System.out.println("Invalid Parameter was given!");
        }
    }
}
