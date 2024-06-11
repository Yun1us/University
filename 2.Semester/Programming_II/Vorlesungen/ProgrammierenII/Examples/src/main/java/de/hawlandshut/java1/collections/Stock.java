package de.hawlandshut.java1.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

// snippet: class
public class Stock implements Iterable<Item> {
// snippet: /class

  // snippet: attributes
  private Item[] items;
  // snippet: /attributes

  public Stock(Item[] items){
    this.items = items;
  }

  // snippet: iterator
  @Override
  public Iterator<Item> iterator(){
    return new StockIterator();
  }
  // snippet: /iterator

  // snippet: StockIterator
  private class StockIterator implements Iterator<Item>{
  // snippet: /StockIterator

    // snippet: stockIteratorAttributes
    private int nextIndex;
    // snippet: /stockIteratorAttributes

    // snippet: stockIteratorConstructor
    private StockIterator(){
      this.nextIndex = 0;
    }
    // snippet: /stockIteratorConstructor

    // snippet: stockIteratorNext
    @Override
    public Item next(){
      if (!hasNext())
        throw new NoSuchElementException("End reached");

      return Stock.this.items[nextIndex++];
    }
    // snippet: /stockIteratorNext

    // snippet: stockIteratorHasNext
    @Override
    public boolean hasNext(){
      return nextIndex < Stock.this.items.length;
    }
    // snippet: /stockIteratorHasNext

  }

  
}
