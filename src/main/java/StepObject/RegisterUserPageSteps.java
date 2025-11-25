package StepObject;

import PageObject.RegisterUserPage;
import io.qameta.allure.Step;

public class RegisterUserPageSteps extends RegisterUserPage {
    @Step("Close popup")
    public RegisterUserPageSteps closePopup() {
        popUp.click();
        return this;
    }

    @Step("Open signup page")
    public RegisterUserPageSteps openSignUpPage() {
        signUpLoginBtn.click();
        return this;
    }

    @Step("Fill fullName Input")
    public RegisterUserPageSteps fillFullName(String fullName) {
        signUpNameInput.setValue(fullName);
        return this;
    }

    @Step("FIll email Input")
    public RegisterUserPageSteps fillEmail(String email) {
        signUpEmailInput.setValue(email);
        return this;
    }

    @Step("Sign up")
    public RegisterUserPageSteps signUp(){
        signUpBtn.click();
        return this;
    }


    @Step("Mark title")
    public RegisterUserPageSteps markTitle() {
        titleRadioBtn.click();
        return this;
    }

    @Step("FIll password Input")
    public RegisterUserPageSteps fillPassword(String pw) {
        passwordInput.setValue(pw);
        return this;
    }

    @Step("Select birthDay")
    public RegisterUserPageSteps selectBirthDay(String birthDay) {
        birthDaySelect.selectOption(birthDay);
        return this;
    }

   @Step("Select birthMonth")
    public RegisterUserPageSteps selectBirthMonth(String birthMonth){
        birthMonthSelect.selectOption(birthMonth);
        return this;
    }
    @Step ("Select birthYear")
    public RegisterUserPageSteps selectBirthYear(String birthYear){
        birthYearSelect.selectOption(birthYear);
        return this;
    }

    @Step("Mark newsletter")
    public RegisterUserPageSteps markNewsLetter() {
        getNewsletterCheckbx.click();
        return this;
    }

    @Step("Fill first name Input")
    public RegisterUserPageSteps fillFirstName(String firstName) {
        firstNameInput.setValue(firstName);
        return this;
    }

    @Step("FIll last name Input")
    public RegisterUserPageSteps fillLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }

    @Step("Fill address input")
    public RegisterUserPageSteps fillAddress(String addrs) {
        addressInput.setValue(addrs);
        return this;
    }

    @Step("Select coutry")
    public RegisterUserPageSteps selectCountry(String cntry) {
        countrySelectBtn.selectOption(cntry);
        return this;
    }

    @Step("Fill state Input")
    public RegisterUserPageSteps fillState(String st) {
        stateInput.setValue(st);
        return this;
    }

    @Step("Fill city Input")
    public RegisterUserPageSteps fillCity(String ct) {
        cityInput.setValue(ct);
        return this;
    }

    @Step("Fill zipcode Input")
    public RegisterUserPageSteps fillZipCode(String zip) {
        zipcodeInput.setValue(zip);
        return this;
    }

    @Step("Fill mobile number Input")
    public RegisterUserPageSteps fillMobileNumb(String numb) {
        mobileNumberInput.setValue(numb);
        return this;
    }

    @Step("CreateAccount")
    public RegisterUserPageSteps createAccount() {
        createAccountBtn.click();
        return this;
    }

    @Step("CreateAcc Message Page")
    public RegisterUserPageSteps createAccMsg(){
        createAccMessage.exists();
        return this;
    }


}