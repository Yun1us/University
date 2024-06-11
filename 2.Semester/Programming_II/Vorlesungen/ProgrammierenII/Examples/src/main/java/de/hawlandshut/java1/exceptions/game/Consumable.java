package de.hawlandshut.java1.exceptions.game;

// snippet: interface
public interface Consumable {
  int unitsLeft();
  void consume(int n)
      throws InvalidConsumptionException;
}
// snippet: /interface
