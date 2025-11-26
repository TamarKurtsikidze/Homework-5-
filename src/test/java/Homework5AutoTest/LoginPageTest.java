package Homework5AutoTest;

import Base.chromeRunner;
import StepObject.LoginPageSteps;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LoginPageData.*;

public class LoginPageTest extends chromeRunner {

    LoginPageSteps loginPageSteps = new LoginPageSteps();

    @Test(priority = 1)
    @Description("Login with incorrect password")
    @Severity(SeverityLevel.BLOCKER)
    public void loginWithIncorrectPassword() {
        loginPageSteps
                .openLoginPage()
                .fillEmailInput(correctEmail)
                .fillPasswordInput(IncorrectPassword)
                .pressLoginBtn()
                .errorMessage();

        Assert.assertEquals("Your email or password is incorrect!", "Your email or password is incorrect!", "Correct message is displayed");
    }

    @Test(priority = 2)
    @Description("Login with correct password")
    @Severity(SeverityLevel.CRITICAL)
    public void loginWithCorrectPassword() {
        loginPageSteps
                .openLoginPage()
                .fillEmailInput(correctEmail)
                .fillPasswordInput(correctPassword)
                .pressLoginBtn()
                .logOutBtnVisible();

        Assert.assertTrue(loginPageSteps.LogOutBtn.is(Condition.visible));

    }

}
