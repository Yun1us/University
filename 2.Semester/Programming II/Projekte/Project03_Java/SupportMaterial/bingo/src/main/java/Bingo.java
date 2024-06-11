import java.util.Scanner;

public class Bingo {
    public static final int[][] BINGO_EXAMPLE = 
    {
        {4, 27, 32, 55, 73},        //Zeile 0
        {15, 25, 41, 58, 75},       //Zeile 1
        {8, 26, 0, 59, 70},         //Zeile 2
        {7, 22, 33, 54, 63},        //Zeile 3
        {13, 17, 43, 48, 67}        //Zeile 4   
    };

    public static void printBingoCard(int[][] bingoCard){                                   //gibt eine BingoCard aus
        String[] headline = {"B", "I", "N", "G", "O"};                                       //Zeichen von BINGO soll ausgegeben werden wie am Beispiel
        for(String headlines : headline){                                                   //for-each Schleife durch die Zeile
            System.out.printf("%-5s", headlines);                                   //%-5s sorgt dafuer, dass der Text in gleichmaeßiger Spaltenbreite von 5 Zeichen ausgegeben wird.
        }
        System.out.println();
        for(int i = 0; i < bingoCard.length; i++){                                      //for schleife die durch die anzahl der Zeilen geht (aeußere Schleife)
            for(int j = 0; j < bingoCard[i].length; j++){                               //for-Schleife die durch die Anzahl der Spalten geht (innere Schleife)                   
                int number = bingoCard[i][j];                                        //number ist die aktuelle Zahl an der entsprechenden Stelle von der Zeile und Spalte
                if (number == 0) {                                                      //0 bedeutet laut Aufgabe, dass die Zahl gestrichen wurde
                    System.out.printf("%-5s","   ");                     //0 wird mit "3 spaces" ersetzt
                } else{                                                                 //else wichtig, damit die 0 sich nicht verschiebt, sondern entfernt wird
                System.out.printf("%-5d", bingoCard[i][j]);                   //gibt Eintrag in Zeile i und Spalte j aus (bingoCard[i][j])
                }                                                                       //%-5.0f sorgt dafuer, dass die Zahlen in gleichmaeßiger Spaltenbreite von 5 Zeichen ausgegeben wird.
            }
            System.out.println();  }}                                                    //Zeilenumbruch nach jeder Zeile
            
    public static boolean containsDuplicates(int[][] bingoCard){ //Ersten beiden for loops checken jede  zahl in der Karte ab. Die anderen beiden for loops gehen durch jedes

        for(int zeile = 0; zeile < bingoCard.length; zeile++){                                      //for schleife die durch die anzahl der Zeilen geht (aeußere Schleife)
            for(int spalte = 0; spalte < bingoCard[zeile].length; spalte++){                         //for schleife die durch die anzahl der Spalten geht (innere Schleife)

                for(int andereZeile = 0; andereZeile < bingoCard.length; andereZeile++){                    //for schleife, die durch die anzahl der Zeilen geht (aeußere Schleife in einer schleife)
                    for(int andereSpalte = 0; andereSpalte < bingoCard[andereZeile].length; andereSpalte++){ //for schleife, die durch die anzahl der Spalten geht (innere Schleife in einer schleife)
                        if (zeile != andereZeile || spalte != andereSpalte) {                               //Somit wird geprueft, dass man nicht denselben Eintrag prueft sondern andere Eintraege im array
                            if (bingoCard[zeile][spalte] == bingoCard[andereZeile][andereSpalte] && bingoCard[zeile][spalte] != 0) {   //Wenn die verschiedenen Eintraege im Array gleich sind, dann true, wobei die Werte nicht 0 sind
                                return true;        //Wenn Duplikat
                            }
                        }
                    }
                }
            }
        }
        return false;                                                                                       //sonst false
    }          

    public static void checkBingoCard(int[][] bingoCard){
        if (bingoCard == null) {                        //pruefung, ob bingoCard null ist
            throw new IllegalArgumentException("bingoCard darf nicht null sein!");  //bingoCard darf nicht null sein
        }

        if(bingoCard.length != 5){
            throw new IllegalArgumentException("bingoCard darf nur ein zweidimensionaler quadratischer Array der Dimension 5 x 5 besitzen! Also 5 Zeilen und 5 Spalten");   //Array darf nur dimension 5x5 sein
        }

        for(int i = 0; i < bingoCard.length; i++){                  //for schleife die durch die anzahl der Zeilen geht (aeußere Schleife)
            if (bingoCard[i] == null || bingoCard[i].length != 5) {                                 //pruefung ob die Zeilen von bingoCard null sind oder nicht eine 5x5 dimension haben
                throw new IllegalArgumentException("Keine Zeile von bingoCard darf null sein und jede Zeile der bingoCard muss 5 Spalten haben!"); //die Zeilen von bingoCard duerfen nicht null sein und nur eine 5x5 dimension haben
            }
        }
        

        //Pruefung, dass die Mitte immer durchgestrichen wird
        if (bingoCard[2][2] != 0) {                                 //pruefung, ob die Mitte 0 ist                                          
            throw new IllegalArgumentException("Die Mitte ist immer gestrichen!"); //Fehlerausgabe, dass die Mitte durchgestrichen werden muss
        }  

        //Pruefung ob die Spalte gueltige Zahlen hat
        int[][] ranges = {
            {1, 15}, {16, 30}, {31, 45}, {46, 60}, {61,75}          //einen Bereich fuer die einzelnen Spalten gemacht
        };
        for(int i = 0; i < 5; i++){                          //for schleife die durch die anzahl der Zeilen geht (aeußere Schleife)
            for(int j = 0; j < 5; j++){                   //for schleife die durch die Anzahl der Spalten geht (innere schleife)
                int num = bingoCard[j][i];                  //Variable die die Zahl an der spalte j und zeile i zeigt
                // ueberprueft, ob die Zahl in der Zelle nicht null und außerhalb des erlaubten Bereichs ist
                if (num != 0 && (num < ranges[i][0] || num > ranges[i][1])) {
                    // Wirft eine Ausnahme, wenn die Zahl nicht innerhalb des spezifischen Bereichs liegt, der für jede Spalte definiert ist.
                    // Die Variable 'num' repräsentiert die aktuelle Zahl in der Bingo-Karte, 'ranges[i][0]' ist der untere Grenzwert und 'ranges[i][1]' der obere Grenzwert des zulässigen Bereichs für die Spalte 'i'.
                    // 'i' ist der Index der Spalte (von 0 bis 4), und 'j' ist der Index der Zeile (von 0 bis 4), daher wird 'i + 1' und 'j + 1' verwendet, um die menschenlesbare Position (beginnend bei 1 statt 0) in der Fehlermeldung anzugeben.
                    throw new IllegalArgumentException("Die Zahl " + num + " in Zeile " + (j + 1) + ", Spalte " + (i + 1) + " liegt nicht im gültigen Bereich von " + ranges[i][0] + " bis " + ranges[i][1] + ".");
                }
            }
        }
        
        //Pruefung auf Duplikat
        if (containsDuplicates(bingoCard)) {                    
            throw new IllegalArgumentException("bingoCard darf keine Duplikate enthalten!");    //bingoCard darf keine Duplikate enthalten
        }
    }

    public static boolean fillBingoCard(int[][] bingoCard, int number){
         //Ueberpruefen, ob die Bingokarte gueltig ist
        checkBingoCard(bingoCard);
        if (number < 1 || number > 75 || number == 0) {                //pruefen, ob number außerhalb von 1 bis 75 ist, wenn ja dann
            throw new IllegalArgumentException("number muss zwischen 1 und 75 liegen und darf nicht 0 sein!"); //Fehlerausgabe
        }
        for(int i = 0; i < bingoCard.length; i++){             //for schleife die durch die anzahl der Zeilen geht (aeußere Schleife)
            for(int j = 0; j < bingoCard[i].length; j++){       //for schleife die durch die anzahl der Spalten geht (innere Schleife)
                if (bingoCard[i][j] == number) {                //Wenn number vorhanden ist
                    bingoCard[i][j] = 0;                        //dann auf 0 initialisiert, was bedeutet, dass es gestrichen wird
                    return true;                                // also ja
                }
            }
        }
        return false;       //sonst falsch also nicht vorhanden
    }

    public static boolean bingo(int[][] bingoCard){
        // Ueberpruefung jeder Zeile auf ein komplettes Bingo
        for(int i = 0; i < bingoCard.length; i++){          //for schleife die durch die anzahl der Zeilen geht (aeußere Schleife)
            boolean isBingo = true;                         //falls Bingo. Wird einzeln in den jeweiligen Bedingungen geprueft und somit kann der Wert zurueckgesetzt werden
            for(int j = 0; j < bingoCard[i].length; j++){  //for schleife die durch die anzahl der Spalten geht (innere Schleife)
               if (bingoCard[i][j] != 0) {  // Wenn irgendein Element in der Zeile nicht 0 ist
                isBingo = false;   //dann falsch (kein bingo)
                break; //Wenn ein element nicht 0 ist, bricht die innere Schleife ab
               }
            }
            if (isBingo) {  //wenn doch
                return true; //ansonsten true (bingo)   -> wenn alle Elemente einer Zeile 0 sind
            }
        }
        //Ueberpruefung jeder Spalte
        for(int j = 0; j < bingoCard[0].length; j++){   // For-Schleife, die durch die Anzahl der Spalten geht
            boolean isBingo = true;                     //falls Bingo. Wird einzeln in den jeweiligen Bedingungen geprueft und somit kann der Wert zurueckgesetzt werden
            for(int i = 0; i < bingoCard.length; i ++){ //for schleife die durch die anzahl der Zeilen geht (aeußere Schleife)
                if (bingoCard[i][j] != 0) {  // Wenn irgendein Element in der Zeile nicht 0 ist
                    isBingo = false;  //dann falsch (kein Bingo)
                    break;          //Wenn ein element nicht 0 ist, bricht die innere Schleife ab
                }
            }
            if (isBingo) { //wenn doch
            return true; //ansonsten true (bingo) -> wenn alle elemente einer Spalte 0 sind
            }
        }
        //Ueberpruefung der Diagonale auf ein komplettes Bingo
        boolean diagonaleEins = true;                                 //falls Bingo. Wird einzeln in den jeweiligen Bedingungen geprueft und somit kann der Wert zurueckgesetzt werden
        for(int i = 0; i < bingoCard.length; i++){              //for schleife die durch die anzahl der Zeilen geht (aeußere Schleife)
            if(bingoCard[i][i] != 0){                           //Wenn die Diagonale nicht 0 ist, dann
                diagonaleEins = false;                                   //false (kein bingo)
                break;          //Wenn ein element nicht 0 ist, bricht die innere Schleife ab
            }
        }
        if(diagonaleEins)//wenn doch
            return true; //ansonsten true(bingo) -> wenn alle element der diagonale 0 sind
            

        //Ueberpruefung der anderen Diagonale auf ein komplettes Bingo
        boolean diagonaleZwei = true;                                 //falls Bingo. Wird einzeln in den jeweiligen Bedingungen geprueft und somit kann der Wert zurueckgesetzt werden
        for(int i = 0; i < bingoCard.length; i++){                  //for schleife die durch die anzahl der Zeilen geht (aeußere Schleife)
            if (bingoCard[i][bingoCard.length -1 - i] != 0) {       // Wenn irgendein Element in der diagonale nicht 0 ist
                diagonaleZwei = false;   //false (kein bingo)
                break;          //Wenn ein element nicht 0 ist, bricht die innere Schleife ab
            }
        }
        if(diagonaleZwei){ //wenn doch
            return true; //ansonsten true(bingo) -> wenn alle element der diagonale 0 sind
            }

        return false; //wenn keine der Bedingungen, also keine Zeile/Spalte oder eine von den Diagonalen nicht gestrichen wurde, dann kein bingo (false)
    }
    public static void main(String[] args) {
        int[][] bingoCard = BINGO_EXAMPLE;                                              // Verwenden der Bingo-Karte
        printBingoCard(bingoCard);                                                  // Zeige die aktuelle Bingo-Karte
        Scanner scanner = new Scanner(System.in);                                   // Scanner für die Eingabe erstellen
        

        while (true) {                                                 
            System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 75 ein:");   //Pruefe auf Gueltigkeit
            int number = scanner.nextInt();                                             // Zahl vom Nutzer einlesen

            if (number < 1 || number > 75) {                                            //Wenn nicht gueltig
                System.out.println("Ungültige Eingabe, bitte versuchen Sie es erneut.");    //Fehlerausgabe
                continue;  // Zurück zum Beginn der Schleife, wenn die Eingabe ungültig ist
            }
  
            if (fillBingoCard(bingoCard, number)) {                                         // Die Zahl auf der Karte streichen   
                System.out.println("Gezogene Zahl: " + number);
                System.out.println("Treffer!");
            } else {                                                                        //Wenn es nicht die Zahl auf der bingo karte ist
                System.out.println("Gezogene Zahl: " + number);
                System.out.println("Kein Treffer!");
            }

            if (bingo(bingoCard)) {  // Überprüfen, ob ein Bingo erreicht wurde
                System.out.println("BINGO ! BINGO ! BINGO ! BINGO ! BINGO ! BINGO !");
                printBingoCard(bingoCard);  // Zeige die endgültige Bingo-Karte
                break;  // Beende die Schleife, wenn ein Bingo erreicht wurde
            }
            printBingoCard(bingoCard);                                      //gib bingoCard aus
        }
        scanner.close();  // Scanner schließen
    }
}