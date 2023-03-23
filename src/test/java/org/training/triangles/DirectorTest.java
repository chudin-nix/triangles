package org.training.triangles;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
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
        when(reader.read(anyString())).thenReturn(Arrays.asList("1 1 1", "2 2 2"));
        TriangleValidator triangleValidator = Mockito.mock(TriangleValidator.class);
        TriangleCreator creator = Mockito.mock(TriangleCreator.class);
        Director director = new Director(reader, triangleValidator, creator);
        String path = "./data/triangles.txt";
        List<Triangle> triangles = director.read(path);

        //when
        boolean result = triangleValidator.isRightTriangle(triangles.get(0));

        //then
        Assert.assertEquals(true, result);
    }
}
