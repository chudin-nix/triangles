package org.training.triangles.data;

import org.training.triangles.logic.DataException;
import org.training.triangles.logic.TriangleLineValidator;

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
            TriangleLineValidator triangleLineValidator = new TriangleLineValidator();
            listObjectsFromFile.add(bufferedReader.readLine());
            // тут надо переделать так, как говорил Филипп в видео
            while (bufferedReader.readLine() != null) {
                listObjectsFromFile.add(bufferedReader.readLine());

                triangleLineValidator.isValidLine(listObjectsFromFile.toString());
            }
        } catch (FileNotFoundException e) {
            throw new DataException("Could not find file by that path", e);
            // тут почему-то не удалось добавить метод warn, idea предлагала сделать warning
//            LOGGER.warn(e.getMessage());

        } catch (IOException e) {
            throw new DataException("Incorrect data in the file", e);
        }
        return listObjectsFromFile;
    }
}