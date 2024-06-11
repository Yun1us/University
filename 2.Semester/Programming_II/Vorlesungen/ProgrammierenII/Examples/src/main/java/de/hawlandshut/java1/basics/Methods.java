package de.hawlandshut.java1.basics;

import java.util.LinkedList;

public class Methods {

  // snippet: varargsIntrospection
  public static void varargsIntrospection(int... numbers) {
    System.out.println("Type: " + 
        numbers.getClass().getSimpleName());
    System.out.println("Length: " + numbers.length);

    for (int number : numbers)
      System.out.print(number + " ");
    System.out.println();
  }
  // snippet: /varargsIntrospection

  public static void varargsIntrospectionExample() {
    // snippet: varargsIntrospectionExample
    // *@\Gradle{runVarargsIntrospectionExample}@*
    int[] numberArray = new int[] {1,2,3,4,5};
    varargsIntrospection();
    varargsIntrospection(1,2,3);
    varargsIntrospection(numberArray);
    // snippet: /varargsIntrospectionExample
  }

  // snippet: max
  public static int max(int... numbers) {
    int maxValue = Integer.MIN_VALUE;
    for (int number : numbers){
      maxValue = (number > maxValue ? number : maxValue);
    }
    return maxValue;
  }
  // snippet: /max

  public static void varargsExample2() {
    // snippet: varargsExample2
    // *@\Gradle{runVarargsExample2}@*
    System.out.printf("max() = %d%n", max());
    System.out.printf("max(0) = %d%n", max(0));
    System.out.printf("max(5,1,8,10) = %d%n", max(5,1,8,10));
    // snippet: /varargsExample2
  }


  // snippet: replaceByPlanet
  public static void replaceByPlanet(CelestialBody body) {
    body = new CelestialBody("Pluto", 1.31e22);
  }
  // snippet: /replaceByPlanet

  
  public static void callByValueExample() {
    // snippet: callByValueExample
    // *@\Gradle{runCallByValueExample}@*
    var body = new CelestialBody("some rock", 140);
    System.out.printf("%s (%e kg)%n", 
        body.getName(), body.getMass());
    replaceByPlanet(body);
    System.out.printf("%s (%e kg)%n", 
        body.getName(), body.getMass());
    // snippet: /callByValueExample
  }
  
  // snippet: addRandomInt
  public static void addRandomInt(LinkedList<Integer> xs) {
    xs.add((int) (Math.random()*100));
  }
  // snippet: /addRandomInt

  public static void callByValueExample2() {
    // snippet: callByValueExample2
    // *@\Gradle{runCallByValueExample2}@*
    var numbers = new LinkedList<Integer>();
    numbers.add(1);
    System.out.println(numbers);
    addRandomInt(numbers);
    System.out.println(numbers);
    // snippet: /callByValueExample2
  }

  // snippet: overloadString
  public static void overload(String s) {
    System.out.println("overload(String)");
  }
  // snippet: /overloadString
  
  // snippet: overloadInt
  public static void overload(int i) {
  // snippet: /overloadInt
    System.out.println("overload(Int)");
  }
  
  // snippet: overloadStringString
  public static void overload(String s1, String s2) {
  // snippet: /overloadStringString
    System.out.println("overload(String, String)");
  }
  
  // snippet: overloadStringInt
  public static void overload(String s1, int i) {
  // snippet: /overloadStringInt
    System.out.println("overload(String, int)");
  }
  
  // snippet: overloadIntString
  public static void overload(int i, String s) {
  // snippet: /overloadIntString
    System.out.println("overload(String, int)");
  }

  public static void simpleOverloadExample() {
    // snippet: simpleOverloadExample
    // *@\Gradle{runSimpleOverloadExample}@*
    overload("Hello");
    overload("Hello", "World");
    // ...
    // snippet: /simpleOverloadExample
    overload(123);
    overload("Hello", 123);
    overload(123, "Hello");
  }

  // snippet: overloadObject
  public static void overload(Object obj) {
    System.out.print("overload(Object)");
  }
  // snippet: /overloadObject

  // snippet: minIntVarargs
  public static int min(int... numbers) {
  // snippet: /minVarargs
    System.out.println("min(int... numbers)");
    int minValue = Integer.MAX_VALUE;

    for (int number : numbers ){
      minValue = (number < minValue ? number : minValue);
    }

    return minValue;
  }
 
  // snippet: minLongVarargs
  public static long min(long... numbers) {
  // snippet: /minLongVarargs
    System.out.println("min(long... numbers)");
    long minValue = Long.MAX_VALUE;

    for (long number : numbers ){
      minValue = (number < minValue ? number : minValue);
    }

    return minValue;
  }
 
  // snippet: minIntInt
  public static int min(int i, int j) {
  // snippet: /minIntInt
    System.out.println("min(int i, int j)");
    return (i < j ? i : j);
  }
 
  // snippet: minIntIntInt
  public static int min(int i, int j, int k) {
  // snippet: /minIntIntInt
    System.out.println("int(int i, int j, int k)");
    // lazy...
    return Math.min(Math.min(i,j), k);
  }

  public static void overloadingExample2() {
    // snippet: overloadingExample2
    // *@\Gradle{runOverloadingExample2}@*
    System.out.printf("min(): %d%n%n", min());
    System.out.printf("min(1): %d%n%n", min(1));
    System.out.printf("min(1,2): %d%n%n", min(1,2));
    System.out.printf("min(1,2,3): %d%n%n", min(1,2,3));
    System.out.printf("min(1L,2,3): %d%n%n", min(1L,2,3));
    System.out.printf("min(1,2,3,4): %d%n%n", min(1,2,3,4));
    // snippet: /overloadingExample2
  }

  // snippet: minAndMax
  public int[] minAndMax(int... numbers) {
    int minValue = min(numbers);
    int maxValue = max(numbers);

    return new int[] {minValue, maxValue};
  }
  // snippet: /minAndMax
  
  // snippet: minAndMax2
  public MinMaxResult minAndMax2(int... numbers) {
    int minValue = min(numbers);
    int maxValue = max(numbers);

    return new MinMaxResult(minValue, maxValue);
  }
  // snippet: /minAndMax2

  // snippet: minmaxresult
  public class MinMaxResult{
    private final int min;
    private final int max;
  
    public MinMaxResult(int min, int max){
      this.min = min;
      this.max = max;
    }
  
    public int getMax() { return max; }
    public int getMin() { return min; }
  }
  // snippet: /minmaxresult

  // snippet: greeting
  public static void greeting(String greeting, String target) {
    System.out.printf("%s %s!%n", greeting, target);
  }

  public static void greeting(String greeting) {
    greeting(greeting, "World");
  }

  public static void greeting() {
    greeting("Hello");
  }

  // der "Trick" hat seine Grenzen...
  public static void greetingWithTarget(String target) {
    greeting("Hello", target);
  }
  // snippet: /greeting

  public static void defaultParameterExample() {
    // snippet: defaultParameterExample
    // *@\Gradle{runDefaultParameterExample}@*
    greeting();
    greeting("Servus");
    greetingWithTarget("Landshut");
    greeting("Servus", "Landshut");
    // snippet: /defaultParameterExample
  }
}
