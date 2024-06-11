package de.hawlandshut.java1.io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

import static java.lang.System.out;

public class CharsetExamples {

  public static void charsetListEncodings() {
    // snippet: charsetListEncodings
    // *@\Gradle{runCharsetListEncodings}@*
    for (Charset charset : Charset.availableCharsets().values())
      out.println(charset.name());
    // snippet: /charsetListEncodings
  }

  public static void charsetDefaultEncoding() {
    // snippet: charsetDefaultEncoding
    // *@\Gradle{runCharsetDefaultEncoding}@*
    out.println(Charset.defaultCharset().name());
    // snippet: /charsetDefaultEncoding
  }

  public static void charsetEncodeDecode() {
    // snippet: charsetEncodeDecode
    // *@\Gradle{runCharsetEncodeDecode}@*
    Charset iso8859 = Charset.forName("ISO-8859-1");
    ByteBuffer b = iso8859.encode("Süßölgefäß");
    out.println(Arrays.toString(b.array()));
    CharBuffer c = iso8859.decode(b);
    out.println(c.toString());
    // snippet: /charsetEncodeDecode
  }
  
  
  
}
