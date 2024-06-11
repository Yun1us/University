package de.hawlandshut.java1.collections;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class GenericsExamples {

  public static void nonGenericExample() {
    // snippet: nonGenericExample
    // *@\Gradle{runNonGenericExample}@*
    // snippet: nonGenericExampleSet
    ArrayList items = new ArrayList();
    items.add(new Item("Salat", 2));
    items.add(new Item("Milch", 1));
    // snippet: /nonGenericExampleSet

    // snippet: nonGenericExampleGet
    int total = 0;
    Item item = (Item) items.get(0);
    total += item.getPrice();

    item = (Item) items.get(1);
    total += item.getPrice();
    // snippet: /nonGenericExampleGet
    
    System.out.printf("%d EUR%n", total);
    // snippet: /nonGenericExample
  }
  
  
  public static void genericsExample() {
    // snippet: genericsExample
    // *@\Gradle{runGenericsExample}@*
    // snippet: nonGenericExampleSet
    ArrayList<Item> items = new ArrayList<Item>();
    items.add(new Item("Salat", 2));
    items.add(new Item("Milch", 1));
    // snippet: /nonGenericExampleSet

    // snippet: nonGenericExampleGet
    int total = 0;
    Item item = items.get(0);
    total += item.getPrice();

    item = items.get(1);
    total += item.getPrice();
    // snippet: /nonGenericExampleGet
    System.out.printf("%d EUR%n", total);
    // snippet: /nonGenericExample

    
    // snippet: /genericsExample
  }
  
  
  
}
