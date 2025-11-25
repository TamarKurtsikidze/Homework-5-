package PageObject;

import StepObject.ContactUsFormPSteps;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class ContactUsFormPage {
    public SelenideElement
            popUpp = $(by("aria-label", "Consent")),
            contactUsBtn = $(withText(" Contact us")),
            nameInput = $(by("data-qa", "name")),
            emailInput = $(byName("name")),
            subjectInput = $(byName("subject")),
            messageInput = $(byId("message")),
            fileForm = $(byName("upload_file")),
            submitBtn = $(by("data-qa", "submit-button")),
            homeBtn = $(by("style", "display: block;"));

}

