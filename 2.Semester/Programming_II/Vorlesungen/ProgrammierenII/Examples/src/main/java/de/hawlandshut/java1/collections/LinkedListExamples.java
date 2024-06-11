package de.hawlandshut.java1.collections;

import java.util.LinkedList;
import static java.lang.System.out;

public class LinkedListExamples {

  public static void linkedListExample() {
    // snippet: linkedListAddLast
    // *@\Gradle{runLinkedListExample}@*
    LinkedList<String> l = new LinkedList<String>();
    l.add("La");
    l.addLast("Da");
    l.add(1, "Dee");
    // snippet: /linkedListAddLast
    System.out.println(l);
    // snippet: linkedListAddRemove
    l.addFirst("First!");
    l.removeLast();
    l.addLast(null);
    l.addLast("Last!");
    // snippet: /linkedListAddRemove
    System.out.println(l);

    // snippet: linkedListSetContains
    l.set(3, "Dum");
    l.contains("Dee"); // true
    l.indexOf("Shangri"); // -1
    // snippet: /linkedListSetContains

    // snippet: linkedListForLoop
    for (int i = 0; i < l.size(); i++)
      out.println(l.get(i));
    // snippet: /linkedListForLoop
    
    // snippet: linkedListForEachLoop
    for (String s : l)
      out.println(s);
    // snippet: /linkedListForEachLoop

  }
  
  
  

}
