package de.hawlandshut.java1.oopbasics;

public class SingletonGreeterExample
{
  public static void singletonGreeterExample() {
    // snippet: singletonGreeterExample
    // *@\Gradle{runSingletonGreeterExample}@*
    System.out.println("Los geht's!");

    var greeter = SingletonGreeter.getInstance();
    greeter.greet("Landshut");

    var greeter2 = SingletonGreeter.getInstance();
    greeter2.greet("Students");
    // snippet: /singletonGreeterExample
  }
}


