package de.hawlandshut.java1.basics;

public class Blocks
{
  public static void blocksExample(){
    // snippet: blocksExample
    // *@\Gradle{runBlocksExample}@*
    double x = Math.random();
    if (x > 0) { // if-Block
      String ausgabe = "Die Zufallszahl ist: %f%n";

      // Bloecke kann auch man zur Strukturierung verwenden
      { 
        String s = "Dieser String ist nur hier sichtbar";

        // sichtbar: x, ausgabe, s
        System.out.println(s);
        System.out.printf(ausgabe, x);
      }

      // sichtbar: x, ausgabe
      // System.out.println(s); // FEHLER "unknown symbol s"
      System.out.printf(ausgabe, x);
    }
    // snippet: /blocksExample
  }

}


