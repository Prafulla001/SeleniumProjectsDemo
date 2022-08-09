package com.org.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSenderOptions;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.*;

public class PostBasedAPITests {

    @Test
    public void validatePostBasedAPITests1(){

        RequestSenderOptions apiRequest  = RestAssured.given();

        //apiRequest.head("Content-Type","application/xml");
        ((RequestSpecification) apiRequest).body("\"id\": 22,\n" +
                "            \"email\": \"prachantest@gmail.com\",\n" +
                "            \"first_name\": \"Prafuul\",\n" +
                "            \"last_name\": \"Chand\",\n" +
                "            \"avatar\": \"https://reqres.in/img/faces/7-image.jpg\"");
        Response apiResponse = (Response) apiRequest.post("https://reqres.in/api/users");

        String responseBody = apiResponse.body().asString();
        System.out.println(responseBody);

    }
}
