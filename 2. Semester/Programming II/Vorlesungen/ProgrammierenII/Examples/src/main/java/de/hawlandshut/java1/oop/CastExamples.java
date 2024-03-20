package de.hawlandshut.java1.oop;

import de.hawlandshut.java1.oop.game.GameCharacter;
import de.hawlandshut.java1.oop.game.NonPlayerCharacter;
import de.hawlandshut.java1.oop.game.Player;
import static java.lang.System.out;

public class CastExamples {

  public static void objectTypeRefExample() {
    // snippet: objectTypeRefExample
    // *@\Gradle{runObjectTypeRefExample}@*
    GameCharacter character = new Player();
    out.printf("character.getName(): %s%n", 
        character.getName());
    // snippet: /objectTypeRefExample
  }

  public static void implicitCastExample() {
    // snippet: implicitCastExample
    Player player = new Player();
    GameCharacter character = player;
    Object object = character;
    // snippet: /implicitCastExample
  }

  // snippet: printName
  public static void printName(GameCharacter character) {
    out.printf("Name: %s%n", character.getName());
  }
  // snippet: /printName

  public static void printNameExample() {
    // snippet: printNameExample
    // *@\Gradle{runPrintNameExample}@*
    Player player = new Player();
    printName(player);
    // snippet: /printNameExample
    NonPlayerCharacter yennefer = new NonPlayerCharacter(
        "Yennefer", "...", 0, 0);
    printName(yennefer);
  }

  public static void narrowingCastExample() {
    // snippet: narrowingCastExample
    // *@\Gradle{runNarrowingCastExample}@*
    Object object = new Player(); // widening
    printName((GameCharacter) object); // narrowing
    // snippet: /narrowingCastExample
  }

  public static void narrowingCastExample2() {
    // snippet: narrowingCastExample2
    // *@\Gradle{runNarrowingCastExample2}@*
    Object object = new NonPlayerCharacter(
        "Yennefer", "...", 0, 0);

    // narrowing casts
    GameCharacter character = (GameCharacter) object;
    NonPlayerCharacter npc = (NonPlayerCharacter) object;

    out.printf("object.hashCode(): %d%n", object.hashCode());
    out.printf("character.getName(): %s%n", character.getName());
    out.printf("npc.talk(): %s%n", npc.talk());
    // snippet: /narrowingCastExample2
  }

  // snippet: letNPCTalk
  public static void letNPCTalk(
      GameCharacter character) {

    NonPlayerCharacter npc = 
      (NonPlayerCharacter) character;

    out.printf("%s: %s%n", 
        character.getName(), npc.talk());
  }
  // snippet: /letNPCTalk


  public static void invalidNarrowingCastExample() {
    // snippet: invalidNarrowingCastExample
    // *@\Gradle{runInvalidNarrowingCastExample}@*
    NonPlayerCharacter yennefer = new NonPlayerCharacter(
        "Yennefer", "...", 0, 0);
    letNPCTalk(yennefer);

    Player player = new Player();
    letNPCTalk(player);
    // snippet: /invalidNarrowingCastExample
  }

  // snippet: printInfo
  public static void printInfo(Object obj) {

    if (obj instanceof Player){
      Player player = (Player) obj;
      out.printf("Player: gold=%d%n", player.getGold());
    } else 
      out.println("Kein Player");

    if (obj instanceof NonPlayerCharacter){
      NonPlayerCharacter npc = (NonPlayerCharacter) obj;
      out.printf("NonPlayerCharacter: phrase=%s%n", npc.getPhrase());
    } else 
      out.println("Kein NonPlayerCharacter");


    if (obj instanceof GameCharacter){
      GameCharacter character = (GameCharacter) obj;
      out.printf("GameCharacter: name=%s%n", character.getName());
    } else 
      out.println("Kein GameCharacter");

  }
  // snippet: /printInfo


  public static void instanceofOOPExample() {
    // snippet: instanceofOOPExample
    // *@\Gradle{runInstanceofOOPExample}@*
    Player player = new Player();
    NonPlayerCharacter yennefer = new NonPlayerCharacter(
        "Yennefer", "...", 0, 0);
    String s = "Toss a coin to the witcher...";

    out.println("printInfo(player)");
    printInfo(player);
    out.println();

    out.println("printInfo(yennefer)");
    printInfo(yennefer);
    out.println();

    out.println("printInfo(s)");
    printInfo(s);
    // snippet: /instanceofOOPExample
  }
  
}
