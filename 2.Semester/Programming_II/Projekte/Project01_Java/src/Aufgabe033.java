import java.util.Scanner;

public class Aufgabe033 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Wie viele Aufgaben wollen sie Rechnen?");
        int anzahlaufgaben = scanner.nextInt();
        int anzahlrichtig = 0; 

        for(int i = 0; i <= anzahlaufgaben; i++){
            double a = Math.random(10);
            double b = Math.random(10);
            System.out.println("Was ist " + a + "* " + b + "?");
            double richtigeloesung = a * b;
            int userloesung = scanner.nextInt();
            if(userloesung == richtigeloesung){
                System.out.println("Richtig!");
                anzahlrichtig++;
            }
            else{
                System.out.println("Leider nicht Richtig!");
            }
        }
        int prozent = (anzahlrichtig * 100) / anzahlaufgaben;
        System.out.println(anzahlrichtig+ " von "+anzahlaufgaben+ " Aufgaben korrekt" +"("+  prozent+"%)" );
        scanner.close();
        
    }
}

/*
 * import java.util.Scanner;

public class Aufgabe033 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie viele Aufgaben wollen Sie rechnen? (keine negativen Zahlen)");
        int anzahlaufgaben = scanner.nextInt();

        while (anzahlaufgaben < 0) {
            System.out.println("Bitte geben Sie eine nicht-negative Zahl ein:");
            anzahlaufgaben = scanner.nextInt();
        }

        int anzahlrichtig = 0; 

        for(int i = 0; i < anzahlaufgaben; i++){
            int a = (int) (Math.random() * 10);
            int b = (int) (Math.random() * 10);
            System.out.println("Was ist " + a + " * " + b + "?");
            int richtigeLoesung = a * b;
            int userLoesung = scanner.nextInt();

            if(userLoesung == richtigeLoesung){
                System.out.println("Richtig!");
                anzahlrichtig++;
            }
            else{
                System.out.println("Leider nicht richtig!");
            }
        }
        int prozent = (anzahlrichtig * 100) / anzahlaufgaben;
        System.out.println(anzahlrichtig + " von " + anzahlaufgaben + " Aufgaben korrekt (" + prozent + "%)");

        // Hinweis abhängig vom Prozentsatz
        if (prozent >= 99) {
            System.out.println("Ausgezeichnet!");
        } else if (prozent >= 90) {
            System.out.println("Sehr gut!");
        } else if (prozent >= 75) {
            System.out.println("Gut gemacht!");
        } else if (prozent >= 50) {
            System.out.println("Nicht schlecht!");
        } else if (prozent >= 25) {
            System.out.println("Da ist noch Luft nach oben.");
        } else {
            System.out.println("Mehr Übung ist nötig.");
        }

        scanner.close();
    }
}

 */
