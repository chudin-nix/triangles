package org.training.triangles.logic;

import org.training.triangles.model.Triangle;

public class TriangleValidator {

//    private static final String TRIANGLE_LINE_REGEX = "[0-9]|\s|\.";

    public boolean isRightTriangle (Triangle triangle) {
        TriangleCalculator calculator = new TriangleCalculator();
        double firstSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getSecondPoint());
        double secondSide = calculator.calculateDistanceBetweenPoints(triangle.getSecondPoint(), triangle.getThirdPoint());
        double thirdSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getThirdPoint());
        boolean isRightTriangle = Math.pow(firstSide, 2) == Math.pow(secondSide, 2) + Math.pow(thirdSide, 2);
        return isRightTriangle;
    }
    public boolean isIsoscelesTriangle (Triangle triangle) {
        TriangleCalculator calculator = new TriangleCalculator();
        double firstSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getSecondPoint());
        double secondSide = calculator.calculateDistanceBetweenPoints(triangle.getSecondPoint(), triangle.getThirdPoint());
        double thirdSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getThirdPoint());

        boolean isIsoscelesTriangle = ((firstSide == secondSide) & (firstSide != thirdSide)) | ((firstSide == thirdSide) & (firstSide != secondSide)) | ((firstSide != secondSide) & (firstSide != thirdSide));
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
        if (bigSide == firstSide) {
            isAcuteTriangle = Math.pow(firstSide, 2) < (Math.pow(secondSide, 2) + Math.pow(thirdSide, 2));
        }
        if (bigSide == secondSide) {
            isAcuteTriangle = Math.pow(secondSide, 2) < (Math.pow(firstSide, 2) + Math.pow(thirdSide, 2));
        }
        if (bigSide == thirdSide) {
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
        if (bigSide == firstSide) {
            isAcuteTriangle = Math.pow(firstSide, 2) > (Math.pow(secondSide, 2) + Math.pow(thirdSide, 2));
        }
        if (bigSide == secondSide) {
            isAcuteTriangle = Math.pow(secondSide, 2) > (Math.pow(firstSide, 2) + Math.pow(thirdSide, 2));
        }
        if (bigSide == thirdSide) {
            isAcuteTriangle = Math.pow(thirdSide, 2) > (Math.pow(firstSide, 2) + Math.pow(secondSide, 2));
        }
        return true;
    }
}
