package org.training.triangles;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DataReaderTest {

    @Test
    public void testTriangleCreatorWhenOneString() throws DataException {
        //given
        DataReader dataReader = new DataReader();

        //when
        List<String> strings = new ArrayList<>();
        strings.add("4.0 1.0 8.0 4.0 1.0 7.0");
        List<String> result = dataReader.read("./src/test/resources/triangles.txt");

        //then
        Assert.assertEquals(strings, result);
    }
    @Test
    public void testTriangleCreatorWhenSomeString() throws DataException {
        //given
        DataReader dataReader = new DataReader();

        //when
        List<String> strings = new ArrayList<>();
        strings.add("4.0 1.0 8.0 4.0 1.0 7.0");
        strings.add("343434");
        strings.add("hjkhjkjh");
        List<String> result = dataReader.read("./src/test/resources/triangles.txt");

        //then
        Assert.assertEquals(strings, result);
    }
}
