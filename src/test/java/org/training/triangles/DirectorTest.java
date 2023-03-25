package org.training.triangles;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.MockingDetails;
import org.mockito.Mockito;
import org.training.triangles.logic.TriangleValidator;
import org.training.triangles.model.Triangle;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class DirectorTest {

    @Test
    public void Director() throws IOException {
        //given
        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.read(anyString())).thenReturn(Arrays.asList("1.1 1.5 1.6", "2.2 2.8 2.3"));
        TriangleValidator triangleValidator = Mockito.mock(TriangleValidator.class);
        TriangleCreator triangleCreator = Mockito.mock(TriangleCreator.class);
        Director director = new Director(reader, triangleValidator, triangleCreator);
        String path = "./src/test/resources/triangles.txt";
        List<Triangle> triangles = director.read(path);

        //when
        boolean result = triangleValidator.isRightTriangle(triangles.get(0));

        //then
        Assert.assertEquals(true, result);
    }
}
