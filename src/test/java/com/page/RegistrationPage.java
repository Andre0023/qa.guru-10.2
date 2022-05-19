package com.page;

import com.codeborne.selenide.SelenideElement;
import com.page.components.CalendarComponent;

import java.nio.channels.SelectableChannel;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {


    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            resultsTable =  $(".modal-content");

    public CalendarComponent calendarComponent = new CalendarComponent();


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
                text(key), text(value),//Email
                text(key), text(value),//Gender
                text(key), text(value),//Mobile
                text(key), text(value),//Date of Birth
                text(key), text(value),//Subjects
                text(key), text(value),//Hobbies
                text(key), text(value),//Picture
                text(key), text(value),//Address
                text(key), text(value)//State and City
        );

        return this;
    }
}
