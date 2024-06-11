package de.hawlandshut.java1.arrays;

import de.hawlandshut.java1.oopbasics.shapes.Point2D;

public class NonRectangularArrayExamples {

  public static void arrayNonRectPolygons() {
    // snippet: arrayNonRectPolygons
    Point2D[][] polygons = new Point2D[3][];

    polygons[0] = new Point2D[] { // three points
      new Point2D(0,0), new Point2D(2,0), new Point2D(1,1)
    };

    polygons[1] = new Point2D[] { // four points
      new Point2D(3,0), new Point2D(4,0), 
      new Point2D(4,1), new Point2D(3,1)
    };

    polygons[2] = new Point2D[] { // six points
      new Point2D(3,2), new Point2D(4,3), new Point2D(4,4), 
      new Point2D(3,5), new Point2D(2,4), new Point2D(2,3)
    };
    // snippet: /arrayNonRectPolygons
  }

}


