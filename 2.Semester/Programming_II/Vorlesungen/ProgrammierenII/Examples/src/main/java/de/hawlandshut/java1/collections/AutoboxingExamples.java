package de.hawlandshut.java1.collections;

import static java.lang.System.out;

public class AutoboxingExamples {

  public static void autoboxingExample() {
    // snippet: autoboxingExample
    // *@\Gradle{runAutoboxingExample}@*
    Integer wrappedAnswer = 42;
    out.printf("answer = %s%n", wrappedAnswer.toString());
    // snippet: /autoboxingExample
  }
  
  
  public static void autounboxingExample() {
    // snippet: autounboxingExample
    // *@\Gradle{runAutounboxingExample}@*
    Integer wrappedAnswer = 42;
    int unwrappedAnswer = wrappedAnswer;
    out.printf("answer = %d%n", unwrappedAnswer);
    // snippet: /autounboxingExample
  }

  public static void autoboxingCastExample() {
    // snippet: autoboxingCastExample
    // *@\Gradle{runAutoboxingCastExample}@*
    String s = ((Integer) 42).toString();
    out.println(s);
    // snippet: /autoboxingCastExample
  }

  public static void autounboxingCastExample() {
    // snippet: autounboxingCastExample
    // *@\Gradle{runAutounboxingCastExample}@*
    Integer answer = Integer.valueOf(42);
    int i = (int) answer;
    out.println(i);
    // snippet: /autounboxingCastExample
  }
  
  public static void autoboxingArithmeticExample() {
    // snippet: autoboxingArithmeticExample
    // *@\Gradle{runAutoboxingArithmeticExample}@*
    Integer i = 1;
    Integer j = 2;
    i = i + j;
    out.printf("i == %s%n", i);
    // snippet: /autoboxingArithmeticExample
  }

  public static void autoboxingComparisonExample() {
    // snippet: autoboxingComparisonExample
    // *@\Gradle{runAutoboxingComparisonExample}@*
    Integer i = 1;
    Integer j = 2;
    if (i < j)
      out.println("i < j");
    // snippet: /autoboxingComparisonExample
  }

  // snippet: printAsObject
  public static void printAsObject(Object o){
    out.printf("%s: %s%n",
        o.getClass().getSimpleName(),
        o.toString());
  }
  // snippet: /printAsObject


  // public static void printAsObject(int i){
  //   out.printf("int: %d%n", i);
  // }

  public static void autoboxingRefTypeExample() {
    // snippet: autoboxingRefTypeExample
    // *@\Gradle{runAutoboxingRefTypeExample}@*
    printAsObject(42);
    printAsObject(3.1415f);
    printAsObject(true);
    // snippet: /autoboxingRefTypeExample
  }

  public static void autoboxingArrayExample() {
    // snippet: autoboxingArrayExample
    // *@\Gradle{runAutoboxingArrayExample}@*
    int[] xs = new int[] {1,2,3,4};
    Integer[] ys = new Integer[xs.length];

    for (int i = 0; i < xs.length; i++) 
      ys[i] = xs[i];
    // snippet: /autoboxingArrayExample
    out.println(java.util.Arrays.toString(ys));
  }
  
  
  
  
}
