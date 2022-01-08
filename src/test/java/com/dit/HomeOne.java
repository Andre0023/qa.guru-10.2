package com.dit;

import org.junit.jupiter.api.AfterEach;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;

import java.io.File;

import com.codeborne.selenide.CollectionCondition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.byText;

public class HomeOne {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    @DisplayName("ввод")
    void homeWorkOne() {
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Andrei"); //имя

        $("#lastName").setValue("Ivanov"); //фамилия

        $("#userEmail").setValue("mail@mail.com"); //почта

        $("[for='gender-radio-1']").click(); //выбор пола

        $("#userNumber").setValue("99999999999"); //номер телефона

        $("#dateOfBirthInput").click(); //Дата рождения
        $(".react-datepicker__month-select").selectOption("January");
        $(".react-datepicker__year-select").selectOption("1992");
        $("[aria-label$='January 11th, 1992']").click();




        $("#subjectsInput").setValue("C");
        $(Selectors.byText("Computer Science")).scrollTo().click(); //Subjects

        $("[for='hobbies-checkbox-2']").click(); //хобби

        $("#uploadPicture").uploadFile(new File("src/test/resources/MY.jpg")); //загрузка фото

        $("#currentAddress").setValue("New Sol"); //андрес проживания

        $(Selectors.byText("Select State")).click(); //Всплывающий список с городом
        $(Selectors.byText("Haryana")).click();
        $(Selectors.byText("Select City")).click();
        $(Selectors.byText("Karnal")).click();

        $("#submit").click(); //кнопка отправки


    }



}


