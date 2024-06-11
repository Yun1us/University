package de.hawlandshut.java1.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.out;

import de.hawlandshut.java1.collections.Item;

public class ParseExamples {

  public static class ParseException extends Exception{
    public ParseException(String message){
      super(message);
    }

    public ParseException(String message, Throwable cause){
      super(message, cause);
    }

    public ParseException(Throwable cause){
      super(cause);
    }

  }

  // snippet: parseCSV
  public static Map<Item, Integer> parseCSV(String path) 
    throws IOException, ParseException {

    var stock = new HashMap<Item, Integer>();

    // BufferedReader für zeilenweises lesen
    var in = new BufferedReader(new FileReader(path));

    String line;

    // Zeile für Zeile lesen
    while ((line = in.readLine()) != null){

      // Zeile an Semikolons trennen
      String[] fields = line.split(";");

      // genau drei Felder erwartet
      if (fields.length != 3)
        throw new ParseException("Invalid line: "+line);

      String name = fields[0];

      // Preis und Menge
      int price;
      int amount;

      try{
        // parsen von Preis
        price = Integer.parseInt(fields[1]);
        // prasen von Menge
        amount = Integer.parseInt(fields[2]);
      } catch (NumberFormatException e){
        throw new ParseException(e);
      }

      Item item = new Item(name, price);

      stock.put(item, amount);

    }

    in.close();

    return stock;
  }
  // snippet: /parseCSV

  public static void parseCSVExample() throws IOException {
    // snippet: parseCSVExample
    // *@\Gradle{runParseCSVExample}@*
    try {
      Map<Item, Integer> stock =
        parseCSV("stock.csv");

      for (Map.Entry<Item, Integer> entry : stock.entrySet()){
        out.printf("%s, %d Stück%n",
            entry.getKey(), entry.getValue());
      }
    }catch (ParseException e){
      e.printStackTrace();
    }
    // snippet: /parseCSVExample
  }

  // snippet: parseCSVScanner
  public static Map<Item, Integer> parseCSVScanner(String path)
    throws IOException, ParseException {

    var stock = new HashMap<Item, Integer>();

    // Scanner erstellen, der auf Datei-Eingabestrom zeigt
    var file = new FileInputStream(path);
    var scanner = new Scanner(file, "UTF-8");

    scanner.useDelimiter("(;|\\R)");

    while (scanner.hasNextLine()){

      // zu füllende Variablen
      String name;
      int price;
      int amount;

      // String einlesen
      if (scanner.hasNext())
        name = scanner.next();
      else throw new ParseException("name expected");

      // int einlesen
      if (scanner.hasNextInt())
        price = scanner.nextInt();
      else throw new ParseException("price expected");

      // int einlesen
      if (scanner.hasNextInt())
        amount = scanner.nextInt();
      else throw new ParseException("amount expected");

      if (!scanner.nextLine().isBlank())
        throw new ParseException("unknown content after last entry");

      Item item = new Item(name, price);
      stock.put(item, amount);
    }

    scanner.close();

    return stock;

  }
  // snippet: /parseCSVScanner
  
  public static void parseCSVScannerExample() throws IOException {
    // snippet: parseCSVScannerExample
    // *@\Gradle{runParseCSVScannerExample}@*
    try {
      Map<Item, Integer> stock =
        parseCSVScanner("stock.csv");

      for (Map.Entry<Item, Integer> entry : stock.entrySet()){
        out.printf("%s, %d Stück%n",
            entry.getKey(), entry.getValue());
      }
    }catch (ParseException e){
      e.printStackTrace();
    }
    // snippet: /parseCSVScannerExample
  }
  


}
