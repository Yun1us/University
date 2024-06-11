package de.hawlandshut.java1.oopbasics;

public class ImmutableStringExamples {

  public static void immutableStringExample() {
    // snippet: immutableStringExample
    // *@\Gradle{runImmutableStringExample}@*
    String quote = "the cake is a lie!";
    quote.toUpperCase();
    System.out.print(quote);
    // snippet: /immutableStringExample
  }

  public static void immutableStringExample2() {
    // snippet: immutableStringExample2
    // *@\Gradle{runImmutableStringExample2}@*
    String quote = "the cake is a lie!";
    String upperCaseQuote = quote.toUpperCase();
    System.out.print(upperCaseQuote);
    // snippet: /immutableStringExample2
  }
  
}
