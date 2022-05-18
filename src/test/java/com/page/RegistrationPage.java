package com.page;

import com.codeborne.selenide.SelenideElement;

import java.nio.channels.SelectableChannel;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {


    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            resultsTable =  $(".modal-content");


    public RegistrationPage openPage(){
        open("https://demoqa.com/automation-practice-form");

        return this;
    }

    public RegistrationPage  typeFirstName(String value){
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage  typeLastName(String value){
        lastNameInput.setValue(value);

        return this;

    }

    public RegistrationPage  cherkResultValue(String key, String value){
        resultsTable.shouldHave(
                text(key), text(value),
                text("Student Email"), text("mail@mail.com"),
                text("Gender"), text("Male"),
                text("Mobile"), text("9999999999"),
                text("Date of Birth"), text("11 January,1992"),
                text("Subjects"), text("Computer Science"),
                text("Hobbies"), text("Reading"),
                text("Picture"), text("MY.jpg"),
                text("Address"), text("New Sol"),
                text("State and City"), text("Haryana Karnal")
        );

        return this;
    }
}
