package org.training.triangles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.io.*;

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

// Тут написать через BufferedReader FileInputStream
    public List<String> read (String path) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("./data/triangles.txt");
       BufferedReader bufferedReader = new BufferedReader();
       String c;
       while ((c=fileInputStream.) != null) {
           System.out.println(c);
       }

        List<String> listObjectsFromFile = Files.readAllLines(Paths.get(path));

        return listObjectsFromFile;
    }
}