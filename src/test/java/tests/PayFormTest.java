package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PayFormTest extends BaseTest {

    @DataProvider
    public Object[][] formData() {
        return new Object[][]{
                {"Услуги связи", "297777777", "10", "example@example.co"}};
    }

    @Test(dataProvider = "formData", testName = "Заполнение полей и проверка работы кнопки «Продолжить»")
    public void checkPayForm(String type, String num, String cost, String email) {
        mainPage.open()
                .acceptCookie()
                .fillPayFormFields(type, num, cost, email)
                .isOpened();
        assertEquals(paymentIframe.getDescriptionText(), "375" + num);
    }
}
