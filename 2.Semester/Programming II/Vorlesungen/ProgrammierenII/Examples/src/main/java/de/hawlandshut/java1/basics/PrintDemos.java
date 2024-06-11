package de.hawlandshut.java1.basics;

public class PrintDemos
{
    public static void overloadingExample() {
      // snippet: overloading
      // *@\Gradle{runOverloadingExample}@*
      System.out.println();               // Leerzeile
      System.out.println(true);           // boolean
      System.out.println("Hello!");       // String
      System.out.println(42);             // int
      System.out.println(3.14159265359);  // double
      System.out.println(3.14159265359f); // float
      // snippet: /overloading
    }

    public static void varargsExample() {
      // snippet: varargs
      // *@\Gradle{runVarargsExample}@*
      System.out.printf("PI ist ungefaehr %f%n", 3.14159265359f);
      System.out.printf("Ein boolean kann %b oder %b sein%n", 
          true, false);
      System.out.printf("%d ist nur die halbe Wahrheit", 42/2);
      // snippet: /varargs
    }
}


