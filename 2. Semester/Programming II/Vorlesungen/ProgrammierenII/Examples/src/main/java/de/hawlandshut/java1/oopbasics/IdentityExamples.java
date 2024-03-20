
package de.hawlandshut.java1.oopbasics;

import java.util.Scanner;

import de.hawlandshut.java1.oopbasics.shapes.Point2D;
import de.hawlandshut.java1.oopbasics.shapes.Rectangle;

public class IdentityExamples {
  
  public static void badIdentityExample() {
    // snippet: badIdentityExample
    // *@\Gradle{runBadIdentityExample}@*
    Scanner scanner = new Scanner(System.in);

    final String password = "1234";

    System.out.println("Enter Password");
    String input = scanner.next();

    if (password == input)
      System.out.println("Access Granted!");
    else
      System.out.println(
          "Ah ah ah, you didn't say the magic word!");
    // snippet: /badIdentityExample
    scanner.close();
  }

  public static void fixedIdentityExample() {
    Scanner scanner = new Scanner(System.in);

    final String password = "1234";

    System.out.println("Enter Password");
    String input = scanner.next();

    // snippet: fixedIdentityExample
    // *@\Gradle{runFixedIdentityExample}@*
    if (password.equals(input))
    // snippet: /fixedIdentityExample
      System.out.println("Access Granted!");
    else
      System.out.println(
          "Ah ah ah, you didn't say the magic word!");
    scanner.close();
  }

  public static void rectangleEqualsTest() {
    // snippet: rectangleEqualsTest
    // *@\Gradle{runRectangleEqualsTest}@*
    Point2D p = new Point2D(2,3);
    Rectangle rect1 = new Rectangle(p, 1, 2);
    Point2D p2 = new Point2D(2,3);
    Rectangle rect2 = new Rectangle(p2, 1, 2);

    System.out.printf("rect1.equals(rect2): %b%n", rect1.equals(rect2));
    System.out.printf("rect2.equals(rect1): %b%n", rect2.equals(rect1));
    System.out.printf("rect1.equals(rect1): %b%n", rect1.equals(rect1));
    System.out.printf("rect1.equals(null): %b%n", rect1.equals(null));
    System.out.printf("rect1.equals(p): %b%n", rect1.equals(p));

    rect2.setWidth(2);
    System.out.printf("rect1.equals(rect2): %b%n", rect1.equals(rect2));
    rect2.setWidth(1);

    rect2.getCenter().move(1,1);
    System.out.printf("rect1.equals(rect2): %b%n", rect1.equals(rect2));
    // snippet: /rectangleEqualsTest
  }
}
