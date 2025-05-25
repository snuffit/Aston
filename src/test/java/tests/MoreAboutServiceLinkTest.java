package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoreAboutServiceLinkTest extends BaseTest {

    @Test(description = "Проверка работы ссылки «Подробнее о сервисе»")
    public void checkLink() {
        mainPage.open();
        mainPage.clickMoreAboutServiceLink();
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
    }
}
