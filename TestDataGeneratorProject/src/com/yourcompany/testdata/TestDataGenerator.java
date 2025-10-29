package com.yourcompany.testdata;

import com.github.javafaker.Faker;
import org.apache.commons.validator.routines.EmailValidator;
import org.apache.commons.validator.routines.UrlValidator;
import org.apache.commons.validator.routines.RegexValidator;

public class TestDataGenerator {

    private Faker faker;
    private EmailValidator emailValidator;
    private UrlValidator urlValidator;
    private RegexValidator phoneValidator;

    public TestDataGenerator() {
        faker = new Faker();
        emailValidator = EmailValidator.getInstance();
        urlValidator = new UrlValidator(new String[]{"http", "https"});
        phoneValidator = new RegexValidator("^[0-9\\-\\+\\(\\)\\s]+$");
    }

    public String generateName() {
        return faker.name().fullName();
    }

    public String generateEmail() {
        return faker.internet().emailAddress();
    }

    public String generatePhoneNumber() {
        return faker.phoneNumber().phoneNumber();
    }

    public String generateWebsite() {
        return faker.internet().url();
    }

    public boolean isValidEmail(String email) {
        return emailValidator.isValid(email);
    }

    public boolean isValidURL(String url) {
        return urlValidator.isValid(url);
    }

    public boolean isValidPhoneNumber(String phone) {
        return phoneValidator.isValid(phone);
    }
}
