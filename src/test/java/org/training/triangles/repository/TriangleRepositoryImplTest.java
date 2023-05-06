package org.training.triangles.repository;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.training.triangles.TriangleObservable;
import org.training.triangles.model.Point;

import java.util.*;

public class TriangleRepositoryImplTest {
    @Test
    public void testQueryShouldReturnTriangleObservableWhenPassedSpecification() {
        //given
        TriangleObservable triangleOne = new TriangleObservable("0f645cc7-9380-4639-8c63-c8888652623b",new Point(2.3,5.2), new Point(3.1, 6.7), new Point(4.1, 8.1));
        TriangleObservable triangleTwo = new TriangleObservable("0f645cc7-9380-4639-8c63-c8888652631b", new Point(8.1, 2.4), new Point(3.1,8.4), new Point(4.5, 9.2));
        TriangleObservable triangleThree = new TriangleObservable("0f645cc7-9380-4639-8c64-c8888652621b", new Point(3.9, 1.5), new Point(4.1, 8.4), new Point(3.8, 2.8));
        Map <String, TriangleObservable> map = new HashMap<>();
        map.put("0f645cc7-9380-4639-8c63-c8888652621b", triangleOne);
        map.put("0f645cc7-9380-4639-8c63-c8888652621n", triangleTwo);
        map.put("0f645cc7-9380-4639-8c63-c8888652621g", triangleThree);

        //тут я использую конструктор, специальный для Unit теста
        TriangleRepositoryImpl repository = new TriangleRepositoryImpl(map);
        Specification specification = new Specification() {
            @Override
            public boolean specified(TriangleObservable triangle) {

                return true;
            }
        };


        //when
        List<TriangleObservable> result = repository.query(specification);

        //then
        Assert.assertEquals(3, result.size());
        Assert.assertTrue(result.contains(triangleOne));
    }

    @Test
    public void testSortShouldSortObjectsWhenPassedComparator() {
            //given
            TriangleRepositoryImpl repository = new TriangleRepositoryImpl();
            TriangleObservable triangleFirst = new TriangleObservable("0f645cc7-9480-4639-8c63-c8888652621b", new Point(2.3, 4.2), new Point(4.1, 3.4), new Point(1.6, 6.7));
            TriangleObservable triangleSecond = new TriangleObservable("0f745cc7-9380-4639-8c63-c8888652621b", new Point(2.3, 4.2), new Point(4.1, 3.4), new Point(1.6, 6.7));
            repository.add(triangleFirst);
            repository.add(triangleSecond);

            Comparator<TriangleObservable> comparatorById = Comparator.comparing(TriangleObservable::getId);
            List<TriangleObservable> expectedQuery = Arrays.asList(triangleFirst, triangleSecond);

            //when
            List<TriangleObservable> actualQuery = repository.sort(comparatorById);

            //then
            Assert.assertEquals(expectedQuery, actualQuery);
        }
    }
