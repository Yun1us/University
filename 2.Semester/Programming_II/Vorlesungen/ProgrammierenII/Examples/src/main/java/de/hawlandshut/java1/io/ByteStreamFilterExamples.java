package de.hawlandshut.java1.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.zip.GZIPOutputStream;

import static java.lang.System.out;

public class ByteStreamFilterExamples {

  // snippet: gzip
  public static void main(String args[]) 
      throws IOException {

    var in = new FileInputStream(args[0]);
    var out = new FileOutputStream(args[0] + ".gz");
    var gzipFilter = new GZIPOutputStream(out);

    in.transferTo(gzipFilter);

    in.close();
    gzipFilter.close(); // closes out as well
  }
  // snippet: /gzip
  

  // snippet: writeData
  public static void writeData(DataOutputStream out) 
      throws IOException {
    out.writeInt(42);
    out.writeDouble(Math.PI);
    out.writeBoolean(true);
    out.writeUTF("Java!");
  }
  // snippet: /writeData
  
  // snippet: readData
  public static void readData(DataInputStream in) 
    throws IOException {

    int i = in.readInt();
    double pi = in.readDouble();
    boolean b = in.readBoolean();
    String s = in.readUTF();

    out.printf("i=%d, pi=%f, b=%b, s=%s%n", i, pi, b, s);
  }
  // snippet: /readData

  public static void dataOutputStreamExample() throws IOException {
    // snippet: dataOutputStreamExample
    // *@\Gradle{runDataOutputStreamExample}@*
    var fileOut = new FileOutputStream("data.bin");
    var dataOut = new DataOutputStream(fileOut);
    writeData(dataOut);
    // snippet: /dataOutputStreamExample
  }

  public static void dataInputStreamExample() throws IOException {
    // snippet: dataInputStreamExample
    // *@\Gradle{runDataInputStreamExample}@*
    var fileIn = new FileInputStream("data.bin");
    var dataIn = new DataInputStream(fileIn);
    readData(dataIn);
    // snippet: /dataInputStreamExample
  }

  public static void combinedFiltersExample() throws IOException, NoSuchAlgorithmException{
    // snippet: combinedFiltersExample
    // *@\Gradle{runCombinedFiltersExample}@*
    var file = new FileOutputStream("data.bin");
    var gzip = new GZIPOutputStream(file);
    var digest = new DigestOutputStream(gzip, 
        MessageDigest.getInstance("MD5"));
    var dataOut = new DataOutputStream(digest);
    writeData(dataOut);
    // snippet: /combinedFiltersExample
    out.println("MD5: " +
        Arrays.toString(digest.getMessageDigest().digest()));
  }
  
  
  
  
  
}
