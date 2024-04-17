public class Aufgabe04 {
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
}
