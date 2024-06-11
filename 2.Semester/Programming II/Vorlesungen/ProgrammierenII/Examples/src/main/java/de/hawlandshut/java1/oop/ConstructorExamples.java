package de.hawlandshut.java1.oop;

import de.hawlandshut.java1.oop.game.NonPlayerCharacter;

public class ConstructorExamples
{
  public static void inheritanceCopyConstructorExample() {
    // snippet: inheritanceCopyConstructorExample
    // *@\Gradle{runInheritanceCopyConstructorExample}@*
    var yennefer = new NonPlayerCharacter("Yennefer", 
        "I'm not heartless, I've just learned how to use my heart less.",
        0, 0);
    var yenneferClone = new NonPlayerCharacter(yennefer);

    System.out.printf("yennefer: %s%n", yennefer);
    System.out.printf("yenneferClone: %s%n", yenneferClone);
    // snippet: /inheritanceCopyConstructorExample
  }
}


