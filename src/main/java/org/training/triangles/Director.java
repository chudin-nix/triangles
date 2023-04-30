package org.training.triangles;

import org.apache.log4j.Logger;
import org.training.triangles.data.DataReader;
import org.training.triangles.logic.DataException;
import org.training.triangles.logic.TriangleCreator;
import org.training.triangles.logic.TriangleLineValidator;
import org.training.triangles.model.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Director {
    private static final Logger LOGGER = Logger.getLogger(Director.class);
    private final DataReader reader;

    private final TriangleLineValidator lineValidator;

    private final TriangleCreator creator;

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
            LOGGER.error(e.getMessage(), e);
        }

        return triangles;
    }

}