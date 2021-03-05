package ru.netology.postman;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.http.ContentType;

public class PostmanEchoTest {

    @Test
    void shouldReturnDemo() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("salut")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("salut"))
        ;
    }
}
