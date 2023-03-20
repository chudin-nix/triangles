package org.training.triangles;

import org.junit.Assert;
import org.junit.Test;
import org.training.triangles.logic.TriangleCalculator;
import org.training.triangles.model.Point;
import org.training.triangles.model.Triangle;

import java.io.IOException;
import java.util.List;

public class TriangleCalculatorTest {
    @Test
    public void testIsTriangle() throws IOException {
        //given
        Director director = new Director();

        //when
        boolean result = calculator.isTriangle(triangles.get(0));

        //then
        Assert.assertEquals(true, result);
    }
    @Test
    public void calculateArea() throws IOException {
        //given
        Point pointOne = new Point(1.1, 4.5);
        Point pointTwo = new Point(2.7, 3.6);
        Point pointTree = new Point(5.1, 6.2);
        TriangleCalculator triangleCalculator = new TriangleCalculator();
        Triangle triangle = new Triangle(pointOne, pointTwo, pointTree);

        //when
        double result = triangleCalculator.calculateArea(triangle);

        //then
        Assert.assertEquals(0.0, result, 0.01);
    }
    @Test
    public void calculatePerimeter() throws IOException {
        //given
        TriangleCalculator calculator = new TriangleCalculator();
        Director director = new Director();
        String path = "./src/main/java/org/training/triangles/triangles.txt";
        List<Triangle> triangles = director.read(path);

        //when
        double result = calculator.calculatePerimeter(triangles.get(0));

        //then
        Assert.assertEquals(0.0, result, 0.01);
    }
    @Test
    public void calculateDistanceBetweenPoints() throws IOException {
        //given
        TriangleCalculator calculator = new TriangleCalculator();
        Director director = new Director();
        String path = "./src/main/java/org/training/triangles/triangles.txt";
        List<Triangle> triangles = director.read(path);
        Triangle triangle = triangles.get(0);

        //when
        double result = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getSecondPoint());

        //then
        Assert.assertEquals(0.0, result, 0.01);
    }

}

