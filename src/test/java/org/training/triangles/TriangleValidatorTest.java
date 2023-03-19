package org.training.triangles;

import org.junit.Assert;
import org.junit.Test;
import org.training.triangles.logic.Calculator;
import org.training.triangles.logic.TriangleValidator;
import org.training.triangles.model.Triangle;

import java.io.IOException;
import java.util.List;

public class TriangleValidatorTest {
    @Test
    public void testIsRightTriangle() throws IOException {
        //given
        TriangleValidator triangleValidator = new TriangleValidator();
        Director director = new Director();
        String path = "./src/main/java/org/training/triangles/test.txt";
        List<Triangle> triangles = director.read(path);

        //when
        boolean result = triangleValidator.isRightTriangle(triangles.get(0));

        //then
        Assert.assertEquals(true, result);
    }
    @Test
    public void testIsIsoscelesTriangle() throws IOException {
        //given
        TriangleValidator triangleValidator = new TriangleValidator();
        Director director = new Director();
        String path = "./src/main/java/org/training/triangles/test.txt";
        List<Triangle> triangles = director.read(path);

        //when
        boolean result = triangleValidator.isIsoscelesTriangle(triangles.get(0));

        //then
        Assert.assertEquals(true, result);
    }
    @Test
    public void testIsEquilateralTriangle() throws IOException {
        //given
        TriangleValidator triangleValidator = new TriangleValidator();
        Director director = new Director();
        String path = "./src/main/java/org/training/triangles/test.txt";
        List<Triangle> triangles = director.read(path);

        //when
        boolean result = triangleValidator.isEquilateralTriangle(triangles.get(0));

        //then
        Assert.assertEquals(true, result);
    }
    @Test
    public void testIsAcuteTriangle() throws IOException {
        //given
        TriangleValidator triangleValidator = new TriangleValidator();
        Director director = new Director();
        String path = "./src/main/java/org/training/triangles/test.txt";
        List<Triangle> triangles = director.read(path);

        //when
        boolean result = triangleValidator.isAcuteTriangle(triangles.get(0));

        //then
        Assert.assertEquals(true, result);
    }
    @Test
    public void testIsObtuseTriangle() throws IOException {
        //given
        TriangleValidator triangleValidator = new TriangleValidator();
        Director director = new Director();
        String path = "./src/main/java/org/training/triangles/test.txt";
        List<Triangle> triangles = director.read(path);

        //when
        boolean result = triangleValidator.isObtuseTriangle(triangles.get(0));

        //then
        Assert.assertEquals(true, result);
    }
}