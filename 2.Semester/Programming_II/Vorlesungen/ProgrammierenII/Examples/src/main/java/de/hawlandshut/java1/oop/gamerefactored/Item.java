package de.hawlandshut.java1.oop.gamerefactored;

/**
 * Models an item that can be bought.
 */
public class Item {
  private final String name;
  private final int value;

  /**
   * Initializes the item with a name and a gold value.
   * @param name Name of the item.
   * @param value Value of the item (gold, greater than 0)
   */
  public Item(String name, int value){
    this.name = name;
    this.value = value;
  }

  /**
   * Default constructor for compatibility.
   */
  public Item(){
    this.name = null;
    this.value = 0;
  }

  public String getName() {
    return name;
  }

  public int getValue() {
    return value;
  }

  // snippet: doublePotentVersion
  public Item doublePotentVersion() {
    return new Item("Powerful " + getName(), 
        2*value);
  }
  // snippet: /doublePotentVersion

  @Override
  public String toString() {
    return String.format("%s: name = \"%s\", value = %d", 
        getClass().getSimpleName(), name, value);
  }
}


