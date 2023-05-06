package org.training.triangles.logic;

import org.training.triangles.model.Triangle;

import java.math.RoundingMode;
import java.text.DecimalFormat;

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
            isRightTriangle = Math.abs(Math.pow(firstSide, 2) - (Math.pow(secondSide, 2) + Math.pow(thirdSide, 2))) < EPSILON;
        }
        if (Math.abs(bigSide - secondSide) < EPSILON) {
            isRightTriangle = Math.abs(Math.pow(secondSide, 2) - (Math.pow(firstSide, 2) + Math.pow(thirdSide, 2))) < EPSILON;
        }
        if (Math.abs(bigSide - thirdSide) < EPSILON) {
            isRightTriangle = Math.abs(Math.pow(thirdSide, 2) - (Math.pow(firstSide, 2) + Math.pow(secondSide, 2))) < EPSILON;
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
//        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double firstSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getSecondPoint());
//        double roundedFirstSide = Double.parseDouble(decimalFormat.format(firstSide));
//        decimalFormat.setRoundingMode(RoundingMode.CEILING);
        double secondSide = calculator.calculateDistanceBetweenPoints(triangle.getSecondPoint(), triangle.getThirdPoint());
//        double roundedSecondSide = Double.parseDouble(decimalFormat.format(secondSide));
//        decimalFormat.setRoundingMode(RoundingMode.CEILING);
        double thirdSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getThirdPoint());
//        double roundedThirdSide = Double.parseDouble(decimalFormat.format(thirdSide));
//        decimalFormat.setRoundingMode(RoundingMode.CEILING);
        boolean isEquilateralTriangle = Math.ceil(firstSide) == Math.ceil(secondSide) & Math.ceil(firstSide) == Math.ceil(thirdSide);
//        boolean isEquilateralTriangle = roundedFirstSide == roundedSecondSide & roundedFirstSide == roundedThirdSide;
        return isEquilateralTriangle;
    }

    public boolean isAcuteTriangle(Triangle triangle) {
        TriangleCalculator calculator = new TriangleCalculator();
        double firstSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getSecondPoint());
        double secondSide = calculator.calculateDistanceBetweenPoints(triangle.getSecondPoint(), triangle.getThirdPoint());
        double thirdSide = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getThirdPoint());
        double bigSide = Math.max(Math.max(firstSide, secondSide), thirdSide);
        boolean isAcuteTriangle = false;
        if (Math.abs(bigSide - firstSide) > EPSILON) {
            isAcuteTriangle = Math.pow(firstSide, 2) < (Math.pow(secondSide, 2) + Math.pow(thirdSide, 2));
        }
        if (Math.abs(bigSide - secondSide) > EPSILON) {
            isAcuteTriangle = Math.pow(secondSide, 2) < (Math.pow(firstSide, 2) + Math.pow(thirdSide, 2));
        }
        if (Math.abs(bigSide - thirdSide) > EPSILON) {
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
