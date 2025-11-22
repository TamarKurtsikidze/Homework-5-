package Homework5;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AutoTest {

    @Test
    public void Test(){
        Configuration.browser = "edge";
        Configuration.browserSize = "1920x1080";
        open("https://www.booking.com/");
        sleep(100000);


    }

}
