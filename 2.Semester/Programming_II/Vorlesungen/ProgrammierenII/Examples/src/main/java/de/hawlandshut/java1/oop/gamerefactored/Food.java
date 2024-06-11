package de.hawlandshut.java1.oop.gamerefactored;

// snippet: class
public class Food extends Item implements Consumable  {
// snippet: /class

  // snippet: bites
  private int bites; // units left to consume
  // snippet: /bites

  public Food(String name, int value, int bites){
    super(name, value);
    this.bites = bites;
  }

  // snippet: consumeOne
  @Override
  public void consumeOne(){
    if (bites > 0)
      bites--;
  }
  // snippet: /consumeOne

  // snippet: unitsLeft
  @Override
  public int unitsLeft(){
    return bites;
  }
  // snippet: /unitsLeft

  // snippet: split
  @Override
  public Food split(int n){
    if (n <= bites){
      bites -= n;
      return new Food(getName(), getValue(), n);
    }else
      throw new IllegalArgumentException("too much");
  }
  // snippet: /split

}
