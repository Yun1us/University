package de.hawlandshut.java1.oop.gamerefactored;

// snippet: class
public class Bottle extends Item
  implements Consumable, Replenishable, Logged{
// snippet: /class

  // snippet: attributes
  private int sipsLeft;
  private int volume;
  // snippet: /attributes

  public Bottle(String name, int value, int volume, int sipsLeft){
    super(name, value);
    this.sipsLeft = sipsLeft;
    this.volume = volume;
  }

  // snippet: consumeOne
  @Override public void consumeOne() {
    info("consumeOne called");
    if (sipsLeft > 0) sipsLeft--;
    else error("bottle empty");
  }
  // snippet: /consumeOne

  // snippet: split
  @Override public Consumable split(int n) {
    error("cannot split bottle");
    throw new UnsupportedOperationException("cannot split bottle");
  }
  // snippet: /split

  // snippet: unitsLeft
  @Override
  public int unitsLeft() {
    return sipsLeft;
  }
  // snippet: /unitsLeft

  // snippet: replenishOne
  @Override public void replenishOne() {
    info("replenishOne called");
    if (sipsLeft < volume) sipsLeft++;
    else error("bottle full");
  }
  // snippet: /replenishOne


  // snippet: maximumUnits
  @Override
  public int maximumUnits() {
    return volume;
  }
  // snippet: /maximumUnits

}
