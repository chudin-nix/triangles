package org.training.triangles.repository;

import org.training.triangles.TriangleObservable;

import java.util.*;

public class TriangleRepositoryImpl implements TriangleRepository{

    private Map<Integer, TriangleObservable> store = new HashMap<>();

    @Override
    public void add(TriangleObservable triangle) {

    }

    @Override
    public void delete(TriangleObservable triangle) {

    }

    @Override
    public void update(TriangleObservable triangle) {

    }

    @Override
    public List<TriangleObservable> query(final Specification specification) {
        List<TriangleObservable> triangles = new ArrayList<>();
        for(TriangleObservable triangle : store.values()) {
            if (specification.specified(triangle)) {
                triangles.add(triangle);
            }
        }
        return triangles;
    }

    @Override
    public List<TriangleObservable> sort(Comparator<TriangleObservable> comparator) {
        return null;
    }
}
