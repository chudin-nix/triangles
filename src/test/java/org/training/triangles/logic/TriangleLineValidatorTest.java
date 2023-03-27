package org.training.triangles.logic;

import org.junit.Assert;
import org.junit.Test;
import org.training.triangles.model.Point;
import org.training.triangles.model.Triangle;

public class TriangleLineValidatorTest {
    @Test
    public void isValidLine() {
        //given
        TriangleLineValidator triangleLineValidator = new TriangleLineValidator();

        //when
        boolean result = triangleLineValidator.isValidLine("4.0 1.0 8.0 4.0 1.0 7.0");

        //then
        Assert.assertEquals(true, result);
    }
}
