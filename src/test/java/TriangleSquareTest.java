import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleSquareTest {

    @Test
    public void checkTriangleSquareWithZeroSide() {
        assertThrows(IllegalArgumentException.class, () -> TriangleSquare.getTriangleSquare(3, 5, 0));
    }

    @Test
    public void checkTriangleSquareWithIncorrectSide() {
        assertThrows(IllegalArgumentException.class, () -> TriangleSquare.getTriangleSquare(3, 4, 7));
    }

    @Test
    public void checkTriangleSquare() {
        assertEquals(6, TriangleSquare.getTriangleSquare(3, 4, 5));
    }
}
