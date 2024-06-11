package de.hawlandshut.java1.collections;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.lang.System.out;

public class MapExamples {

  public static void mapOperationsExample() {
    // snippet: mapOperationsExample
    var salad = new Item("Salat", 2);
    var choc = new Item("Schokolade", 1);
    var milk = new Item("Milch", 2);
    var toiletpaper = new Item("Toilettenpapier", 3);


    // snippet: mapNew
    // *@\Gradle{runMapOperationsExample}@*
    var stock = new HashMap<Item,Integer>();
    // snippet: /mapNew

    // snippet: mapPut
    stock.put(salad, 10);
    stock.put(choc, 50);
    stock.put(toiletpaper, 0);
    // snippet: /mapPut
    // snippet: /mapOperationsExample
    out.println(stock);

    // snippet: mapPut2
    out.println(stock.put(salad, 15));
    // snippet: /mapPut2

    // snippet: mapGet
    out.printf("Salat: %d Stück%n", stock.get(salad));
    // snippet: /mapGet
    
    // snippet: mapGet2
    out.printf("Milch: %d Stück%n", stock.get(milk));
    // snippet: /mapGet2

    // snippet: mapPutNull
    stock.put(milk, null);
    // snippet: /mapPutNull
    out.println(stock);

    // snippet: mapContainsKey
    if (stock.containsKey(milk))
      out.println("Eintrag vorhanden!");
    // snippet: /mapContainsKey

    // snippet: mapRemove
    stock.remove(milk);
    // snippet: /mapRemove
    out.println(stock);

    // snippet: mapPut3
    stock.put(milk, 15);
    // snippet: /mapPut3
    out.println(stock);

    // snippet: mapKeyIterate
    for (Item item : stock.keySet())
      out.println(item);
    // snippet: /mapKeyIterate

    // snippet: mapKeySetRemove
    Set<Item> keys = stock.keySet();
    keys.remove(choc);
    out.println(stock);
    // snippet: /mapKeySetRemove

    // snippet: mapValuesIterate
    for (Integer amount : stock.values())
      out.println(amount);
    // snippet: /mapValuesIterate

    // snippet: mapValuesRemove
    Collection<Integer> amounts = stock.values();
    amounts.remove(0);
    out.println(stock);
    // snippet: /mapValuesRemove

    // snippet: mapEntrySetIterate
    for (Map.Entry<Item,Integer> entry : stock.entrySet())
      out.printf("(%s, %s)%n", entry.getKey(), entry.getValue());
    // snippet: /mapEntrySetIterate

    // snippet: mapEntrySetChange
    for (Map.Entry<Item,Integer> entry : stock.entrySet())
      entry.setValue(entry.getValue() + 5);
    // snippet: /mapEntrySetChange
    out.println(stock);
  }

  
  
}
