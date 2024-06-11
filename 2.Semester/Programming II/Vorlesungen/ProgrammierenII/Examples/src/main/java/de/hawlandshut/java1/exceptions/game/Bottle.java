package de.hawlandshut.java1.exceptions.game;

public class Bottle implements Consumable, Replenishable{

  private int sipsLeft;
  private int volume;

  public Bottle(int sipsLeft, int volume){
    this.sipsLeft = sipsLeft;
    this.volume = volume;
  }

  @Override
  public int maximumUnits() {
    return volume;
  }

  @Override
  // snippet: !replenish
  public void replenish(int n) 
    throws InvalidReplenishmentException {
    if (sipsLeft + n > volume)
      throw new InvalidReplenishmentException("Full!");
    sipsLeft += n;
  }
  // snippet: /!replenish

  @Override
  public int unitsLeft() {
    return sipsLeft;
  }

  @Override
  // snippet: !consume
  public void consume(int n) 
    throws InvalidConsumptionException {
    if (sipsLeft < n)
      throw new InvalidConsumptionException("Empty!");
    sipsLeft -= n;
  }
  // snippet: /!consume


}
