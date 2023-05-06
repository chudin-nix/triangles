package org.training.triangles;

import org.junit.Test;
import org.mockito.Mockito;
import org.training.triangles.model.Point;

import static org.mockito.Mockito.*;

public class TriangleObservableTest {

    @Test
    public void testNotifyObserversShouldCallNotifyObserversWhenSetFirstPoint () {
        //given
        Observer observerMock = Mockito.mock(Observer.class);
        TriangleObservable triangleObservable = new TriangleObservable("5f9f1e37-20b3-48ca-9af0-64058e3886ad", new Point(0,0), new Point(0,1), new Point(1,0));
        /*тут пришлось вызвать реальный метод аттач, т.к. объект triangleObservable реальный, получается опять не совсем
        честный тест*/
        triangleObservable.attach(observerMock);

        //when
        triangleObservable.setFirstPoint(new Point(2.3, 1.3));

        //then
        verify(observerMock, times(1)).update(triangleObservable);
    }
}
