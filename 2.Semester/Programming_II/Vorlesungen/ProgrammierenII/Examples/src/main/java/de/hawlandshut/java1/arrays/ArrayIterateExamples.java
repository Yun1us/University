package de.hawlandshut.java1.arrays;

public class ArrayIterateExamples {
  
  public static void arraySumExample() {
    // snippet: arraySumExample
    // *@\Gradle{runArraySumExample}@*
    int[] numbers = new int[] {1,2,3,4,5};
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }

    System.out.printf("sum = %d%n", sum);
    // snippet: /arraySumExample
  }

  public static void arraySumForEachExample() {
    // snippet: arraySumForEachExample
    // *@\Gradle{runArraySumForEachExample}@*
    int[] numbers = new int[] {1,2,3,4,5};
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }

    System.out.printf("sum = %d%n", sum);
    // snippet: /arraySumForEachExample
  }

  public static void printArray(int[] xs){
    System.out.print("[ ");
    for (int x : xs){
      System.out.print(x + " ");
    }
    System.out.println("]");
  }

  public static void arraySortExample() {
    // snippet: arraySortExample
    // *@\Gradle{runArraySortExample}@*
    int[] numbers = new int[] {4,1,8,7,2,9,3,5,6};
    int n = numbers.length;
    for (int i = 0; i < n-1; i++){
      for (int j = 0; j < n-i-1; j++){
        if (numbers[j] > numbers[j+1]){
          int temp = numbers[j];
          numbers[j] = numbers[j+1];
          numbers[j+1] = temp;
        }
      }
    }
    printArray(numbers); // [ 1 2 3 4 5 6 7 8 9 ]
    // snippet: /arraySortExample
  }

}
