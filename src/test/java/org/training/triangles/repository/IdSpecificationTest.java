package org.training.triangles.repository;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.training.triangles.TriangleObservable;
import org.training.triangles.model.Point;

public class IdSpecificationTest {

    @Test
    public void testsSpecifiedShouldCompareIdWhenIdSame() {
        //given
        TriangleObservable triangleObservable = new TriangleObservable(1, new Point(2.3,3.1), new Point(3.1, 4.2), new Point(2.4, 4.1));
        IdSpecification idSpecification = new IdSpecification(1);

        //when
        boolean result = idSpecification.specified(triangleObservable);

        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testsSpecifiedShouldCompareIdWhenIdDifferent() {
        //given
        TriangleObservable triangleObservable = new TriangleObservable(2, new Point(2.3,3.1), new Point(3.1, 4.2), new Point(2.4, 4.1));
        IdSpecification idSpecification = new IdSpecification(1);

        //when
        boolean result = idSpecification.specified(triangleObservable);

        //then
        Assert.assertFalse(result);
    }
}
