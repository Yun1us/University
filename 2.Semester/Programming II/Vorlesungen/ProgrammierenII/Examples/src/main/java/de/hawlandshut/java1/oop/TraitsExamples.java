package de.hawlandshut.java1.oop;

import de.hawlandshut.java1.oop.gamerefactored.Bottle;

public class TraitsExamples {
  

  public static void traitsExample() {
    // snippet: traitsExample
    // *@\Gradle{runTraitsExample}@*
    var bottle = new Bottle("Water Bottle", 0, 10, 1);

    bottle.consumeOne();
    bottle.consumeOne();
    bottle.replenishOne();
    // snippet: /traitsExample
  }

}
