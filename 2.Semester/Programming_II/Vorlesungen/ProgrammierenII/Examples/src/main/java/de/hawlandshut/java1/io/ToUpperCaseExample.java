package de.hawlandshut.java1.io;

import java.io.IOException;

public class ToUpperCaseExample {

  public static void convertToUpperCase(){
    int in = 0;
    try {
      while ((in = System.in.read()) >= 0){
        char upper = Character.toUpperCase((char) in);
        System.out.print(upper);
      }
    } catch (IOException e){
      System.err.println(e.getMessage());
    }

  }
  
}
