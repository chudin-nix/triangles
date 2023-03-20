package org.training.triangles;

import org.junit.Assert;
import org.junit.Test;
import org.training.triangles.logic.TriangleValidator;
import org.training.triangles.model.Triangle;

import java.io.IOException;
import java.util.List;

public class DirectorTest {

    @Test
    public void Director() {
        //given
        TriangleValidator triangleValidator = new TriangleValidator();
        Director director = new Director();
        String path = "./src/main/java/org/training/triangles/triangles.txt";
        List<Triangle> triangles = director.read(path);

        //when
        boolean result = triangleValidator.isRightTriangle(triangles.get(0));

        //then
        Assert.assertEquals(true, result);
    }
}
