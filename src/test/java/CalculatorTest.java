import org.junit.Assert;
import org.junit.Test;
import org.training.triangles.logic.Calculator;

public class CalculatorTest {
    @Test
    public void testIsTriangle(){
        //given
        Calculator calculator = new Calculator();

        //when
        boolean result = calculator.isTriangle();

        //then
        Assert.assertEquals(true, result);
    }
    @Test
    public void calculateArea(){
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.calculateArea();

        //then
        Assert.assertEquals(1.1, result, 0.01);
    }
    @Test
    public void calculatePerimeter(){
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.calculatePerimeter();

        //then
        Assert.assertEquals(1.1, result, 0.01);
    }
    @Test
    public void calculateDistanceBetweenPoints(){
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.calculateLengthSidesTriangle();

        //then
        Assert.assertEquals(1.4, result, 0.01);
    }

}

