package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountryScotlandSteps {

	@Given("User launches browser and enters urlscotland")
	public void user_launches_browser_and_enters_urlscotland() {
		System.out.println("ScotlandTest");

	   
	}

	@When("user clicks on StartNow buttonscotland")
	public void user_clicks_on_start_now_buttonscotland() {
	    System.out.println("ScotlandTest");
	    
	}

	@Then("user lands on country selection pagescotland")
	public void user_lands_on_country_selection_pagescotland() {
	    System.out.println("ScotlandTest");
	    
	}


}
