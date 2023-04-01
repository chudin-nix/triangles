package org.training.triangles;

import org.training.triangles.logic.TriangleLineValidator;
import org.training.triangles.logic.TriangleValidator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class DataReader {

public DataReader () {

}

    public List<String> read (String path) throws DataException {
        List<String> listObjectsFromFile = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String newLine = bufferedReader.readLine();
                if (newLine == null) {
                    break;
                }
                listObjectsFromFile.add(newLine);
            }
        } catch (FileNotFoundException e) {
            throw new DataException("Could not find file by that path", e);

        } catch (IOException e) {
            throw new DataException("Incorrect data in the file", e);
        }
        return listObjectsFromFile;
    }
}