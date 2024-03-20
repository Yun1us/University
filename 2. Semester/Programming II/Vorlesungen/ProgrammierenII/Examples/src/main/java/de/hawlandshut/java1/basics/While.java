package de.hawlandshut.java1.basics;

import java.util.Iterator;
import java.util.Scanner;

public class While
{

  // snippet: findContainingString
  // *@\Gradle{runFindContainingString}@*
  public static void findContainingString(
      Iterator<String> stringsIterator, 
      String searchString) {
    String match = null;
    while (stringsIterator.hasNext()){
      String candidate = stringsIterator.next();

      // zu kurze Strings sofort verwerfen
      if (candidate.length() < searchString.length()){
        System.out.printf("\"%s\" ist zu kurz.%n", candidate);
        continue;
      }

      if (candidate.contains(searchString)){
        match = candidate;
        break;
      }else{
        System.out.printf("Kein Treffer: \"%s\"%n", candidate);
      }
    }

    if (match != null){
      System.out.printf("Treffer: \"%s\"%n", match);
    }else{
      System.out.printf("Leider nichts gefunden.%n");
    }
  }
  // snippet: /findContainingString


  public static void doWhileExample() {
    var scanner = new Scanner(System.in);
    // snippet: doWhileExample
    // *@\Gradle{runDoWhileExample}@*
    boolean validInput = false;
    boolean confirmed = false;

    do{
      System.out.println("Sind die einverstanden?");

      String answer = scanner.nextLine();

      switch (answer.toUpperCase()){
        case "YES": case "JA": case "OUI":
          confirmed = true;
          validInput = true;
          break;


        case "NO": case "NEIN": case "NON":
          confirmed = false;
          validInput = true;
          break;

        default:
          System.out.println("Ich verstehe Sie nicht.");
      }

    } while (!validInput);

    System.out.printf("Einverstanden: %b%n", confirmed);
    // snippet: /doWhileExample
    scanner.close();
  }
}
