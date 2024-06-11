package de.hawlandshut.java1.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

// snippet: class
public class IterableString 
  implements Iterable<Character> {
// snippet: /class

  // snippet: attributes
  private String string;

  public IterableString(String string){
    this.string = string;
  }
  // snippet: /attributes

  @Override
  // snippet: iterator
  public Iterator<Character> iterator(){
    return new StringIterator();
  }
  // snippet: /iterator

  // snippet: StringIterator
  private class StringIterator 
      implements Iterator<Character>{
  // snippet: /StringIterator

    // snippet: stringIteratorAttributes
    private int nextIndex;
    // snippet: /stringIteratorAttributes

    // snippet: stringIteratorConstructor
    private StringIterator(){
      nextIndex = 0;
    }
    // snippet: /stringIteratorConstructor

    // snippet: stringIteratorHasNext
    @Override
    public boolean hasNext(){
      return nextIndex < IterableString.this.string.length();
    }
    // snippet: /stringIteratorHasNext

    // snippet: stringIteratorNext
    @Override
    public Character next(){
      if (!hasNext())
        throw new NoSuchElementException("End reached");
    
      return IterableString.this.string.charAt(nextIndex++);
    }
    // snippet: /stringIteratorNext




  }
  
}
