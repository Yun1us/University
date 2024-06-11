package de.hawlandshut.java1.oop.gamerefactored;

// snippet: interface
public interface Replenishable{
  void replenishOne();
  default int maximumUnits() { 
    return Integer.MAX_VALUE; 
  }
}
// snippet: /interface
