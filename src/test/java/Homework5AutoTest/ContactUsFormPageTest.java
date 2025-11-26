package Homework5AutoTest;

import Base.chromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import StepObject.ContactUsFormPageSteps;

import static DataObject.ContactUsFormPageData.*;

public class ContactUsFormPageTest extends chromeRunner {

    ContactUsFormPageSteps contactUsFormPageSteps = new ContactUsFormPageSteps();

    @Test
    @Description("Validate sending message on Contact Us page without file")
    @Severity(SeverityLevel.CRITICAL)
    public void successfullySendingMessageByContactUsFormWithOutFile() {
        contactUsFormPageSteps
                .goToContactUs()
                .fillName(nameCU)
                .fillEmail(emailCU)
                .fillSubject(subjectCU)
                .fillMessage(messageCU)
                .pressSubmitBtn()
                .SuccessMsg();

        Assert.assertTrue(contactUsFormPageSteps.successMsg.exists());

    }
}
