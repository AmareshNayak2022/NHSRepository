package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountryWalesSteps {

	@Given("User launches browser and enters urlwales")
	public void user_launches_browser_and_enters_urlwales() {
		System.out.println("WalesTest");

	   
	}

	@When("user clicks on StartNow buttonwales")
	public void user_clicks_on_start_now_buttonwales() {
	    System.out.println("WalesTest");
	    
	}

	@Then("user lands on country selection pagewales")
	public void user_lands_on_country_selection_pagewales() {
	    System.out.println("WalesTest");
	    
	}

}
