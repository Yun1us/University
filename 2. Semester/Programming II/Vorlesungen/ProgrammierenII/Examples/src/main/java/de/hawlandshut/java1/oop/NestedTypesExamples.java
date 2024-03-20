package de.hawlandshut.java1.oop;

import de.hawlandshut.java1.oop.game.Consumable;
import de.hawlandshut.java1.oop.game.SlimeBlob;
import static java.lang.System.out;
public class NestedTypesExamples {

  public static void bloblingsExample() {
    var slimeBlob = 
      new SlimeBlob("Blob",0,1,100,20,60,SlimeBlob.SlimeColor.RED);
    // snippet: bloblingsExample
    // *@\Gradle{runBloblingsExample}@*
    out.println(slimeBlob);

    SlimeBlob[] children = slimeBlob.divide();
    out.println(children[0]);
    out.println(children[1]);
    // snippet: /bloblingsExample
  }

  public static void innerBloblingsExample() {
    var slimeBlob = 
      new SlimeBlob("Blob",0,1,100,20,60,SlimeBlob.SlimeColor.RED);
    // snippet: innerBloblingsExample
    // *@\Gradle{runInnerBloblingsExample}@*
    out.println(slimeBlob);

    SlimeBlob[] children = slimeBlob.innerDivide();
    out.println(children[0]);
    out.println(children[1]);
    // snippet: /innerBloblingsExample
  }

  public static void anonymousBloblingsExample() {
    var slimeBlob = 
      new SlimeBlob("Blob",0,1,100,20,60,SlimeBlob.SlimeColor.RED);
    // snippet: anonymousBloblingsExample
    // *@\Gradle{runAnonymousBloblingsExample}@*
    out.println(slimeBlob);

    SlimeBlob[] children = slimeBlob.anonymousDivide();
    out.println(children[0]);
    out.println(children[1]);

    out.println(children[0].getClass().getName());
    out.println(children[1].getClass().getName());
    // snippet: /anonymousBloblingsExample
  }

  // snippet: anonymousConsumableExample
  // *@\Gradle{runAnonymousConsumableExample}@*
  public static void anonymousConsumableExample() {
    Consumable soup = new Consumable(){
      private int spoonsLeft = 100;

      @Override public int unitsLeft(){
        return spoonsLeft;
      }
      @Override public void consumeOne(){
        if (spoonsLeft > 0)
          spoonsLeft--;
      }
      @Override public Consumable split(int n) {
        throw new UnsupportedOperationException("nah");
      }
    };

    out.printf("Spoons left: %d%n", soup.unitsLeft());
    soup.consumeOne();
    out.printf("Spoons left: %d%n", soup.unitsLeft());
  }
  // snippet: /anonymousConsumableExample
  
}
