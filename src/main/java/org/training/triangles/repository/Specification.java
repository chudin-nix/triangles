package org.training.triangles.repository;

import org.training.triangles.TriangleObservable;

public interface Specification {
    
    boolean specified(TriangleObservable triangle) ;
}
