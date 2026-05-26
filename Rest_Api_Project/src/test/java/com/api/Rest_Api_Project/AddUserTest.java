package com.api.Rest_Api_Project;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class AddUserTest {

    @Test
    public void addUser() {

        given()

        .header("Content-Type", "application/json")

        .body("{\r\n"
                + "   \"firstName\": \"Muhammad\",\r\n"
                + "   \"lastName\": \"Ovi\",\r\n"
                + "   \"age\": 250\r\n"
                + "}")

        .when()

        .post("https://dummyjson.com/users/add")

        .then()

        .statusCode(201)

        .log().all();

    }
}