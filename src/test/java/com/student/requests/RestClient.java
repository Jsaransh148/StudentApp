package com.student.requests;

import com.student.utils.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestClient extends TestBase {

    public Response doGetRequest(String requestPath) {
        Response response = RestAssured.given()
                .when()
                .get(requestPath);

        return response;
    }

    public Response doPostRequest(String uri, Object body) {

        return RestAssured.given()
                .contentType(ContentType.JSON)
                .when(Specificationfactory.logPayloadResponseInfo());
                .body(body)
                .post(uri);
    }

    public Response doDeleteRequest(String res) {

        return RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .delete(res);
    }
    public Response doPatchRequest(String res, Object body) {

        return RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .body(body)
                .delete(res);
    }
}
