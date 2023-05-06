package org.training.triangles;

import org.junit.Test;
import org.training.triangles.logic.TriangleCalculator;
import org.training.triangles.model.Point;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class TriangleStoreTest {

    @Test
    public void testUpdateShouldTriangleStore() {
        //given
        TriangleObservable triangle = new TriangleObservable("0f645cc7-9380-4639-8c63-c8888652654b", new Point(2.1, 3.4), new Point(2.3, 2.5), new Point(1.3, 4.2));
        TriangleStore triangleStore = TriangleStore.getInstance();
        triangleStore.update(triangle);
        TriangleCalculator triangleCalculator = new TriangleCalculator();

        // when
        Parameters parameters = new Parameters(triangleCalculator.calculateArea(triangle), triangleCalculator.calculatePerimeter(triangle));

        //then
        assertEquals(5.51536556332519, parameters.getArea(), 0.001);
        assertEquals(4.0256335879593665, parameters.getPerimeter(), 0.001);
    }

    @Test
    public void testGetInstanceWhenFromTriangleStore() {
        //given
        TriangleStore storeOne;
        TriangleStore storeTwo;

        //when
        storeOne = TriangleStore.getInstance();
        storeTwo = TriangleStore.getInstance();

        //then
        assertSame(storeOne, storeTwo);
    }

}
