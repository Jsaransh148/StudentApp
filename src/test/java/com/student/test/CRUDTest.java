package com.student.test;

import com.student.requests.Requestfactory;
import com.student.requests.Specificationfactory;
import com.student.tags.Smoke;
import com.student.utils.TestBase;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.ArrayList;
import java.util.List;

@Story("This is CRUD Testing story")
public class CRUDTest extends TestBase {


    Requestfactory requestfactory = new Requestfactory();

    @Category(Smoke.class)
    @Story("This is CRUD Testing story")
    @DisplayName("Get all students from db")
    @Test
    @Step("Getting all student information from database")
    public void getAllStudents(){
requestfactory.getAllStudents().then().spec(Specificationfactory.getGenericResponseSpec()).statusCode(200);


    }

    @Story("This is CRUD Testing story")
    @DisplayName("Get all students from db")
    @Feature("dss")
    @Test
    public void createNewStudent(){

        String firstName = "John";
        String lastName = "Doe";
        String email = "jsaransh148@gmail.com";
        String programme ="CSE";
        List<String>courses = new ArrayList<String>();
        courses.add("java");
        courses.add("JS");

        requestfactory.createNewStudent("",firstName,lastName,email,programme,courses)
                .then()
                .spec(Specificationfactory.getGenericResponseSpec())
                .statusCode(201);

    }



}
