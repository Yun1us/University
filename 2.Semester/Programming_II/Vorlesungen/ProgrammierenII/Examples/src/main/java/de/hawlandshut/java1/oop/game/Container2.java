package de.hawlandshut.java1.oop.game;

// snippet: interface
public interface Container2 {

  double HUNDRED_PERCENT = 100.0;

  static double percentFull(Container2 container){
    return (HUNDRED_PERCENT * container.unitsLeft()) 
      / container.maximumUnits();
  }

  int unitsLeft();
  int maximumUnits();
}
// snippet: /interface


