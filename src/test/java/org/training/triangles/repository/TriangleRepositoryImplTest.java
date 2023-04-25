package org.training.triangles.repository;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.training.triangles.TriangleObservable;
import org.training.triangles.model.Point;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TriangleRepositoryImplTest {
    @Test
    public void testsQueryShouldReturnTriangleObservableWhenPassedSpecification() {
        //given
        TriangleObservable triangleOne = new TriangleObservable(1,new Point(2.3,5.2), new Point(3.1, 6.7), new Point(4.1, 8.1));
        TriangleObservable triangleTwo = new TriangleObservable(2, new Point(8.1, 2.4), new Point(3.1,8.4), new Point(4.5, 9.2));
        TriangleObservable triangleThree = new TriangleObservable(3, new Point(3.9, 1.5), new Point(4.1, 8.4), new Point(3.8, 2.8));
        Map <Integer, TriangleObservable> map = new HashMap<>();
        map.put(1, triangleOne);
        map.put(2, triangleTwo);
        map.put(3, triangleThree);

        TriangleRepositoryImpl repository = new TriangleRepositoryImpl(map);
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
        Assert.assertTrue(result.contains(triangleOne));
    }
}
