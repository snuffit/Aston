import org.testng.Assert;
import org.testng.annotations.Test;

public class NumFactorialTest {

    @Test
    public void checkNumFactorial() {
        Assert.assertEquals(NumFactorial.getNumFactorial(3), 6, "Факториал посчитан неверно");
    }

    @Test
    public void checkZeroFactorial() {
        Assert.assertEquals(NumFactorial.getNumFactorial(0), 1, "Факториал посчитан неверно");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void checkIncorrectFactorial() {
        NumFactorial.getNumFactorial(-1);
    }
}
