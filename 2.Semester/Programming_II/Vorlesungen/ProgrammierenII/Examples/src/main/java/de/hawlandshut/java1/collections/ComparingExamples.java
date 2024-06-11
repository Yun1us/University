package de.hawlandshut.java1.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.lang.System.out;

import java.text.Collator;

public class ComparingExamples {


  public static void sortNumbersExample() {
    // snippet: sortNumbersExample
    // *@\Gradle{runSortNumbersExample}@*
    List<Integer> numbers 
      = Arrays.asList(5,1,2,6,9,3,8,7,4);

    Collections.sort(numbers);

    out.println(numbers);
    // snippet: /sortNumbersExample
  }

  public static void sortItemsExample() {
    // snippet: itemDefinition
    var salad = new Item("Salat", 2);
    var choc = new Item("Schokolade", 1);
    var milk = new Item("Milch", 2);
    var toiletpaper = new Item("Toilettenpapier", 3);
    // snippet: /itemDefinition
    // snippet: sortItemsExample
    // *@\Gradle{runSortItemsExample}@*
    List<Item> items 
      = Arrays.asList(salad,choc,milk,toiletpaper);

    Collections.sort(items);

    out.println(items);
    // snippet: /sortItemsExample
  }
  
  public static void compareToItemExample() {
    // snippet: compareToItemExample
    // *@\Gradle{runCompareToItemExample}@*
    var choc = new Item("Schokolade", 1);
    var salad = new Item("Salat", 2);
    var milk = new Item("Milch", 2);

    out.printf("choc.compareTo(salad): %d%n",
        choc.compareTo(salad));

    out.printf("salad.compareTo(milk): %d%n",
        salad.compareTo(milk));
    // snippet: /compareToItemExample
  }
  
  public static void comparatorItemExample() {
    // snippet: comparatorItemExample
    // *@\Gradle{runComparatorItemExample}@*
    var choc = new Item("Schokolade", 1);
    var salad = new Item("Salat", 2);
    var cheapSalad = new Item("Salat", 1);

    var comp = new ItemNameComparator();

    out.printf("comp.compare(choc, salad): %d%n",
        comp.compare(choc, salad));

    out.printf("comp.compare(salad, cheapSalad): %d%n",
        comp.compare(salad, cheapSalad));
    // snippet: /comparatorItemExample
  }
  
  public static void sortItemsComparatorExample() {
    var salad = new Item("Salat", 2);
    var choc = new Item("Schokolade", 1);
    var milk = new Item("Milch", 2);
    var cheapSalad = new Item("Salat", 1);
    // snippet: sortItemsComparatorExample
    // *@\Gradle{runSortItemsComparatorExample}@*
    List<Item> items 
      = Arrays.asList(salad,choc,milk,cheapSalad);

    items.sort(new ItemNameComparator());

    out.println(items);
    // snippet: /sortItemsComparatorExample
  }
  
  public static void collatorCompareExample() {
    // snippet: collatorCompareExample
    // *@\Gradle{runCollatorCompareExample}@*
    Collator c = Collator.getInstance();
    out.println(c.compare("Salat", "Schokolade")); // -1
    // snippet: /collatorCompareExample
  }
  
  public static void sortItemsComparatorExample2() {
    var salad = new Item("Salat", 2);
    var choc = new Item("Schokolade", 1);
    var milk = new Item("Milch", 2);
    var cheapSalad = new Item("Salat", 1);
    List<Item> items 
      = Arrays.asList(salad,choc,milk,cheapSalad);

    // snippet: sortItemsComparatorExample2
    // *@\Gradle{runSortItemsComparatorExample2}@*
    items.sort(new ItemNameAlphabeticComparator());
    // snippet: /sortItemsComparatorExample2

    out.println(items);
  }
  
  public static void sortItemsComparatorExample3() {
    var salad = new Item("Salat", 2);
    var choc = new Item("Schokolade", 1);
    var milk = new Item("Milch", 2);
    var cheapSalad = new Item("Salat", 1);
    List<Item> items 
      = Arrays.asList(salad,choc,milk,cheapSalad);

    // snippet: sortItemsComparatorExample3
    // *@\Gradle{runSortItemsComparatorExample3}@*
    items.sort(new Comparator<Item>(){
      public int compare(Item x, Item y) {
        if (x == null || y == null)
          throw new IllegalArgumentException("...");

        Collator c = Collator.getInstance();
      
        return c.compare(x.getName(), y.getName());
      }
    });
    // snippet: /sortItemsComparatorExample3

    out.println(items);
  }

  public static void treeSetComparableExample() {
    var salad = new Item("Salat", 2);
    var choc = new Item("Schokolade", 1);
    var milk = new Item("Milch", 2);
    var cheapSalad = new Item("Salat", 1);
    // snippet: treeSetComparableExample
    // *@\Gradle{runTreeSetComparableExample}@*
    TreeSet<Item> items = new TreeSet<Item>();
    items.add(salad);
    items.add(choc);
    items.add(milk);
    items.add(cheapSalad);
    // snippet: /treeSetComparableExample
    out.println(items);
  }

  public static void treeSetComparatorExample() {
    var salad = new Item("Salat", 2);
    var choc = new Item("Schokolade", 1);
    var milk = new Item("Milch", 2);
    var cheapSalad = new Item("Salat", 1);
    // snippet: treeSetComparatorExample
    // *@\Gradle{runTreeSetComparatorExample}@*
    TreeSet<Item> items = new TreeSet<Item>(
        new ItemNameComparator());
    items.add(salad);
    items.add(choc);
    items.add(milk);
    items.add(cheapSalad);
    // snippet: /treeSetComparatorExample
    out.println(items);
  }

  public static void treeSetInconsistentComparatorExample() {
    var salad = new Item("Salat", 2);
    var choc = new Item("Schokolade", 1);
    var milk = new Item("Milch", 2);
    var cheapSalad = new Item("Salat", 1);
    // snippet: treeSetInconsistentComparatorExample
    // *@\Gradle{runTreeSetInconsistentComparatorExample}@*
    TreeSet<Item> items = new TreeSet<Item>(
        new ItemNameAlphabeticComparator());
    items.add(salad);
    items.add(choc);
    items.add(milk);
    items.add(cheapSalad);
    // snippet: /treeSetInconsistentComparatorExample
    out.println(items);
  }

  public static void treeMapComparableExample() {
    var salad = new Item("Salat", 2);
    var choc = new Item("Schokolade", 1);
    var milk = new Item("Milch", 2);
    var cheapSalad = new Item("Salat", 1);
    // snippet: treeMapComparableExample
    // *@\Gradle{runTreeMapComparableExample}@*
    var stock = new TreeMap<Item,Integer>();
    stock.put(salad, 20);
    stock.put(choc, 20);
    stock.put(milk, 10);
    stock.put(cheapSalad, 25);
    // snippet: /treeMapComparableExample
    out.println(stock);
  }
  
  
  
  
  
}
