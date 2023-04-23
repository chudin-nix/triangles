package org.training.triangles.repository;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.training.triangles.TriangleObservable;
import org.training.triangles.model.Point;

import java.util.List;

public class TriangleRepositoryImplTest {
    @Test
    public void testsQueryShouldReturnTriangleObservableWhenPassedSpecification() {
        //given
        TriangleRepositoryImpl repository = new TriangleRepositoryImpl();
        TriangleObservable triangleOne = new TriangleObservable(1,new Point(2.3,5.2), new Point(3.1, 6.7), new Point(4.1, 8.1));
        TriangleObservable triangleTwo = new TriangleObservable(2, new Point(8.1, 2.4), new Point(3.1,8.4), new Point(4.5, 9.2));
        TriangleObservable triangleThree = new TriangleObservable(3, new Point(3.9, 1.5), new Point(4.1, 8.4), new Point(3.8, 2.8));
        IdSpecification idSpecification = new IdSpecification(1);

        repository.add(triangleOne);
        repository.add(triangleTwo);
        repository.add(triangleThree);

        Specification specification = new Specification() {
            @Override
            public boolean specified(TriangleObservable triangle) {
                return triangle.getId() == 1;
            }
        };


        //when
        List<TriangleObservable> result = repository.query(specification);

        //then
        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.contains(triangleTwo));
    }
}
