package org.training.triangles.repository;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.training.triangles.TriangleObservable;
import org.training.triangles.model.Point;

public class IdSpecificationTest {

    @Test
    public void testSpecifiedShouldCompareIdWhenIdSame() {
        //given
        TriangleObservable triangleObservable = new TriangleObservable("0f645cc7-9380-4639-8c63-c8888652621b", new Point(2.3,3.1), new Point(3.1, 4.2), new Point(2.4, 4.1));
        IdSpecification idSpecification = new IdSpecification("0f645cc7-9380-4639-8c63-c8888652621b");

        //when
        boolean result = idSpecification.specified(triangleObservable);

        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testSpecifiedShouldCompareIdWhenIdDifferent() {
        //given
        TriangleObservable triangleObservable = new TriangleObservable("0f645cc7-9380-4639-8c63-c8888652626b", new Point(2.3,3.1), new Point(3.1, 4.2), new Point(2.4, 4.1));
        IdGenerator idGenerator = new IdGenerator();
        IdSpecification idSpecification = new IdSpecification(idGenerator.generateId());

        //when
        boolean result = idSpecification.specified(triangleObservable);

        //then
        Assert.assertFalse(result);
    }
}
