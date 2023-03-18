package org.training.triangles;

import org.training.triangles.model.Triangle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
/*
    List<Triangle> read(String filePath) {
        List<Triangle> circles = new ArrayList<Triangle>();
        List<String> lines = dataReader.read(filePath);
        for (String line: lines) {
            if (validator.isValid(line)) {
                Triangle triangle = creator.create(line);
                circles.add(circle);
            }
        }
        return circles;
    }
}
*/


    public List<String> read (String path) throws IOException {
        List<String> listObjectsFromFile = Files.readAllLines(Paths.get("triangles.txt"));
        return listObjectsFromFile;
    }
}