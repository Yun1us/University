package de.hawlandshut.java1.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Arrays;

import static java.lang.System.out;

public class ByteStreamExamples {


  // snippet: ioPlusOne
  public static void ioPlusOne(InputStream in, 
      OutputStream out) throws IOException {
    for (int i = in.read(); i >= 0; i = in.read()){
      out.write((i+1)%256);
    }
  }
  // snippet: /ioPlusOne

  
  public static void ioPlusOneStdInOut() 
    throws IOException {
    // snippet: ioPlusOneStdInOut
    // *@\Gradle{runIoPlusOneStdInOut}@*
    ioPlusOne(System.in, System.out);
    // snippet: /ioPlusOneStdInOut
  }

  public static void ioPlusOneFiles() 
    throws IOException {
    // snippet: ioPlusOneFiles
    // *@\Gradle{runIoPlusOneFiles}@*
    FileInputStream in = new FileInputStream("input.txt");
    FileOutputStream out = new FileOutputStream("output.txt");
    ioPlusOne(in, out);
    // snippet: /ioPlusOneFiles
  }
  public static void ioPlusOneNetwork() 
    throws IOException {
    // snippet: ioPlusOneNetwork
    // *@\Gradle{runIoPlusOneNetwork}@*
    Socket socket = new Socket();
    socket.connect(
        new InetSocketAddress("localhost", 12345));
    ioPlusOne(socket.getInputStream(), 
        socket.getOutputStream());
    // snippet: /ioPlusOneNetwork
    socket.close();
  }

  public static void inputStreamExample() throws IOException {

    // snippet: byteInputStreamInit
    // *@\Gradle{runInputStreamExample}@*
    final byte[] b = { 'H', 'e', 'l', 'l', 'o', 
      ' ', 'I', 'O', '!'};
    ByteArrayInputStream i = new ByteArrayInputStream(b);
    // snippet: /byteInputStreamInit

    // snippet: byteInputStreamRead
    out.println(i.read()); // 72 == 'H'
    // snippet: /byteInputStreamRead
    
    // snippet: byteInputStreamReadBuffer
    byte[] buffer = new byte[4];
    int n = i.read(buffer);
    out.printf("n = %d: %s%n", n, Arrays.toString(buffer));
    // snippet: /byteInputStreamReadBuffer

    // snippet: byteInputStreamReadBuffer2
    buffer = new byte[10];
    n = i.read(buffer, 3, 7);
    out.printf("n = %d: %s%n", n, Arrays.toString(buffer));
    // snippet: /byteInputStreamReadBuffer2

    // snippet: byteInputStreamReset
    i.reset();
    // snippet: /byteInputStreamReset

    // snippet: byteInputStreamSkip
    long l = i.skip(6);
    out.printf("l = %d%n", l);
    // snippet: /byteInputStreamSkip
     
    // snippet: byteInputStreamAvailable
    n = i.available();
    out.printf("n = %d%n", n);
    // snippet: /byteInputStreamAvailable

    // snippet: byteInputStreamMark
    i.mark(100);
    i.skip(3);
    out.printf("before: available = %d%n", i.available());
    i.reset();
    out.printf("after: available = %d%n", i.available());
    // snippet: /byteInputStreamMark

    // snippet: byteInputStreamClose
    i.close();
    // snippet: /byteInputStreamClose
  }

  public static void outputStreamExample() throws IOException {
    // snippet: byteOutputStreamInit
    // *@\Gradle{runOutputStreamExample}@*
    ByteArrayOutputStream o = new ByteArrayOutputStream(4);
    // snippet: /byteOutputStreamInit

    // snippet: byteOutputStreamWrite
    o.write('H');
    out.println(Arrays.toString(o.toByteArray()));
    // snippet: /byteOutputStreamWrite

    // snippet: byteOutputStreamWrite2
    byte[] b = { 'e', 'l', 'l', 'o' };
    o.write(b);
    out.println(Arrays.toString(o.toByteArray()));
    // snippet: /byteOutputStreamWrite2

    // snippet: byteOutputStreamFlushClose
    o.flush();
    o.close();
    // snippet: /byteOutputStreamFlushClose

  }
  
  
}
