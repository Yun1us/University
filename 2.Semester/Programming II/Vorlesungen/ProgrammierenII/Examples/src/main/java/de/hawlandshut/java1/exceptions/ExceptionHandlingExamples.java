package de.hawlandshut.java1.exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.err;

public class ExceptionHandlingExamples {

  public static void noExceptionHandlingExample() {
    // snippet: noExceptionHandlingExample
    // *@\Gradle{runNoExceptionHandlingExample}@*
    Scanner scanner = new Scanner(System.in);

    int i = scanner.nextInt();
    out.printf("%d*%d = %d%n", i, i, i*i);

    scanner.close();
    // snippet: /noExceptionHandlingExample
  }

  public static void someExceptionHandlingExample() {
    // snippet: someExceptionHandlingExample
    // *@\Gradle{runSomeExceptionHandlingExample}@*
    try{
      Scanner scanner = new Scanner(System.in);
      int i = scanner.nextInt();
      out.printf("%d*%d = %d%n", i, i, i*i);
      scanner.close();
    } catch (InputMismatchException exception){
      err.printf("Zahl erwartet%n");
    }
    // snippet: /someExceptionHandlingExample
  }

  public static void someExceptionHandlingExample2() {
    // snippet: someExceptionHandlingExample2
    // *@\Gradle{runSomeExceptionHandlingExample2}@*
    boolean valid = false;
    Scanner scanner = new Scanner(System.in);
    do {
      try{
        int i = scanner.nextInt();
        out.printf("%d*%d = %d%n", i, i, i*i);
        valid = true;
      } catch (InputMismatchException exception){
        err.printf("Bitte ganze Zahl eingeben!%n");
        scanner.nextLine();
      }
    } while (!valid);
    scanner.close();
    // snippet: /someExceptionHandlingExample2
  }

  public static void moreExceptionHandlingExample() {
    Scanner scanner = new Scanner(System.in);
    // snippet: moreExceptionHandlingExample
    // *@\Gradle{runMoreExceptionHandlingExample}@*
    try{
      int i = scanner.nextInt();
      out.printf("%d*%d = %d%n", i, i, i*i);
      scanner.close();
    } catch (InputMismatchException exception){
      err.printf("Bitte ganze Zahl eingeben!%n");
    } catch (NoSuchElementException exception){
      err.printf("Kann nichts mehr lesen!%n");
    }
    // snippet: /moreExceptionHandlingExample
  }

  public static void finallyExceptionHandlingExample() {
    Scanner scanner = new Scanner(System.in);
    // snippet: finallyExceptionHandlingExample
    // *@\Gradle{runFinallyExceptionHandlingExample}@*
    try{
      int i = scanner.nextInt();
      out.printf("%d*%d = %d%n", i, i, i*i);

    } catch (InputMismatchException exception){
      err.printf("Bitte ganze Zahl eingeben!%n");

    } catch (NoSuchElementException exception){
      err.printf("Kann nichts mehr lesen!%n");

    } finally {
      scanner.close();
      System.out.printf("Scanner geschlossen!%n");
    }
    // snippet: /finallyExceptionHandlingExample
  }

  // snippet: readAndSquare
  public static void readAndSquare(Scanner scanner) {
    try{
      int i = scanner.nextInt();
      out.printf("%d*%d = %d%n", i, i, i*i);
  
    } catch (InputMismatchException exception){
      err.printf("Bitte ganze Zahl eingeben!%n");

    } catch (NoSuchElementException exception){
      err.printf("Kann nichts mehr lesen!%n");

    } finally {
      scanner.close();
      System.out.printf("Finally ausgeführt!%n");
    }
  }
  // snippet: /readAndSquare

  public static void provokeUnhandledException() {
  // snippet: provokeUnhandledException
    try {
      Scanner scanner = new Scanner(System.in);
      scanner.close(); // provoziert Exception
      readAndSquare(scanner);
    } catch (IllegalStateException exception){
      err.println("Methode hat IllegalStateException geworfen");
    }
  // snippet: /provokeUnhandledException
  }
  
  public static void multiCatchExceptionExample() {
    Scanner scanner = new Scanner(System.in);
    // snippet: multiCatchExceptionExample
    // *@\Gradle{runMultiCatchExceptionExample}@*
    try{
      int i = scanner.nextInt();
      out.printf("%d*%d = %d%n", i, i, i*i);
    } catch (InputMismatchException exception){
      err.printf("Bitte ganze Zahl eingeben!%n");
    } catch (NoSuchElementException | IllegalStateException exception){
      err.printf("Kann nichts mehr lesen!%n");
    } finally {
      scanner.close();
      System.out.printf("Scanner geschlossen!%n");
    }
    // snippet: /multiCatchExceptionExample
  }
  
}
