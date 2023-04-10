package org.training.triangles;

import org.training.triangles.logic.TriangleCalculator;

import java.util.HashMap;
import java.util.Map;

public class TriangleStore implements Observer{

    private static TriangleStore instance;

    private final Map<Integer, Parameters> parameters = new HashMap<>();

    private final TriangleCalculator calculator = new TriangleCalculator();

    private TriangleStore() {

    }

    public void update(TriangleObservable triangle) {
        double area = calculator.calculateArea(triangle);
        double perimeter = calculator.calculatePerimeter(triangle);
        parameters.put(triangle.getId(), new Parameters(area, perimeter));
    }

    public static TriangleStore getInstance() {
        if (instance == null) {
            instance = new TriangleStore();
        }
        return instance;
    }
}
