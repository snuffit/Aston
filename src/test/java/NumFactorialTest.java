import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumFactorialTest {

    @ParameterizedTest
    @CsvSource({
            "3, 6",
            "0, 1"
    })
    public void checkNumFactorial(int a, int result) {
        assertEquals(result, NumFactorial.getNumFactorial(a));
    }

    @Test
    public void checkIncorrectFactorial(){
        assertThrows(IllegalArgumentException.class, () -> NumFactorial.getNumFactorial(-1));
    }
}
