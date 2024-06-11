package de.hawlandshut.java1.oopbasics.shapes;

public class SimpleRectangleExamples
{
  public static void negativeWidthExample() {
    // snippet: negativeWidthExample
    // *@\Gradle{runNegativeWidthExample}@*
    SimpleRectangle rect = new SimpleRectangle();
    rect.width = 10;
    rect.height = -5;
    System.out.printf("Flaeche: %d%n", rect.getArea());
    // snippet: /negativeWidthExample
  }

  public static void nullCenterExample() {
    // snippet: nullCenterExample
    // *@\Gradle{runNullCenterExample}@*
    SimpleRectangle rect = new SimpleRectangle();
    rect.width = 10;
    rect.height = 5;
    System.out.printf("Beinhaltet (0,0): %b%n", 
        rect.contains(new Point2D(0,0)));
    // snippet: /nullCenterExample
  }

}



