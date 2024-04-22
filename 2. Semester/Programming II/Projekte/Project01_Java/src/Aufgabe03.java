import java.util.Scanner; // Scanner importieren´für spätere nutzung
import java.util.Random; // Random importieren für spätere nutzung
public class Aufgabe03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Neue instanz der Klasse Scanner wird gebildet 
        Random random = new Random(); // Neue Instanz der Klasse Random wird gebildet

        System.out.println("Wie viele Aufgaben wollen Sie rechnen?");
        int anzahlaufgaben = scanner.nextInt(); // Hier ist die Int die vom User festgelegt wird 
        int anzahlrichtig = 0;  // Counter der die Anzahl der richtigen Aufgaben zählt

        for(int i = 0; i < anzahlaufgaben; i++){
            int random1 = random.nextInt(10); // neue random int von 0-9 wird erstellt 
            int random2 = random.nextInt(10); // neue random int von 0-9 wird erstellt 

            System.out.printf("Was ist %d * %d\n", random1, random2); // %d sind Platzhalter für random1 und random2 in reihenfolge 
            int userloesung = scanner.nextInt(); // Die Lösung die der User eingibt 

            int richtigeloesung = random1 * random2; // berechnung der richtigen Lösung
            if(richtigeloesung == userloesung){ // richtigelösung wird mit userlösung verglichen 
                anzahlrichtig++; // sofern richtig wird anzahlrichtig pro durchlauf um 1 erhörht 
                System.out.println("Richtig!!!!"); 
            }else{
                System.out.println("Falsch :(");
            }
        }
        System.out.printf("%d von %d Aufgaben korrekt" , anzahlrichtig, anzahlaufgaben); // %d als Platzhalter in Reihenfolge 
        double prozent = (anzahlrichtig * 100)/anzahlaufgaben; // Berechnung der Prozentzahl 
        System.out.println("in Prozent: "+ prozent + "%"); // Ausgabe der Prozentzahl 
        scanner.close(); // scanner wird geschlossen 

        if(prozent <= 50){  // wenn weniger oder geanu 50 prozent erzielt wurde dann 
            System.out.println("Mehr Übung wäre nicht schlecht!");             // wird ausgegeben 
        }
        else if(prozent > 50){ // bei mehr als 50 prozent 
            System.out.println("Gut gemacht!"); // wird ausgegeben 
        }
    }
}
