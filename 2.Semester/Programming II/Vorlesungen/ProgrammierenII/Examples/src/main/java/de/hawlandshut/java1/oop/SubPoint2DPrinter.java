package de.hawlandshut.java1.oop;

// snippet: class
import java.awt.geom.Point2D;
public class SubPoint2DPrinter extends Point2DPrinter {
  public void printPoint(Point2D p){
    System.out.printf("Sub-Class: x=%f, y=%f", 
        p.getX(), p.getY());
  }
}
// snippet: /class

