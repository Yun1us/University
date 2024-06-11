package de.hawlandshut.java1.basics;

import java.util.Iterator;
import java.util.LinkedList;

public class For
{
  public static void forInfiniteLoopExample() {
    // snippet: forInfiniteLoopExample
    // *@\Gradle{runForInfiniteLoopExample}@*
    for ( ; ; ){
      System.out.println("All work and no play makes Jack a dull boy");
    }
    // snippet: /forInfiniteLoopExample
  }

  public static void forMultiplicationTable() {
    // Beispiel von [Insel]
    // snippet: forMultiplicationTable
    // *@\Gradle{runForMultiplicationTable}@*
    for (int i = 1, j = 9; i < 10; i++, j--){
      System.out.printf("%d * %d = %d%n", i, j, i*j);
    }
    
    // snippet: /forMultiplicationTable
  }

  // snippet: forExpressionStatementsExample
  // *@\Gradle{runForExpressionStatementsExample}@*
  public static void forExpressionStatementsExample() {
    int i, sum;

    for (i = 0, sum = 0, logInit(i, sum); // Initialisierung
         i < 100;                         // Bedingung
         i++, logStep(i, sum)) {          // Fortsetzung
      sum += i;
    }

  }

  private static void logInit(int i, int sum){
    System.out.printf(
        "Initialisierung: i == %d, sum == %d%n", i, sum);
  }

  private static void logStep(int i, int sum){
    System.out.printf(
        "Fortsetzung: i == %d, sum == %d%n", i, sum);
  }
  // snippet: /forExpressionStatementsExample

  // snippet: planets
  public static LinkedList<CelestialBody> planets() {
    LinkedList<CelestialBody> planets = 
      new LinkedList<CelestialBody>();
    planets.add(new CelestialBody("Mercury",   0.330e24));
    planets.add(new CelestialBody("Venus",     4.87e24));
    planets.add(new CelestialBody("Earth",     5.97e24));
    planets.add(new CelestialBody("Moon",      0.073e24));
    planets.add(new CelestialBody("Mars",      0.642e24));
    planets.add(new CelestialBody("Jupiter",   1898e24));
    planets.add(new CelestialBody("Saturn",    568e24));
    planets.add(new CelestialBody("Uranus",    86.8e24));
    planets.add(new CelestialBody("Neptune",   102e24));
    planets.add(new CelestialBody("Pluto",     0.0146e24));
    return planets;
  }
  // snippet: /planets

  public static void iteratorExample() {
    // snippet: iteratorExample
    // *@\Gradle{runIteratorExample}@*
    LinkedList<CelestialBody> planets = planets();

    // iterator erstellen (Iterable-Interface)
    Iterator<CelestialBody> planetsIterator = planets.iterator();
    double massSum = 0d;

    // solange noch Elemente aufzulisten sind
    while (planetsIterator.hasNext()){
      // hole nächstes Element
      CelestialBody planet = planetsIterator.next();
      massSum += planet.getMass();
    }

    System.out.printf("Masse aller Planeten: %e%n", massSum);
    // snippet: /iteratorExample
  }

  public static void forEachExample() {
    // snippet: forEachExample
    // *@\Gradle{runForEachExample}@*
    LinkedList<CelestialBody> planets = planets();
    double massSum = 0d;

    for (CelestialBody planet : planets){
      massSum += planet.getMass();
    }

    System.out.printf("Masse aller Planeten: %e%n", massSum);
    // snippet: /forEachExample
  }

  public static void forEachArrayExample() {
    // snippet: forEachArrayExample
    // *@\Gradle{runForEachArrayExample}@*
    int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int sum = 0;

    for (int number: numbers){
      sum += number;
    }

    System.out.printf("Summe: %d%n", sum);
    // snippet: /forEachArrayExample
  }

}


