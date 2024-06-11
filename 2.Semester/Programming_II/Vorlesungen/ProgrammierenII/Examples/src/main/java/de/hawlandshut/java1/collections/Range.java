package de.hawlandshut.java1.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

// snippet: class
public class Range implements Iterable<Integer>{
// snippet: /class

  // snippet: attributes
  private int start;
  private int end;
  public Range(int start, int end){
    this.start = start;
    this.end = end;
  }
  // snippet: /attributes


  // snippet: iterator
  @Override public Iterator<Integer> iterator(){
    return new RangeIterator();
  }
  // snippet: /iterator

  // snippet: range
  public static Range range(int start, int end){
    return new Range(start, end);
  }
  // snippet: /range

  // snippet: RangeIterator
  private class RangeIterator 
      implements Iterator<Integer>{
  // snippet: /RangeIterator

    // snippet: rangeIteratorAttributes
    private int next;

    private RangeIterator(){
      this.next = Range.this.start;
    }
    // snippet: /rangeIteratorAttributes



    // snippet: rangeIteratorHasNext
    @Override
    public boolean hasNext(){
      return next < Range.this.end;
    }
    // snippet: /rangeIteratorHasNext

    // snippet: rangeIteratorNext
    @Override
    public Integer next(){
      if (!hasNext())
        throw new NoSuchElementException("Reached end");
    
      return next++;
    }
    // snippet: /rangeIteratorNext
  }

}

