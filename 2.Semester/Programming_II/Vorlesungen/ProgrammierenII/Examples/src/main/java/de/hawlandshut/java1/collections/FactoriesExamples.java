package de.hawlandshut.java1.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.lang.System.out;

// snippet: importEntry
import static java.util.Map.entry;
// snippet: /importEntry

public class FactoriesExamples {
  private static Item salad = new Item("Salat", 2);
  private static Item choc = new Item("Schokolade", 1);
  private static Item milk = new Item("Milch", 2);
  private static Item toiletpaper = new Item("Toilettenpapier", 3);

  public static void listCreationNoFactory() {
    // snippet: listCreationNoFactory
    // *@\Gradle{runListCreationNoFactory}@*
    var items = new ArrayList<Item>();
    items.add(salad);
    items.add(choc);
    items.add(milk);
    items.add(toiletpaper);
    // snippet: /listCreationNoFactory
    out.println(items);
  }

  public static void listCreationArray() {
    // *@\Gradle{runListCreationArray}@*
    // snippet: listCreationArray
    Item[] itemsArray = 
      new Item[]{salad, choc, milk, toiletpaper};
    // snippet: /listCreationArray

    // snippet: arrayToList
    List<Item> items = Arrays.asList(itemsArray);
    // snippet: /arrayToList

    out.println(items);
  }

  public static void listCreationFactory() {
    // snippet: listCreationFactory
    // *@\Gradle{runListCreationFactory}@*
    List<Item> items = 
      List.of(salad, choc, milk, toiletpaper);
    // snippet: /listCreationFactory
    out.println(items);
  }

  public static void setCreationFactory() {
    // snippet: setCreationFactory
    // *@\Gradle{runSetCreationFactory}@*
    Set<Item> items =
      Set.of(salad, choc, milk, toiletpaper);
    // snippet: /setCreationFactory
    out.println(items);
  }
  
  
 public static void setCreationDuplicates() {
   // snippet: setCreationDuplicates
   // *@\Gradle{runSetCreationDuplicates}@*
    Set<Item> items =
      Set.of(salad, choc, milk, toiletpaper, milk);
   // snippet: /setCreationDuplicates
 }

 public static void mapCreationFactory() {
   // snippet: mapCreationFactory
   // *@\Gradle{runMapCreationFactory}@*
   Map<Item,Integer> stock = 
     Map.of(
         salad, 10, 
         choc, 40, 
         milk, 20, 
         toiletpaper, 0);
   // snippet: /mapCreationFactory
   out.println(stock);
 }

 public static void mapCreationEntryFactory() {
   // snippet: mapCreationEntryFactory
   // *@\Gradle{runMapCreationEntryFactory}@*
   Map<Item,Integer> stock =
     Map.ofEntries(
         entry(salad, 10),
         entry(choc, 40),
         entry(milk, 20),
         entry(toiletpaper, 0));
   // snippet: /mapCreationEntryFactory
   out.println(stock);
 }

 public static void listFactoryModify() {
   // snippet: listFactoryModify
   // *@\Gradle{runListFactoryModify}@*
   List<Item> items = List.of(salad, choc);
   items.add(toiletpaper);
   // snippet: /listFactoryModify
 }
 
 public static void listFactoryModifiable() {
   // snippet: listFactoryModifiable
   // *@\Gradle{runListFactoryModifiable}@*
   List<Item> roItems = List.of(salad, choc);
   var items = new ArrayList<Item>(roItems);
   items.add(toiletpaper);
   // snippet: /listFactoryModifiable
   out.println(items);
 }
 
 
}
