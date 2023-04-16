package org.training.triangles;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.training.triangles.data.DataReader;
import org.training.triangles.logic.DataException;
import org.training.triangles.logic.TriangleCreator;
import org.training.triangles.logic.TriangleLineValidator;
import org.training.triangles.model.Point;
import org.training.triangles.model.Triangle;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class DirectorTest {

    @Test
    public void testShouldReadLineWhenLinesAreValid() throws DataException {
        //given
        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.read(anyString())).thenReturn(Arrays.asList("4.0 1.0 8.0 4.0 1.0 7.0", "1.1 4.2 6.8 7.9 6.2 4.5"));
        TriangleLineValidator triangleLineValidator = Mockito.mock(TriangleLineValidator.class);
        when(triangleLineValidator.isValidLine(anyString())).thenReturn(true);
        TriangleCreator triangleCreator = new TriangleCreator();
        Director director = new Director(reader, triangleLineValidator, triangleCreator);
        String path = "./src/test/resources/triangles.txt";

        Point point;
        Triangle triangleOne = new Triangle(new Point(4.0, 1.0), new Point(8.0, 4.0), new Point(1.0, 7.0));
        Triangle triangleTwo = new Triangle(new Point(1.1, 4.2), new Point(6.8, 7.9), new Point(6.2, 4.5));
        List<Triangle> triangles = Arrays.asList(triangleOne,triangleTwo);

        //when
        List<Triangle> result = director.read(path);

        //then
        Assert.assertEquals(triangles, result);
    }
}
