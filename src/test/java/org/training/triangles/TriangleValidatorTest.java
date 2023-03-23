package org.training.triangles;

import org.junit.Assert;
import org.junit.Test;
import org.training.triangles.logic.TriangleCalculator;
import org.training.triangles.logic.TriangleValidator;
import org.training.triangles.model.Point;
import org.training.triangles.model.Triangle;

import java.io.IOException;
import java.util.List;

public class TriangleValidatorTest {
    @Test
    public void testIsRightTriangle() throws IOException {
        //given
        Point pointOne = new Point(1.1, 4.5);
        Point pointTwo = new Point(2.7, 3.6);
        Point pointTree = new Point(5.1, 6.2);
        Triangle triangle = new Triangle(pointOne, pointTwo, pointTree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isRightTriangle(triangle);

        //then
        Assert.assertEquals(true, result);
    }
    @Test
    public void testIsIsoscelesTriangle() throws IOException {
        //given
        Point pointOne = new Point(1.1, 4.5);
        Point pointTwo = new Point(2.7, 3.6);
        Point pointTree = new Point(5.1, 6.2);
        Triangle triangle = new Triangle(pointOne, pointTwo, pointTree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isIsoscelesTriangle(triangle);

        //then
        Assert.assertEquals(false, result);
    }
    @Test
    public void testIsEquilateralTriangle() throws IOException {
        //given
        Point pointOne = new Point(1.1, 4.5);
        Point pointTwo = new Point(2.7, 3.6);
        Point pointTree = new Point(5.1, 6.2);
        Triangle triangle = new Triangle(pointOne, pointTwo, pointTree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isEquilateralTriangle(triangle);

        //then
        Assert.assertEquals(true, result);
    }
    @Test
    public void testIsAcuteTriangle() throws IOException {
        //given
        Point pointOne = new Point(1.1, 4.5);
        Point pointTwo = new Point(2.7, 3.6);
        Point pointTree = new Point(5.1, 6.2);
        Triangle triangle = new Triangle(pointOne, pointTwo, pointTree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isAcuteTriangle(triangle);

        //then
        Assert.assertEquals(false, result);
    }
    @Test
    public void testIsObtuseTriangle() throws IOException {
        //given
        Point pointOne = new Point(1.1, 4.5);
        Point pointTwo = new Point(2.7, 3.6);
        Point pointTree = new Point(5.1, 6.2);
        Triangle triangle = new Triangle(pointOne, pointTwo, pointTree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isObtuseTriangle(triangle);

        //then
        Assert.assertEquals(true, result);
    }
}