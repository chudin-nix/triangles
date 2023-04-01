package org.training.triangles.logic;

import org.junit.Assert;
import org.junit.Test;
import org.training.triangles.model.Point;
import org.training.triangles.model.Triangle;

import java.io.IOException;
import java.util.List;

public class TriangleCalculatorTest {
    @Test
    public void testIsTriangle() {
        //given
        Point pointOne = new Point(1.1, 4.5);
        Point pointTwo = new Point(2.7, 3.6);
        Point pointTree = new Point(5.1, 6.2);
        TriangleCalculator triangleCalculator = new TriangleCalculator();
        Triangle triangle = new Triangle(pointOne, pointTwo, pointTree);

        //when
        boolean result = triangleCalculator.isTriangle(triangle);

        //then
        Assert.assertEquals(true, result);
    }
    @Test
    public void calculateArea() {
        //given
        Point pointOne = new Point(1.1, 4.5);
        Point pointTwo = new Point(2.7, 3.6);
        Point pointTree = new Point(5.1, 6.2);
        TriangleCalculator triangleCalculator = new TriangleCalculator();
        Triangle triangle = new Triangle(pointOne, pointTwo, pointTree);

        //when
        double result = triangleCalculator.calculateArea(triangle);

        //then
        Assert.assertEquals(23.51, result, 0.01);
    }
    @Test
    public void calculatePerimeter() {
        //given
        Point pointOne = new Point(1.1, 4.5);
        Point pointTwo = new Point(2.7, 3.6);
        Point pointTree = new Point(5.1, 6.2);
        TriangleCalculator triangleCalculator = new TriangleCalculator();
        Triangle triangle = new Triangle(pointOne, pointTwo, pointTree);

        //when
        double result = triangleCalculator.calculatePerimeter(triangle);

        //then
        Assert.assertEquals(9.72, result, 0.01);
    }
    @Test
    public void calculateDistanceBetweenPoints() {
        //given
        Point pointOne = new Point(1.1, 4.5);
        Point pointTwo = new Point(2.7, 3.6);
        TriangleCalculator triangleCalculator = new TriangleCalculator();

        //when
        double result = triangleCalculator.calculateDistanceBetweenPoints(pointOne, pointTwo);

        //then
        Assert.assertEquals(1.83, result, 0.01);
    }

}

