package org.training.triangles;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.training.triangles.logic.TriangleLineValidator;
import org.training.triangles.logic.TriangleValidator;
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
        when(reader.read(anyString())).thenReturn(Arrays.asList("1.1 1.5 1.6", "2.2 2.8 2.3"));
        // тут надо подумать, что должен возвращать валидатор
        TriangleLineValidator triangleLineValidator = Mockito.mock(TriangleLineValidator.class);
        when(triangleLineValidator.isValidLine(anyString())).thenReturn(true);
        // тут надо написать конструкцию when для triangleCreator,
        TriangleCreator triangleCreator = Mockito.mock(TriangleCreator.class);
        Director director = new Director(reader, triangleLineValidator, triangleCreator);
        String path = "./src/test/resources/triangles.txt";
        List<Triangle> triangles = director.read(path);

        //when
        String result = triangleLineValidator.isValidLine(triangles.get(0));

        //then
        Assert.assertEquals(true, result);
    }
}
