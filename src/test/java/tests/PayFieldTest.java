package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PayFieldTest extends BaseTest {

    @DataProvider
    public Object[][] fieldsData() {
        return new Object[][]{
                {"Услуги связи", "Номер телефона", "Сумма", "E-mail для отправки чека"},
                {"Домашний интернет", "Номер абонента", "Сумма", "E-mail для отправки чека"},
                {"Рассрочка", "Номер счета на 44", "Сумма", "E-mail для отправки чека"},
                {"Задолженность", "Номер счета на 2073", "Сумма", "E-mail для отправки чека"}
        };
    }

    @Test(dataProvider = "fieldsData", testName = "Проверка отображения надписей в полях ввода оформления услуги")
    public void checkField(String type, String firstField, String secondField, String thirdField) {
        mainPage.open()
                .acceptCookie()
                .selectType(type);
        softAssert.assertEquals(mainPage.getFormField(1).getAttribute("placeholder"), firstField);
        softAssert.assertEquals(mainPage.getFormField(2).getAttribute("placeholder"), secondField);
        softAssert.assertEquals(mainPage.getFormField(3).getAttribute("placeholder"), thirdField);
        softAssert.assertAll();
    }
}
