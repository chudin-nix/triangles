package org.training.triangles.logic;

import org.training.triangles.model.Triangle;

public class TriangleValidator {

    public boolean isRightTriangle (Triangle triangle) {
        Calculator calculator = new Calculator();
        double firstSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getSecondPoint());
        double secondSide = calculator.calculateDistanceBetweenPoints(triangle.getSecondPoint(), triangle.getThirdPoint());
        double thirdSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getThirdPoint());
        boolean isRightTriangle = Math.pow(firstSide, 2) == Math.pow(secondSide, 2) + Math.pow(thirdSide, 2);
        return isRightTriangle;
    }
    public boolean isIsoscelesTriangle (Triangle triangle) {
        Calculator calculator = new Calculator();
        double firstSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getSecondPoint());
        double secondSide = calculator.calculateDistanceBetweenPoints(triangle.getSecondPoint(), triangle.getThirdPoint());
        double thirdSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getThirdPoint());
    // тут надо переписать, потому что очень длинно получается
        boolean isIsoscelesTriangle = ((firstSide == secondSide) & (firstSide != thirdSide)) | ((firstSide == thirdSide) & (firstSide != secondSide)) | ((firstSide != secondSide) & (firstSide != thirdSide));
            return isIsoscelesTriangle;
        }

    // проверка является ли треугольник равносторонним
    public boolean isEquilateralTriangle () {
        return true;
    }
    // проверка является ли треугольник остроугольным
    public boolean isAcuteTriangle() {
        return true;
    }
    // проверка является ли треугольник тупоугольным
    public boolean isObtuseTriangle() {
        return true;
    }
}
