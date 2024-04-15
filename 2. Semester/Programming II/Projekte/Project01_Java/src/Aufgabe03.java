import java.util.Scanner;
import java.util.Random;
public class Aufgabe03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Wie viele Aufgaben wollen Sie rechnen?");
        int anzahlaufgaben = scanner.nextInt();
        int anzahlrichtig = 0;

        for(int i = 0; i < anzahlaufgaben; i++){
            int random1 = random.nextInt(10);
            int random2 = random.nextInt(10);

            System.out.printf("Was ist %d * %d\n", random1, random2);
            int userloesung = scanner.nextInt();

            int richtigeloesung = random1 * random2;
            if(richtigeloesung == userloesung){
                anzahlrichtig += 1;
                System.out.println("Richtig!!!!");
            }else{
                System.out.println("Falsch :(");
            }
        }
        System.out.printf("%d von %d Aufgaben korrekt" , anzahlrichtig, anzahlaufgaben);
        double prozent = (anzahlrichtig * 100)/anzahlaufgaben;
        System.out.println("in Prozent: "+ prozent + "%");
        scanner.close();
    }
}
