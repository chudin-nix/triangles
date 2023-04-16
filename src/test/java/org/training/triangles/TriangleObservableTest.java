package org.training.triangles;

import org.junit.Test;
import org.training.triangles.model.Point;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TriangleObservableTest {

    @Test
    public void testWhenGetId() {
        //given
        TriangleObservable triangle = new TriangleObservable(1, new Point(2.1, 3.4), new Point(2.3, 2.5), new Point(1.3, 4.2));
        int expected = 1;

        //when
        int actual = triangle.getId();

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testWhenGetObservers() {
        //given
        TriangleObservable triangle = new TriangleObservable(1, new Point(0,0), new Point(0,1), new Point(1,0));

        //when
        List<Observer> observerList = triangle.getObservers();

        //then
        assertNotNull(observerList);
    }

    
}
