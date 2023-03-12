package org.training.triangles.logic;

import org.training.triangles.model.Point;
import org.training.triangles.model.Triangle;

public class Calculator {

    public boolean isTriangle (Triangle triangle) {
        return true;
    }

    public double calculateArea (Triangle triangle) {
        Point firstPoint = triangle.getFirstPoint();
        Point secondPoint = triangle.getSecondPoint();
        Point thirdPoint = triangle.getThirdPoint();
        double square = 1/2  * calculateDistanceBetweenPoints(firstPoint, secondPoint) * calculateDistanceBetweenPoints(secondPoint, thirdPoint) * Math.sin(y);
        return square;
    }

    public double calculatePerimeter (Triangle triangle) {
        return 1.1;
    }

    public double calculateDistanceBetweenPoints (Point pointOne, Point pointTwo) {
        double distanceBetweenPoints = Math.sqrt(Math.pow((pointOne.getX() - pointTwo.getX()), 2) + Math.pow((pointOne.getY() - pointTwo.getY()), 2));
        return distanceBetweenPoints;
    }

    public double calculateAngleBetweenFirstAndSecondSides (Triangle triangle) {
            double angleBetweenFirstAndSecondSides = 0;
            double firstSegment = calculateDistanceBetweenFirstPointAndSecondPoint ();

            double SecondSegment = calculateDistanceBetweenSecondPointAndThirdPoint (triangle);

            double ThirdSegment = calculateDistanceBetweenFirstPointAndThirdPoint (triangle);

            angles[0] = Math.acos((SecondSegment*SecondSegment + ThirdSegment*ThirdSegment - firstSegment*firstSegment) / (2*SecondSegment*ThirdSegment));

            angles[0] *= 180 / Math.PI;

            angles[1] = Math.acos((calculateDistanceBetweenFirstPointAndSecondPoint () * firstSegment + SecondSegment * SecondSegment - ThirdSegment * ThirdSegment) / (2 * firstSegment * SecondSegment));

            angles[1] *= 180 / Math.PI;

            angles[2] = Math.acos((firstSegment * firstSegment + ThirdSegment * ThirdSegment - SecondSegment * SecondSegment) / (2* firstSegment * ThirdSegment));

            angles[2] *= 180 / Math.PI;


        return angleBetweenFirstAndSecondSides;
    }
}
