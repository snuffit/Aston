import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumComparisonTest {

    @ParameterizedTest
    @CsvSource({
            "1, 5, 5",
            "2, 1, 2",
            "2, 2, 2"
    })
    public void checkNumComparison(int a, int b, int result) {
        assertEquals(result, NumComparison.comparison(a, b));
    }
}
