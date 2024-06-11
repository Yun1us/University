package de.hawlandshut.java1.collections;

import java.util.Arrays;
import static java.lang.System.out;

public class WrapperExamples {

  public static void integerWrapperExample() {
    // snippet: integerWrapperExample
    // *@\Gradle{runIntegerWrapperExample}@*
    Integer i = Integer.valueOf(42);
    System.out.printf("Value of %d%n", i.intValue());
    // snippet: /integerWrapperExample
  }

  public static void primitivesAsObjectExample() {
    // snippet: primitivesAsObjectExample
    // *@\Gradle{runPrimitivesAsObjectExample}@*
    Object[] numbers = {
      Integer.valueOf(42), 
      Double.valueOf(Math.PI),
      Byte.parseByte("01101100", 2)
    };
    out.println(Arrays.toString(numbers));
    // snippet: /primitivesAsObjectExample
  }

  public static void wrapperValidIdentityExample() {
    // snippet: wrapperValidIdentityExample
    // *@\Gradle{runWrapperValidIdentityExample}@*
    Integer i = Integer.valueOf(42);
    Integer j = Integer.valueOf(42);
    out.printf("i == j: %b%n", 
        i == j);
    // snippet: /wrapperValidIdentityExample
  }

  public static void wrapperNoIdentityExample() {
    // snippet: wrapperNoIdentityExample
    // *@\Gradle{runWrapperNoIdentityExample}@*
    Integer i = Integer.valueOf(200);
    Integer j = Integer.valueOf(200);
    out.printf("i == j: %b%n", i == j);
    // snippet: /wrapperNoIdentityExample
  }

  public static void wrapperEqualsExample() {
    // snippet: wrapperEqualsExample
    // *@\Gradle{runWrapperEqualsExample}@*
    Integer i = Integer.valueOf(200);
    Integer j = Integer.valueOf(200);
    out.printf("i.equals(j): %b%n", i.equals(j));
    // snippet: /wrapperEqualsExample
  }
  
  
  
  
  
  
  
}
