/*public class Aufgabe04 {
    public static void main(String[] args){
        int n = 10000;
        int unterekurvenpunkte = 0;
        for(int i = 0; i < n; i++){
        double x = Math.random();
        double y = Math.random(); 
        
        if(y < Funktionswert(x)){
            unterekurvenpunkte++;               
        }
        }

        double schätzung = (double) unterekurvenpunkte / n;
        System.out.println("Die Schätzung beträgt: " + schätzung);

        
        
        
    }
    public static double Funktionswert(double x){
        return x;
    }
}*/ 
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

        for (int i = 0; i < MAX_ITERATIONS; i++) {
            double x = Math.random();
            double y = Math.random();
            allPoints++;

            if(y <= Funktionswert(x)){
                pointsUnderCurve++;

            }

            lastapproxdouble = approxInt;
            approxInt = pointsUnderCurve / allPoints;

            diff = Math.abs(approxInt - lastapproxdouble);

            if(i > 0 && diff < MIN_CHANGE){ // hier checkt man ab ob i > 0 ist um sicherzustellen dass die schleife mindestens einmal durchgegenagne ist
                break;
            }
        }
        System.out.printf("Die Schätzung beträgt: %.5f%n (%f)", approxInt, allPoints);
    }
}
