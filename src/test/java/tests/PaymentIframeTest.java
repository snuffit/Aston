package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class PaymentIframeTest extends BaseTest {

    @DataProvider
    public Object[][] formData() {
        return new Object[][]{
                {"Услуги связи", "297777777", "10.00", "example@example.co"}};
    }

    @Test(dataProvider = "formData", testName = "Проверка платежной информации в форме оплаты")
    public void checkPaymentIframeInfo(String type, String num, String cost, String email) {
        mainPage.open()
                .acceptCookie()
                .fillPayFormFields(type, num, cost, email)
                .isOpened();
        softAssert.assertEquals(paymentIframe.getDescriptionCost(), cost);
        softAssert.assertEquals(paymentIframe.getPayButtonText(), cost);
        softAssert.assertEquals(paymentIframe.getDescriptionText(), "375" + num);
        softAssert.assertAll();
    }

    @Test(dataProvider = "formData", testName = "Проверка отображения надписей в полях ввода реквизитов карты")
    public void checkPaymentIframeFields(String type, String num, String cost, String email) {
        mainPage.open()
                .acceptCookie()
                .fillPayFormFields(type, num, cost, email)
                .isOpened();
        softAssert.assertEquals(paymentIframe.getCardNumFieldText(), "Номер карты");
        softAssert.assertEquals(paymentIframe.getExpirationDateFieldText(), "Срок действия");
        softAssert.assertEquals(paymentIframe.getCVCFieldText(), "CVC");
        softAssert.assertEquals(paymentIframe.getCardHolderFieldText(), "Имя и фамилия на карте");
        softAssert.assertAll();
    }

    @Test(dataProvider = "formData", testName = "Проверка отображения логотипов платежных систем")
    public void checkPaySystemLogos(String type, String num, String cost, String email){
        mainPage.open()
                .acceptCookie()
                .fillPayFormFields(type, num, cost, email)
                .isOpened();
        assertTrue(paymentIframe.isPaySystemIconsDisplayed());
    }
}
