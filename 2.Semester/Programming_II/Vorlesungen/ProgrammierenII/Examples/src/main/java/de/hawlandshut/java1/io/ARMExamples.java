package de.hawlandshut.java1.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.System.err;

public class ARMExamples {

  // snippet: copyFile
  public static void copyFile(String from, String to) 
    throws IOException {
    var in = new FileInputStream(from);
    var out = new FileOutputStream(to);

    in.transferTo(out);

    in.close();
    out.close();
  }
  // snippet: /copyFile
  
  // snippet: copyFileWithFinally
  public static void copyFileWithFinally(
      String from, String to) throws IOException {
    FileInputStream in = null;
    FileOutputStream out = null;
    try{
      in = new FileInputStream(from);
      out = new FileOutputStream(to);
      in.transferTo(out);
    } finally {
      if (in != null) in.close();
      if (out != null) out.close();
    }
  }
  // snippet: /copyFileWithFinally
  
  public static void copyFileWithFinallyFinally(
      String from, String to) throws IOException {
    FileInputStream in = null;
    FileOutputStream out = null;
    // snippet: copyFileWithFinallyFinally
    try{
      in = new FileInputStream(from);
      out = new FileOutputStream(to);
      in.transferTo(out);
    } finally {
      try{
        if (in != null) in.close();
        if (out != null) out.close();
      } finally {
          if (in != null) in.close();
          if (out != null) out.close();
      }
    }
    // snippet: /copyFileWithFinallyFinally
  }
  
  public static void copyFileWithARM(String from, String to) 
    throws IOException {
  // snippet: copyFileWithARM
    try (var in = new FileInputStream(from);
         var out = new FileOutputStream(to)){
      in.transferTo(out);
    }
  // snippet: /copyFileWithARM
  }

  public static void copyFileWithARMAndExceptions(String from, String to) 
    throws IOException {
  // snippet: copyFileWithARMAndExceptions
    try (var in = new FileInputStream(from);
         var out = new FileOutputStream(to)){
      in.transferTo(out);
    } catch (IOException e){
      err.println(e.getMessage());
    }
  // snippet: /copyFileWithARMAndExceptions
  }

  public static void copyFileWithARMAndExceptionsSuppressed(String from, String to) 
    throws IOException {
    try (var in = new FileInputStream(from);
         var out = new FileOutputStream(to)){
      in.transferTo(out);
    } 
    // snippet: copyFileWithARMAndExceptionsSuppressed
    catch (IOException e){

      err.println(e.getMessage());

      for (Throwable t : e.getSuppressed())
        err.println(t.getMessage());

    }
    // snippet: /copyFileWithARMAndExceptionsSuppressed
  }
}
