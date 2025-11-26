package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
            SignLoginBtn = $(by("href", "/login")),
            LoginEmail = $(byName("email")),
            LoginPass = $(byName("password")),
            LoginBtn = $(by("data-qa", "login-button")),
            errorMsg = $(byText("Your email or password is incorrect!")),
            LogOutBtn = $(by("href", "/logout"));

}
