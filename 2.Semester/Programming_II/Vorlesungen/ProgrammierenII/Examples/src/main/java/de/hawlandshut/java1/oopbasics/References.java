package de.hawlandshut.java1.oopbasics;

import de.hawlandshut.java1.oopbasics.shapes.Point2D;

public class References {

  public static void referencesExample() {
    // snippet: referencesExample
    // *@\Gradle{runReferencesExample}@*
    Point2D p1, p2, p3;
    p1 = new Point2D(0,0);
    p2 = new Point2D(0,1);

    System.out.printf("Distanz: %f%n", p1.distance(p2));

    p3 = p2;
    p3.set(1,1);

    System.out.printf("Distanz: %f%n", p1.distance(p2));
    // snippet: /referencesExample
  }

  public static void referencesAndPrimitiveTypes() {
    // snippet: referencesAndPrimitiveTypes
    Point2D p1, p2;
    p1 = new Point2D(1,2);
    p2 = p1;

    int i, j;
    i = 1;
    j = i;
    // snippet: /referencesAndPrimitiveTypes
  }

  public static void referenceEqualityExample() {
    // snippet: referenceEqualityExample
    // *@\Gradle{runReferenceEqualityExample2}@*
    Point2D p1 = new Point2D(1,2);
    Point2D p2 = new Point2D(1,2);
    System.out.printf("p1 == p2: %b%n", p1 == p2);
    p2 = p1;
    System.out.printf("p1 == p2: %b%n", p1 == p2);
    // snippet: /referenceEqualityExample
  }

}


