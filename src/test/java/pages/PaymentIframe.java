package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PaymentIframe extends BasePage {
    private final String FIELD_BASE_PATH = "//input[@formcontrolname='%s']/following-sibling::label";

    private final By PAY_DESCRIPTION_TEXT = By.xpath("//*[@class='pay-description__text']//span"),
            PAY_DESCRIPTION_COST = By.xpath("//*[@class='pay-description__cost']//span"),
            PAY_BUTTON = By.xpath("//*[@class='card-page__card']//button"),
            CARD_NUMBER = By.xpath(String.format(FIELD_BASE_PATH, "creditCard")),
            EXPIRATION_DATE = By.xpath(String.format(FIELD_BASE_PATH, "expirationDate")),
            CVC = By.xpath(String.format(FIELD_BASE_PATH, "cvc")),
            CARD_HOLDER = By.xpath(String.format(FIELD_BASE_PATH, "holder")),
            PAY_SYSTEM_ICONS = By.xpath("//*[contains(@class, 'cards-brands__container')]");

    public PaymentIframe(WebDriver driver) {
        super(driver);
    }

    public PaymentIframe isOpened() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(PAY_DESCRIPTION_COST)));
        return this;
    }

    public String getDescriptionText() {
        return driver.findElement(PAY_DESCRIPTION_TEXT).getText().replaceAll("[^0-9]", "");
    }

    public String getDescriptionCost() {
        return driver.findElement(PAY_DESCRIPTION_COST).getText().replaceAll("[^0-9.]", "");
    }

    public String getPayButtonText() {
        return driver.findElement(PAY_BUTTON).getText().replaceAll("[^0-9.]", "");
    }

    public String getCardNumFieldText() {
        return driver.findElement(CARD_NUMBER).getText();
    }

    public String getExpirationDateFieldText() {
        return driver.findElement(EXPIRATION_DATE).getText();
    }

    public String getCVCFieldText() {
        return driver.findElement(CVC).getText();
    }

    public String getCardHolderFieldText() {
        return driver.findElement(CARD_HOLDER).getText();
    }

    public boolean isPaySystemIconsDisplayed() {
        return driver.findElement(PAY_SYSTEM_ICONS).isDisplayed();
    }
}
