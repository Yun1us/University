package de.hawlandshut.java1.basics;


public class Recursion{

  // snippet: fibonacci
  public static long fib(int n) {
    if (n <= 1)
      return 1;
    else
      return fib(n-1) + fib(n-2);
  }
  // snippet: /fibonacci

  public static void fibonacciExample() {
    // snippet: fibonacciExample
    // *@\Gradle{runFibonacciExample}@*
    System.out.printf("fib(0) = %d%n", fib(0));   // 1       
    System.out.printf("fib(1) = %d%n", fib(1));   // 1
    System.out.printf("fib(2) = %d%n", fib(2));   // 2
    System.out.printf("fib(3) = %d%n", fib(3));   // 3
    System.out.printf("fib(10) = %d%n", fib(10)); // 89
    System.out.printf("fib(30) = %d%n", fib(30)); // 1346269
    System.out.printf("fib(45) = %d%n", fib(45)); // ...
    // snippet: /fibonacciExample
  }

  // snippet: recursion
  // *@\Gradle{runStackOverflowExample}@*
  public static void recursion(int depth){
    System.out.printf("Tiefe %d%n", depth);
    if (depth < 100000)
      recursion(depth+1);
  }
  // snippet: /recursion

  public static void stackOverflowExample() {
    // snippet: stackOverflowExample
    // *@\Gradle{runStackOverflowExample}@*
    recursion(1);
    // snippet: /stackOverflowExample
  }

}
