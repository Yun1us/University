package de.hawlandshut.java1.oopbasics;

// snippet: class
public class Product {
  private static int serialNumberCounter = 0;

  private final int serialNumber;
  private final String name;

  public Product(String name) {
    serialNumberCounter++;
    this.serialNumber = serialNumberCounter;
    this.name = name;
  }

  public int getSerialNumber() { return serialNumber; }
  public String getName() { return name; }
}
// snippet: /class


