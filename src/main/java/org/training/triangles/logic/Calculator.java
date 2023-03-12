package org.training.triangles.logic;

import org.training.triangles.model.Point;
import org.training.triangles.model.Triangle;

public class Calculator {

    public boolean isTriangle (Triangle triangle) {

//        boolean isTriangle = ((triangle.getThirdPoint() - x_1) / (x_2 - x_1) == (y_3 - y_1) / (y_2 - y_1))
        return true;
    }

    public double calculateArea (Triangle triangle) {
        double firstSide = calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getSecondPoint());
        double secondSide = calculateDistanceBetweenPoints(triangle.getSecondPoint(), triangle.getThirdPoint());
        double thirdSide = calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getThirdPoint());
        double halfPerimeter = firstSide + secondSide + thirdSide / 2;
        double triangleArea = Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) * (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
        return triangleArea;
    }

    public double calculatePerimeter (Triangle triangle) {
        double firstSide = calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getSecondPoint());
        double secondSide = calculateDistanceBetweenPoints(triangle.getSecondPoint(), triangle.getThirdPoint());
        double thirdSide = calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getThirdPoint());
        double perimeter = firstSide + secondSide + thirdSide;
        return perimeter;
    }

    public double calculateDistanceBetweenPoints (Point pointOne, Point pointTwo) {
        double distanceBetweenPoints = Math.sqrt(Math.pow((pointOne.getX() - pointTwo.getX()), 2) + Math.pow((pointOne.getY() - pointTwo.getY()), 2));
        return distanceBetweenPoints;
    }

}
