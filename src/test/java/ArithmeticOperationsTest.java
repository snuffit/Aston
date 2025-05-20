import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticOperationsTest {

    @Test
    public void checkSum() {
        Assert.assertEquals(ArithmeticOperations.sum(4, 5), 9,
                "Сложение произведено неверно");
    }

    @Test
    public void checkSubtraction() {
        Assert.assertEquals(ArithmeticOperations.subtraction(4, 5), -1,
                "Вычитание произведено неверно");
    }

    @Test
    public void checkMultiplication() {
        Assert.assertEquals(ArithmeticOperations.multiplication(4, 5), 20,
                "Умножение произведено неверно");
    }

    @Test
    public void checkDivide() {
        Assert.assertEquals(ArithmeticOperations.divide(8, 2), 4,
                "Деление произведено неверно");
    }
}
