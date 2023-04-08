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
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line = bufferedReader.readLine();
            // тут надо переделать так, как говорил Филипп в видео
            while (line != null) {
                listObjectsFromFile.add(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new DataException("Could not find file by that path", e);
            // тут почему-то не удалось добавить метод warn, idea предлагала сделать warning
//            LOGGER.warn(e.getMessage());

        } catch (IOException e) {
            throw new DataException("Incorrect data in the file", e);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return listObjectsFromFile;
    }
}