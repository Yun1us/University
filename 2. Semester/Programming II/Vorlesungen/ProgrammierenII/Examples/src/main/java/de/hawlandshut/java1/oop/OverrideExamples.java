package de.hawlandshut.java1.oop;

import de.hawlandshut.java1.oop.game.BuffPotion;
import de.hawlandshut.java1.oop.game.HealthPotion;
import de.hawlandshut.java1.oop.game.Item;
import de.hawlandshut.java1.oop.game.Player;

import static java.lang.System.out;

public class OverrideExamples {

  public static void useItemsExample() {
    // snippet: useItemsExample
    // *@\Gradle{runUseItemsExample}@*
    var player = new Player();

    var key = new Item("Key", 10);

    var healthPotion = new HealthPotion(
        "Redundant Health Potion of Health", 50, 10);

    var buffPotion = new BuffPotion(
        "Rage Potion", 100, 10, -5);

    key.use(player);
    out.println(player);

    healthPotion.use(player);
    out.println(player);

    buffPotion.use(player);
    out.println(player);
    // snippet: /useItemsExample
  }

  public static void forgottenOverrideMessExample() {
    // snippet: forgottenOverrideMessExample
    // *@\Gradle{runForgottenOverrideMessExample}@*
    var printer = new SubPoint2DPrinter();
    var p = new de.hawlandshut.java1.oopbasics.shapes.Point2D(1,2);

    printer.printPoint(p);
    // snippet: /forgottenOverrideMessExample
  }

  public static void covarianceExample() {
    Item key = new Item("Key", 10);
    var healthPotion = new HealthPotion(
        "Redundant Health Potion of Health", 50, 10);
    // snippet: covarianceExample
    // *@\Gradle{runCovarianceExample}@*
    Item expensiveKey = key.doublePotentVersion();

    // kein Cast notwendig:
    HealthPotion powerfulHealthPotion = 
      healthPotion.doublePotentVersion(); 

    out.println(expensiveKey);
    out.println(powerfulHealthPotion);
    // snippet: /covarianceExample
  }

  public static void dynamicVsStaticBindingExample() {
    // snippet: dynamicVsStaticBindingExample
    // *@\Gradle{runDynamicVsStaticBindingExample}@*
    var priv = new KeepItPrivate();
    var pub = new MakeItPublic();
    var whistleblower = new WhistleBlower();

    priv.saySomething();
    pub.saySomething();
    whistleblower.saySomething();
    // snippet: /dynamicVsStaticBindingExample
  }
  
}
