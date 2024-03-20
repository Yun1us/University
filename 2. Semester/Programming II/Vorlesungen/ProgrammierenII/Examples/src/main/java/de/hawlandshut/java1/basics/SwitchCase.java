package de.hawlandshut.java1.basics;

import java.util.Calendar;
import java.util.Scanner;


public class SwitchCase
{

  // snippet: printMonthDaysIf
  // *@\Gradle{runPrintMonthDaysIf}@*
  public static void printMonthDaysIf(int month, boolean isLeapYear){
    if (month == Calendar.JANUARY
        || month == Calendar.MARCH
        || month == Calendar.MAY
        || month == Calendar.JULY
        || month == Calendar.AUGUST
        || month == Calendar.OCTOBER
        || month == Calendar.DECEMBER){
      System.out.println("31 Tage");
    }else if (month ==  Calendar.APRIL
        || month == Calendar.JUNE
        || month == Calendar.SEPTEMBER
        || month == Calendar.NOVEMBER){
      System.out.println("30 Tage");
    }else if (month == Calendar.FEBRUARY) {



      if (isLeapYear){
        System.out.println("29 Tage");
      } else {
        System.out.println("28 Tage");
      }
    }else{
      System.out.println("Ungültiger Monat");
    }
  }
  // snippet: /printMonthDaysIf

  // snippet: printMonthDaysSwitch
  // *@\Gradle{runPrintMonthDaysSwitch}@*
  public static void printMonthDaysSwitch(int month, boolean isLeapYear){
    switch (month){
      case Calendar.JANUARY:
      case Calendar.MARCH:
      case Calendar.MAY:
      case Calendar.JULY:
      case Calendar.AUGUST:
      case Calendar.OCTOBER:
      case Calendar.DECEMBER:
        System.out.println("31 Tage");
        break;

      case Calendar.APRIL:
      case Calendar.JUNE:
      case Calendar.SEPTEMBER:
      case Calendar.NOVEMBER:
        System.out.println("30 Tage");
        break;

      case Calendar.FEBRUARY:
        if (isLeapYear){
          System.out.println("29 Tage");
        } else {
          System.out.println("28 Tage");
        }
        break;

      default:
        System.out.println("Ungültiger Monat");
    }
  }

  // snippet: /printMonthDaysSwitch
  public static void switchCaseExample(int n){
    // snippet: switchCaseExample
    // *@\Gradle{runSwitchCaseExample}@*
    switch (n % 5){
      case 0:
        System.out.println("Rest 0");
        break;

      case 1:
      case 2:
        System.out.println("Rest 1 oder 2");
        break;

      case 4:
        System.out.println("Rest 4");

      default:
        System.out.println("Default");
    }
    // snippet: /switchCaseExample
  }

  
  public static void switchCaseStringExample() {
    var scanner = new Scanner(System.in);
    System.out.println("Sind Sie mit allem einverstanden?");
    String userInput = scanner.nextLine();
    // snippet: switchCaseStringExample
    // *@\Gradle{runSwitchCaseStringExample}@*
    switch (userInput.toUpperCase()){
      case "JA":
      case "YES":
        System.out.println("Nutzer sagt 'Ja'!");
        break;

      case "NEIN":
      case "NO":
        System.out.println("Nutzer sagt 'Nein'!");
        break;

      case "VIELLEICHT":
      case "MAYBE":
        System.out.println("Nutzer ist sich nicht sicher!");
        break;

      default:
        System.out.println("Eingabe nicht verstanden: " + userInput);
    }
    // snippet: /switchCaseStringExample
    scanner.close();
  }

  public static void switchCaseExpressionExample() {
    // snippet: switchCaseExpressionExample
    final int theAnswer = 42;
    switch ((int) (Math.random()*100)) {
      case theAnswer:
        System.out.println("Die ganze Wahrheit");
        break;

      case theAnswer/2:
        System.out.println("Die halbe Wahrheit");
        break;

      case theAnswer*2:
        System.out.println("Die doppelte Wahrheit");
        break;

      default:
        System.out.println("Was anderes");
    }
    // snippet: /switchCaseExpressionExample
  }


}


