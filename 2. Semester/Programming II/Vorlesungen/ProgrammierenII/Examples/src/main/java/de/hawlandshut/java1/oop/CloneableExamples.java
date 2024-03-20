package de.hawlandshut.java1.oop;

import de.hawlandshut.java1.oop.game.Player;
import de.hawlandshut.java1.oop.game.SlimeBlob;

import static java.lang.System.out;

public class CloneableExamples {
  
  public static void callCloneExample() 
    throws CloneNotSupportedException {
    // snippet: callCloneExample
    // *@\Gradle{runCallCloneExample}@*
    Player player = new Player();
    var playerClone = player.clone();
    // snippet: /callCloneExample
  }

  public static void slimeBlobCloneExample() {
    // snippet: slimeBlobCloneExample
    // *@\Gradle{runSlimeBlobCloneExample}@*
    var slime = new SlimeBlob("Large Green Slime", 
        1, 2, 100, 20, 50, SlimeBlob.SlimeColor.GREEN);

    var slimeClone = slime.clone();

    out.printf("slime == slimeClone: %b%n", slime == slimeClone);
    out.println(slime);
    out.println(slimeClone);
    // snippet: /slimeBlobCloneExample
  }
}
