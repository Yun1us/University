package de.hawlandshut.java1.oop.gamerefactored;

import static java.lang.System.out;
import static java.lang.System.err;

// snippet: interface
public interface Logged{
  default void info(String message){
    out.printf("INFO (%s): %s%n",
        this.getClass().getSimpleName(), message);
  }

  default void error(String message){
    err.printf("ERROR (%s): %s%n",
        this.getClass().getSimpleName(), message);
  }
}
// snippet: /interface
