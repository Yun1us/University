package de.hawlandshut.java1.arrays;

import static de.hawlandshut.java1.arrays.ArrayIterateExamples.printArray;

import java.util.Arrays;
import java.util.Objects;

import de.hawlandshut.java1.oopbasics.shapes.Point2D;

public class ArrayEqualsExamples {

  public static void arrayIdentityExample() {
    // snippet: arrayIdentityExample
    // *@\Gradle{runArrayIdentityExample}@*
    int[] numbers = new int[] {1,2,3,4};
    int[] numbers2 = numbers;

    System.out.printf("numbers == numbers2 : %b%n", 
        numbers == numbers2);
    // snippet: /arrayIdentityExample
  }

  public static void arrayEqualsExample() {
    // snippet: arrayEqualsExample
    // *@\Gradle{runArrayEqualsExample}@*
    int[] numbers = new int[] {1,2,3,4};
    int[] numbers2 = numbers;
    int[] numbersClone = numbers.clone();

    System.out.printf("numbers.equals(numbers2): %b%n", 
        numbers.equals(numbers2));

    System.out.printf("numbers.equals(numbersClone): %b%n", 
        numbers.equals(numbersClone));
    // snippet: /arrayEqualsExample
  }


  // snippet: arrayEqualsIntByFoot
  // *@\Gradle{runArrayEqualsIntByFoot}@*
  public static boolean arrayEqualsIntByFoot(
      int[] a, int[] b) {
    if (a.length != b.length)
      return false;

    for (int i = 0; i < a.length; i++){
      if (a[i] != b[i])
        return false;
    }
    return true;
  }
  // snippet: /arrayEqualsIntByFoot
  
  // snippet: arrayEqualsPoint2DByFoot
  public static boolean arrayEqualsPoint2DByFoot(
      Point2D[] a, Point2D[] b) {

    if (a.length != b.length)
      return false;

    for (int i = 0; i < a.length; i++){
      if (!Objects.equals(a[i], b[i]))
        return false;
    }
    return true;
  }
  // snippet: /arrayEqualsPoint2DByFoot

  public static void arrayArraysEqualsExample() {
    // snippet: arrayArraysEqualsExample
    // *@\Gradle{runArrayArraysEqualsExample}@*
    Point2D[] triangle = new Point2D[]{
      new Point2D(0,0), new Point2D(2,0), new Point2D(1,1)};
    Point2D[] triangle2 = new Point2D[]{
      new Point2D(0,0), new Point2D(2,0), new Point2D(1,1)};
    Point2D[] triangle3 = new Point2D[]{
      new Point2D(0,0), new Point2D(2,0), new Point2D(1,2)};

    boolean t1EqualsT2 = Arrays.equals(triangle, triangle2);
    boolean t1EqualsT3 = Arrays.equals(triangle, triangle3);
    // snippet: /arrayArraysEqualsExample
    System.out.printf("Arrays.equals(triangle, triangle2) : %b%n", t1EqualsT2);
    System.out.printf("Arrays.equals(triangle, triangle3) : %b%n", t1EqualsT3);
  }

  public static void arrayTwoDimensionalEqualsExample() {
    // snippet: arrayTwoDimensionalEqualsExample
    // *@\Gradle{runArrayTwoDimensionalEqualsExample}@*
    int[][] a1 = { {1,2,3}, {4,5,6}, {6,8,9} };
    int[][] a2 = { {1,2,3}, {4,5,6}, {6,8,9} };

    System.out.printf("Arrays.equals(a1,a2) : %b%n",
        Arrays.equals(a1,a2));
    // snippet: /arrayTwoDimensionalEqualsExample
  }

  public static void arrayTwoDimensionalDeepEqualsExample() {
    // snippet: arrayTwoDimensionalDeepEqualsExample
    // *@\Gradle{runArrayTwoDimensionalDeepEqualsExample}@*
    int[][] a1 = { {1,2,3}, {4,5,6}, {7,8,9} };
    int[][] a2 = { {1,2,3}, {4,5,6}, {7,8,9} };

    System.out.printf("Arrays.deepEquals(a1,a2) : %b%n",
        Arrays.deepEquals(a1,a2));
    // snippet: /arrayTwoDimensionalDeepEqualsExample
  }
  
}
