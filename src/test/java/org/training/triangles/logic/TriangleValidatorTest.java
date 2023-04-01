package org.training.triangles.logic;

import org.junit.Assert;
import org.junit.Test;
import org.training.triangles.model.Point;
import org.training.triangles.model.Triangle;


public class TriangleValidatorTest {
    @Test
    public void testIsRightTriangle() {
        //given
        Point pointOne = new Point(0, -2.0);
        Point pointTwo = new Point(0, -5.0);
        Point pointThree = new Point(2.0, -5.0);
        Triangle triangle = new Triangle(pointOne, pointTwo, pointThree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isRightTriangle(triangle);

        //then
        Assert.assertEquals(true, result);
    }
    @Test
    public void testIsIsoscelesTriangle() {
        //given
        Point pointOne = new Point(0, 3.0);
        Point pointTwo = new Point(-1.0, 0);
        Point pointThree = new Point(1.0, 0);
        Triangle triangle = new Triangle(pointOne, pointTwo, pointThree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isIsoscelesTriangle(triangle);

        //then
        Assert.assertEquals(true, result);
    }
    @Test
    public void testIsEquilateralTriangle() {
        //given
        Point pointOne = new Point(0, 0);
        Point pointTwo = new Point(3.0, 5.0);
        Point pointThree = new Point(6.0, 0);
        Triangle triangle = new Triangle(pointOne, pointTwo, pointThree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isEquilateralTriangle(triangle);

        //then
        Assert.assertEquals(false, result);
    }
    @Test
    public void testIsAcuteTriangle() {
        //given
        Point pointOne = new Point(0, 5.0);
        Point pointTwo = new Point(-1.0, 0);
        Point pointThree = new Point(1.0, 0);
        Triangle triangle = new Triangle(pointOne, pointTwo, pointThree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isAcuteTriangle(triangle);

        //then
        Assert.assertEquals(true, result);
    }
    @Test
    public void testIsObtuseTriangle() {
        //given
        Point pointOne = new Point(-4.0, 3.2);
        Point pointTwo = new Point(0, -2.0);
        Point pointThree = new Point(4.0, 0);
        Triangle triangle = new Triangle(pointOne, pointTwo, pointThree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isObtuseTriangle(triangle);

        //then
        Assert.assertEquals(true, result);
    }
}