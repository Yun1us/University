package de.hawlandshut.java1.exceptions;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import static java.lang.System.out;

public class ThrowableExamples {

  // snippet: printThrowableInfo
  // *@\Gradle{runPrintThrowableInfo}@*
  public static void printThrowableInfo(Throwable t) {
    out.printf("Type: %s%n", t.getClass().getSimpleName());
    out.printf("Message: %s%n", t.getMessage());
    out.printf("Cause: %s%n", t.getCause());
    t.printStackTrace();
  }
  // snippet: /printThrowableInfo
  
  public static void printThrowableInfoExample() {
    // snippet: printThrowableInfoExample
    // *@\Gradle{runPrintThrowableInfoExample}@*
    try {
      var examFile = new File("/home/auer/java1-exam.txt");
      var in = new FileInputStream(examFile);
    } catch (IOException exception){
      printThrowableInfo(exception);
    }
    // snippet: /printThrowableInfoExample
  }

}
