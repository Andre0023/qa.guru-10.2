package com.dit;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.github.javafaker.Faker;
import com.page.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomeOnePegeObjects extends testBase {

    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();

    @Test
    public void fillForm() {

        String
                firstName = faker.name().firstName(),
                lastName = faker.name().lastName(),
                userEmail = faker.internet().emailAddress(),
                gender = "Male",
                userNumber = faker.phoneNumber().subscriberNumber(10),
                subject = "Physics",
                hobbySport = "Sports",
                uploadPicture = "MY.jpg",
                currentAddress = faker.address().fullAddress(),
                state = "NCR",
                city = "Noida";

        registrationPage
                .openPage()
                .typeFirstName(firstName)
                .typeLastName(lastName)
                .typeEmail(userEmail)
                .typeGender(gender)
                .typeUserNumber(userNumber)
                .calendar.setDate("11", "May", "1992");
        registrationPage
                .typeSubject(subject)
                .typeHobbySport(hobbySport)
                .uploadPicture(uploadPicture)
                .typeCurrentAddress(currentAddress)
                .typeState(state)
                .typeCity(city)
                .clickSubmit()
                // проверки
                .checkResultsValue(firstName + " " + lastName)
                .checkResultsValue(userEmail)
                .checkResultsValue(gender)
                .checkResultsValue(userNumber)
                .checkResultsValue("11 May,1992")
                .checkResultsValue(subject)
                .checkResultsValue(hobbySport)
                .checkResultsValue(uploadPicture)
                .checkResultsValue(currentAddress)
                .checkResultsValue(state)
                .checkResultsValue(city);
    }
}
