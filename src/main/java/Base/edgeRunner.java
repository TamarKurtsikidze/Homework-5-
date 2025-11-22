package Base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class edgeRunner {
    @BeforeTest
    public static void setup (){

        Configuration.browser = "edge";
        Configuration.browserSize = "1920x1080";
        open("https://www.booking.com/");
        sleep(5000);

    }
    @AfterTest
    public static void tearDown(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }
}
