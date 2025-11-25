package DataObject;

import com.github.javafaker.Faker;

public interface RegisterUserPageData {
    Faker faker = new Faker();
    String
            fullName = faker.name().fullName(),
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            password = faker.internet().password(),
            day = String.valueOf(faker.number().numberBetween(1, 31)),
            month = "February",
            year = String.valueOf(faker.number().numberBetween(1970, 2005)),
            company = faker.company().name(),
            Address = faker.address().fullAddress(),
            country = "United States",
            state = faker.address().state(),
            city = faker.address().city(),
            zipcode = faker.address().zipCode(),
            mobileNumber = faker.phoneNumber().phoneNumber();

}
