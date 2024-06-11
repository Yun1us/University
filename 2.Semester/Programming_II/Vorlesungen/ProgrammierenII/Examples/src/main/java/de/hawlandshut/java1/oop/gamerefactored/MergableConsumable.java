package de.hawlandshut.java1.oop.gamerefactored;

// snippet: interface
public interface MergableConsumable 
    extends Consumable {
  MergableConsumable merge(MergableConsumable other);
  @Override MergableConsumable split(int n);

  // snippet: consume
  @Override default void consume(int n){
    int i = 0;
    while (i < n){
      consumeOne();
      i++;
    }
  }
  // snippet: /consume
}
// snippet: /interface
