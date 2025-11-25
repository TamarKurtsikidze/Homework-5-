package Homework5AutoTest;

import Base.edgeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import StepObject.ContactUsFormPSteps;

import static DataObject.ContactUsFormPageData.*;

public class ContactUsFormPageTest extends edgeRunner {

    ContactUsFormPSteps contactUsFormPageSteps = new ContactUsFormPSteps();

    @Test
    @Description("Validate ContactUs page ")
    @Severity(SeverityLevel.CRITICAL)
    public void sendingMessageByContactUsFormCase() {
        contactUsFormPageSteps
                .closePopUpp()
                .goToContactUs()
                .fillName(nameCU)
                .fillEmail(emailCU)
                .fillSubject(subjectCU)
                .fillMessage(messageCU)
                .pressSubmitBtn()
                .goToHomePage();

    }
}
