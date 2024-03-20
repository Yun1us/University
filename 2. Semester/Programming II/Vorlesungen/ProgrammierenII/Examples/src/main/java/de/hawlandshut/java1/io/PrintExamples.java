package de.hawlandshut.java1.io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Map;

import de.hawlandshut.java1.collections.Item;

public class PrintExamples {

  // snippet: exportToCSV
  public static void exportToCSV(Map<Item,Integer> stock, 
      OutputStream outputStream) throws IOException {

    var out = new PrintStream(outputStream);
    for (var entry : stock.entrySet()){
      Item item = entry.getKey();
      int amount = entry.getValue();

      out.printf("%s;%d;%d%n",
          item.getName(),
          item.getPrice(),
          amount);
    }

    out.close();
  }
  // snippet: /exportToCSV

  // snippet: exportToJson
  public static void exportToJson(Map<Item,Integer> stock, 
      Writer writer) throws IOException {

    var out = new PrintWriter(writer);

    out.println("{ \"stock\": ");
    out.println("  [ ");

    boolean first = true;

    for (var entry : stock.entrySet()){
      Item item = entry.getKey();
      int amount = entry.getValue();

      if (!first)
        out.println(",");
      first = false;

      out.printf("    { \"name\" : \"%s\", \"price\": %d, \"amount\": %d }",
          item.getName(),
          item.getPrice(),
          amount);
    }

    out.println();
    out.println("  ]");
    out.println("}");

    out.close();
  }
  // snippet: /exportToJson


  public static void exportToJsonExample() throws IOException {
    // snippet: exportToJsonExample
    // *@\Gradle{runExportToJsonExample}@*
    var salad = new Item("Salat", 2);
    var choc = new Item("Schokolade", 1);
    var milk = new Item("Milch", 2);
    var toiletpaper = new Item("Toilettenpapier", 3);

    var stock = Map.of(
        salad, 10,
        choc, 50,
        milk, 30,
        toiletpaper, 2);

    var file = new FileWriter("stock.json");
    exportToJson(stock, file);
    // snippet: /exportToJsonExample
  }

  public static void exportToCSVExample() throws IOException {
    // snippet: exportToCSVExample
    // *@\Gradle{runExportToCSVExample}@*
    var salad = new Item("Salat", 2);
    var choc = new Item("Schokolade", 1);
    var milk = new Item("Milch", 2);
    var toiletpaper = new Item("Toilettenpapier", 3);

    var stock = Map.of(
        salad, 10,
        choc, 50,
        milk, 30,
        toiletpaper, 2);

    var file = new FileOutputStream("stock.csv");
    exportToCSV(stock, file);
    // snippet: /exportToCSVExample
  }

}
