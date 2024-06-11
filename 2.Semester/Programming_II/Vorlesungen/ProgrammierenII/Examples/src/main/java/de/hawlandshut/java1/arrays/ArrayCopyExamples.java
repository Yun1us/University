package de.hawlandshut.java1.arrays;
import static de.hawlandshut.java1.arrays.ArrayIterateExamples.printArray;

import de.hawlandshut.java1.oopbasics.shapes.Point2D;

public class ArrayCopyExamples {

  private static void printComparison(int[] a, int[] b, String aName, String bName){
    System.out.printf("%s == %s? %b%n", aName, bName, a == b);

    boolean entriesIdentical = true;

    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]){
        entriesIdentical = false;
        break;
      }

    }

    System.out.printf("Eintraege identisch? %b%n", entriesIdentical);

  }

  private static void printComparison(Point2D[] a, Point2D[] b, String aName, String bName){
    System.out.printf("%s == %s? %b%n", aName, bName, a == b);

    boolean entriesIdentical = true;

    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]){
        entriesIdentical = false;
        break;
      }

    }

    System.out.printf("Eintraege identisch? %b%n", entriesIdentical);

    boolean entriesEqual = true;

    for (int i = 0; i < a.length; i++) {
      if (!a[i].equals(b[i])){
        entriesIdentical = false;
        break;
      }

    }

    System.out.printf("Eintraege wertgleich? %b%n", entriesEqual);

  }



  public static void arrayAssignmentExample() {
    // snippet: arrayAssignmentExample
    // snippet: runArrayAssignmentExample
    int[] numbers = new int[] {1,2,3,4};
    int[] numbers2 = numbers;
    // snippet: /arrayAssignmentExample
    printComparison(numbers,numbers2, "numbers", "numbers2");
  }

  public static void arrayCopyManualExample() {
    // snippet: arrayCopyManualExample
    // *@\Gradle{runArrayCopyManualExample}@*
    int[] numbers = new int[] {1,2,3,4};

    int[] numbersClone = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) 
      numbersClone[i] = numbers[i];
    // snippet: /arrayCopyManualExample
    printComparison(numbers,numbersClone, "numbers", "numbersClone");
  }

  public static void arrayCopyCloneExample() {
    // snippet: arrayCopyCloneExample
    // *@\Gradle{runArrayCopyCloneExample}@*
    int[] numbers = new int[] {1,2,3,4};
    int[] numbersClone = numbers.clone();
    // snippet: /arrayCopyCloneExample
    printComparison(numbers,numbersClone, "numbers", "numbersClone");
  }

  public static void arrayFlatCopyExample() {
    // snippet: arrayFlatCopyExample
    // *@\Gradle{runArrayFlatCopyExample}@*
    Point2D[] triangle = new Point2D[]{
      new Point2D(0,0), new Point2D(2,0), new Point2D(1,1)
    };

    Point2D[] triangle2 = triangle.clone();
    // snippet: /arrayFlatCopyExample
    printComparison(triangle, triangle2, "triangle", "triangle2");
  }

  public static void arrayDeepCopyManualExample() {
    // snippet: arrayDeepCopyManualExample
    // *@\Gradle{runArrayDeepCopyManualExample}@*
    Point2D[] triangle = new Point2D[]{
      new Point2D(0,0), new Point2D(2,0), new Point2D(1,1)
    };

    Point2D[] triangle2 = new Point2D[triangle.length];

    for (int i = 0; i < triangle.length; i++)
      triangle2[i] = new Point2D(triangle[i]);
    // snippet: /arrayDeepCopyManualExample
    printComparison(triangle, triangle2, "triangle", "triangle2");
  }
  
  public static void arrayDeepCopyCloneExample() {
    // snippet: arrayDeepCopyCloneExample
    // *@\Gradle{runArrayDeepCopyCloneExample}@*
    Point2D[] triangle = new Point2D[]{
      new Point2D(0,0), new Point2D(2,0), new Point2D(1,1)
    };

    Point2D[] triangle2 = new Point2D[triangle.length];

    for (int i = 0; i < triangle.length; i++)
      triangle2[i] = triangle[i].clone();
    // snippet: /arrayDeepCopyCloneExample
    printComparison(triangle, triangle2, "triangle", "triangle2");
  }
  public static void arrayDeepCopyNonRectangular() {
    Point2D[][] polygons = new Point2D[3][];
    
    polygons[0] = new Point2D[] { // three points
      new Point2D(0,0), new Point2D(2,0), new Point2D(1,1)
    };
    
    polygons[1] = new Point2D[] { // four points
      new Point2D(3,0), new Point2D(4,0), 
      new Point2D(4,1), new Point2D(3,1)
    };
    
    polygons[2] = new Point2D[] { // six points
      new Point2D(3,2), new Point2D(4,3), new Point2D(4,4), 
      new Point2D(3,5), new Point2D(2,4), new Point2D(2,3)
    };
    // snippet: arrayDeepCopyNonRectangular
    Point2D[][] clone = new Point2D[polygons.length][];

    for (int i = 0; i < polygons.length; i++){
      clone[i] = new Point2D[polygons[i].length];

      for (int j = 0; j < polygons[i].length; j++){
        clone[i][j] = polygons[i][j].clone();
      }

    }
    // snippet: /arrayDeepCopyNonRectangular
  }
  
}
