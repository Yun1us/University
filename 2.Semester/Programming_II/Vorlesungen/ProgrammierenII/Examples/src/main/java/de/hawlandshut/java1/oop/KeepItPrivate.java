package de.hawlandshut.java1.oop;

// snippet: class
public class KeepItPrivate{
  private String message(){
    return "This is private!";
  }

  public void saySomething(){
    System.out.println(message());
  }
}
// snippet: /class

