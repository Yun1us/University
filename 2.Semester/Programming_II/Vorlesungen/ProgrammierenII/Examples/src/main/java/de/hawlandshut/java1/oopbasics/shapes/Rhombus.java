package de.hawlandshut.java1.oopbasics.shapes;

/**
 * A rhombus with a integer width and height.
 *
 * The rhombus has a width and a height, where the width is the horizontal main
 * diagonal and the height the vertical main diagonal. The center ({@link
 * #center} of the rhombus is the intersection of its diagonals.
 * @see Point2D
 * @version 1.0
 */
public class Rhombus {
  private Point2D center;
  private int width;
  private int height;

  /**
   * Creates a rhombus with the given center, width and height.
   * @param center center of the rhombus (must not be {@code null})
   * @param width width of the rhombus (must not be negative)
   * @param height height of the rhombus (must not be negative)
   */
  public Rhombus(final Point2D center, final int width, final int height){
    setCenter(center);
    setWidth(width);
    setHeight(height);
  }

  /**
   * Returns the center of the rhombus.
   * The center is the intersection between its two main diagonals.
   * @see Point2D
   * @see #setCenter(Point2D)
   * @return Center of the rhombus.
   */
  public Point2D getCenter() {
    return center;
  }
  
  /**
   * Sets the center of the rhombus.
   * @param center The new center of the rhombus (must not be {@code null})
   * @see #getCenter()
   */
  public void setCenter(final Point2D center) {
    if (center == null)
      throw new IllegalArgumentException("Center must not be null.");
    this.center = center;
  }

  /**
   * The width of the rhombus.
   * The width is the length of the horizontal diagonal.
   * @return The width of the rhombus
   * @see #setWidth(int)
   * @see #getHeight()
   * @see #setHeight(int)
   */
  public int getWidth() {
    return width;
  }
  
  /**
   * Sets the width of the rhombus.
   * The width is the length of the horizontal diagonal.
   * @param width The new width of the rhombus (must not be {@code null})
   * @see #getWidth()
   * @see #getHeight()
   * @see #setHeight(int)
   */
  public void setWidth(final int width) {
    if (width < 0f)
      throw new IllegalArgumentException("Width must not be negative");
    this.width = width;
  }

  /**
   * The height of the rhombus.
   * The height is the length of the vertial diagonal.
   * @return The height of the rhombus
   * @see #getWidth()
   * @see #setWidth(int)
   * @see #setHeight(int)
   */
  public int getHeight() {
    return height;
  }
  
  /**
   * Sets the height of the rhombus.
   * The height is the length of the horizontal diagonal.
   * @see #getWidth()
   * @see #setWidth(int)
   * @see #getHeight()
   * @param height The new height of the rhombus (must not be {@code null})
   */
  public void setHeight(final int height) {
    if (height < 0f)
      throw new IllegalArgumentException("Height must not be negative");
    this.height = height;
  }


  /**
   * Computes and returns the area enclosed the by Rhombus.
   * The area is computed by the formula {@code width*height/2}.
   * @return The area enclosed by the rhombus.
   * @see #perimeter()
   */
  public double area(){
    return width*height/2d;
  }
  
  /**
   * Computes and returns perimeter of the rhombus.
   * The perimeter is twice the length of the diagonal of the rectangle with
   * side lengths {@link #width} and {@link height}.
   * @return The perimeter of the rhombus.
   * @see #area()
   */
  public double perimeter(){
    return 2 * Math.sqrt(width * width + height * height);
  }
  

  /**
   * Checks if the rhombus contains the given point.
   * @param point point for which to check if it is contained in the rhombus
   * (must not be {@code null})
   * @return {@code true} is the rhombus contains the point, {@code false}
   * otherwise
   */
  public boolean containsPoint(final Point2D point){
  
    if (point == null)
      throw new IllegalArgumentException("point must not be null");
  
    int deltaX = Math.abs(point.getX() - center.getX());
    int deltaY = Math.abs(point.getY() - center.getY());
  
    return height * deltaX <= width * (height/2 - deltaY);
  }


}



