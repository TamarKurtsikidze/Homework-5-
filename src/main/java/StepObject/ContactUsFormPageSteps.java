package StepObject;

import PageObject.ContactUsFormPage;
import io.qameta.allure.Step;

public class ContactUsFormPageSteps extends ContactUsFormPage {

    @Step("Go to ContactUsForm page")
    public ContactUsFormPageSteps goToContactUs() {
        contactUsBtn.click();
        return this;
    }

    @Step("Fill the name Input")
    public ContactUsFormPageSteps fillName(String text) {
        nameInput.setValue(text);
        return this;
    }

    @Step("Fill the email Input")
    public ContactUsFormPageSteps fillEmail(String emails) {
        emailInput.setValue(emails);
        return this;
    }

    @Step("Fill Subject Input")
    public ContactUsFormPageSteps fillSubject(String sbj) {
        subjectInput.setValue(sbj);
        return this;
    }

    @Step("Fill message Input")
    public ContactUsFormPageSteps fillMessage(String msg) {
        messageInput.setValue(msg);
        return this;
    }

    @Step("Press submit")
    public ContactUsFormPageSteps pressSubmitBtn() {
        submitBtn.click();
        return this;
    }

    @Step("Success Message")
    public ContactUsFormPageSteps SuccessMsg() {
        successMsg.isDisplayed();
        return this;
    }

}
