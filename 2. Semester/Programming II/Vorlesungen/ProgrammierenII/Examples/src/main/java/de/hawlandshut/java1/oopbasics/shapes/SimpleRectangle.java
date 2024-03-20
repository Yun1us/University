package de.hawlandshut.java1.oopbasics.shapes;


// snippet: class
public class SimpleRectangle {
  public Point2D center;
  public int width;
  public int height;

  public int getArea(){
    return width * height;
  }

  public boolean contains(Point2D point){
    int deltaX = point.getX() - center.getX();
    int deltaY = point.getY() - center.getY();
    return Math.abs(deltaX) <= width/2 
      && Math.abs(deltaY) <= height/2;
  }
}
// snippet: /class
