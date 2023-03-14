package org.training.triangles.logic;

import org.training.triangles.model.Point;
import org.training.triangles.model.Triangle;

public class Calculator {

    public boolean isTriangle (Triangle triangle) {
        Point firstPoint = triangle.getFirstPoint();
        Point secondPoint = triangle.getSecondPoint();
        Point thirdPoint = triangle.getThirdPoint();
        boolean isTriange = ((thirdPoint.getX() - firstPoint.getX()) * (secondPoint.getY() - firstPoint.getY()) == (thirdPoint.getY() - firstPoint.getY()) * (secondPoint.getX() - firstPoint.getX()));
        return true;
    }

/* В методах ниже заводил переменные специально, чтобы код не становился очень длинным и был более читабельным.
    Возможно есть смысл подумать как их вынести */
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
