public class Aufgabe04 {
    public static final int MAX_ITERATIONS = 100_000; //Hier sind die 2 Konstanten aufgelistet die in der Aufgabe gelistet sind. 
    public static final double MIN_CHANGE = 1e-5;
    
    public static double Funktionswert(double x) { // wie in der Aufgabenstellung ist hier der Funktionswert wiedergegeben
        return Math.sin(Math.PI * x);
    }

    public static void main(String[] args) {
        double pointsUnderCurve = 0;
        double approxInt = 0;
        double allPoints = 0;
        double lastapproxdouble = -1;
        double diff = 0;

        for (int i = 0; i < MAX_ITERATIONS; i++) { // Schleife in der  2 randoms erstellt werden und all points um 1 pro durchlauf erhöht wird 
            double x = Math.random();
            double y = Math.random();
            allPoints++;

            if(y <= Funktionswert(x)){ // Wenn der random y wert and der y stelle des funktionswerts kleiner ist dann wird pointsundercurve um 1 erhöht 
                pointsUnderCurve++;

            }

            lastapproxdouble = approxInt; // Speichert den letzten integer von approxInt 
            approxInt = pointsUnderCurve / allPoints; // Hier wird die Schätzung berechnet 

            diff = Math.abs(approxInt - lastapproxdouble); // eine differenz wird gebildet um später die änderung zu prüfen  

            if(i > 0 && diff < MIN_CHANGE){ // hier checkt man ab ob i > 0 ist um sicherzustellen dass die schleife mindestens einmal durchgegenagne ist
                break; // wenn nicht, dann wird hier die Schleife unterbrochen 
            }
        }
        System.out.printf("Die Schätzung beträgt: %.5f%n (%f)", approxInt, allPoints); //formatierung von argumenten die dann ausgegeben werden 
    }
}
