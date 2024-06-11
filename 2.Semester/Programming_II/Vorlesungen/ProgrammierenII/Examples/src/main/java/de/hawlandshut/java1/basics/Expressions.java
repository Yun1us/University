package de.hawlandshut.java1.basics;

public class Expressions
{
  public static void expressionExample(){
    // snippet: expressionExample
    // *@\Gradle{runExpressionExample}@*
    System.out.println((3908-1234) / 2);
    System.out.println(Math.PI * Math.PI);
    System.out.println("The cake is a lie!");
    System.out.println(true == false);
    // snippet: /expressionExample
  }

  public static void expressionEvaluationExample() {
    // snippet: expressionEvaluationExample
    // *@\Gradle{runExpressionEvaluationExample}@*
    double x = Math.random();
    double c = (3908-1234)/2; // wird von Compiler berechnet
    System.out.println(x + c);
    // snippet: /expressionEvaluationExample
    
  }

  public static void booleanExpressionExample() {
    // snippet: booleanExpressionExample
    // *@\Gradle{runBooleanExpressionExample}@*
    System.out.println(true != false);
    System.out.println(42 == 21*2);
    if (Math.PI == Math.E)
      System.out.println("Die Mathematik bricht zusammen.");
    // snippet: /booleanExpressionExample
    
  } 
}


