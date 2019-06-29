package com.basic;



import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Testinggoogle {

	
	  public static void main(String[] args) {
	  
	  Response res = RestAssured.given().get("https://www.google.com/"); 
	  int statcode = res.statusCode(); 
	  System.out.println("Status Code =" +statcode);
	
	  }
	 

	/*
	 * @Test public void testgoogle() { Response res =
	 * RestAssured.given().get("https://www.google.com/"); int statcode =
	 * res.statusCode(); System.out.println("Status Code =" +statcode);
	 * Assert.assertEquals(statcode, 200);
	 * 
	 * }
	 */
	}
	

