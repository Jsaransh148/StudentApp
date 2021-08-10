package com.student.requests;

import com.student.utils.TestBase;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.lessThan;

public class Specificationfactory extends TestBase {

    public static synchronized ResponseSpecification getGenericResponseSpec(){

        ResponseSpecBuilder responseSpecBuilder;
        ResponseSpecification responseSpecification;

        responseSpecBuilder = new ResponseSpecBuilder();
        responseSpecBuilder.expectHeader("Content-Type","application/json;charset=utf-8");
        responseSpecBuilder.expectHeader("Transfer-Encoding","chunked");
        responseSpecBuilder.expectResponseTime(lessThan(5L), TimeUnit.SECONDS);
        responseSpecification = responseSpecBuilder.build();

        return responseSpecification;
    }

    public static synchronized RequestSpecification logPayloadResponseInfo(){
        RequestSpecBuilder logBuilder;
        RequestSpecification logSpecification;

        logBuilder.addFilter(new AllureRestAssured());

        logSpecification = logBuilder.build();

        return logSpecification;


    }
}
