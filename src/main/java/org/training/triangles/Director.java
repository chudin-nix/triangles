package org.training.triangles;

import org.training.triangles.data.DataReader;
import org.training.triangles.logic.DataException;
import org.training.triangles.logic.TriangleLineValidator;
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

    public List<Triangle>  read (String path) {
        List<Triangle> triangles = new ArrayList<Triangle>();
        try {
            List<String> coordinatesTriangle = reader.read(path);
            for (int i = 0; i < coordinatesTriangle.size(); i++) {
                String line = coordinatesTriangle.get(i);
                if (lineValidator.isValidLine(line)) {
                    triangles.add(creator.createTriangle(line));
                }
            }

        } catch (DataException e) {
            System.out.println(e.getMessage());
        }

        return triangles;
    }

}