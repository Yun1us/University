package de.hawlandshut.java1.oopbasics.shapes;

/** 
 * Represents a point in the two-dimensional plane.
 * The coordinates are integer.
 */
public class Point2D{

  // snippet: attributes
  private int x;
  private int y;
  // snippet: /attributes

  /**
   * Constructor which creates point at origin (0,0).
   */
  // snippet: defaultConstructor
  public Point2D() {
    this(0,0);
  }
  // snippet: /defaultConstructor

  // snippet: copyConstructor
  public Point2D(Point2D other){
    this(other.getX(), other.getY());
  }
  // snippet: /copyConstructor

  /**
   * Constructor which creates a point at the given coorindates.
   * @param x x coordinate of the point.
   * @param y y coordinate of the point.
   */ 
  // snippet: constructor
  public Point2D(final int x, final int y){
    set(x, y);
  }
  // snippet: /constructor

  /**
   * Returns the y coordinate
   * @return y coordinate
   */
  public int getY() {
    return y;
  }

  /**
   * Sets the y coordinate
   * @param y y coordinate
   */
  public void setY(final int y) {
    this.y = y;
  }

  /**
   * Returns the x coordinate
   * @return x coordinate
   */
  public int getX() {
    return x;
  }

  /**
   * Sets the x coordinate
   * @param x x coordinate
   */
  // snippet: setX
  public void setX(final int x) {
    this.x = x;
  }
  // snippet: /setX

  /**
   * Sets both x and y to the passed values
   * @param x x coordinate
   * @param y y coordinate
   */
  // snippet: set
  public void set(final int x, final int y){
    this.x = x;
    this.y = y;
  }
  // snippet: /set

  /**
   * Moves the point by the given delta values.
   * @param dx movement in x direction
   * @param dy movement in y direction
   */
  // snippet: move
  public void move(final int dx, final int dy){
    x += dx;
    y += dy;
  }
  // snippet: /move

  // snippet: distance

  /** 
   * Returns the distance between this and the other point.
   * The distance is Euclidean.
   *
   * @param other other point (must not be {@code null})
   * @return return Euclidean distance between the two points.
   */
  public double distance(final Point2D other){
    double dx = x - other.getX();
    double dy = y - other.getY();
    return Math.sqrt(dx*dx + dy*dy);
  }
  // snippet: /distance

  @Override
  public String toString(){
    return String.format("Point2D: { x = %d, y = %d }", x, y);
  }

  @Override 
  public Point2D clone(){
    return new Point2D(this);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + x;
    result = prime * result + y;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Point2D other = (Point2D) obj;
    if (x != other.x)
      return false;
    if (y != other.y)
      return false;
    return true;
  }





}

