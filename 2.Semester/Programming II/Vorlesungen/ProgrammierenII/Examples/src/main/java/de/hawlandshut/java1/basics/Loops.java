package de.hawlandshut.java1.basics;

import java.util.Scanner;

public class Loops
{
  public static void nestedLoopsExample() {
    // snippet: nestedLoopsExample
    // *@\Gradle{runNestedLoopsExample}@*
    for (int p = 2; p < 10; p++) {
      for (int q = p; q < 10; q++) {
        System.out.printf("%d * %d = %d%n", p, q, p*q);
      }
    }
    // snippet: /nestedLoopsExample
  }

  private static void swap(int[] array, int i, int j){
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  // snippet: bubbleSort
  // *@\Gradle{runBubbleSort}@*
  public static void bubbleSort(int[] numbers) {
    int n = numbers.length; 
    for (int i = 0; i < n-1; i++) {
      for (int j = 0; j < n-i-1; j++) {
        if (numbers[j] > numbers[j+1]) { 
          swap(numbers, j, j+1);
        } 
      }
    }
  }
  // snippet: /bubbleSort

  public static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++){
      for (int j = 0; j < matrix[i].length; j++){
        System.out.printf("%4d ", matrix[i][j]);
      }
      System.out.println();
    }
    
  }

  public static void squareMatrix() {
    int n = 3;
    int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
    int[][] result = new int[3][3];
    System.out.println("Eingabe: ");
    printMatrix(matrix);
    // snippet: squareMatrix
    // *@\Gradle{runSquareMatrix}@*
    for (int i = 0; i < n; i++){
      for (int j = 0; j < n; j++){
        result[i][j] = 0;
        for (int k = 0; k < n; k++){
          result[i][j] += matrix[i][k] * matrix[k][j];
        }
      }
    }
    // snippet: /squareMatrix
    System.out.println("Ergebnis: ");
    printMatrix(result);
  }

  // snippet: innerProduct
  public static int innerProduct(int[][] x, int i, int j){
    int result = 0;
    for (int k = 0; k < x.length; k++){
      result += x[i][k] * x[k][j];
    }
    return result;
  }
  // snippet: /innerProduct

  public static void improvedSquareMatrix() {
    int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
    final int n = matrix.length;
    int[][] result = new int[3][3];
    System.out.println("Eingabe: ");
    printMatrix(matrix);
    // snippet: improvedSquareMatrix
    // *@\Gradle{runImprovedSquareMatrix}@*
    for (int i = 0; i < n; i++){
      for (int j = 0; j < n; j++){
        result[i][j] = innerProduct(matrix, i, j);
      }
    }
    // snippet: /improvedSquareMatrix
    System.out.println("Ergebnis: ");
    printMatrix(result);

  }

  public static void badLoopExample() {
    Scanner scanner = new Scanner(System.in);
    // snippet: badLoopExample
    // *@\Gradle{runBadLoopExample}@*
    int lower = scanner.nextInt();
    scanner.nextLine();
    int upper = scanner.nextInt();

    for (int i = lower; i != (upper+1); i++){
      System.out.printf("%d^2 = %d%n", i, i*i);
    }
    // snippet: /badLoopExample
  }

  public static void improvedLoopExample() {
    Scanner scanner = new Scanner(System.in);
    // snippet: improvedLoopExample
    // *@\Gradle{runImprovedLoopExample}@*
    int lower = scanner.nextInt();
    scanner.nextLine();
    int upper = scanner.nextInt();

    for (int i = lower; i <= upper; i++){
      System.out.printf("%d^2 = %d%n", i, i*i);
    }
    // snippet: /improvedLoopExample
  }

  public static void simpleBreakExample() {
    // snippet: simpleBreakExample
    // *@\Gradle{runSimpleBreakExample}@*
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.printf("i = %d, j = %d%n", i, j);
        break;
      }
    }
    // snippet: /simpleBreakExample
  }

  public static void breakLoopExample() {
    // snippet: breakLoopExample
    // *@\Gradle{runBreakLoopExample}@*
    String s = "I used to be an adventurer like you, then I took an arrow in the knee";
    String searchString = "arrow";
    boolean found = false;

    // teste jede Position für searchString in s
    for (int i = 0; i < s.length()-searchString.length(); i++){
      int j = 0;
      found = false;

      // vergleiche Zeichen für Zeichen
      while (searchString.charAt(j) == s.charAt(i+j)){
        j++;

        // alle Zeichen von searchString stimmen überein
        if (j >= searchString.length()){
          found = true;
          break;
        }
      }
    }
    System.out.printf("Gefunden: %b%n", found);

    // snippet: /breakLoopExample
  }

  public static void breakLoopWithLabelExample() {
    // snippet: breakLoopWithLabelExample
    // *@\Gradle{runBreakLoopWithLabelExample}@*
    String s = "I used to be an adventurer like you, then I took an arrow in the knee";
    String searchString = "arrow";
    boolean found = false;

searchLoop: // NEU: Marke für äußere Schleife
    for (int i = 0; i < s.length()-searchString.length(); i++){

      int j = 0;
      found = false;

      while (searchString.charAt(j) == s.charAt(i+j)){
        j++;

        if (j >= searchString.length()){
          found = true;
          break searchLoop; // NEU: bricht beide Schleifen ab
        }
      }
    }
    System.out.printf("Gefunden: %b%n", found);

    // snippet: /breakLoopWithLabelExample
  }

}


