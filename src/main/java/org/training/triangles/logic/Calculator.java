package org.training.triangles.logic;

import org.training.triangles.model.Triangle;

public class Calculator {

    public boolean isTriangle () {
        return true;
    }

    public double calculateArea (Triangle triangle) {
        double square = 1/2  * calculateDistanceBetweenFirstPointAndSecondPoint(Triangle triangle) * calculateDistanceBetweenSecondPointAndThirdPoint(Triangle triangle) * Math.sin(y);
        return 1.1;
    }

    public double calculatePerimeter () {
        return 1.1;
    }

    public double calculateDistanceBetweenFirstPointAndSecondPoint (Triangle triangle) {
        double distanceBetweenFirstPointAndSecondPoint = Math.sqrt(Math.pow((triangle.getFirstPoint().getX() - triangle.getSecondPoint().getX()), 2) + Math.pow((triangle.getFirstPoint().getY() - triangle.getSecondPoint().getY()), 2));
        return distanceBetweenFirstPointAndSecondPoint;
    }
    public double calculateDistanceBetweenSecondPointAndThirdPoint (Triangle triangle) {
        double distanceBetweenSecondPointAndThirdPoint = Math.sqrt(Math.pow((triangle.getSecondPoint().getX() - triangle.getThirdPoint().getX()), 2) + Math.pow((triangle.getSecondPoint().getY() - triangle.getThirdPoint().getY()), 2));
        return distanceBetweenSecondPointAndThirdPoint;
    }

    public double calculateDistanceBetweenFirstPointAndThirdPoint (Triangle triangle) {
        double distanceBetweenFirstPointAndThirdPoint = Math.sqrt(Math.pow((triangle.getFirstPoint().getX() - triangle.getThirdPoint().getX()), 2) + Math.pow((triangle.getFirstPoint().getY() - triangle.getThirdPoint().getY()), 2));
        return distanceBetweenFirstPointAndThirdPoint;
    }

    public double calculateAngleBetweenFirstAndSecondSides (Triangle triangle) {
            double angleBetweenFirstAndSecondSides = 0;
            double firstSegment = calculateDistanceBetweenFirstPointAndSecondPoint ();

            double SecondSegment = calculateDistanceBetweenSecondPointAndThirdPoint (Triangle triangle);

            double ThirdSegment = calculateDistanceBetweenFirstPointAndThirdPoint (Triangle triangle);

            angles[0] = Math.acos((SecondSegment*SecondSegment + ThirdSegment*ThirdSegment - firstSegment*firstSegment) / (2*SecondSegment*ThirdSegment));

            angles[0] *= 180 / Math.PI;

            angles[1] = Math.acos((calculateDistanceBetweenFirstPointAndSecondPoint () * firstSegment + SecondSegment * SecondSegment - ThirdSegment * ThirdSegment) / (2 * firstSegment * SecondSegment));

            angles[1] *= 180 / Math.PI;

            angles[2] = Math.acos((firstSegment * firstSegment + ThirdSegment * ThirdSegment - SecondSegment * SecondSegment) / (2* firstSegment * ThirdSegment));

            angles[2] *= 180 / Math.PI;


        return angleBetweenFirstAndSecondSides;
    }
}
