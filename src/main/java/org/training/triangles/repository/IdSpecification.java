package org.training.triangles.repository;

import org.training.triangles.TriangleObservable;

public class IdSpecification implements Specification{
    private final Integer id;

    public IdSpecification(Integer id) {
        this.id = id;
    }

    @Override
    public boolean specified(final TriangleObservable triangle) {
        return triangle.getId().equals(id);
    }
}
