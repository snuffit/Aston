package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {

    private final String URL = "https://www.mts.by/",
            COOKIE_AGREE_BUTTON = "//*[@id='cookie-agree']",
            PAY_PARTNERS_BASE_PATH = "//*[@class='pay__wrapper']",
            TITLE = PAY_PARTNERS_BASE_PATH + "//h2",
            PAY_PARTNERS_LOGOS = PAY_PARTNERS_BASE_PATH + "//*[@alt='%s']",
            MORE_ABOUT_SERVICE_LINK = PAY_PARTNERS_BASE_PATH + "//a",
            INPUT_NUMBER = "//input[@id='connection-phone']",
            INPUT_SUM = "//input[@id='connection-sum']",
            CONTINUE_BUTTON = "//*[@class='pay-form opened']//button",
            IFRAME_ALLOW_PAYMENT_REQUEST = "//iframe[@class='bepaid-iframe']",
            IFRAME_PAY_DESCRIPTION_TEXT = "//*[@class='pay-description__text']//span";

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
        acceptCookie();
    }

    private void acceptCookie() {
        try {
            driver.findElement(By.xpath(COOKIE_AGREE_BUTTON)).click();
        } catch (ElementNotInteractableException e) {
        }
    }

    public void fillPayFormFields(String phone, String sum) {
        driver.findElement(By.xpath(INPUT_NUMBER)).sendKeys(phone);
        driver.findElement(By.xpath(INPUT_SUM)).sendKeys(sum);
        driver.findElement(By.xpath(CONTINUE_BUTTON)).click();
    }

    public String getIframeDescriptionText() {
        driver.switchTo().frame(driver.findElement(By.xpath(IFRAME_ALLOW_PAYMENT_REQUEST)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IFRAME_PAY_DESCRIPTION_TEXT)));
        String text = driver.findElement(By.xpath(IFRAME_PAY_DESCRIPTION_TEXT)).getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public void clickMoreAboutServiceLink() {
        driver.findElement(By.xpath(MORE_ABOUT_SERVICE_LINK)).click();
    }

    public WebElement getPartnerLogo(String logoName) {
        return driver.findElement(By.xpath(String.format(PAY_PARTNERS_LOGOS, logoName)));
    }

    public String getPaySectionTitle() {
        return driver.findElement(By.xpath(TITLE)).getText();
    }
}
