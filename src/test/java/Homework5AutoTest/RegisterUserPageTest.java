package Homework5AutoTest;

import StepObject.RegisterUserPageSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import Base.chromeRunner;

import static DataObject.RegisterUserPageData.*;

public class RegisterUserPageTest extends chromeRunner {

    RegisterUserPageSteps registerUserPageSteps = new RegisterUserPageSteps();


    @Test
    @Description("Create account")
    @Severity(SeverityLevel.CRITICAL)
    public void creatingAccountSuccesCase() {
        registerUserPageSteps
                .openSignUpPage()
                .fillFullName(fullName)
                .fillEmail(email)
                .signUp()
                .markTitle()
                .fillPassword(password)
                .selectBirthDay(day)
                .selectBirthMonth(month)
                .selectBirthYear(year)
                .markNewsLetter()
                .fillFirstName(firstName)
                .fillLastName(lastName)
                .fillAddress(Address)
                .selectCountry(country)
                .fillState(state)
                .fillCity(city)
                .fillZipCode(zipcode)
                .fillMobileNumb(mobileNumber)
                .createAccount()
                .createAccMsg();

        Assert.assertTrue(registerUserPageSteps.createAccMessage.isDisplayed());

    }

}
