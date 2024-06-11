package de.hawlandshut.java1.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static java.lang.System.out;

public class NestedCollections {

  // snippet: enum
  public enum Category { 
    CHOCOLATE, VEGGIES, TOILETPAPER }
  // snippet: /enum

  // snippet: printCategories
  // *@\Gradle{runNestedCollectionsExample}@*
  public static void printCategories(
      Map<Category, List<Item>> itemsForCategory){

    for (Category category : itemsForCategory.keySet()){

      out.printf("Kategorie: %s%n", category.name());

      List<Item> items = itemsForCategory.get(category);

      for (Item item : items)
        out.printf(" - %s%n", item);

      out.println();

    }
  }
  
  // snippet: /printCategories

  public static void nestedCollectionsExample() {
    // snippet: nestedCollectionsExample
    // *@\Gradle{runNestedCollectionsExample}@*
    // snippet: nestedCreation
    Map<Category, List<Item>> itemsForCategory = 
      new HashMap<Category, List<Item>>();
    // snippet: /nestedCreation

    // snippet: fillChocolates
    var chocolates = new ArrayList<Item>();
    chocolates.add(new Item("Milka Vollmilch", 2));
    chocolates.add(new Item("Milka Nuss", 2));
    chocolates.add(new Item("Romy", 3));
    
    itemsForCategory.put(Category.CHOCOLATE, chocolates);
    // snippet: /fillChocolates
    
    // snippet: fillVeggies
    var veggies = new LinkedList<Item>();
    veggies.add(new Item("Möhren", 3));
    veggies.add(new Item("Kartoffeln", 2));
    veggies.add(new Item("Salat", 2));
    
    itemsForCategory.put(Category.VEGGIES, veggies);
    // snippet: /fillVeggies

    // snippet: fillToiletpaper
    itemsForCategory.put(Category.TOILETPAPER,
        List.of(
          new Item("Vella 3-lagig", 3),
          new Item("Happy End soft", 2)));
    // snippet: /fillToiletpaper

    printCategories(itemsForCategory);

    // snippet: /nestedCollectionsExample
  }
  
  
}
