package org.training.triangles.repository;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.training.triangles.TriangleObservable;
import org.training.triangles.model.Point;

import java.util.*;

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

    @Test
    public void testSortShouldPassedComparatoraWhen() {
            //given
            TriangleRepositoryImpl repository = new TriangleRepositoryImpl();
            TriangleObservable triangleFirst = new TriangleObservable(1, new Point(2.3, 4.2), new Point(4.1, 3.4), new Point(1.6, 6.7));
            TriangleObservable triangleSecond = new TriangleObservable(2, new Point(2.3, 4.2), new Point(4.1, 3.4), new Point(1.6, 6.7));
            repository.add(triangleFirst);
            repository.add(triangleSecond);
            //В видео было предложено замокать компоратор и воспользоваться методоми thenanswer и doAnswer. Не удалось реализовать, оставил такую логику.
            Comparator<TriangleObservable> comparatorById = Comparator.comparing(TriangleObservable::getId);
            List<TriangleObservable> expectedQuery = Arrays.asList(triangleFirst, triangleSecond);

            //when
            //в методе сорт происходит NullPointerException
            List<TriangleObservable> actualQuery = repository.sort(comparatorById);

            //then
            Assert.assertEquals(expectedQuery, actualQuery);
        }

    // на методы add, delete, update решил не писать тесты, т.к. логика достаточно простая
    }
