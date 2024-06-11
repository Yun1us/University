package de.hawlandshut.java1.arrays;

public class RectangularArrayExamples {

  // snippet: printMatrix
  private static void printMatrix(double[][] matrix){
    for (int i = 0; i < matrix.length; i++){
      for (int j = 0; j < matrix[i].length; j++){
        System.out.printf("% 2.1f ", matrix[i][j]);
      }
      System.out.println();
    }
  }
  // snippet: /printMatrix

  // snippet: printMatrixForEach
  private static void printMatrixForEach(double[][] matrix){
    for (double[] row : matrix){
      for (double entry : row){
        System.out.printf("% 2.1f ", entry);
      }
      System.out.println();
    }
  }
  // snippet: /printMatrixForEach


  public static void identityMatrixExample() {
    // snippet: identityMatrixExample
    // *@\Gradle{runIdentityMatrixExample}@*
    double[][] matrix = new double[3][]; // 3 Zeilen

    for (int i = 0; i < matrix.length; i++)
      matrix[i] = new double[3]; // 3 Spalten je Zeile

    matrix[0][0] = 1;
    matrix[1][1] = 1;
    matrix[2][2] = 1;

    printMatrix(matrix);
    // snippet: /identityMatrixExample
  }
  
  public static void identityMatrixLiteralExample() {
    // snippet: identityMatrixLiteralExample
    // *@\Gradle{runIdentityMatrixLiteralExample}@*
    double[][] matrix = new double[][] 
    { 
        {1,0,0}, // Zeile 0
        {0,1,0}, // Zeile 1
        {0,0,1}  // Zeile 2
    };

    printMatrix(matrix);
    // snippet: /identityMatrixLiteralExample
  }
  
  // snippet: printMatrix3D
  private static void printMatrix3D(int[][][] matrix){
    for (int i = 0; i < matrix.length; i++){
      for (int j = 0; j < matrix[i].length; j++){
        for (int k = 0; k < matrix[i][j].length; k++){
          System.out.printf("m[%d][%d][%d] = %d%n", i, j, k, matrix[i][j][k]);
        }
      }
    }
  }
  // snippet: /printMatrix

  public static void threeDimArrayExample() {
    // snippet: threeDimArrayExample
    // *@\Gradle{runThreeDimArrayExample}@*
    int[][][] threeDim = new int[3][4][5];

    for (int i = 0; i < threeDim.length; i++)
      for (int j = 0; j < threeDim[i].length; j++)
        for (int k = 0; k < threeDim[i][j].length; k++)
          threeDim[i][j][k] = i + j + k;

    printMatrix3D(threeDim);
    // snippet: /threeDimArrayExample
  }
  
}
