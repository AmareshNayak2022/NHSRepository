package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import NHSPages.Page1_CountrySelectionPage;
import NHSPages.Page21_FinalHelpPage;
import NHSPages.StartPage;
import NHSUtils.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CountryNorthernIrelandSteps extends TestBase {
	
	TestBase tb;
	StartPage sp;
	Page1_CountrySelectionPage cs;
	Page21_FinalHelpPage fh;
	
	@Given("User launches browser and enters urlnorthernireland")
	public void user_launches_browser_and_enters_url() throws InterruptedException {
		tb.initializationchrome();
		System.out.println("Browser started");
		Thread.sleep(5000);
		
	}

	@When("user clicks on StartNow buttonnorthernireland")
	public void user_clicks_on_start_now_button() throws InterruptedException {
		sp = new StartPage(driver);
		sp.clickStartNowbutton();
	    System.out.println("User landed country selection page");
	    Thread.sleep(9000);
	    tb.popupremoval();
	}
	
	@And("user selects country NorthernIrelandnorthernireland")
	public void user_selects_country_NorthernIreland() throws InterruptedException {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//input[@id='radio-nire']")));      
		cs = new Page1_CountrySelectionPage(driver);
		Thread.sleep(5000);
		cs.selectNorthernIrelandcountry();
		Thread.sleep(5000);
	    
	}
	
	@And("user clicks Next button")
	public void user_clicks_NextButton() throws InterruptedException {
		cs.clickNextbutton();
		Thread.sleep(9000);
	   
	    
	}
	

	@Then("user checks the treatment helpnorthernireland")
	public void user_lands_on_country_selection_page() throws InterruptedException {
		fh = new Page21_FinalHelpPage(driver);
		fh.mainHelpTextshow();
		Thread.sleep(9000);
	    
	}


}
