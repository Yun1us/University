package de.hawlandshut.java1.oopbasics;

// snippet: class
public class ConfigurableGreeter {

  public static String greeting = "Hello";

  private String target;

  public ConfigurableGreeter(String target){
    this.target = target;
  }

  public void greet(){
    System.out.printf("%s, %s!%n", greeting, target);
  }

}
// snippet: /class
