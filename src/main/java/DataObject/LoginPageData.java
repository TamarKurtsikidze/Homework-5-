package DataObject;

import com.github.javafaker.Faker;

public interface LoginPageData {
    Faker faker = new Faker();
    String
            IncorrectEmail = faker.internet().emailAddress(),
            IncorrectPassword = faker.internet().password(),
            correctEmail = "tako.k@gmail.com",
            correctPassword = "Tamar.k1";

}
