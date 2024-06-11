package de.hawlandshut.java1.oop.game;

// snippet: class
public abstract class InfiniteBeer extends Item implements Consumable{
  @Override public void consumeOne(){ }
  @Override public int unitsLeft(){ return 1; }
}
// snippet: /class
