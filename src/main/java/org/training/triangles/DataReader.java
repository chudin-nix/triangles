package org.training.triangles;

import java.io.IOException;
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

public DataReader () {

}

    public List<String> read (String path) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(path);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        List<String> listObjectsFromFile = null;
        while (bufferedReader.readLine() != null) {
            listObjectsFromFile.add(bufferedReader.readLine());
        }

        return listObjectsFromFile;
    }
}