package de.hawlandshut.java1.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

import static java.lang.System.out;

public class ReaderWriterExamples {

  public static void writeIntByteStream() throws IOException{
    // snippet: writeIntByteStream
    // *@\Gradle{runWriteIntByteStream}@*
    var file = new FileOutputStream("answer.bin");
    var data = new DataOutputStream(file);
    data.writeInt(42);
    // snippet: /writeIntByteStream
    data.close();
  }

  public static void printIntText() throws IOException{
    // snippet: printIntText
    // *@\Gradle{runPrintIntText}@*
    var file = new PrintWriter("answer.txt");
    file.print(42);
    // snippet: /printIntText
    file.close();
  }
  
  
  public static void fileWriterEncoding() throws IOException {
    // snippet: fileWriterEncoding
    // *@\Gradle{runFileWriterEncoding}@*
    Charset iso8859 = Charset.forName("ISO-8859-1");
    FileWriter out = new FileWriter("output.txt", iso8859);
    out.write("Süßölgefäß");
    out.close();
    // snippet: /fileWriterEncoding
  }

  public static void fileReaderEncoding() throws IOException {
    // snippet: fileReaderEncoding
    // *@\Gradle{runFileReaderEncoding}@*
    char[] c = new char[1024]; // magic number
    Charset iso8859 = Charset.forName("ISO-8859-1");
    FileReader in = new FileReader("output.txt", iso8859);
    int count = in.read(c);
    out.printf("Gelesen: %d character%n", count);

    // erstelle String aus c[0..count-1]
    String s = new String(c, 0, count);
    out.println(s);
    
    in.close();
    // snippet: /fileReaderEncoding
  }
  
  public static void inputStreamReaderExample() throws IOException {
    // snippet: inputStreamReaderExample
    // *@\Gradle{runInputStreamReaderExample}@*
    ServerSocket server = new ServerSocket(12345);

    out.println("Waiting for incoming connections...");
    Socket connection = server.accept();

    InputStream inputStream = connection.getInputStream();
    InputStreamReader reader = new InputStreamReader(inputStream, "UTF-16");

    char[] b = new char[1024];
    int count = reader.read(b);
    String s = new String(b, 0, count);
    out.println(s);

    reader.close();
    server.close();
    // snippet: /inputStreamReaderExample
  }
  

  public static void outputStreamWriterExample() throws IOException {
    // snippet: outputStreamWriterExample
    // *@\Gradle{runOutputStreamWriterExample}@*
    Socket client = new Socket();
    out.println("Connecting...");
    client.connect(new InetSocketAddress("localhost", 12345));

    OutputStream outputStream = client.getOutputStream();
    OutputStreamWriter writer = new OutputStreamWriter(outputStream, "UTF-16");

    writer.write("Süßölgefäß");
    out.println("done...");

    writer.close();
    client.close();
    // snippet: /outputStreamWriterExample
  }
  
  
}
