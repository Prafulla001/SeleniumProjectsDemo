package com.org.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSenderOptions;
import org.testng.annotations.Test;

public class GetBasedAPITests {

    @Test(priority = 1)
    public void validateGetBasedAPITests1(){
        //url- https://petstore.swagger.io/#/pet/findPetsByStatus
        //Imp rest Assured class in selenium
        RequestSenderOptions apiRequest  = RestAssured.given();

        //Response apiResponse = (Response) apiRequest.get("https://petstore.swagger.io/v2/pet/available");
        Response apiResponse = (Response) apiRequest.get("https://reqres.in/api/users/694");
        String responseBody = apiResponse.body().asString();
        System.out.println(responseBody);
    }
    @Test(enabled = false)
    public void validateGetBasedAPITests2(){
        RequestSenderOptions apiRequest  = RestAssured.given();

        Response apiResponse = (Response) apiRequest.get("https://petstore.swagger.io/v2/pet/available");
        //Response apiResponse = (Response) apiRequest.get("https://reqres.in/api/users/2");
        String responseBody = apiResponse.body().asString();
        System.out.println(responseBody);
    }
}
