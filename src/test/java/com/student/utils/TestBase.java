package com.student.utils;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {

    public static PropertyReader prop;


    @BeforeClass
    public static void initURL(){

        prop = PropertyReader.getInstance();

        RestAssured.baseURI =prop.getProperty("baseUrl") ;
        RestAssured.port =Integer.valueOf(prop.getProperty("port")) ;
    }
}
