package de.hawlandshut.java1.oopbasics;

// snippet: numberPrinter
public class NumberPrinter
{
  private double number = getRandomNumber();

  public NumberPrinter(){
    System.out.println("NumberPrinter()");
  }

  public NumberPrinter(double number){
    System.out.printf("NumberPrinter(%f)%n", number);
    this.number = number;
  }

  private double getRandomNumber(){
    System.out.println("getRandomNumber()");
    return 1000*Math.random();
  }

  public void printNumber(){
    System.out.printf("Number: %f%n", number);
  }

}
// snippet: /numberPrinter


