package org.training.triangles.logic;

import org.training.triangles.model.Triangle;

public class TriangleValidator {

    public static final double EPSILON = 0.001;

    public boolean isRightTriangle (Triangle triangle) {
        TriangleCalculator calculator = new TriangleCalculator();
        double firstSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getSecondPoint());
        double secondSide = calculator.calculateDistanceBetweenPoints(triangle.getSecondPoint(), triangle.getThirdPoint());
        double thirdSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getThirdPoint());
        double bigSide = Math.max(Math.max(firstSide, secondSide), thirdSide);
        boolean isRightTriangle = false;
        if (Math.abs(bigSide - firstSide) < EPSILON) {
            isRightTriangle = Math.pow(firstSide, 2) == Math.pow(secondSide, 2) + Math.pow(thirdSide, 2);
        }
        if (Math.abs(bigSide - secondSide) < EPSILON) {
            isRightTriangle = Math.pow(secondSide, 2) == Math.pow(firstSide, 2) + Math.pow(thirdSide, 2);
        }
        if (Math.abs(bigSide - thirdSide) < EPSILON) {
            isRightTriangle = Math.pow(thirdSide, 2) == Math.pow(firstSide, 2) + Math.pow(secondSide, 2);
        }
        return isRightTriangle;
    }
    public boolean isIsoscelesTriangle (Triangle triangle) {
        TriangleCalculator calculator = new TriangleCalculator();
        double firstSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getSecondPoint());
        double secondSide = calculator.calculateDistanceBetweenPoints(triangle.getSecondPoint(), triangle.getThirdPoint());
        double thirdSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getThirdPoint());
        boolean isIsoscelesTriangle = firstSide == secondSide || secondSide == thirdSide || firstSide == thirdSide;
            return isIsoscelesTriangle;
        }


    public boolean isEquilateralTriangle (Triangle triangle) {
        TriangleCalculator calculator = new TriangleCalculator();
        double firstSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getSecondPoint());
        double secondSide = calculator.calculateDistanceBetweenPoints(triangle.getSecondPoint(), triangle.getThirdPoint());
        double thirdSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getThirdPoint());
        boolean isEquilateralTriangle = firstSide == secondSide & firstSide == thirdSide;
        return isEquilateralTriangle;
    }

    public boolean isAcuteTriangle(Triangle triangle) {
        TriangleCalculator calculator = new TriangleCalculator();
        double firstSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getSecondPoint());
        double secondSide = calculator.calculateDistanceBetweenPoints(triangle.getSecondPoint(), triangle.getThirdPoint());
        double thirdSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getThirdPoint());
        double bigSide = Math.max(Math.max(firstSide, secondSide), thirdSide);
        boolean isAcuteTriangle = false;
        if (Math.abs(bigSide - firstSide) < EPSILON) {
            isAcuteTriangle = Math.pow(firstSide, 2) < (Math.pow(secondSide, 2) + Math.pow(thirdSide, 2));
        }
        if (Math.abs(bigSide - secondSide) < EPSILON) {
            isAcuteTriangle = Math.pow(secondSide, 2) < (Math.pow(firstSide, 2) + Math.pow(thirdSide, 2));
        }
        if (Math.abs(bigSide - thirdSide) < EPSILON) {
            isAcuteTriangle = Math.pow(thirdSide, 2) < (Math.pow(firstSide, 2) + Math.pow(secondSide, 2));
        }
        return isAcuteTriangle;
    }

    public boolean isObtuseTriangle(Triangle triangle) {
        TriangleCalculator calculator = new TriangleCalculator();
        double firstSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getSecondPoint());
        double secondSide = calculator.calculateDistanceBetweenPoints(triangle.getSecondPoint(), triangle.getThirdPoint());
        double thirdSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getThirdPoint());
        double bigSide = Math.max(Math.max(firstSide, secondSide), thirdSide);
        boolean isAcuteTriangle = false;
        if (Math.abs(bigSide - firstSide) < EPSILON) {
            isAcuteTriangle = Math.pow(firstSide, 2) > (Math.pow(secondSide, 2) + Math.pow(thirdSide, 2));
        }
        if (Math.abs(bigSide - secondSide) < EPSILON) {
            isAcuteTriangle = Math.pow(secondSide, 2) > (Math.pow(firstSide, 2) + Math.pow(thirdSide, 2));
        }
        if (Math.abs(bigSide - thirdSide) < EPSILON) {
            isAcuteTriangle = Math.pow(thirdSide, 2) > (Math.pow(firstSide, 2) + Math.pow(secondSide, 2));
        }
        return isAcuteTriangle;
    }
}
