package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PayFormTest extends BaseTest {

    @Test(description = "Заполнение полей и проверка работы кнопки «Продолжить»")
    public void checkPayForm() {
        mainPage.open();
        mainPage.fillPayFormFields("297777777", "10");
        assertEquals(mainPage.getIframeDescriptionText(), "Оплата: Услуги связи Номер:375297777777");
    }
}
