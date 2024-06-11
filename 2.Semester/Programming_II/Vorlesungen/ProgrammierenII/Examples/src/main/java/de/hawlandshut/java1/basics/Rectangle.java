package de.hawlandshut.java1.basics;

public class Rectangle
{
  // snippet: fields
  private double width;
  private double height;
  private double area;
  // snippet: /fields

  // snippet: constructor
  public Rectangle(final double width, final double height) {
    this.width = width;
    this.height = height;
    updateArea();
  }
  // snippet: /constructor

  // snippet: static
  public static Rectangle getEnclosing(Rectangle... rectangles){
    if (rectangles.length == 0)
      throw new IllegalArgumentException("at least one rectangle must be given");
  
    double maxWidth = Double.NEGATIVE_INFINITY;
    double maxHeight = Double.NEGATIVE_INFINITY;
    
    for (Rectangle rectangle : rectangles) {
      if (rectangle.getWidth() > maxWidth)
        maxWidth = rectangle.getWidth();

      if (rectangle.getHeight() > maxHeight)
        maxHeight = rectangle.getHeight();
    }

    return new Rectangle(maxWidth, maxHeight);
  }
  // snippet: /static

  // snippet: accessors
  public double getHeight() {
    return height;
  }
  
  public void setHeight(final double height) {
    if (height <= 0)
      throw new IllegalArgumentException("height must positive");
    this.height = height;
    updateArea();
  }
  
  public double getWidth() {
    return width;
  }
  
  public void setWidth(final double width) {
    if (width <= 0)
      throw new IllegalArgumentException("width must positive");
    this.width = width;
    updateArea();
  }
  // snippet: /accessors

  // snippet: protected
  protected void updateArea(){
    area = width * height;
  }
  // snippet: /protected

  // snippet: helper
  private boolean approxEqual(double x, double y, double error){
    return Math.abs(x-y) <= Math.abs(error);
  }
  
  // snippet: /helper

  // snippet: queries
  public double area(){
    return area;
  }
  
  public boolean canContain(Rectangle other){
    if (other == null)
      throw new IllegalArgumentException("other rectangle must not no null");
    return other.getWidth() < width && other.getHeight() < height;
  }

  public boolean isSquare(double error){
    return approxEqual(width, height, error);
  }
  // snippet: /queries

  // snippet: modifiers
  public void scale(double s){
    if (s <= 0)
      throw new IllegalArgumentException("scale factor must be positive");
    width *= s;
    height *= s;
    updateArea();
  }
  // snippet: /modifiers


}


