import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleSquareTest {

    @Test
    public void checkTriangleSquare() {
        Assert.assertEquals(TriangleSquare.getTriangleSquare(3, 4, 5), 6,
                "Площадь треугольника посчитана неверно");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void checkZeroSideTriangleSquare() {
        TriangleSquare.getTriangleSquare(3, 4, 0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void checkIncorrectSideTriangleSquare() {
        TriangleSquare.getTriangleSquare(3, 4, 7);
    }
}
