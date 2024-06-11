package de.hawlandshut.java1.oop.gamerefactored;

// snippet: interface
public interface Consumable {
  int unitsLeft();
  void consumeOne();
  Consumable split(int n);

  default void consume(int n){
    for (int i = 0; i < n; i++)
      consumeOne();
  }
}
// snippet: /interface
