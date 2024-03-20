package de.hawlandshut.java1.collections;

import static java.lang.System.out;

import java.util.HashSet;
import java.util.EnumSet;

public class SetExamples {

  public static void setOperationsExample() {
    // snippet: setOperationsExample
    // snippet: setAdd
    // *@\Gradle{runSetOperationsExample}@*
    var salad = new Item("Salat", 2);
    var choc = new Item("Schokolade", 1);
    var milk = new Item("Milch", 2);
    var tomatoes = new Item("Tomaten", 3);
    
    var setA = new HashSet<Item>();
    var setB = new HashSet<Item>();
    
    setA.add(salad);
    setA.add(choc);
    
    setB.add(choc);
    setB.add(milk);
    // snippet: /setAdd
    out.println("setA = " + setA);
    out.println("setB = " + setB);

    // snippet: setAddAgain
    out.println("setA = " + setA);
    setA.add(salad);
    out.println("setA = " + setA);
    // snippet: /setAddAgain

    // snippet: setContainsAll
    out.println(setA.containsAll(setB));
    setA.add(milk);
    out.println(setA.containsAll(setB));
    // snippet: /setContainsAll

    // snippet: setDifference
    setA.removeAll(setB);
    // snippet: /setDifference
    out.println("setA = " + setA);

    setA.add(tomatoes);

    // snippet: setUnion
    setA.addAll(setB);
    // snippet: /setUnion
    out.println("setA = " + setA);
    // snippet: /setOperationsExample

    // snippet: setIntersection
    setA.retainAll(setB);
    // snippet: /setIntersection
    out.println("setA = " + setA);
  }

  // snippet: enum
  enum Feature { TALL, HANDSOME, SMART, LIKABLE };
  // snippet: /enum

  public static void enumSetExample() {
    // snippet: enumSetExample
    // snippet: enumSet
    // *@\Gradle{runEnumSetExample}@*
    EnumSet<Feature> myDreamPartner;
    // snippet: /enumSet

    // snippet: enumOf
    myDreamPartner = EnumSet.of(
        Feature.HANDSOME, Feature.SMART);
    // snippet: /enumOf

    out.println("myDreamPartner = " + myDreamPartner);
    
    // snippet: allOf
    myDreamPartner = EnumSet.allOf(Feature.class);
    // snippet: /allOf

    out.println("myDreamPartner = " + myDreamPartner);

    // snippet: noneOf
    myDreamPartner = EnumSet.noneOf(Feature.class);
    // snippet: /noneOf

    out.println("myDreamPartner = " + myDreamPartner);
    
    // snippet: range
    myDreamPartner = EnumSet.range(
        Feature.HANDSOME, Feature.LIKABLE);
    // snippet: /range

    out.println("myDreamPartner = " + myDreamPartner);

    // snippet: enumRemove
    myDreamPartner.remove(Feature.LIKABLE);
    // snippet: /enumRemove

    out.println("myDreamPartner = " + myDreamPartner);

    // snippet: complementOf
    var noDreamPartner =
      EnumSet.complementOf(myDreamPartner);
    // snippet: /complementOf

    out.println("noDreamPartner = " + noDreamPartner);


    // snippet: /enumSetExample
  }
  
  
  
}
