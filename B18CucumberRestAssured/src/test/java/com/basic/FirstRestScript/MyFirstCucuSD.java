package com.basic.FirstRestScript;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyFirstCucuSD {
	Response res;
	
	@Given("user hit the get request")
	public void user_hit_the_get_request(){
		res = RestAssured.given().get("https://www.google.co.in/"); 
	 
	}
	
	@Then("^user checks the \"([^\"]*)\" status code$")
	public void user_checks_the_Status_code(String stCode){
	int statuscode = res.getStatusCode(); 
	//Assert.assertTrue(ExpStatusCode==statuscode);
	System.out.println("Status Code =" +statuscode);
	//Assert.assertTrue(stCode, Integer.toString(statuscode));
	}

}