package de.hawlandshut.java1.basics;

import java.util.Calendar;

public class IfThenElse
{

  public static void badIfExample1(){
    Calendar now = Calendar.getInstance();
    // snippet: badIfExample1
    // *@\Gradle{runBadIfExample1}@*
    if (now.get(Calendar.YEAR) == 2050 && now.get(Calendar.MONTH) == Calendar.MARCH);
      System.out.println("We are living in the future!");
    // snippet: /badIfExample1

  }

  public static void improvedIfExample1(){
    Calendar now = Calendar.getInstance();
    // snippet: improvedIfExample1
    // *@\Gradle{runImprovedIfExample1}@*
    boolean is2050 = now.get(Calendar.YEAR) == 2050;
    boolean isMarch = now.get(Calendar.MONTH) == Calendar.MARCH;
    if (is2050 && isMarch)
      System.out.println("We are living in the future!");
    // snippet: /improvedIfExample1

  }

  public static void badIfExample2(){
    // snippet: badIfExample2
    // *@\Gradle{runBadIfExample2}@*
    int i = 13, j = 2020;
    if (i > 10 && i > j)
      System.out.println("i is greater than 10");
      System.out.println("i is greater than j");
    // snippet: /badIfExample2

  }

  public static void improvedIfExample2(){
    // snippet: improvedIfExample2
    // *@\Gradle{runImprovedIfExample2}@*
    int i = 13, j = 2020;
    if (i > 10 && i > j){
      System.out.println("i is greater than 10");
      System.out.println("i is greater than j");
    }
    // snippet: /improvedIfExample2

  }

  public static void badIfExample3(){
    // snippet: badIfExample3
    // *@\Gradle{runBadIfExample3}@*
    int i = 13, j = 2020;
    if (i > 10)
      if (i > j)
        System.out.println("i > 10 && i > j");
    else
      System.out.println("i <= 10");
    // snippet: /badIfExample3

  }

  public static void improvedIfExample3(){
    int i = 13, j = 2020;
    // snippet: improvedIfExample3
    // *@\Gradle{runImprovedIfExample3}@*
    if (i > 10){
      if (i > j)
        System.out.println("i > 10 && i > j");
    }
    else
      System.out.println("i <= 10");
    // snippet: /improvedIfExample3

  }
}
