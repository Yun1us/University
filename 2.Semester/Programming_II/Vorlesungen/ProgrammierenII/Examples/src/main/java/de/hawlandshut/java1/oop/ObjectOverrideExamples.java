package de.hawlandshut.java1.oop;

import de.hawlandshut.java1.oop.game.Item;
import de.hawlandshut.java1.oop.game.Merchant;
import de.hawlandshut.java1.oop.game.NonPlayerCharacter;
import static java.lang.System.out;

public class ObjectOverrideExamples {

  public static void overrideToStringExample() {
    // snippet: overrideToStringExample
    // *@\Gradle{runOverrideToStringExample}@*
    NonPlayerCharacter yennefer = new NonPlayerCharacter(
        "Yennefer", "...", 0, 0);
    System.out.println(yennefer);
    // snippet: /overrideToStringExample
  }

  public static void wrongEqualsExample() {
    // snippet: wrongEqualsExample
    // *@\Gradle{runWrongEqualsExample}@*
    NonPlayerCharacter yennefer = 
      new NonPlayerCharacter("Yennefer", "*sigh*", 0, 0);
    NonPlayerCharacter jaskier = 
      new NonPlayerCharacter("Jaskier", "*sigh*", 2, 6);

    System.out.printf("yennefer.equals(yaskier): %b%n", 
        yennefer.equals(jaskier));
    // snippet: /wrongEqualsExample
  }

  public static void rightEqualsExample() {
    // snippet: rightEqualsExample
    // *@\Gradle{runRightEqualsExample}@*
    NonPlayerCharacter yennefer = 
      new NonPlayerCharacter("Yennefer", "*sigh*", 0, 0);
    NonPlayerCharacter yenneferClone = 
      new NonPlayerCharacter(yennefer);
    NonPlayerCharacter jaskier = 
      new NonPlayerCharacter("Jaskier", "*sigh*", 2, 6);

    System.out.printf("yennefer.equals(yaskier): %b%n", 
        yennefer.equals(jaskier));
    System.out.printf("yennefer.equals(yenneferClone): %b%n", 
        yennefer.equals(yenneferClone));
    // snippet: /rightEqualsExample
  }

  public static void badHashCodeExample() {
    // snippet: badHashCodeExample
    // *@\Gradle{runAddHashCodeExample}@*
    NonPlayerCharacter yennefer = 
      new NonPlayerCharacter("Yennefer", "*sigh*", 0, 0);
    NonPlayerCharacter jaskier = 
      new NonPlayerCharacter("Jaskier", "*sigh*", 2, 6);

    System.out.printf("yennefer.hashCode(): %d%n", 
        yennefer.hashCode());
    System.out.printf("jaskier.hashCode(): %d%n", 
        jaskier.hashCode());
    
    // snippet: /badHashCodeExample
  }

  public static void goodHashCodeExample() {
    // snippet: goodHashCodeExample
    // *@\Gradle{runGoodHashCodeExample}@*
    NonPlayerCharacter yennefer = 
      new NonPlayerCharacter("Yennefer", "*sigh*", 0, 0);
    NonPlayerCharacter yenneferClone = 
      new NonPlayerCharacter(yennefer);
    NonPlayerCharacter jaskier = 
      new NonPlayerCharacter("Jaskier", "*sigh*", 2, 6);

    System.out.printf("yennefer.hashCode(): %d%n", 
        yennefer.hashCode());
    System.out.printf("yenneferClone.hashCode(): %d%n", 
        yenneferClone.hashCode());
    System.out.printf("jaskier.hashCode(): %d%n", 
        jaskier.hashCode());
    // snippet: /goodHashCodeExample
  }

  // snippet: cloneNPC
  public static NonPlayerCharacter 
      cloneNPC(NonPlayerCharacter npc) {
    return new NonPlayerCharacter(npc);
  }
  // snippet: /cloneNPC

  public static void copyConstructorGoneWrongExample() {
    Item[] stock = new Item[] { new Item("Key", 100) };
    // snippet: copyConstructorGoneWrongExample
    // *@\Gradle{runCopyConstructorGoneWrongExample}@*
    var merchant = new Merchant("Bram", stock, 10, 5);
    out.println(merchant);

    var merchantClone = new Merchant(merchant);
    out.println(merchantClone);

    var anotherClone = cloneNPC(merchant);
    out.println(anotherClone);
    // snippet: /copyConstructorGoneWrongExample
  }
  
}
