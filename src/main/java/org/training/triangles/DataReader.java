package org.training.triangles;

import org.training.triangles.logic.TriangleLineValidator;
import org.training.triangles.logic.TriangleValidator;

import java.io.IOException;
import java.util.ArrayList;
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

    public List<String> read (String path) throws DataException {
        List<String> listObjectsFromFile = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            TriangleLineValidator triangleLineValidator = new TriangleLineValidator();
            while (bufferedReader.readLine() != null) {
                listObjectsFromFile.add(bufferedReader.readLine());
                triangleLineValidator.isValidLine(listObjectsFromFile.toString());
            }
        } catch (FileNotFoundException e) {
            throw new DataException("Could not find file by that path");
//        } catch (IOException e) {
//            throw new DataExeption("An I/O error occured");
        } catch (IOException e) {
            throw new DataException("Incorrect data in the file");
        }
        return listObjectsFromFile;
    }
}