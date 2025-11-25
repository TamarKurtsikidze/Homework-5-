package PageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class ContactUsFormPage {
    public SelenideElement
            popUpp = $(by("aria-label", "Consent")),
            contactUsBtn = $(by("href","/contact_us")),
            nameInput = $(by("data-qa", "name")),
            emailInput = $(byName("email")),
            subjectInput = $(byName("subject")),
            messageInput = $(byId("message")),
            submitBtn = $(by("data-qa", "submit-button")),
            successMsg = $(by("style","display: block;"));

}

