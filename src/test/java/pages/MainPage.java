package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage extends BasePage {

    private final String
            PAY_PARTNERS_BASE_PATH = "//*[@class='pay__wrapper']",
            PAY_PARTNERS_LOGOS = PAY_PARTNERS_BASE_PATH + "//*[@alt='%s']",
            SELECT = "//*[@id='pay-section']//p[text()='%s']";

    private final By COOKIE_AGREE_BUTTON = By.xpath("//*[@id='cookie-agree']"),
            SELECT_BUTTON = By.xpath("//*[@class='select__header']"),
            CONTINUE_BUTTON = By.xpath("//*[@class='pay-form opened']//button"),
            IFRAME_ALLOW_PAYMENT_REQUEST = By.xpath("//iframe[@class='bepaid-iframe']"),
            INPUT_FIELDS = By.xpath("//form[@class='pay-form opened']//input"),
            TITLE = By.xpath(PAY_PARTNERS_BASE_PATH + "//h2"),
            MORE_ABOUT_SERVICE_LINK = By.xpath(PAY_PARTNERS_BASE_PATH + "//a");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage open() {
        driver.get(BASE_URL);
        return this;
    }

    public MainPage acceptCookie() {
        try {
            driver.findElement(COOKIE_AGREE_BUTTON).click();
        } catch (ElementNotInteractableException e) {
        }
        return this;
    }

    public PaymentIframe fillPayFormFields(String type, String num, String cost, String email) {
        selectType(type);
        fillFormFields(num, cost, email);
        clickContinueButton();
        return new PaymentIframe(driver);
    }

    public MainPage selectType(String type) {
        driver.findElement(SELECT_BUTTON).click();
        driver.findElement(By.xpath(String.format(SELECT, type))).click();
        return this;
    }

    public PaymentIframe clickContinueButton() {
        driver.findElement(CONTINUE_BUTTON).click();
        driver.switchTo().frame(driver.findElement(IFRAME_ALLOW_PAYMENT_REQUEST));
        return new PaymentIframe(driver);
    }

    public WebElement getFormField(int numOfField) {
        List<WebElement> elements = driver.findElements(INPUT_FIELDS);
        return elements.get(numOfField - 1);
    }

    public MainPage fillFormFields(String num, String cost, String email) {
        List<WebElement> elements = driver.findElements(INPUT_FIELDS);
        elements.get(0).sendKeys(num);
        elements.get(1).sendKeys(cost);
        elements.get(2).sendKeys(email);
        return this;
    }

    public void clickMoreAboutServiceLink() {
        driver.findElement(MORE_ABOUT_SERVICE_LINK).click();
    }

    public WebElement getPartnerLogo(String logoName) {
        return driver.findElement(By.xpath(String.format(PAY_PARTNERS_LOGOS, logoName)));
    }

    public String getPaySectionTitle() {
        return driver.findElement(TITLE).getText();
    }
}
