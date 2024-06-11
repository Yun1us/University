package de.hawlandshut.java1.exceptions;

import static java.lang.System.out;

import de.hawlandshut.java1.exceptions.game.Bottle;
import de.hawlandshut.java1.exceptions.game.GameException;
import de.hawlandshut.java1.exceptions.game.InvalidConsumptionException;

public class CustomExceptionExamples {

  public static void printInfo(Throwable t) {
    out.printf("Type: %s%n", t.getClass().getSimpleName());
    out.printf("Message: %s%n", t.getMessage());
  }

  public static void customExceptionExample() {
    // snippet: customExceptionExample
    // *@\Gradle{runCustomExceptionExample}@*
    try {
      Bottle bottle = new Bottle(0, 100);
      bottle.consume(1);
    } catch (InvalidConsumptionException exception){
      printInfo(exception);
    }
    // snippet: /customExceptionExample
  }

  public static void customExceptionExample2() {
    // snippet: customExceptionExample2
    // *@\Gradle{runCustomExceptionExample2}@*
    try {
      Bottle bottle = new Bottle(1, 100);
      bottle.consume(1);
      bottle.replenish(150);
    } catch (GameException exception){
      printInfo(exception);
    }
    
    // snippet: /customExceptionExample2
  }

}
