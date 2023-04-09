package org.training.triangles;

import org.training.triangles.model.Point;
import org.training.triangles.model.Triangle;

public class TriangleIdentifiable extends Triangle {
    private final Integer id;

    public TriangleIdentifiable(Integer id, Point firstPoint, Point secondPoint, Point thirdPoint) {
        super(firstPoint, secondPoint, thirdPoint);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
