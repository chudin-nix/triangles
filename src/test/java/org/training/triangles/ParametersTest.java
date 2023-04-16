package org.training.triangles;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ParametersTest {

    @Test
    public void testWhenGetArea() {
        //given
        Parameters params = new Parameters(10.0, 20.0);
        double expected = 10.0;

        //when
        double actual = params.getArea();

        //then
        assertEquals(expected, actual, 0.001);

    }

    @Test
    public void testWhenGetPerimeter() {
        //given
        Parameters params = new Parameters(10.0, 20.0);
        double expected = 20.0;

        //when
        double actual = params.getPerimeter();

        //then
        assertEquals(expected, actual, 0.001);

    }


}
