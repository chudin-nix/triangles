package org.training.triangles;

import org.junit.Test;
import org.training.triangles.model.Point;
import org.training.triangles.model.Triangle;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ObservalbeTest {

    @Test
    public void testAttach() {
        //given
        Observable observable = new TriangleObservable(3, new Point(2.1, 3.4), new Point(2.3, 2.5), new Point(1.3, 4.2));

        //when
        observable.attach(new Observer() {
            @Override
            public void update(TriangleObservable event) {

            }
        });

        //then
/*        assertTrue(observable.getObservers());
    }

    @Test
    public void testDetach() {
        Observable observable = new Triangle();
        Observer observer = new TriangleObserver();
        observable.attach(observer);
        assertTrue(observable.getObservers().contains(observer));
        observable.detach(observer);
        assertFalse(observable.getObservers().contains(observer));
    }

    @Test
    public void testNotifyObservers() {
        Observable observable = new Triangle();
        Observer observer1 = new TriangleObserver();
        Observer observer2 = new TriangleObserver();
        observable.attach(observer1);
        observable.attach(observer2);
        observable.notifyObservers();
        assertTrue(observer1.isNotified());
        assertTrue(observer2.isNotified());
    }

 */
    }

}