package de.hawlandshut.java1.oop;

// snippet: import
import static java.lang.Math.sin;
import static java.lang.Math.PI;
// snippet: /import

public class StaticImportExamples
{

  // snippet: sin
  private static double sin(double x){
    // a good approximation (for small angles...)
    return x; 
  }
  // snippet: /sin


  public static void staticImportConflictExample() {
    // snippet: staticImportConflictExample
    // *@\Gradle{runStaticImportConflictExample}@*
    System.out.printf("sin(PI/2)=%f%n", sin(PI/2));
    // snippet: /staticImportConflictExample
  }


}


