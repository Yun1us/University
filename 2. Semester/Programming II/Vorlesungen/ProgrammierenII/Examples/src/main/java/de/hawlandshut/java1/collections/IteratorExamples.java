package de.hawlandshut.java1.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static java.lang.System.out;

public class IteratorExamples {

  public static void iteratorManualExample() {
    // snippet: iteratorManualExample
    // *@\Gradle{runIteratorManualExample}@*
    List<String> l = List.of("La", "Dee", "Da");

    for (Iterator<String> i = l.iterator(); i.hasNext();){
      String s = i.next();
      out.println(s);
    }
    // snippet: /iteratorManualExample
  }

  public static void iteratorForEachExample() {
    // snippet: iteratorForEachExample
    // *@\Gradle{runIteratorForEachExample}@*
    List<String> l = List.of("La", "Dee", "Da");

    for (String s : l)      
      out.println(s);
    // snippet: /iteratorForEachExample
  }

  public static void iteratorParallelExample() {
    // snippet: iteratorParallelExample
    // *@\Gradle{runIteratorParallelExample}@*
    List<String> l = List.of("Shangri", "La", "Dee", "Da");
    Iterator<String> i1 = l.iterator();
    Iterator<String> i2 = l.iterator();

    while (i1.hasNext() || i2.hasNext()){

      if (i1.hasNext())
        out.println("i1: " + i1.next());

      if (i2.hasNext())
        i2.next(); // überspringen

      if (i2.hasNext())
        out.println("i2: " + i2.next());
    }
    // snippet: /iteratorParallelExample
  }

  public static void iteratorChangeStructureExample() {
    List<String> l = new ArrayList<String>(List.of("Shangri", "La", "Dee", "Da"));
    // snippet: iteratorChangeStructureExample
    // *@\Gradle{runIteratorChangeStructureExample}@*
    for (Iterator<String> i = l.iterator(); i.hasNext();){
      String s = i.next();
      out.println(s);
      l.add("Da");
    }
    // snippet: /iteratorChangeStructureExample
  }

  public static void iteratorChangeContentExample() {
    // snippet: iteratorChangeContentExample
    // *@\Gradle{runIteratorChangeContentExample}@*
    List<String> l = new ArrayList<String>(List.of("La", "Dee", "Da"));
    for (Iterator<String> i = l.iterator(); i.hasNext();){
      l.set(0, "Dum");
      String s = i.next();
      out.println(s);
    }
    // snippet: /iteratorChangeContentExample
  }
  
  public static void iteratorRemoveExample() {
    // snippet: iteratorRemoveExample
    // *@\Gradle{runIteratorRemoveExample}@*
    List<String> l = new ArrayList<String>(
        List.of("Shangri", "La", "Dee", "Da"));

    for (Iterator<String> i = l.iterator(); i.hasNext();){
      String s = i.next();

      if (s.length() <= 2)
        i.remove();
    }
    // snippet: /iteratorRemoveExample
    out.println(l);
  }


  public static void iteratorRemoveConcurrentExample() {
    List<String> l = new ArrayList<String>(
        List.of("Shangri", "La", "Dee", "Da"));
    // snippet: iteratorRemoveConcurrentExample
    // *@\Gradle{runIteratorRemoveConcurrentExample}@*
    Iterator<String> i1 = l.iterator();
    Iterator<String> i2 = l.iterator();

    while (i1.hasNext() || i2.hasNext()){

      if (i1.hasNext() && i1.next().length() <= 2)
          i1.remove();

      if (i2.hasNext())
        out.println(i2.next());

    }
    // snippet: /iteratorRemoveConcurrentExample
  }

  public static void listIteratorLeftRightExample() {
    // snippet: listIteratorLeftRightExample
    // snippet: liList
    // *@\Gradle{runListIteratorLeftRightExample}@*
    List<String> l = new ArrayList<String>(
        List.of("Shangri", "La", "Dee", "Da"));
    // snippet: /liList

    // snippet: liCreate
    ListIterator<String> i = l.listIterator(2);
    // snippet: /liCreate
    
    out.println(i.next()); 
    out.println(i.nextIndex());
    out.println(i.previous());
    out.println(i.previousIndex());

    i.add("Ma");

    out.println(i.previous());
    i.set("Du");

    out.println(i.next());
    i.remove();
    
    out.println(l);
    // snippet: /listIteratorLeftRightExample
  }
  
  
  
  
  
}
