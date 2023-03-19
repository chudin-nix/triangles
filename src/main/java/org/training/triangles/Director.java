package org.training.triangles;

import org.training.triangles.logic.TriangleValidator;
import org.training.triangles.model.Triangle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Director {
    private DataReader reader;

    private TriangleValidator validator;

    private TriangleCreator creator;
// Ниже нужно будет убирать переменную path, пока оставляю как заглушку
    public Director() throws IOException {
        String path = "./src/main/java/org/training/triangles/triangles.txt";
        DataReader dataReader = new DataReader();
        this.setReader(reader);
    }
//Тут проблема, почему-то передаются только
    public List  read (String path) throws IOException {
        DataReader dataReader = new DataReader();
        TriangleCreator triangleCreator = new TriangleCreator();
        List<String> coordinatesTriangle = dataReader.read(path);
        List<Triangle> triangles = new ArrayList<Triangle>();
        for (int i = 0; i < coordinatesTriangle.size(); i++) {
            triangles.add(triangleCreator.createTriangle(coordinatesTriangle.get(i)));
        }

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