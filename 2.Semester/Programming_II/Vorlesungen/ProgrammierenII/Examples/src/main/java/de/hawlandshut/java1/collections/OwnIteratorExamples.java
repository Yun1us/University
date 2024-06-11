package de.hawlandshut.java1.collections;

import static de.hawlandshut.java1.collections.Range.range;
import static java.lang.System.out;

public class OwnIteratorExamples {

  private static Item salad = new Item("Salat", 2);
  private static Item choc = new Item("Schokolade", 1);
  private static Item milk = new Item("Milch", 2);
  private static Item toiletpaper = new Item("Toilettenpapier", 3);

  public static void stockIteratorExample() {
    // snippet: stockIteratorExample
    // *@\Gradle{runStockIteratorExample}@*
    Stock stock = new Stock(
        new Item[] {salad, choc, milk, toiletpaper});

    for (Item item : stock)
      out.println(item);
    // snippet: /stockIteratorExample
  }
  

  public static void rangeIteratorExample() {
    // snippet: rangeIteratorExample
    // *@\Gradle{runRangeIteratorExample}@*
    int s = 0;
    for (int i : range(1,100))
      s += i;
    // snippet: /rangeIteratorExample
    out.println(s);
  }
  
  public static void iterableStringExample() {
    // snippet: iterableStringExample
    // *@\Gradle{runIterableStringExample}@*
    IterableString is = new IterableString("YMCA!");

    for (char c : is)
      out.println(c);
    // snippet: /iterableStringExample
  }
  
  
  


  
}
