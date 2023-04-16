package org.training.triangles.logic;

import org.training.triangles.logic.DataException;
import org.training.triangles.model.Point;
import org.training.triangles.model.Triangle;

public class TriangleCreator {

    public Triangle createTriangle (String lineCoordinates) throws DataException {
        String[] triangleCoordinates = lineCoordinates.split(" ");
        Point pointOne = new Point(Double.parseDouble(triangleCoordinates[0]), Double.parseDouble(triangleCoordinates[1]));
        Point pointTwo = new Point(Double.parseDouble(triangleCoordinates[0]), Double.parseDouble(triangleCoordinates[1]));
        Point pointThree = new Point(Double.parseDouble(triangleCoordinates[0]), Double.parseDouble(triangleCoordinates[1]));
        Triangle triangle = new Triangle(pointOne, pointTwo, pointThree);
        return triangle;
    }
}
