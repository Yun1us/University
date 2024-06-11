package de.hawlandshut.java1.collections;

import java.text.Collator;
import java.util.Comparator;

// snippet: class
public class ItemNameAlphabeticComparator 
    implements Comparator<Item> {

  @Override public int compare(Item x, Item y) {
    if (x == null || y == null)
      throw new IllegalArgumentException("...");

    Collator c = Collator.getInstance();
  
    return c.compare(x.getName(), y.getName());
  }
}
// snippet: /class
