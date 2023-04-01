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
        strings.add("1.1 4.2 6.8 7.9 6.2 4.5");
        strings.add("2.1 4.3 1.2 3.4 6.2 2.3");
        strings.add("fsadf");
        strings.add("*^*()^()(*&)&");
        List<String> result = dataReader.read("./src/test/resources/triangles.txt");

        //then
        Assert.assertEquals(strings, result);
    }
}
