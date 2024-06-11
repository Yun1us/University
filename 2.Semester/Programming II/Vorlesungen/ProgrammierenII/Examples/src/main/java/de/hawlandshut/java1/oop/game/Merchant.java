package de.hawlandshut.java1.oop.game;

import static java.lang.System.out;

/**
 * A merchant is an NPC from which the player can buy items.
 */
public class Merchant extends NonPlayerCharacter {

  private Item[] stock;

  public Merchant(String name, Item[] stock, int x, int y) {
    super(name, "Do you want to buy something?", x, y);
    this.stock = stock;
  }

  // snippet: copyConstructor
  public Merchant(Merchant other){
    super(other);
    this.stock = other.getStock().clone();
  }
  // snippet: /copyConstructor

  /**
   * Removes the item with the given index from the stock and returns it.
   * @param index Index of the item to buy
   * @return Bouth item
   */
  // snippet: buy
  public Item buy(int index){
    Item item = stock[index];
    stock[index] = null;
    return item;
  }
  // snippet: /buy

  // snippet: talk
  @Override
  public String talk(){
    StringBuilder builder = new StringBuilder();
    builder.append(super.talk());
  
    builder.append("\nMy stock: \n");
    for (var item : stock){
      builder.append("  " + item + "\n");
    }
  
    return builder.toString();
  }
  // snippet: /talk


  // snippet: update
  @Override
  public void update(){
    out.println(talk());
  }
  // snippet: /update

  public Item[] getStock() {
    return stock;
  }

  @Override
  public String toString() {
    return String.format("%s, #stock=%d", 
        super.toString(), stock.length);
  }

}


