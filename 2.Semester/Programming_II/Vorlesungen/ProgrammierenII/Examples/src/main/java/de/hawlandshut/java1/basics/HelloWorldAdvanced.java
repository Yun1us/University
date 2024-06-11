package de.hawlandshut.java1.basics;
// *@\Gradle{runHelloWorldAdvanced}@* --args="Name"
public class HelloWorldAdvanced{

  private static final String DEFAULT_NAME = "World";
  

  public static void main(String[] args){
    // snippet: statements
    String name = DEFAULT_NAME;
    if (args.length > 0)
      name = args[0];
    System.out.println("Hello " + name + "!");
    // snippet: /statements
  }

}
