package org.training.triangles;

import org.training.triangles.logic.TriangleValidator;
import org.training.triangles.model.Point;
import org.training.triangles.model.Triangle;

import java.util.List;

public class Director {
    private DataReader reader;

    private TriangleValidator validator;

    private TriangleCreator creator;
// Ниже нужно додумать логику
    public void Director (DataReader reader) {

    }

    public List  read (String path) {
        List<Triangle> triangles = null;
        return triangles;
    }

    public void setReader (DataReader setReader) {
        reader = setReader;
    }

    public DataReader getReader() {
        return reader;
    }

    public void setValidator(TriangleValidator setValidator) {
        validator = setValidator;
    }

    public TriangleValidator getValidator() {

        return validator;
    }

    public void setCreator(TriangleCreator setCreator) {
        creator = setCreator;
    }

    public TriangleCreator getCreator() {

        return creator;
    }
}