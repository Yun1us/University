package de.hawlandshut.java1.oop;

import de.hawlandshut.java1.oop.game.Bottle;
import de.hawlandshut.java1.oop.game.Consumable;
import de.hawlandshut.java1.oop.game.Container;
import de.hawlandshut.java1.oop.game.FancyBottle;
import de.hawlandshut.java1.oop.game.Food;
import de.hawlandshut.java1.oop.game.Item;
import de.hawlandshut.java1.oop.game.Replenishable;
import static java.lang.System.out;

public class MultipleInterfacesExamples {

  // snippet: printInfo
  public static void printInfo(Item item) {
    out.printf("Name: %s%n", item.getName());

    if (item instanceof Consumable){
      var consumable = (Consumable) item;
      out.printf("units left: %d%n", consumable.unitsLeft());
    } else out.println("Not Consumable");

    if (item instanceof Replenishable){
      var replenishable = (Replenishable) item;
      out.printf("maximum units: %d%n", replenishable.maximumUnits());
    } else out.println("Not Replenishable");

    out.println();
  }
  // snippet: /printInfo

  public static void multipleInterfacesExample() {
    // snippet: multipleInterfacesExample
    // *@\Gradle{runMultipleInterfacesExample}@*
    var fairyBottle = new Bottle("Fairy Bottle", 10, 10, 2);
    var squirrelBits = new Food("Squirrel on a Stick", 2, 5);
    
    printInfo(fairyBottle);
    printInfo(squirrelBits);
    // snippet: /multipleInterfacesExample
  }

  // snippet: printConsumableInfo
  public static void 
      printConsumableInfo(Consumable consumable) {
    out.printf("Consumable.unitsLeft(): %d%n", 
        consumable.unitsLeft());
  }
  // snippet: /printConsumableInfo
    
  // snippet: printReplenishableInfo
  public static void 
      printReplenishableInfo(Replenishable replenishable) {
    out.printf("Replenishable.maximumUnits(): %d%n", 
        replenishable.maximumUnits());
  }
  // snippet: /printReplenishableInfo
    
  // snippet: printContainerInfo
  public static void 
      printContainerInfo(Container container) {
    out.printf("Container percent full: %f%n", 
        (100f * container.unitsLeft()) / container.maximumUnits());
  }
  // snippet: /printContainerInfo

  public static void multipleInterfacesExample2() {
    // snippet: multipleInterfacesExample2
    // *@\Gradle{runMultipleInterfacesExample2}@*
    var fancyBottle = 
      new FancyBottle("Fancy Bottle", 10, 10, 2);

    printConsumableInfo(fancyBottle);
    printReplenishableInfo(fancyBottle);
    printContainerInfo(fancyBottle);
    // snippet: /multipleInterfacesExample2
  }


  
}
