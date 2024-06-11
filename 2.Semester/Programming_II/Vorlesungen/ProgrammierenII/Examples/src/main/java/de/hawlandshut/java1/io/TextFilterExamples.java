package de.hawlandshut.java1.io;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

import static java.lang.System.out;

public class TextFilterExamples {

  public static void bufferedWriterExample() throws IOException {
    // snippet: bufferedWriterExample
    // *@\Gradle{runBufferedWriterExample}@*
    FileWriter file = new FileWriter("squares.txt");
    BufferedWriter out = new BufferedWriter(file);

    for (int i = 0; i < 10; i++) {
      out.write(i + "^2 = " + (i*i));
      out.newLine();
    }

    out.close();
    // snippet: /bufferedWriterExample
  }

  public static void lineNumberReaderExample() throws IOException {
    // snippet: lineNumberReaderExample
    // *@\Gradle{runLineNumberReaderExample}@*
    FileReader file = new FileReader("squares.txt");
    LineNumberReader in = new LineNumberReader(file);

    String line;

    do{
      int n = in.getLineNumber();
      line = in.readLine();

      if (line != null)        
        out.printf("Zeile %d: %s%n", n, line);
    } while (line != null);

    in.close();
    // snippet: /lineNumberReaderExample
  }
  
  
  
}
