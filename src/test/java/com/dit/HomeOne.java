package com.dit;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class HomeOne {
        @BeforeAll
        static void beforeAll(){
            Configuration.browserSize = "1920x1080";
        }
        @Test
        void hOne() {
            open("https://demoqa.com/automation-practice-form");

            $("#firstName").setValue("Andrei");
            //имя
            $("#lastName").setValue("Ivanov");
            //фамилия
            $("#userEmail").setValue("mail@mail.com");
            //почта
            $("[for='gender-radio-1']").click();
            //выбор пола
            $("#userNumber").setValue("99999999999");
            //номер телефона
            $("#dateOfBirthInput").setValue("16 Dec 1999");
            $("[for='gender-radio-1']").click();
            //Дата рождения
            $("#subjectsInput").setValue("C");
            $(Selectors.byText("Computer Science")).scrollTo().click();
            //Subjects
            $("[for='hobbies-checkbox-2']").click();
            //хобби
            $("input#uploadPicture").uploadFile(new File("C:\\Users\\64an\\Pictures\\MY.jpg"));
            //загрузка фото

            $("#currentAddress").setValue("New Sol");
            //андрес проживания

            //$("#lastName").setValue();
            //Всплывающий список с городом

            $("#submit").click();
            //кнопка отправки
        }
        @Test
        void prow() {
            $("example-modal-sizes-title-lg").shouldBe(Condition.visible);
           // $("").shouldHave(text());//имя
           // $("").shouldHave(text());//фамилия
           // $("").shouldHave(text());//почта
           // $("").shouldHave(text());//выбор пола
          //  $("").shouldHave(text());//номер телефона
          //  $("").shouldHave(text());//Дата рождения
          //  $("").shouldHave(text());//хобби
          //  $("").shouldHave(text());//загрузка фото
          //  $("").shouldHave(text());//андрес проживания
           // $("").shouldHave(text());//Всплывающий список с городом




        }



    }

