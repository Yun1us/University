package de.hawlandshut.java1.oop.gamerefactored;

// snippet: class
public class PileOfGold extends Item 
  implements MergableConsumable{
// snippet: /class

  // snippet: attributes
  private int coins;
  // snippet: /attributes

  public PileOfGold(int coins) {
    super("Pile of Gold", 0);
    this.coins = coins;
  }

  @Override
  public int unitsLeft() {
    return coins;
  }

  @Override
  public void consumeOne() {
    if (coins > 0)
      coins--;
  }

  // snippet: merge
  @Override
  public PileOfGold merge(MergableConsumable other) {
    if (other instanceof PileOfGold){
      var otherPile = (PileOfGold) other;
      return new PileOfGold(coins + otherPile.coins);
    } else 
      throw new IllegalArgumentException("other must be PileOfGold");
  }
  // snippet: /merge

  // snippet: split
  @Override public PileOfGold split(int n) {
  // snippet: /split
    if (n <= coins){
      coins -= n;
      return new PileOfGold(n);
    } else throw new IllegalArgumentException("too much");
  }

}
