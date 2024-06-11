
package de.hawlandshut.java1.oopbasics;

// snippet: enum
public enum WeightUnit
{
  GRAM("g"), KILOGRAM("kg"), TON("t"), POUND("lb");

  private final String symbol;

  WeightUnit(String symbol) {
    this.symbol = symbol;
  }

  public String getSymbol() { return symbol; }
}
// snippet: /enum
