package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import pages.PaymentIframe;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    MainPage mainPage;
    PaymentIframe paymentIframe;
    SoftAssert softAssert;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        softAssert = new SoftAssert();
        mainPage = new MainPage(driver);
        paymentIframe = new PaymentIframe(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
