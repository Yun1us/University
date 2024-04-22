public class Aufgabe02 {
    public static void main(String[] args){
        switch(args.length){ // switch case mit args lenght als expression 
            case 0: // case 0 wenn keine Argumente eingegeben werden 
                System.out.println("Verfügbare Berechnungen: Kugel, Pyramide, Quader");
                break;
            case 1: // case 1 wenn 1 Argument als Parameter eingegeben wird
                double radius = Double.parseDouble(args[0]); //Array an der Stelle 0 wird in eine double
                double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); // Volumenberechnung 
                System.out.println("Kugelvolumen beträgt: " + volumen); 
                break;
            case 2: // case 2 bei 2 Arguments als Parameter 
                double grundseite = Double.parseDouble(args[0]); 
                double hoehe = Double.parseDouble(args[1]);
                double volumen2 = (1.0 / 3.0) * Math.pow(grundseite, 2) * hoehe; //Volumenbrecehnung einer Pyramide
                System.out.println("Pyramidenvolumen beträgt: " + volumen2 ); 
                break;
            case 3:
                double laenge = Double.parseDouble(args[0]);
                double breite = Double.parseDouble(args[1]);
                double hoehe2 = Double.parseDouble(args[2]);
                double volumen3 = laenge * breite * hoehe2; //Volumenberechnung eines Quaders 
                System.out.println("Quadervolumen beträgt: " + volumen3);
                break;
            default:
                System.out.println("Invalid Parameter was given!");
        }
    }
}
