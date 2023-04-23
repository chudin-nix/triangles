package org.training.triangles;

import org.junit.Test;
import org.mockito.Mockito;
import org.training.triangles.model.Point;

import static org.mockito.Mockito.*;

public class TriangleObservableTest {

    @Test
    public void testSetFirstPointShouldCallNotifyObservers () {
        //given
        TriangleStore.getInstance();
        Observer observerMock = Mockito.mock(Observer.class);
        TriangleObservable triangleObservableMock = Mockito.mock(TriangleObservable.class);
        Point point = new Point(2.3,5.4);
        doCallRealMethod().when(triangleObservableMock).setFirstPoint(point);
        triangleObservableMock.attach(observerMock);

        // При аттачить мок обсервера, разобраться как

        //when
        triangleObservableMock.setFirstPoint(new Point(2.3, 1.3));

        //then
        // с помощью Verify проверить, что был вызван метод NotifyObservers на моке
        verify(triangleObservableMock, times(1)).notifyObservers();
    }
}
