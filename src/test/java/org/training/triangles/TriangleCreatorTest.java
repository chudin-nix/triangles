package org.training.triangles;

import org.junit.Assert;
import org.junit.Test;
import org.training.triangles.model.Point;
import org.training.triangles.model.Triangle;

public class TriangleCreatorTest {
    private static final String VALID_LINE = "4.0 1.0 8.0 4.0 1.0 7.0";

    @Test
    public void testTriangleCreator() throws DataException {
        //given
        TriangleCreator triangleCreator = new TriangleCreator();
        Point pointOne = new Point(1.5, 3.2);
        Point pointTwo = new Point(4.0, 6.0);
        Point pointTree = new Point(5.2, 2.0);
        Triangle triangle = new Triangle(pointOne, pointTwo, pointTree);

        //when
        Triangle result = triangleCreator.createTriangle(VALID_LINE);

        //then
        Assert.assertEquals(triangle, result);
    }
}
