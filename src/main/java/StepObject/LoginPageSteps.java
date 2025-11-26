package StepObject;

import PageObject.LoginPage;
import io.qameta.allure.Step;

public class LoginPageSteps extends LoginPage {

    @Step("Open login page")
    public LoginPageSteps openLoginPage() {
        SignLoginBtn.click();
        return this;
    }

    @Step("FIll Email Input")
    public LoginPageSteps fillEmailInput(String mail) {
        LoginEmail.setValue(mail);
        return this;
    }

    @Step("Fill password Input")
    public LoginPageSteps fillPasswordInput(String pas) {
        LoginPass.setValue(pas);
        return this;
    }

    @Step("Press Login")
    public LoginPageSteps pressLoginBtn() {
        LoginBtn.click();
        return this;
    }

    @Step("Error Message")
    public LoginPageSteps errorMessage() {
        errorMsg.isDisplayed();
        return this;

    }

    @Step("Log Out Buttons is visible")
    public LoginPageSteps logOutBtnVisible() {
        LogOutBtn.exists();
        return this;
    }


}
