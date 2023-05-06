package org.training.triangles.repository;

import org.training.triangles.TriangleObservable;

import java.util.*;

public class TriangleRepositoryImpl implements TriangleRepository{

    private Map<String, TriangleObservable> store = new HashMap<>();


    public TriangleRepositoryImpl () {

    }
    // for unit testing
    TriangleRepositoryImpl(Map<String, TriangleObservable> store) {
        this.store = store;
    }

    @Override
    public void add(TriangleObservable triangle) {
        String triangleId = triangle.getId();
        store.put(triangleId, triangle);
    }

    @Override
    public void delete(TriangleObservable triangle) {
        String triangleId = triangle.getId();
        store.remove(triangleId, triangle);
    }

    @Override
    public void update(TriangleObservable triangle) {
        String triangleId = triangle.getId();
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
        for (Map.Entry<String, TriangleObservable> pair: store.entrySet()) {
            TriangleObservable value = pair.getValue();
            listTriangles.add(value);
        }
        //Вот тут NullPointer так и не разобрался почему, что-то не так с объектом TriangleRepositoryImpl
        Collections.sort(listTriangles, comparator);
        return listTriangles;
    }
}
