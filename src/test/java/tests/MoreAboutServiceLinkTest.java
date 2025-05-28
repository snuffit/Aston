package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MoreAboutServiceLinkTest extends BaseTest {

    @Test(testName = "Проверка работы ссылки «Подробнее о сервисе»")
    public void checkLink() {
        mainPage.open()
                .acceptCookie()
                .clickMoreAboutServiceLink();
        assertEquals(driver.getCurrentUrl(),
                "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
    }
}
