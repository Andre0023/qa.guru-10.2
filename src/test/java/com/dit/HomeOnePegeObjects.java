package com.dit;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.page.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomeOnePegeObjects {
    RegistrationPage registrationPage = new RegistrationPage();


    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }


    @DisplayName("ввод")
    @Test
        void homeWorkOneDs() {
            registrationPage.openPage()
            .typeFirstName("Andrei") //имя
            .typeLastName("Ivanov"); //фамилия



            $("#userEmail").setValue("mail@mail.com"); //почта

            $("[for='gender-radio-1']").click(); //выбор пола

            $("#userNumber").setValue("99999999999"); //номер телефона

            registrationPage.calendarComponent.setDate("30", "January", "1992");




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

            registrationPage.cherkResultValue("Student Name","Andrei Ivanov")
                            /*.cherkResultValue("Student Email","mail@mail.com")
                            .cherkResultValue("Gender","Male")
                            .cherkResultValue("Mobile","9999999999")
                            .cherkResultValue("Date of Birth","11 January,1992")
                            .cherkResultValue("Subjects","Computer Science")
                            .cherkResultValue("Hobbies","Reading")
                            .cherkResultValue("Picture","MY.jpg")
                            .cherkResultValue("Address","New Sol")
                            .cherkResultValue("State and City","Haryana Karnal")*/;

    }



}


