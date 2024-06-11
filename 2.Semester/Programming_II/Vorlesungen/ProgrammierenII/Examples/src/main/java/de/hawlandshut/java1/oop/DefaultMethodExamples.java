package de.hawlandshut.java1.oop;

import de.hawlandshut.java1.oop.gamerefactored.Food;

import static java.lang.System.out;

public class DefaultMethodExamples {

  public static void defaultMethodExample() {
    // snippet: defaultMethodExample
    // *@\Gradle{runDefaultMethodExample}@*
    Food squirrelBits = 
      new Food("Squirrel on a Stick", 10, 10000);

    out.printf("Bites: %d%n", squirrelBits.unitsLeft());
    squirrelBits.consume(1000);
    out.printf("Bites: %d%n", squirrelBits.unitsLeft());
    // snippet: /defaultMethodExample
  }
  
}
