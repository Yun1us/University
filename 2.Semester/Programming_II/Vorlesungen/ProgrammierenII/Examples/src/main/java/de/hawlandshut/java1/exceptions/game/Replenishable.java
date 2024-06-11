
package de.hawlandshut.java1.exceptions.game;

// snippet: interface
public interface Replenishable{
  int maximumUnits();
  void replenish(int n)
    throws InvalidReplenishmentException;
}
// snippet: /interface
