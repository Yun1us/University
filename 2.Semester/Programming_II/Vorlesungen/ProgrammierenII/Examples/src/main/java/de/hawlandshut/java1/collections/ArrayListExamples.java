package de.hawlandshut.java1.collections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.out;

public class ArrayListExamples {

  public static class Item{
    private final String name;
    private final int price;

    public Item(String name, int price){
      this.name = name;
      this.price = price;
    }

    public String getName() {
      return name;
    }

    public int getPrice() {
      return price;
    }

    @Override
    public String toString(){
      return String.format("%s: %d EUR", name, price);
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + price;
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Item other = (Item) obj;
      if (name == null) {
        if (other.name != null)
          return false;
      } else if (!name.equals(other.name))
        return false;
      if (price != other.price)
        return false;
      return true;
    }


  }

  public static void printReceipt(Iterable<Item> items){
    int total = 0;

    for (var item : items){

      if (item != null){
        System.out.println(item);
        total += item.getPrice();
      }else
        System.out.println("Item null");
    }

    System.out.printf("SUMME: %d EUR%n", total);
  }

  public static void printReceipt(Item[] items){
    printReceipt(Arrays.asList(items));
  }

  public static Item readItem(Scanner scanner){
    String name = scanner.nextLine();

    if (name.isBlank())        
      return null;

    int price = scanner.nextInt();
    Item item = new Item(name, price);

    scanner.nextLine();

    return item;
  }

  public static void arrayCheckoutExample() {
    Scanner scanner = new Scanner(System.in);
    // snippet: arrayCheckoutExample
    // *@\Gradle{runArrayCheckoutExample}@*
    Item[] items = new Item[10];
    int i = 0;
    boolean done = false;

    do {
      Item item = readItem(scanner);

      if (item == null)
        done = true;
      else
        items[i++] = item;

    } while (!done);

    printReceipt(items);
    // snippet: /arrayCheckoutExample
    scanner.close();
  }

  public static void arrayListCheckoutExample() {
    Scanner scanner = new Scanner(System.in);
    // snippet: arrayListCheckoutExample
    // *@\Gradle{runArrayListCheckoutExample}@*
    ArrayList<Item> items = 
      new ArrayList<Item>();
    boolean done = false;

    do {
      Item item = readItem(scanner);

      if (item == null)
        done = true;
      else
        items.add(item);

    } while (!done);

    printReceipt(items);
    // snippet: /arrayListCheckoutExample
    scanner.close();
  }

  public static ArrayList<String> createExampleList(){
    var l = new ArrayList<String>();
    l.add("First!");
    l.add(null);
    l.add("La");
    l.add("Dee");
    l.add("Da");
    return l;
  }

  public static void arrayListIterateForExample() {
    var l = createExampleList();
    // snippet: arrayListIterateForExample
    // *@\Gradle{runArrayListIterateForExample}@*
    for (int i = 0; i < l.size(); i++)
      out.println(l.get(i));
    // snippet: /arrayListIterateForExample
  }

  public static void arrayListIterateForEachExample() {
    var l = createExampleList();
    // snippet: arrayListIterateForEachExample
    // *@\Gradle{runArrayListIterateForEachExample}@*
    for (String item : l)
      out.println(item);
    // snippet: /arrayListIterateForEachExample
  }
  
}
