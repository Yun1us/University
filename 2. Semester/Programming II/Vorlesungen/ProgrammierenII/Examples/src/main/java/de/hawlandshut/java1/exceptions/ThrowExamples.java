package de.hawlandshut.java1.exceptions;

import static java.lang.System.out;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;

public class ThrowExamples {

  public static void printInfo(Throwable t) {
    out.printf("Type: %s%n", t.getClass().getSimpleName());
    out.printf("Message: %s%n", t.getMessage());
    out.printf("Cause: %s%n", t.getCause());
  }

  // snippet: factorial
  // *@\Gradle{runFactorial}@*
  public static long factorial(int n) {
    if (n < 0)
      throw new IllegalArgumentException("n must not be negative");

    // n! berechnen und zurückgeben
  // snippet: /factorial
    int p = 1;
    for (int i = 1; i <= n; i++)       
      p *= i;
    return p;
  }

  public static void throwExceptionExample() {
    // snippet: throwExceptionExample
    // *@\Gradle{runThrowExceptionExample}@*
    try {
      factorial(-5);
    } catch (IllegalArgumentException exception){
      printInfo(exception);
    }
    // snippet: /throwExceptionExample
  }

  // snippet: readFirstByte
  public static int readFirstByte(String path) 
    throws FileNotFoundException, IOException {
  // snippet: /readFirstByte

    var file = new File(path);
    var in = new FileInputStream(file); 
    int b = in.read(); 
    in.close(); 
    return b;
  }

  // snippet: rethrowExceptionExample
  // *@\Gradle{runRethrowExceptionExample}@*
  public static void rethrowExceptionExample()
    throws FileNotFoundException, IOException {
    try {
      readFirstByte("/home/auer/java1-exam.txt");
    } catch (FileNotFoundException e){

      printInfo(e); // "Ausnahmebehandlung"
      throw e;

    } catch (IOException e){

      printInfo(e); // "Ausnahmebehandlung"
      throw e;

    }
  }
  // snippet: /rethrowExceptionExample
  
  

  public static void nestExceptionExample() {
    // snippet: nestExceptionExample
    // *@\Gradle{runNestExceptionExample}@*
    try {
      readFirstByte("/home/auer/java1-exam.txt");
    } catch (FileNotFoundException e){

      var nestingE = 
        new UncheckedIOException("Wrong path", e);
      printInfo(nestingE);
      throw nestingE;

    } catch (IOException e){

      var nestingE = 
        new UncheckedIOException("File cannot be read", e);
      printInfo(nestingE);
      throw nestingE;

    }
    
    // snippet: /nestExceptionExample
  }



}
