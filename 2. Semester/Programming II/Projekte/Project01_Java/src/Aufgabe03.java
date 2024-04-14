import java.util.Scanner;
import java.util.Random;
public class Aufgabe03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Wie viele Aufgaben wollen Sie rechnen?");
        int numoftask = scan.nextInt();
        int anzahlrichtig = 0;

        for(int i = 0; i < numoftask; i++){
            int random1 = random.nextInt(10);
            int random2 = random.nextInt(10);

            System.out.printf("Was ist %d * %d\n", random1, random2);
            int userloesung = scan.nextInt();

            int correctnum = random1 * random2;
            if(correctnum == userloesung){
                anzahlrichtig += 1;
                System.out.println("Richtig!!!!");
            }else{
                System.out.println("Falsch :(");
            }
            System.out.printf("%d von %d Aufgaben korrekt\n" , anzahlrichtig, numoftask);
            int prozent = (anzahlrichtig * 100)/numoftask;
            System.out.println("in Prozent: "+ prozent + "%");


        }
    }
}
