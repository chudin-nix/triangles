package org.training.triangles;

import org.training.triangles.logic.TriangleLineValidator;
import org.training.triangles.logic.TriangleValidator;
import org.training.triangles.model.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Director {
    final private DataReader reader;

    final private TriangleLineValidator lineValidator;

    final private TriangleCreator creator;

    public Director(DataReader dataReader, TriangleLineValidator triangleLineValidator, TriangleCreator triangleCreator) {
        reader = dataReader;
        lineValidator = triangleLineValidator;
        creator = triangleCreator;
    }

    public List<Triangle>  read (String path) throws DataException {
        DataReader dataReader = new DataReader();
        TriangleCreator triangleCreator = new TriangleCreator();
        List<String> coordinatesTriangle = dataReader.read(path);
        List<Triangle> triangles = new ArrayList<Triangle>();
        for (int i = 0; i < coordinatesTriangle.size(); i++) {
            triangles.add(triangleCreator.createTriangle(coordinatesTriangle.get(i)));
        }

        return triangles;
    }

}