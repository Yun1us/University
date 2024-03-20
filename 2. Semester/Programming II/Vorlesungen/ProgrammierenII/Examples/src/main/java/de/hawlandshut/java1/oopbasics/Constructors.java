package de.hawlandshut.java1.oopbasics;

public class Constructors {
  public static void numberPrinterExample1() {
    // snippet: numberPrinterExample1
    // *@\Gradle{runNumberPrinterExample1}@*
    var numberPrinter = new NumberPrinter();
    numberPrinter.printNumber();
    // snippet: /numberPrinterExample1
  }

  public static void numberPrinterExample2() {
    // snippet: numberPrinterExample2
    // *@\Gradle{runNumberPrinterExample2}@*
    var numberPrinter = new NumberPrinter(3.1415f);
    numberPrinter.printNumber();
    // snippet: /numberPrinterExample2
  }

}


