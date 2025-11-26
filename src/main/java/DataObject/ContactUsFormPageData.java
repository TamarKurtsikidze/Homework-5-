package DataObject;

import com.github.javafaker.Faker;

public interface ContactUsFormPageData {
    Faker faker = new Faker();
    String
            nameCU = faker.name().fullName(),
            emailCU = faker.internet().emailAddress(),
            subjectCU = faker.howIMetYourMother().catchPhrase(),
            messageCU = faker.gameOfThrones().quote();
}
