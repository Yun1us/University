package de.hawlandshut.java1.oop;

// snippet: class
import de.hawlandshut.java1.oopbasics.shapes.Point2D;
public class Point2DPrinter {
  public void printPoint(Point2D p){
    System.out.printf("Super-Class: x=%d, y=%d", 
        p.getX(), p.getY());
  }
}
// snippet: /class
