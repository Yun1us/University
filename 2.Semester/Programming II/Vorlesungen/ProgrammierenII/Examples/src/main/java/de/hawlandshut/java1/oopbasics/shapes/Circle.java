package de.hawlandshut.java1.oopbasics.shapes;

public class Circle{

  // snippet: fields
  private Point2D center;
  private int radius;
  // snippet: /fields

  // snippet: constructor
  public Circle(Point2D center, int radius){
    this.center = center;
    this.radius = radius;
  }
  // snippet: /constructor
  
  // snippet: copyConstructor
  public Circle(Circle other){
    this.center = other.getCenter();
    this.radius = other.getRadius();
  }
  // snippet: /copyConstructor

  // snippet: deepCopyConstructor
  // public Circle(Circle other){
  //   this.center = new Point2D(other.getCenter());
  //   this.radius = other.getRadius();
  // }
  // snippet: /deepCopyConstructor

  // snippet: center
  public Point2D getCenter() {
    return center;
  }
  
  public void setCenter(Point2D center) {
    if (center == null)
      throw new IllegalArgumentException("Center must not be null.");
    this.center = center;
  }
  // snippet: /center

  // snippet: radius
  public int getRadius() {
    return radius;
  }
  
  public void setRadius(int radius) {
    if (radius < 0f)
      throw new IllegalArgumentException("Radius must not be negative");
  
    this.radius = radius;
  }
  // snippet: /radius
  

  // snippet: queries
  public double area(){
    return Math.PI * radius * radius;
  }
  
  public double perimeter(){
    return 2 * Math.PI * radius;
  }

  public boolean containsPoint(Point2D point){
    if (point == null)
      throw new IllegalArgumentException("point must not be null");
  
    int deltaX = point.getX() - center.getX();
    int deltaY = point.getY() - center.getY();
  
    return Math.sqrt(deltaX*deltaX + deltaY*deltaY) <= radius;
  }
  // snippet: /queries

}
