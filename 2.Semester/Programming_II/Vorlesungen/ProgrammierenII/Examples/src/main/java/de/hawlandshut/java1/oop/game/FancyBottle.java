package de.hawlandshut.java1.oop.game;

// snippet: class
public class FancyBottle extends Item
  implements Consumable, Replenishable, Container{
// snippet: /class

  // snippet: attributes
  private int sipsLeft;
  private int volume;
  // snippet: /attributes

  public FancyBottle(String name, int value, int volume, int sipsLeft){
    super(name, value);
    this.sipsLeft = sipsLeft;
    this.volume = volume;
  }

  // snippet: consumeOne
  @Override
  public void consumeOne() {
    if (sipsLeft > 0)
      sipsLeft--;
  }
  // snippet: /consumeOne

  // snippet: split
  @Override
  public Consumable split(int n) {
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
  @Override
  public void replenishOne() {
    if (sipsLeft < volume)
      sipsLeft++;
  }
  // snippet: /replenishOne


  // snippet: maximumUnits
  @Override
  public int maximumUnits() {
    return volume;
  }
  // snippet: /maximumUnits

}
