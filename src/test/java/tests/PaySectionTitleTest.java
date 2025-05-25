package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PaySectionTitleTest extends BaseTest {

    @Test(description = "Проверка названия указанного блока")
    public void checkPaySectionTitle() {
        mainPage.open();
        assertEquals(mainPage.getPaySectionTitle(), "Онлайн пополнение\nбез комиссии",
                "Неверное название блока.");
    }
}
