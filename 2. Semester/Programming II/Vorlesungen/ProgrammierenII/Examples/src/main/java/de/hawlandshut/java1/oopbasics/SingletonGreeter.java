package de.hawlandshut.java1.oopbasics;

// snippet: class
public class SingletonGreeter {
  private static SingletonGreeter instance;

  private String greeting;

  private SingletonGreeter(){
    System.out.println("SingletonGreeter()");
    greeting = "Hello";
  }

  public static SingletonGreeter getInstance(){
    System.out.println("getInstance()");

    if (instance == null)
      instance = new SingletonGreeter();
    return instance;
  }

  public void greet(String target){
    System.out.printf("%s, %s!%n", greeting, target);
  }
}
// snippet: /class


