import org.junit.Assert;
import org.junit.Test;
import org.training.triangles.logic.TriangleValidator;

public class TriangleValidatorTest {
    @Test
    public void testIsRightTriangle(){
        //given
        /*
        Autopark autopark = new Autopark();
        BusCar bus = new BusCar("Beautiful", 1.0, 4, Color.RED, BusCarType.BIG);
        autopark.add(bus);
        CarCalculator calculator = new CarCalculator(); */
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isRightTriangle();

        //then
        Assert.assertEquals(true, result);
    }
    @Test
    public void testIsIsoscelesTriangle(){
        //given
        /*
        Autopark autopark = new Autopark();
        BusCar bus = new BusCar("Beautiful", 1.0, 4, Color.RED, BusCarType.BIG);
        autopark.add(bus);
        CarCalculator calculator = new CarCalculator(); */
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isIsoscelesTriangle();

        //then
        Assert.assertEquals(true, result);
    }
    @Test
    public void testIsEquilateralTriangle(){
        //given
        /*
        Autopark autopark = new Autopark();
        BusCar bus = new BusCar("Beautiful", 1.0, 4, Color.RED, BusCarType.BIG);
        autopark.add(bus);
        CarCalculator calculator = new CarCalculator(); */
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isEquilateralTriangle();

        //then
        Assert.assertEquals(true, result);
    }
    @Test
    public void testIsAcuteTriangle(){
        //given
        /*
        Autopark autopark = new Autopark();
        BusCar bus = new BusCar("Beautiful", 1.0, 4, Color.RED, BusCarType.BIG);
        autopark.add(bus);
        CarCalculator calculator = new CarCalculator(); */
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isAcuteTriangle();

        //then
        Assert.assertEquals(true, result);
    }
    @Test
    public void testIsObtuseTriangle(){
        //given
        /*
        Autopark autopark = new Autopark();
        BusCar bus = new BusCar("Beautiful", 1.0, 4, Color.RED, BusCarType.BIG);
        autopark.add(bus);
        CarCalculator calculator = new CarCalculator(); */
        TriangleValidator triangleValidator = new TriangleValidator();

        //when
        boolean result = triangleValidator.isObtuseTriangle();

        //then
        Assert.assertEquals(true, result);
    }
}