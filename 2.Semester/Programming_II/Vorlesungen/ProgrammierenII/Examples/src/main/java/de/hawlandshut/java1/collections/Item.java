package de.hawlandshut.java1.collections;

// snippet: class
public class Item implements Comparable<Item> {
// snippet: /class
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

  // snippet: compareTo
  @Override public int compareTo(Item other) {
    if (other == null)
      throw new IllegalArgumentException("other == null");

    int result = this.price - other.price;

    if (result == 0)
      result = this.name.compareTo(other.name);

    return result;
  }
  // snippet: /compareTo

  // Alternative Prüfreihenfolge:
  // @Override public int compareTo(Item other) {
  //   if (other == null)
  //     throw new IllegalArgumentException("other == null");
  //   int result = this.name.compareTo(other.name);

  //   if (result == 0)
  //     result = this.price - other.price;

  //   return result;
  // }

}
