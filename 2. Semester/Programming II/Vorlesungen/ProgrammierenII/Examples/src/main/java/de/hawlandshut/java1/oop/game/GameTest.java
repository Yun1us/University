package de.hawlandshut.java1.oop.game;

import static java.lang.System.out;

public class GameTest {

  public static GameCharacter[] gameSetup() {
    // Stock items
    var key = new Item("Key", 10);
    var healthPotion = new HealthPotion(
        "Redundant Health Potion of Health", 50, 10);
    var buffPotion = new BuffPotion(
        "Rage Potion", 100, 10, -5);

    Item[] stock = new Item[] { key, healthPotion, buffPotion };

    Player player = new Player();

    // NPCs
    NonPlayerCharacter yennefer =
        new NonPlayerCharacter("Yennefer", 
            "I'm not heartless, I've just learned how to use my heart less.",
            10, 1);

    NonPlayerCharacter jaskier =
      new NonPlayerCharacter("Jaskier",
          "Toss a coin to the witcher!", 1, 1);

    Merchant merchant =
        new Merchant("Blackbough's Merchant", stock, 5, 5);

    GameCharacter[] characters = 
      new GameCharacter[]{
        player, yennefer, jaskier, merchant
      };

    return characters;
  }

  public static void gameLoop() {
    // snippet: gameLoop
    // *@\Gradle{runGameLoop}@*
    GameCharacter[] characters = gameSetup();
    Player player = (Player) characters[0];

    while (player.isAlive()) {
      for (GameCharacter character : characters){
        character.update();
        out.println(character);
        out.println();
      }
    }
    
    // snippet: /gameLoop
  }

  
}
