package com.basic.GetRequestSD;

import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;


public class RetRequestSD {
	Response resp;
	
	@Given("^user start the rest assured test$")
	public void user_start_the_rest_assured_test() throws Throwable {
	    System.out.println("Starting of the Get request");
	}

	@When("^user hit the get request$")
	public void user_hit_the_get_request() {
		resp = RestAssured.given().relaxedHTTPSValidation().when().get("https://ergast.com/api/f1/2017/circuits.json"); 
		
		//print response string
		String respString =resp.asString();
		System.out.println(respString);
		
		//get all headers
		Headers heds= resp.getHeaders();
		System.out.println(heds);
			}
	
	/*@Then("^user checks (\\d+) the status code$")
	public void user_checks_the_Status_code(int ExpStatusCode){
	int statuscode = resp.getStatusCode(); 
	//System.out.println("Status Code =" +statuscode);
	Assert.assertTrue(ExpStatusCode==statuscode);
	
	}*/

	
	@Then("^user check the count or size$")
	public void user_check_the_count_or_size() {
		String limitvalue = resp.getBody().jsonPath().getString("MRData.limit");
		Assert.assertEquals(30, limitvalue);
		resp.then().assertThat().body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
	}

	@Then("^user check at path \"([^\"]*)\"$")
	public void user_check_at_path(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
