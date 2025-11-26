package com.qa.utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class RequestManager {
    private final String BASE_URI = "https://api.yourdomain.com";
    private String authToken = null;
    public RequestManager() {
        RestAssured.baseURI = BASE_URI;
    }
    public void setAuthToken(String token) {
        this.authToken = token;
    }
    private RequestSpecification getRequestSpecification() {
        RequestSpecification request = RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON);

        if (authToken != null && !authToken.isEmpty()) {
            request.header("Authorization", "Bearer " + authToken);
        }
        return request;
    }

    public Response get(String path) {
        return getRequestSpecification().when().get(path);
    }

    public Response post(String path, Object body) {
        return getRequestSpecification().body(body).when().post(path);
    }
}
