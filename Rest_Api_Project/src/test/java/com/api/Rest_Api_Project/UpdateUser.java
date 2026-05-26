package com.api.Rest_Api_Project;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class UpdateUser {

    @Test
    public void updateUser() {

        given()

        .header("Content-Type", "application/json")

        .body("{\r\n"
                + "   \"lastName\": \"Owais\"\r\n"
                + "}")

        .when()

        .put("https://dummyjson.com/users/2")

        .then()

        .statusCode(200)

        .log().all();

    }
}