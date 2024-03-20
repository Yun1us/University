package de.hawlandshut.java1.oopbasics;

// snippet: greeter
public class Greeter{
  private String target = "World";

  public Greeter(){ }

  public Greeter(String target){
    this.target = target;
  }

  public void greet(){
    System.out.printf("Hello %s!%n", target);
  }
}
// snippet: /greeter
