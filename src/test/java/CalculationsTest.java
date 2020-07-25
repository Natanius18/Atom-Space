import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculationsTest {
    int x;
    int y;

    @Before
    public void SetUp(){
        x = 10;
        y = 5;
    }

    @Test
    public void testMult(){
        int result = 50;
        Assert.assertEquals("10*5=50", result, Calculations.multiplication(x, y));
    }

    @Test
    public void testDiv(){
        int result = 2;
        Assert.assertEquals("10/2=5", result, Calculations.division(x, y));
    }

    @Test
    public void testAdd(){
        int result = 15;
        Assert.assertEquals("10+*5=15", result, Calculations.addition(x, y));
    }
}