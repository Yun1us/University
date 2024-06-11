package de.hawlandshut.java1.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Arrays;

import static java.lang.System.out;

public class SourcesSinksExamples {

  // snippet: readAndPrint
  public static void readAndPrint(InputStream in) {
    try{
      int i;
      while ((i = in.read()) >= 0){
        out.printf("%d (%c)%n", i, (char) i);
      }
    } catch (IOException e){
      out.println(e.getMessage());
    }
    
  }
  // snippet: /readAndPrint
  

  public static void sourceSystemIn() {
    // snippet: sourceSystemIn
    // *@\Gradle{runSourceSystemIn}@*
    readAndPrint(System.in);
    // snippet: /sourceSystemIn
  }

  public static void sourceFileInputStream() throws IOException {
    // snippet: sourceFileInputStream
    // *@\Gradle{runSourceFileInputStream}@*
    FileInputStream in = new FileInputStream("input.txt");
    readAndPrint(in);
    // snippet: /sourceFileInputStream
  }

  public static void sourceByteArrayInputStream() {
    // snippet: sourceByteArrayInputStream
    // *@\Gradle{runSourceByteArrayInputStream}@*
    byte[] a = new byte[] { 'J', 'a', 'v', 'a', '\n' };
    ByteArrayInputStream in = new ByteArrayInputStream(a);
    readAndPrint(in);
    // snippet: /sourceByteArrayInputStream
  }

  public static void sourcePipedInputStream() throws IOException {
    // snippet: sourcePipedInputStream
    // *@\Gradle{runSourcePipedInputStream}@*
    PipedOutputStream out = new PipedOutputStream();
    PipedInputStream in = new PipedInputStream(out);
    out.write( new byte[]  { 'J', 'a', 'v', 'a', '\n' } );
    readAndPrint(in);
    // snippet: /sourcePipedInputStream
  }

  // snippet: writeJava
  public static void writeJava(OutputStream out) {
    try{
      out.write(new byte[] { 'J', 'a', 'v', 'a', '\n' } );
      out.close();
    }catch (IOException e){
      System.err.println(e.getMessage());
    }
  }
  // snippet: /writeJava
  

  public static void sinkSystemOutErr() {
    // snippet: sinkSystemOutErr
    // *@\Gradle{runSinkSystemOutErr}@*
    writeJava(System.out);
    writeJava(System.err);
    // snippet: /sinkSystemOutErr
  }
  
  public static void sinkFileOutputStream() throws IOException {
    // snippet: sinkFileOutputStream
    // *@\Gradle{runSinkFileOutputStream}@*
    FileOutputStream out = new FileOutputStream("output.txt");
    writeJava(out);
    // snippet: /sinkFileOutputStream
  }

  public static void sinkByteArrayOutputStream() {
    // snippet: sinkByteArrayOutputStream
    // *@\Gradle{runSinkByteArrayOutputStream}@*
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    writeJava(out);
    System.out.println(Arrays.toString(out.toByteArray()));
    // snippet: /sinkByteArrayOutputStream
  }
  
  
  
  
  
  
  
}
