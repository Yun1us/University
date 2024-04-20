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
public class Aufgabe04{
    public static void main(String[] args){
        double MAX_ITERATIONS = 100_000;
        double MIN_CHANGE = Math.pow(10, -5);
        double pointsUnderCurve = 0;
        double approxInt = 0;
        double allpoints = 0;
        for(int i = 0; i < MAX_ITERATIONS; i++){
            double x = Math.random();
            double y = Math.random();
            allpoints++;

            if(y <= Funktionswert(x)){
                pointsUnderCurve++;
            }
        }
        
    }
    public static double Funktionswert(double x){
        return Math.sin(Math.PI) * x;

        }
}