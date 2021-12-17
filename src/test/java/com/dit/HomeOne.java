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
        static void beforeAll(){
            Configuration.browserSize = "1920x1080";
        }
        @Test
        @DisplayName("ввод")
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
            $("#dateOfBirthInput").click();
            $(".react-datepicker__month-select").click();
            $("[value='10']").click();
            $(".react-datepicker__year-select").click();
            $("[value='1992']").click();
            $(".react-datepicker__day--002").click();
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
            $(Selectors.byText("Select State")).click();
            $(Selectors.byText("Haryana")).click();
            $(Selectors.byText("Select City")).click();
            $(Selectors.byText("Karnal")).click();
            //Всплывающий список с городом

            $("#submit").click();
            //кнопка отправки


            //$("#closeLargeModal").click();


        }
    @DisplayName("Проверка")
    void checkResult() {
        $(byText("Thanks for submitting the form")).should(appear);
        $(byText("Andrei Ivanov")).should(appear);
        $(byText("mail@mail.com")).should(appear);
        $(byText("Male")).should(appear);
        $(byText("99999999999")).should(appear);
        $(byText("02 November,1992")).should(appear);
        $(byText("Computer Science")).should(appear);
        $(byText("Reading")).should(appear);
        $(byText("MY.jpg")).should(appear);
        $(byText("Saint-Pee")).should(appear);
        $(byText("Haryana Karnal")).should(appear);
    }
    @AfterEach
    void after(){
        closeWebDriver();
    }

}


