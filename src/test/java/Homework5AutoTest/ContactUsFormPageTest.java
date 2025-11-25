package Homework5AutoTest;

import Base.edgeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import StepObject.ContactUsFormPageSteps;

import static DataObject.ContactUsFormPageData.*;

public class ContactUsFormPageTest extends edgeRunner {

    ContactUsFormPageSteps contactUsFormPageSteps = new ContactUsFormPageSteps();

    @Test
    @Description("Validate sending message on Contact Us page")
    @Severity(SeverityLevel.CRITICAL)
    public void successfullySendingMessageByContactUsFormCase() {
        contactUsFormPageSteps
                .closePopUpp()
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
