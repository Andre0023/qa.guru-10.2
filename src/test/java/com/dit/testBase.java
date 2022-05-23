package com.dit;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class testBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        open("https://demoqa.com/automation-practice-form");

    }
}
