package de.hawlandshut.java1.arrays;

import de.hawlandshut.java1.oopbasics.Weekday;
import de.hawlandshut.java1.oopbasics.shapes.Point2D;

public class OneDimArrayExamples {

  public static void randomArrayLengthExample() {
    // snippet: randomArrayLengthExample
    // *@\Gradle{runRandomArrayLengthExample}@*
    int length = (int) (Math.random()*100);
    int[] numbers = new int[2*length+20];
    System.out.printf("numbers.length == %d%n", 
        numbers.length);
    // snippet: /randomArrayLengthExample
  }

  
  // snippet: createIntArray
  // *@\Gradle{runCreateIntArray}@*
  public static int[] createIntArray(int length) {
    System.out.printf("new int[%d]%n", length);
    int[] numbers = new int[length];
    System.out.printf("numbers.length == %d%n", 
        numbers.length);
    return numbers;
  }
  // snippet: /createIntArray

  // snippet: arrayMultiplesExample
  // *@\Gradle{runArrayMultiplesExample}@*
  public static int[] arrayMultiplesExample(int n) {
    int[] multiples = new int[] {1 * n, 2 * n, 3 * n};
    return multiples;
  }
  // snippet: /arrayMultiplesExample
  

  public static void arrayReferencesExample() {
    // snippet: arrayReferencesExample
    // *@\Gradle{runArrayReferencesExample}@*
    Point2D[] points = new Point2D[4];
    points[0] = new Point2D(2,3);
    points[1] = new Point2D(-1,2);

    points[2] = points[0];
    points[2].move(5,5);

    points[3].set(0,0); // NullPointerException
    // snippet: /arrayReferencesExample
  }
}
