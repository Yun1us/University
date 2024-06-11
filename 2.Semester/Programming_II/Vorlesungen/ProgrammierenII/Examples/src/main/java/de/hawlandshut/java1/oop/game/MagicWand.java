package de.hawlandshut.java1.oop.game;

// snippet: class
public class MagicWand 
  extends Item implements Consumable {
// snippet: /class

  // snippet: charges
  private int charges;
  // snippet: /charges

  public MagicWand(String name, int value, int charges){
    super(name, value);
    this.charges = charges;
  }

  // snippet: unitsLeft
  @Override
  public int unitsLeft() {
    return charges;
  }
  // snippet: /unitsLeft

  // snippet: consumeOne
  @Override
  public void consumeOne() {
    if (charges > 0)
      charges--;
  }
  // snippet: /consumeOne

  // snippet: split
  @Override
  public Consumable split(int n) {
    throw new UnsupportedOperationException("Cannot split wand");
  }
  // snippet: /split


  
}
