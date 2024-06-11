package de.hawlandshut.java1.oopbasics.shapes;

import java.util.Objects;

public class Rectangle {
  private Point2D center;
  private int width;
  private int height;

  // snippet: constructor
  public Rectangle(final Point2D center, final int width, final int height){
    setCenter(center);
    setWidth(width);
    setHeight(height);
  }
  // snippet: /constructor

  // snippet: center
  public Point2D getCenter() {
    return center;
  }
  
  public void setCenter(final Point2D center) {
    if (center == null)
      throw new IllegalArgumentException("Center must not be null.");
    this.center = center;
  }
  // snippet: /center

  // snippet: width
  public int getWidth() {
    return width;
  }
  
  public void setWidth(final int width) {
    if (width < 0f)
      throw new IllegalArgumentException("Width must not be negative");
    this.width = width;
  }
  // snippet: /width

  // snippet: height
  public int getHeight() {
    return height;
  }
  
  public void setHeight(final int height) {
    if (height < 0f)
      throw new IllegalArgumentException("Height must not be negative");
    this.height = height;
  }
  // snippet: /height


  // snippet: queries
  public int area(){
    return width * height;
  }
  
  public int perimeter(){
    return 2 * (width + height);
  }

  public boolean containsPoint(final Point2D point){

    if (point == null)
      throw new IllegalArgumentException("point must not be null");

    int deltaX = point.getX() - center.getX();
    int deltaY = point.getY() - center.getY();

    return 
        Math.abs(deltaX) <= width/2 &&
        Math.abs(deltaY) <= height/2;
  }
  // snippet: /queries

@Override
public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result + ((center == null) ? 0 : center.hashCode());
  result = prime * result + height;
  result = prime * result + width;
  return result;
}

// snippet: equals
@Override
public boolean equals(Object other) {
  // Identitaet
  if (this == other)
    return true;

  // null
  if (other == null)
    return false;

  // Typvergleich
  if (getClass() != other.getClass())
    return false;


  // Rectangle-cast
  Rectangle otherRectangle = (Rectangle) other;
  // Attribute vergleichen
  if (height != otherRectangle.getHeight())
    return false;
  if (width != otherRectangle.getWidth())
    return false;

  if (!Objects.equals(center, otherRectangle.getCenter()))
    return false;

  // Objekte sind gleich
  return true;
}
// snippet: /equals

  


}


