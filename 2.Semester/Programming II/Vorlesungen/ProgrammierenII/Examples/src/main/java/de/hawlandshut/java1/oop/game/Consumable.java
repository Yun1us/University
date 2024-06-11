package de.hawlandshut.java1.oop.game;

// snippet: interface
public interface Consumable {
  int unitsLeft();
  void consumeOne();
  Consumable split(int n);
}
// snippet: /interface
