package com.dit;

import com.github.javafaker.Faker;

public class TestData {
    //static String userEmail = "mail@mail.com";
    //static String gender = "Male";

    Faker faker = new Faker();



    //    faker data
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String Email = faker.internet().emailAddress();
    String phone = faker.phoneNumber().subscriberNumber(10);
    String fullAddress = faker.address().fullAddress();
    String gender = "Male"; // Male, Female, Other
}



