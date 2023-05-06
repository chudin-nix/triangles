package org.training.triangles;

import org.training.triangles.model.Point;

public class Main {
    public static void main(String[] args) {
        TriangleObservable triangleObservable = new TriangleObservable(1, new Point(0, -2.0), new Point(0, -5.0), new Point(2.0, -5.0) );
        TriangleStore triangleStore = TriangleStore.getInstance();

        triangleObservable.attach(triangleStore);

      //  triangleObservable.setFirstPoint(new Point(2.1, 3.2));
    }
}
