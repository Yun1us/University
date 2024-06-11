package de.hawlandshut.java1.basics;

import java.util.Scanner;

public class ConsoleIO
{
  public static void printExample(){
    // snippet: printExample
    // *@\Gradle{runPrintExample}@*
    System.out.print("Hello World!\n");
    System.out.println(123);
    System.out.print("Die Kreiszahl PI ist: ");
    System.out.println(Math.PI);
    // snippet: /printExample
  }

  public static void printConcatExample(){
    // snippet: printConcatExample
    // *@\Gradle{runPrintConcatExample}@*
    double radius = 2.0f;
    System.out.println(
        "Ein Kreis mit Radius " + radius 
        + " hat eine Fläche von " + (Math.PI * radius * radius));
    // snippet: /printConcatExample
  }

  public static void printBadConcatExample(){
    // snippet: printBadConcatExample
    // *@\Gradle{runPrintBadConcatExample}@*
    System.out.println( "2 plus 2 = " + 2 + 2);
    // snippet: /printBadConcatExample

  }

  public static void printfExample() {
    // snippet: printfExample
    // *@\Gradle{runPrintfExample}@*
    double radius = 2.0;
    System.out.printf( "%d + %d = %d%n", 2, 2, 2 + 2);
    System.out.printf("Gravitationskonstante %e m^3/(kg*s^2)%n", CelestialBody.GRAVITATIONAL_CONSTANT);
    System.out.printf("PI ist ungefähr: %f%n", Math.PI);
    System.out.printf( 
        "Ein Kreis mit Radius %.2f hat eine Fläche von %.2f%n", 
        radius, (Math.PI * radius * radius));
    // snippet: /printfExample
  }

  public static void simpleScannerExample(){
    // snippet: simpleScannerExample
    // *@\Gradle{runSimpleScannerExample}@*
    var scanner = new Scanner(System.in); 

    System.out.println("Radius: ");
    double radius = scanner.nextDouble(); 

    scanner.nextLine(); 

    System.out.println("Einheit: ");
    String unit = scanner.nextLine(); 

    System.out.printf( 
        "Kreisfläche: %.2f %s^2%n", (Math.PI * radius * radius), unit);

    scanner.close();
    // snippet: /simpleScannerExample
  }

}


