package com.student.requests;

import com.student.pojo.StudentClass;
import com.student.utils.TestBase;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import java.util.List;

public class Requestfactory extends TestBase {


    RestClient restClient =new RestClient();

    @Step("Getting all student info from db")
    public Response getAllStudents(){

       Response response=  restClient.doGetRequest("/student/list");

       return response;
    }

    @Step("Creating new Student")
    public Response createNewStudent(String url,String firstName, String lastName, String email,
                                     String programme, List<String> courses){

       //restClient.doPostRequest(url,);

        StudentClass body= new StudentClass();




       return restClient.doPostRequest("",body);
    }
}
