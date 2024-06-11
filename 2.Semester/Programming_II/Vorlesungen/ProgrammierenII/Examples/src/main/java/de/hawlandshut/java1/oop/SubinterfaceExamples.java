package de.hawlandshut.java1.oop;

import de.hawlandshut.java1.oop.game.PileOfGold;

public class SubinterfaceExamples {

  public static void subinterfaceExample() {
    // snippet: subinterfaceExample
    // *@\Gradle{runSubinterfaceExample}@*
    PileOfGold smallPile = new PileOfGold(10);
    PileOfGold bigPile = new PileOfGold(100);

    PileOfGold biggerPile = smallPile.merge(bigPile);

    System.out.printf("Coins in bigger pile: %d%n", 
        biggerPile.unitsLeft());

    PileOfGold mediumPile = biggerPile.split(60);

    System.out.printf("Coins in medium pile: %d%n", 
        mediumPile.unitsLeft());
    // snippet: /subinterfaceExample
  }

  
}
