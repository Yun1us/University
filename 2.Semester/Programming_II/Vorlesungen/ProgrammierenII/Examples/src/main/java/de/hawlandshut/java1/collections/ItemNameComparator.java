package de.hawlandshut.java1.collections;

import java.util.Comparator;

// snippet: class
public class ItemNameComparator implements Comparator<Item> {
// snippet: /class

  // snippet: compare
  @Override
  public int compare(Item x, Item y) {
  
    if (x == null || y == null)
      throw new IllegalArgumentException("null");
  
    int result = x.getName().compareTo(y.getName());
  
    if (result == 0)
      result = x.getPrice() - y.getPrice();
  
    return result;
  }
  // snippet: /compare
  
}
