package Base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.open;

public class edgeRunner {

    protected static WebDriver driver;
    protected static WebDriverWait wait;
    @BeforeTest(description = "Configure browser before tests")
    public static void setup (){
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "edge";
        Configuration.timeout = 10000;
        open("https://automationexercise.com/");

        driver = new EdgeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        SelenideLogger.addListener("AllureSelenide",
        new AllureSelenide()
                .screenshots(true)
                .savePageSource(false));


    }
    @AfterTest(description = "Clear all cookies and close web driver after test is done")
    public static void tearDown(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }



}
