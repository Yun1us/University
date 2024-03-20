package de.hawlandshut.java1.oopbasics;

public class ConfigurableGreeterExample
{

  public static void configurableGreeterExample() {
    // snippet: configurableGreeterExample
    // *@\Gradle{runConfigurableGreeterExample}@*
    ConfigurableGreeter landshutGreeter = 
      new ConfigurableGreeter("Landshut");
    ConfigurableGreeter studentGreeter = 
      new ConfigurableGreeter("Students");
    
    landshutGreeter.greet();
    studentGreeter.greet();

    ConfigurableGreeter.greeting = "Servus";
    landshutGreeter.greet();
    studentGreeter.greet();
    // snippet: /configurableGreeterExample
  }

}


