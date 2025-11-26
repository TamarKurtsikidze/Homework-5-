package Base;

import com.codeborne.selenide.*;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.*;

public class chromeRunner {

    @BeforeTest(description = "Configure browser before tests")
    public static void setup() {

        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide()
                        .screenshots(true)
                        .savePageSource(false));
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;

    }

    @BeforeMethod
    public static void url() {

        open("https://automationexercise.com/");
        SelenideElement popUp = $(by("aria-label", "Consent"));
        popUp.click();
    }

    @AfterMethod
    public void cleanAfterEachTest() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }

    @AfterTest
    public void tearDown() {
        closeWebDriver();
    }
}
