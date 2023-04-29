package org.training.triangles.repository;

import org.training.triangles.TriangleObservable;

import java.util.*;

public class TriangleRepositoryImpl implements TriangleRepository{

    private Map<Integer, TriangleObservable> store = new HashMap<>();


    public TriangleRepositoryImpl () {

    }
    // for unit testing
    TriangleRepositoryImpl(Map<Integer, TriangleObservable> store) {
        this.store = store;
    }

    @Override
    public void add(TriangleObservable triangle) {
        Integer triangleId = triangle.getId();
        store.put(triangleId, triangle);
    }

    @Override
    public void delete(TriangleObservable triangle) {
        Integer triangleId = triangle.getId();
        store.remove(triangleId, triangle);
    }

    @Override
    public void update(TriangleObservable triangle) {
        Integer triangleId = triangle.getId();
        store.put(triangleId, triangle);
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
        List<TriangleObservable> listTriangles = new ArrayList<>();
        int i = 0;
        for (i = 0; i < this.store.size(); i++) {
            listTriangles.add(this.store.get(i));
        }
        //Вот тут NullPointer так и не разобрался почему, что-то не так с объектом TriangleRepositoryImpl
        Collections.sort(listTriangles, comparator);
        return listTriangles;
    }
}
