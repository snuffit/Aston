import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationsTest {

    @Test
    public void checkSum() {
        assertEquals(9, ArithmeticOperations.sum(4, 5));
    }

    @Test
    public void checkSubtraction() {
        assertEquals(4, ArithmeticOperations.subtraction(9, 5));
    }

    @Test
    public void checkMultiplication() {
        assertEquals(10, ArithmeticOperations.multiplication(2, 5));
    }

    @Test
    public void checkDivide() {
        assertEquals(2, ArithmeticOperations.divide(8, 4));
    }
}
