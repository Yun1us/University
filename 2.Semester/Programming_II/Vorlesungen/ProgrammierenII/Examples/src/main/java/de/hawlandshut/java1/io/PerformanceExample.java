
package de.hawlandshut.java1.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static java.lang.System.out;

public class PerformanceExample {

  private static void printPerformanceInfo(long count, long time){
    double mbs = (count/(1024.0*1024.0));
    double secs = (time/1000.0);
    out.printf("Time: %f s%n", secs);
    out.printf("Size: %f MB%n", mbs);
    out.printf("Rate: %f MB/s%n", mbs/secs);
  }

  // snippet: copyByteByByte
  public static long copyByteByByte(InputStream in, 
      OutputStream out) throws IOException {
      long count = 0;
      int b;
      do{
        b = in.read();
        if (b >= 0){
          out.write(b);
          count++;
        }
      } while (b >= 0);

      return count;
  }
  // snippet: /copyByteByByte

  public static void copyFileByteByByte() throws IOException {
    // snippet: copyFileByteByByte
    // *@\Gradle{runCopyFileByteByByte}@*
    FileInputStream in = new FileInputStream("input-file");
    FileOutputStream out = 
      new FileOutputStream("output-file");

    long startTime = System.currentTimeMillis();
    long count = copyByteByByte(in, out);
    long elapsed = System.currentTimeMillis() - startTime;

    // Gibt Infos zur Laufzeit und Datenrate aus
    printPerformanceInfo(count, elapsed);

    in.close();
    out.close();
    
    // snippet: /copyFileByteByByte
  }

  // snippet: copyBuffer
  public static long copyBuffer(InputStream in,
      OutputStream out, byte[] buffer) 
      throws IOException {
    long count = 0;
    int readCount;

    do {
      readCount = in.read(buffer);
      count += readCount;

      if (readCount > 0)
        out.write(buffer, 0, readCount);

    } while (readCount > 0);
    return count;
  }
  // snippet: /copyBuffer

  public static void copyFileBuffer(int bufferSize) throws IOException {
    // snippet: copyFileBuffer
    // *@\Gradle{runCopyFileBuffer}@*
    FileInputStream in = new FileInputStream("input-file");
    FileOutputStream out = new FileOutputStream("output-file");

    byte[] buffer = new byte[bufferSize];
    long startTime = System.currentTimeMillis();
    long count = copyBuffer(in, out, buffer);
    long elapsed = System.currentTimeMillis() - startTime;

    // Gibt Infos zum Laufzeit und Datenrate aus
    System.out.printf("Buffer Size: %d%n", bufferSize);
    printPerformanceInfo(count, elapsed);

    in.close();
    out.close();
    // snippet: /copyFileBuffer
  }

  public static void copyFileByteByByteWithBuffer() throws IOException {
    // snippet: copyFileByteByByteWithBuffer
    // *@\Gradle{runCopyFileByteByByteWithBuffer}@*
    var in = new BufferedInputStream(new FileInputStream("input-file"));
    var out = new BufferedOutputStream(new FileOutputStream("output-file"));

    long startTime = System.currentTimeMillis();
    long count = copyByteByByte(in, out);
    long elapsed = System.currentTimeMillis() - startTime;

    // Gibt Infos zum Laufzeit und Datenrate aus
    printPerformanceInfo(count, elapsed);

    in.close();
    out.close();
    
    // snippet: /copyFileByteByByteWithBuffer
  }

  // snippet: copyTransferTo
  public static long copyTransferTo(InputStream in, 
      OutputStream out) throws IOException {
    return in.transferTo(out);
  }
  // snippet: /copyTransferTo

  public static void copyFileTransferTo() throws IOException {
    // snippet: copyFileTransferTo
    // *@\Gradle{runCopyFileTransferTo}@*
    var in = new FileInputStream("input-file");
    var out = new FileOutputStream("output-file");

    long startTime = System.currentTimeMillis();
    long count = copyTransferTo(in,out);
    long elapsed = System.currentTimeMillis() - startTime;

    // Gibt Infos zum Laufzeit und Datenrate aus
    printPerformanceInfo(count, elapsed);

    in.close();
    out.close();
    // snippet: /copyFileTransferTo
  }




}
