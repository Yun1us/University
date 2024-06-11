package de.hawlandshut.java1.oopbasics;

public class ProductExample
{
  public static void productExample() {
    // snippet: productExample
    // *@\Gradle{runProductExample}@*
    Product sword = new Product("Sword");
    Product shield = new Product("Shield");

    System.out.printf("%s (%d)%n", 
        sword.getName(), sword.getSerialNumber());
    
    System.out.printf("%s (%d)%n", 
        shield.getName(), shield.getSerialNumber());
    // snippet: /productExample
  }
}


