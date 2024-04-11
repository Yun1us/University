public class Volumenberechner {
    public static void main(String[] args){
        switch(args.length){
            case 0:
            System.out.println("Aufruf: java Flaechenberechner");
            System.out.println("Verfügbare Berechnungen:");
            System.out.println("Kugel: Radius");
            System.out.println("Pyramide: Grundseite Höhe");
            System.out.println("Quader: Länge Breite Höhe");
            
            case 1:
            double radius = Double.parseDouble(args[0]);
            double volumen = (4 / 3) * Math.PI * Math.pow(radius, 3);
            System.out.println("Kugelvolumen beträgt: " + volumen);

            case 2: 
            double Grundseite = Double.parseDouble(args[0]);
            double Höhe = Double.parseDouble(args[1]);
            double volumen2 = (1 / 3) * Math.pow(Grundseite , 2) * Höhe;
            System.out.println("Pyramidenvolumen beträgt: " + volumen2);

            case 3:
            double Länge = Double.parseDouble(args[0]);
            double Breite = Double.parseDouble(args[1]);
            double Höhe3 = Double.parseDouble(args[2]);
            double volumen3 = Länge * Breite * Höhe3;
            System.out.println("Quadervolumen beträgt: " + volumen3);

        }
    }
}
