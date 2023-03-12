import org.junit.Assert;
import org.junit.Test;
import org.training.triangles.logic.Calculator;

public class CalculatorTest {
    @Test
    public void testIsTriangle(){
        //given
        /*
        Autopark autopark = new Autopark();
        BusCar bus = new BusCar("Beautiful", 1.0, 4, Color.RED, BusCarType.BIG);
        autopark.add(bus);
        CarCalculator calculator = new CarCalculator(); */
        Calculator calculator = new Calculator();

        //when
        boolean result = calculator.isTriangle();

        //then
        Assert.assertEquals(true, result);
    }
    @Test
    public void calculateArea(){
        //given
        /*
        Autopark autopark = new Autopark();
        BusCar bus = new BusCar("Beautiful", 1.0, 4, Color.RED, BusCarType.BIG);
        autopark.add(bus);
        CarCalculator calculator = new CarCalculator(); */
        Calculator calculator = new Calculator();

        //when
        double result = calculator.calculateArea();

        //then
        Assert.assertEquals(1.1, result, 0.01);
    }
    @Test
    public void calculatePerimeter(){
        //given
        /*
        Autopark autopark = new Autopark();
        BusCar bus = new BusCar("Beautiful", 1.0, 4, Color.RED, BusCarType.BIG);
        autopark.add(bus);
        CarCalculator calculator = new CarCalculator(); */
        Calculator calculator = new Calculator();

        //when
        double result = calculator.calculatePerimeter();

        //then
        Assert.assertEquals(1.1, result, 0.01);
    }
}

