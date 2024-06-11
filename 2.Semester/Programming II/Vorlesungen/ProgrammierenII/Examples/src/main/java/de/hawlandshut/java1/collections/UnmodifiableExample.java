package de.hawlandshut.java1.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import static java.lang.System.out;

public class UnmodifiableExample {

  private static Item salad = new Item("Salat", 2);
  private static Item choc = new Item("Schokolade", 1);
  private static Item toiletpaper = new Item("Toilettenpapier", 3);


  // snippet: hamster
  public static void printMap(Map<Item,Integer> stock) {
    out.println(stock);
    stock.remove(toiletpaper); // muahahaha!
  }
  // snippet: /hamster

  public static void modifiableMapExample() {
    // snippet: modifiableMapExample
    // *@\Gradle{runModifiableMapExample}@*
    var stock = new HashMap<Item,Integer>();
    stock.put(salad, 10);
    stock.put(choc, 50);
    stock.put(toiletpaper, 50);

    printMap(stock);
    // snippet: /modifiableMapExample
    out.println(stock);
  }

  public static void unmodifieableMapExample() {
    var stock = new HashMap<Item,Integer>();
    stock.put(salad, 10);
    stock.put(choc, 50);
    stock.put(toiletpaper, 50);
    // snippet: unmodifieableMapExample
    // *@\Gradle{runUnmodifieableMapExample}@*
    Map<Item,Integer> unmodifiableStock =
      Collections.unmodifiableMap(stock);

    printMap(unmodifiableStock);
    // snippet: /unmodifieableMapExample
    out.println(stock);
  }
  
  
  
  
}
