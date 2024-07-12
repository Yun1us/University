package bfs;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class VertexTest {

  // @Test
  // public void iteratorTest(){
    
  //   Vertex sub = new Vertex(2,
  //         new Vertex(4, 
  //           new Vertex(7, null, null),
  //           new Vertex(8, null, null)),
  //         null);
  //   Vertex root = new Vertex(
  //       0,
  //       new Vertex(1, 
  //         null,
  //         new Vertex(3,
  //           new Vertex(5, null, null),
  //           new Vertex(6, null, null))), 
  //       sub);

  //   Iterator<Vertex> i = root.iterator();

  //   assertNotNull("iterator() must not return null", i);

  //   for (int value = 0; value < 9; value++){
  //     assertTrue("hasNext() must return true if there are elements left", i.hasNext());

  //     Vertex next = i.next();

  //     assertNotNull("next() must never return null", next);

  //     assertEquals("next expected vertex must be of value " + value, value, next.getValue());
  //   }

  //   assertFalse("hasNext() must return false after last element was returned", i.hasNext());

  //   assertThrows("next() must throw NoSuchElementException after last element was returned",
  //       NoSuchElementException.class,
  //       i::next);

  //   i = sub.iterator();

  //   int[] valuesSub = {2, 4, 7, 8};

  //   for (int index = 0; index < 4; index++){
  //     assertTrue("hasNext() must return true if there are elements left", i.hasNext());
  //     Vertex next = i.next();
  //     assertNotNull("next() must never return null", next);
  //     assertEquals("iterator of sub tree must return values of subtree",
  //         valuesSub[index], next.getValue());
  //   }
  //   assertFalse("hasNext() must return false after last element was returned", i.hasNext());



  // }
}
