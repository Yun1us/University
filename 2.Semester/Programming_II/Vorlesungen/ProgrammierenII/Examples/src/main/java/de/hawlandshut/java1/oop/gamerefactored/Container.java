package de.hawlandshut.java1.oop.gamerefactored;

// snippet: interface
public interface Container {
  int unitsLeft();
  default int maximumUnits(){
    return 10;
  }
}
// snippet: /interface

