package de.hawlandshut.java1.oop;

import de.hawlandshut.java1.oop.game.Consumable;
import de.hawlandshut.java1.oop.game.Food;
import de.hawlandshut.java1.oop.game.HealthPotion;
import de.hawlandshut.java1.oop.game.MagicWand;
import de.hawlandshut.java1.oop.game.Item;
import static java.lang.System.out;

public class BasicInterfaceExamples {

  // snippet: printItemInfo
  public static void printItemInfo(Item mysteryItem) {
    out.printf("Item: name=%s, value=%d%n",
        mysteryItem.getName(), mysteryItem.getValue());

    if (mysteryItem instanceof Consumable){
      Consumable consumable = (Consumable) mysteryItem;

      out.printf("Consumable: unitsLeft=%d%n", 
          consumable.unitsLeft());
    } else 
      out.printf("Item is not consumable%n");

    System.out.println();
  }
  // snippet: /printItemInfo

  public static void interfaceTypeExample() {
    // snippet: interfaceTypeExample
    // *@\Gradle{runInterfaceTypeExample}@*
    var healthPotion = 
      new HealthPotion("Health Potion", 10, 100);
    var squirrelBits = 
      new Food("Squirrel on a Stick", 2, 5);

    printItemInfo(healthPotion);
    printItemInfo(squirrelBits);
    // snippet: /interfaceTypeExample
  }

  public static void interfaceCastExample() {
    // snippet: interfaceCastExample
    Food squirrelBits = 
      new Food("Squirrel on a Stick", 2, 5);

    Item item = squirrelBits; // widening
    Consumable consumable = squirrelBits; // widening

    Food food = (Food) consumable; // narrowing
    // snippet: /interfaceCastExample
  }

  // snippet: sumUnits
  // *@\Gradle{runSumUnits}@*
  public static int sumUnits(Consumable... consumables) {
    int sum = 0;

    for (Consumable consumable : consumables)
      sum += consumable.unitsLeft();

    return sum;
  }
  // snippet: /sumUnits

  public static void sumUnitsExample() {
    // snippet: sumUnitsExample
    // *@\Gradle{runSumUnitsExample}@*
    Food squirrelBits = 
      new Food("Squirrel on a Stick", 2, 5);
    MagicWand fireWand = 
      new MagicWand("Wand of Fire", 500, 100);

    var sum = sumUnits(squirrelBits, fireWand);

    out.printf("Sum: %d%n", sum);
    // snippet: /sumUnitsExample
  }
  
}
