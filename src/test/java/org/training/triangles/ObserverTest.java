package org.training.triangles;

import org.junit.Test;
import org.training.triangles.model.Point;

import static org.junit.Assert.assertNotNull;

public class ObserverTest {

    @Test
    public void testWhenUpdate() {
        //given
        TriangleObservable triangle = new TriangleObservable(1, new Point(0, 0), new Point(0,1.0), new Point(1.4,0));

        //when
        triangle.setFirstPoint(new Point(2,2));

        //then
        assertNotNull(triangle.getObservers());
    }
}
