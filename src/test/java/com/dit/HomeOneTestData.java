package com.dit;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.dit.TestData.userEmail;

public class HomeOneTestData extends testBase{
    String firstName = "Andrei",
            lastName = "Ivanov";


    @Test
    @DisplayName("ввод")
    void homeWorkOne() {



        $("#firstName").setValue(firstName); //имя

        $("#lastName").setValue(lastName); //фамилия

        $("#userEmail").setValue(userEmail); //почта

        $("[for='gender-radio-1']").click(); //выбор пола

        $("#userNumber").setValue("99999999999"); //номер телефона

        $("#dateOfBirthInput").click(); //Дата рождения
        $(".react-datepicker__month-select").selectOption("January");
        $(".react-datepicker__year-select").selectOption("1992");
        $("[aria-label$='January 11th, 1992']").click();




        $("#subjectsInput").setValue("Com");
        $(Selectors.byText("Computer Science")).scrollTo().click(); //Subjects

        $("[for='hobbies-checkbox-2']").click(); //хобби

        $("#uploadPicture").uploadFile(new File("src/test/resources/MY.jpg")); //загрузка фото

        $("#currentAddress").setValue("New Sol"); //андрес проживания

        $(Selectors.byText("Select State")).click(); //Всплывающий список с городом
        $(Selectors.byText("Haryana")).click();
        $(Selectors.byText("Select City")).click();
        $(Selectors.byText("Karnal")).click();

        $("#submit").click(); //кнопка отправки

        $(".modal-content").shouldHave(
                text("Student Name"), text(firstName + " " + lastName),
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


    }



}


