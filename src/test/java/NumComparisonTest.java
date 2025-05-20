import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NumComparisonTest {

    @DataProvider(name = "Значения для проверки метода по сравнению чисел")
    public Object[][] numCompData() {
        return new Object[][]{
                {13, 4, 13},
                {4, 12, 12},
                {4, 4, 4}
        };
    }

    @Test(dataProvider = "Значения для проверки метода по сравнению чисел")
    public void checkNumComparison(int firstNum, int secondNum, int result) {
        Assert.assertEquals(NumComparison.comparison(firstNum, secondNum), result, "Неверный результат");
    }
}
