package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class PayPartnersLogoTest extends BaseTest {

    @DataProvider
    public Object[][] logoData() {
        return new Object[][]{
                {"Visa"}, {"Verified By Visa"}, {"MasterCard"}, {"MasterCard Secure Code"}, {"Белкарт"}
        };
    }

    @Test(dataProvider = "logoData", description = "Проверка наличия логотипов платёжных систем")
    public void checkPayPartnerLogo(String logoName) {
        mainPage.open();
        assertTrue(mainPage.getPartnerLogo(logoName).isDisplayed());
    }
}
