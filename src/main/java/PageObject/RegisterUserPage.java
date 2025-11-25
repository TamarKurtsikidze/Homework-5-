package PageObject;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


public class RegisterUserPage {
    public SelenideElement
            popUp = $(by("aria-label", "Consent")),
            signUpLoginBtn = $(byXpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]")),
            signUpNameInput = $(by("data-qa", "signup-name")),
            signUpEmailInput = $(by("data-qa", "signup-email")),
            signUpBtn = $(by("data-qa", "signup-button")),
            titleRadioBtn = $(byName("title")),
            passwordInput = $(byId("password")),
            getNewsletterCheckbx = $(byName("newsletter")),
            birthDaySelect = $(byId("days")),
            birthMonthSelect = $(byId("months")),
            birthYearSelect = $(byId("years")),
            firstNameInput = $(byName("first_name")),
            lastNameInput = $(byName("last_name")),
            addressInput = $(byId("address1")),
            countrySelectBtn = $(byName("country")),
            stateInput = $(byName("state")),
            cityInput = $(byName("city")),
            zipcodeInput = $(byName("zipcode")),
            mobileNumberInput = $(byName("mobile_number")),
            createAccountBtn = $(by("data-qa", "create-account")),
            createAccMessage = $(by("data-qa", "account-created"));


}


