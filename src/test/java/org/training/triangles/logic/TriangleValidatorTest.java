package org.training.triangles.logic;

import org.junit.Assert;
import org.training.triangles.model.Point;
import org.training.triangles.model.Triangle;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TriangleValidatorTest {

    @DataProvider
    public static Object[][] rightTriangles() {
        return new Object[][] {
                {new Point(0, -2.0), new Point(0, -5.0), new Point(2.0, -5.0)},
                {new Point(1, -3.0), new Point(1, -7.0), new Point(2.0, -7.0)}
        };
    }
    @Test(dataProvider = "rightTriangles")
    public void testShouldReadLineWhenTriangleIsRight(Point pointOne, Point pointTwo, Point pointThree) {
        //given
        Triangle triangle = new Triangle(pointOne, pointTwo, pointThree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isRightTriangle(triangle);

        //then
        Assert.assertEquals(true, result);
    }

    @DataProvider
    public static Object[][] notRightTriangles() {
        return new Object[][] {
                {new Point(0, -2.0), new Point(0, -5.0), new Point(2.0, -7.0)},
                {new Point(1, -3.0), new Point(1, -7.0), new Point(2.0, -9.0)}
        };
    }
    @Test(dataProvider = "notRightTriangles")
    public void testShouldReadLineWhenTriangleIsNotRight(Point pointOne, Point pointTwo, Point pointThree) {
        //given
        Triangle triangle = new Triangle(pointOne, pointTwo, pointThree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isRightTriangle(triangle);

        //then
        Assert.assertEquals(false, result);
    }

    @DataProvider
    public static Object[][] isoscelesTriangles() {
        return new Object[][] {
                {new Point(0, -2.0), new Point(0, -4.0), new Point(2.0, -4.0)},
                {new Point(1.0, -2.0), new Point(1.0, -4.0), new Point(3.0, -4.0)}
        };
    }
    @Test(dataProvider = "isoscelesTriangles")
    public void testShouldReadLineWhenTriangleIsIsosceles(Point pointOne, Point pointTwo, Point pointThree) {
        //given
        Triangle triangle = new Triangle(pointOne, pointTwo, pointThree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isIsoscelesTriangle(triangle);

        //then
        Assert.assertEquals(true, result);
    }

    @DataProvider
    public static Object[][] notIsoscelesTriangles() {
        return new Object[][] {
                {new Point(0, -2.0), new Point(0, -4.0), new Point(1.0, -4.0)},
                {new Point(1.0, -2.0), new Point(1.0, -4.0), new Point(2.0, -4.0)}
        };
    }
    @Test(dataProvider = "notIsoscelesTriangles")
    public void testShouldReadLineWhenTriangleIsNotIsosceles(Point pointOne, Point pointTwo, Point pointThree) {
        //given
        Triangle triangle = new Triangle(pointOne, pointTwo, pointThree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isIsoscelesTriangle(triangle);

        //then
        Assert.assertEquals(false, result);
    }

    @DataProvider
    public static Object[][] equilateralTriangles() {
        return new Object[][] {
                {new Point(0.0, 0.0), new Point(10.0, 0.0), new Point(5.0, 8.660)},
                {new Point(0, 0), new Point(1.5, 2.598), new Point(-1.5, 2.598)}
        };
    }
    @Test(dataProvider = "equilateralTriangles")
    public void testShouldReadLineWhenTriangleIsEquilateral(Point pointOne, Point pointTwo, Point pointThree) {
        //given
        Triangle triangle = new Triangle(pointOne, pointTwo, pointThree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isEquilateralTriangle(triangle);

        //then
        Assert.assertEquals(true, result);
    }

    @DataProvider
    public static Object[][] notEquilateralTriangles() {
        return new Object[][] {
                {new Point(0, 0), new Point(3.0, 0), new Point(9.0, 3.46)},
                {new Point(0, 1.0), new Point(4.5, 2.598), new Point(-5.5, 2.598)}
        };
    }
    @Test(dataProvider = "notEquilateralTriangles")
    public void testShouldReadLineWhenTriangleIsNotEquilateral(Point pointOne, Point pointTwo, Point pointThree) {
        //given
        Triangle triangle = new Triangle(pointOne, pointTwo, pointThree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isEquilateralTriangle(triangle);

        //then
        Assert.assertEquals(false, result);
    }

    @DataProvider
    public static Object[][] acuteTriangles() {
        return new Object[][] {
                {new Point(0, 0), new Point(0, -3.0), new Point(2.0, -3.0)},
                {new Point(0, 10.0), new Point(0, 0), new Point(-5.5, 2.598)}
        };
    }
    @Test(dataProvider = "acuteTriangles")
    public void testShouldReadLineWhenTriangleIsAcute(Point pointOne, Point pointTwo, Point pointThree) {
        //given
        Triangle triangle = new Triangle(pointOne, pointTwo, pointThree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isAcuteTriangle(triangle);

        //then
        Assert.assertEquals(true, result);
    }

    @DataProvider
    public static Object[][] notAcuteTriangles() {
        return new Object[][] {
                {new Point(0.0, 0.0), new Point(10.0, 0.0), new Point(5.0, 8.660)},
                {new Point(0, 0), new Point(1.5, 2.598), new Point(-1.5, 2.598)}
        };
    }
    @Test(dataProvider = "notAcuteTriangles")
    public void testShouldReadLineWhenTriangleIsNotAcute(Point pointOne, Point pointTwo, Point pointThree) {
        //given
        Triangle triangle = new Triangle(pointOne, pointTwo, pointThree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isAcuteTriangle(triangle);

        //then
        Assert.assertEquals(false, result);
    }

    @DataProvider
    public static Object[][] obtuseTriangles() {
        return new Object[][] {
                {new Point(0.0, 0.0), new Point(-5.0, 2.0), new Point(5.0, 2.0)},
                {new Point(-1.0, 1.0), new Point(-6.5, 3.0), new Point(4.0, 3.0)}
        };
    }
    @Test(dataProvider = "obtuseTriangles")
    public void testShouldReadLineWhenTriangleIsObtuse(Point pointOne, Point pointTwo, Point pointThree) {
        //given
        Triangle triangle = new Triangle(pointOne, pointTwo, pointThree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isObtuseTriangle(triangle);

        //then
        Assert.assertEquals(true, result);
    }

    @DataProvider
    public static Object[][] notObtuseTriangles() {
        return new Object[][] {
                {new Point(0.0, 0.0), new Point(10.0, 0.0), new Point(5.0, 8.660)},
                {new Point(0, 0), new Point(1.5, 2.598), new Point(-1.5, 2.598)}
        };
    }
    @Test(dataProvider = "notObtuseTriangles")
    public void testShouldReadLineWhenTriangleIsNotObtuse(Point pointOne, Point pointTwo, Point pointThree) {
        //given
        Triangle triangle = new Triangle(pointOne, pointTwo, pointThree);
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isObtuseTriangle(triangle);

        //then
        Assert.assertEquals(false, result);
    }
}