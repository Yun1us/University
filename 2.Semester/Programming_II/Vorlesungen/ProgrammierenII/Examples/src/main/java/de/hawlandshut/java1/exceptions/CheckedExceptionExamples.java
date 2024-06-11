package de.hawlandshut.java1.exceptions;

import java.io.File;
import java.io.IOException;

import static java.lang.System.out;

public class CheckedExceptionExamples {

  public static void checkedExceptionExample() {
    // snippet: checkedExceptionExample
    try {
      File.createTempFile("java1-", "txt");
    } catch (IOException exception){
      out.println("Kann Datei nicht erstellen");
    }
    // snippet: /checkedExceptionExample
  }
  
}
