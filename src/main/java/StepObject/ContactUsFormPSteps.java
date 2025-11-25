package StepObject;

import PageObject.ContactUsFormPage;
import io.qameta.allure.Step;

public class ContactUsFormPSteps extends ContactUsFormPage {
    @Step("Close popUpp")
    public ContactUsFormPage closePopUpp() {
        popUpp.click();
        return this;
    }

    @Step("Go to ContactUsForm page")
    public ContactUsFormPage goToContactUs() {
        contactUsBtn.click();
        return this;
    }

    @Step("Fill the name Input")
    public ContactUsFormPage fillName(String text) {
        nameInput.setValue(text);
        return this;
    }

    @Step("Fill the email Input")
    public ContactUsFormPage fillEmail(String emails) {
        emailInput.setValue(emails);
        return this;
    }

    @Step("Fill Subject Input")
    public ContactUsFormPage fillSubject(String sbj) {
        subjectInput.setValue(sbj);
        return this;
    }

    @Step("Fill message Input")
    public ContactUsFormPage fillMessage(String msg) {
        messageInput.setValue(msg);
        return this;
    }

    @Step("Press submit")
    public ContactUsFormPage pressSubmitBtn() {
        submitBtn.click();
        return this;
    }

    @Step("Go to the home page")
    public ContactUsFormPage goToHomePage() {
        homeBtn.click();
        return this;
    }

}
