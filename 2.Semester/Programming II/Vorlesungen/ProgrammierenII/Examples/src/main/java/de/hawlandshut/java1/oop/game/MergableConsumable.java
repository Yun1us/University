package de.hawlandshut.java1.oop.game;

// snippet: interface
public interface MergableConsumable 
    extends Consumable {
  MergableConsumable merge(MergableConsumable other);
  @Override MergableConsumable split(int n);
}
// snippet: /interface
