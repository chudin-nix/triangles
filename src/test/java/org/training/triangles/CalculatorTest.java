package org.training.triangles;

import org.junit.Assert;
import org.junit.Test;
import org.training.triangles.logic.Calculator;
import org.training.triangles.model.Triangle;

import java.io.IOException;
import java.util.List;

public class CalculatorTest {
    @Test
    public void testIsTriangle() throws IOException {
        //given
        Calculator calculator = new Calculator();
        Director director = new Director();
        String path = "./src/main/java/org/training/triangles/test.txt";
        List<Triangle> triangles = director.read(path);

        //when
        boolean result = calculator.isTriangle(triangles.get(0));

        //then
        Assert.assertEquals(true, result);
    }
    @Test
    public void calculateArea() throws IOException {
        //given
        Calculator calculator = new Calculator();
        Director director = new Director();
        String path = "./src/main/java/org/training/triangles/test.txt";
        List<Triangle> triangles = director.read(path);

        //when
        double result = calculator.calculateArea(triangles.get(0));

        //then
        Assert.assertEquals(1.1, result, 0.01);
    }
    @Test
    public void calculatePerimeter() throws IOException {
        //given
        Calculator calculator = new Calculator();
        Director director = new Director();
        String path = "./src/main/java/org/training/triangles/test.txt";
        List<Triangle> triangles = director.read(path);

        //when
        double result = calculator.calculatePerimeter(triangles.get(0));

        //then
        Assert.assertEquals(1.1, result, 0.01);
    }
    @Test
    public void calculateDistanceBetweenPoints() throws IOException {
        //given
        Calculator calculator = new Calculator();
        Director director = new Director();
        String path = "./src/main/java/org/training/triangles/test.txt";
        List<Triangle> triangles = director.read(path);
        Triangle triangle = triangles.get(0);

        //when
        double result = calculator.calculateDistanceBetweenPoints(triangle.getFirstPoint(), triangle.getSecondPoint());

        //then
        Assert.assertEquals(1.4, result, 0.01);
    }

}

