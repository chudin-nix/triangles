package org.training.triangles;

import org.junit.Test;
import org.training.triangles.model.Point;

import static org.junit.Assert.*;

public class ObservalbeTest {

    @Test
    public void testWhenObserverAttach() {
        //given
        TriangleObservable triangleObservable = new TriangleObservable(3, new Point(2.1, 3.4), new Point(2.3, 2.5), new Point(1.3, 4.2));
        Observer observer = new Observer() {
            @Override
            public void update(TriangleObservable event) {

            }
        };

        //when
        triangleObservable.attach(observer);

        //then
        assertNotNull(triangleObservable.getObservers());

    }

    @Test
    public void testWhenObserverDetach() {
        //given
        TriangleObservable triangleObservableOne = new TriangleObservable(3, new Point(2.1, 3.4), new Point(2.3, 2.5), new Point(1.3, 4.2));
        Observer observer = new Observer() {
            @Override
            public void update(TriangleObservable event) {

            }
        };
        triangleObservableOne.attach(observer);
        TriangleObservable triangleObservableTwo = new TriangleObservable(4, new Point(1.1, 4.4), new Point(3.3, 1.5), new Point(3.3, 5.2));
        triangleObservableTwo.attach(observer);

        //when
        triangleObservableOne.detach(observer);
        triangleObservableTwo.detach(observer);

        //then
        assertEquals(triangleObservableOne.getObservers(), triangleObservableTwo.getObservers());

    }



    @Test
    public void testWhenWorkedNotifyObservers() {
        //given
        TriangleObservable triangleObservable = new TriangleObservable(3, new Point(2.1, 3.4), new Point(2.3, 2.5), new Point(1.3, 4.2));

        //when
        triangleObservable.setFirstPoint(new Point(3.5, 2.3));

        //then
        assertNotNull(triangleObservable.getObservers());
    }

}