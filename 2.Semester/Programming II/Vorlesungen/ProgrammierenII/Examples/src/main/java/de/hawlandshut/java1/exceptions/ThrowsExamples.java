
package de.hawlandshut.java1.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExamples {

  // snippet: generateTempFile
  public static File generateTempFile() 
    throws IOException {
    return File.createTempFile("java1-", "txt");
  }
  // snippet: /generateTempFile

  // snippet: readFirstByte
  public static int readFirstByte(String path) 
    throws FileNotFoundException, IOException {

    var file = new File(path);
    var in = new FileInputStream(file); // FileNotFoundException
    int b = in.read(); // IOException
    in.close(); // IOException
    return b;

  }
  // snippet: /readFirstByte
  
}
