package de.hawlandshut.java1.basics;

public class MethodCalls
{
  // snippet: add
  public static int add(int a, 
      int b) {
    int result = a + b;
    return result;
  }
  // snippet: /add

  public static void methodCallExample() {
    // snippet: methodCallExample
    // *@\Gradle{runMethodCallExample}@* 
    int i = 2, j = 5;
    add(2*i, j*j);
    // snippet: /methodCallExample
  }

  // snippet: id
  public static int id(int i) {
    System.out.printf("id(%d)%n", i);
    return i;
  }
  // snippet: /id

  public static void parameterEvaluationExample() {
    // snippet: parameterEvaluationExample
    // *@\Gradle{runParameterEvaluationExample}@*
    System.out.printf("%d, %d oder %d%n", id(1), id(2), id(3));
    // snippet: /parameterEvaluationExample
  }

  public static void methodCallChain() {
    // snippet: methodCallChain
    // *@\Gradle{runMethodCallChain}@* 
    String s1 = "It's Mario-Time!";
    String s2 = 
      s1.substring(0,10).replace(" ", "-a me, ").concat("!");
    System.out.printf("s1 = %s%ns2 = %s%n", s1, s2);
    // snippet: /methodCallChain
  }
}
