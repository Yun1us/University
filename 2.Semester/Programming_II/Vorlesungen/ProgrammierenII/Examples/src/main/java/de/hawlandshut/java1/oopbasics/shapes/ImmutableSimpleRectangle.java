package de.hawlandshut.java1.oopbasics.shapes;


public class ImmutableSimpleRectangle {

  // snippet: attributes
  private final Point2D center;
  private final int width;
  private final int height;
  // snippet: /attributes

  // snippet: constructor
  public ImmutableSimpleRectangle(Point2D center, int width, int height){
    this.center = center;
    this.width = width;
    this.height = height;
  }
  // snippet: /constructor

  // snippet: getter
  public Point2D getCenter() {
    return center;
  }
  
  public int getWidth() {
    return width;
  }
  
  public int getHeight() {
    return height;
  }
  // snippet: /getter

  public int getArea(){
    return width * height;
  }

  public boolean contains(Point2D point){
    int deltaX = point.getX() - center.getX();
    int deltaY = point.getY() - center.getY();
    return Math.abs(deltaX) <= width/2 
      && Math.abs(deltaY) <= height/2;
  }

  // snippet: enlarge
  public ImmutableSimpleRectangle enlarge(
      int deltaWidth, int deltaHeight){
    return new ImmutableSimpleRectangle(
        this.center,
        this.width + deltaWidth,
        this.height + deltaHeight);
  }
  // snippet: /enlarge

}
