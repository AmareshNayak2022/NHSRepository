package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import NHSPages.Page10_TakeHome935Page;
import NHSPages.Page1_CountrySelectionPage;
import NHSPages.Page21_FinalHelpPage;
import NHSPages.Page2_GPPracticeLocationYesNoPage;
import NHSPages.Page3_DentalPracticeCountryPage;
import NHSPages.Page4_DOBEntryPage;
import NHSPages.Page5_PartnerYesNoPage;
import NHSPages.Page6_BenefitsTaxCreditsYesNoPage;
import NHSPages.Page7_UniversalCreditPage;
import NHSPages.Page8_ResponsePage;
import NHSPages.StartPage;
import NHSUtils.TestBase;
import NHSUtils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CountryEnglandSteps extends TestBase{

	TestBase tb;
	StartPage sp;
	Utils ul;
	Page1_CountrySelectionPage cs;
	Page2_GPPracticeLocationYesNoPage gps;
	Page3_DentalPracticeCountryPage dcs;
	Page4_DOBEntryPage dob;
	Page5_PartnerYesNoPage pp;
	Page6_BenefitsTaxCreditsYesNoPage btp;
	Page7_UniversalCreditPage ucp;
	Page8_ResponsePage rp;
	Page10_TakeHome935Page thp;
	Page21_FinalHelpPage fhp;
		
	@Given("User launches browser and enters urlengland")
	public void user_launches_browser_and_enters_urlengland() throws InterruptedException {
		tb.initializationfirefox();;
		System.out.println("checking");
        Thread.sleep(5000);
       
	   
	}

	@When("user clicks on StartNow buttonengland")
	public void user_clicks_on_start_now_buttonengland() throws InterruptedException {
		sp = new StartPage(driver);
		sp.clickStartNowbutton();
	    System.out.println("User landed country selection page");
	    Thread.sleep(9000);
	    tb.popupremoval();
	    
	}
	
	@And("user selects country England clicks Next")
	public void user_select_country_England() throws InterruptedException {
	    cs = new Page1_CountrySelectionPage(driver);
	    cs.selectEnglandcountry();
	    cs.clickNextbutton();
	    Thread.sleep(5000);
	    
	}
	@And("user selects GPPractice yes clicks Next")
	public void user_selects_GPPracticeCountry_Yes() throws InterruptedException {
	    gps = new Page2_GPPracticeLocationYesNoPage(driver);
	    gps.selectGPPracticeYes();
	    gps.clickNextbutton();
	    Thread.sleep(5000);
	    
	}
	@And("user selects dental practice country England clicks Next")
	public void user_selects_DentalPractice_country_Yes() throws InterruptedException {
	    dcs = new Page3_DentalPracticeCountryPage(driver);
	    dcs.selectEnglandcountry();
	    dcs.clickNextbutton();
	    Thread.sleep(5000);
	    
	}
	/*@And("user enter Date of Birth clicks Next")
	public void user_enters_DOB() throws InterruptedException {
	    dob = new Page4_DOBEntryPage(driver);
	    dob.enterDay();
	    dob.enterMonth();
	    dob.enterYear();
	    dob.clickNext();
	    Thread.sleep(5000);
	    
	}*/
	@When("user enter valid {string} and {string} and  {string} in Date of Birth clicks Next")
	public void user_enter_valid_and_and_in_date_of_birth_clicks_next(String Day, String Month	, String Year) throws InterruptedException {
	   
	    dob = new Page4_DOBEntryPage(driver);
	    dob.enterDay(Day);
	    dob.enterMonth(Month);
	    dob.enterYear(Year);
	    dob.clickNext();
	    Thread.sleep(5000);
	}
	@And("user enters livein partner Yes and clicks Next")
	public void user_selects_liveinpartner_yes() throws InterruptedException {
	    pp = new Page5_PartnerYesNoPage(driver);
	    pp.partnerYes();
	    pp.clickNext();
	    Thread.sleep(5000);
	    
	}
	@And("user selects benefits Yes and Clicks Next")
	public void user_selects_benefits_yes() throws InterruptedException {
	    btp = new Page6_BenefitsTaxCreditsYesNoPage(driver);
	    btp.partnerYes();
	    btp.clickNext();
	    Thread.sleep(5000);
	    
	}
	@And("user selects universal credit Yes and clicks Next")
	public void user_selects_universalcredit_yes() throws InterruptedException {
	    ucp = new Page7_UniversalCreditPage(driver);
	    ucp.yesUniversal();
	    ucp.clickNext();
	    Thread.sleep(5000);
	    
	}
	@And("user selects response and clicks Next")
	public void user_selects_response_yes() throws InterruptedException {
	    rp = new Page8_ResponsePage(driver);
	    rp.responseYes();
	    rp.clickNext();
	    Thread.sleep(5000);
	    
	}
	@And("user selects less than 935 pond and clicks Next")
	public void user_selects_lessThanPound_yes() throws InterruptedException {
	    thp = new Page10_TakeHome935Page(driver);
	    thp.takeHome935Yes();
	    thp.clickNext();
	    Thread.sleep(5000);
	    
	}
	
	

	@Then("user lands on NHSBSA help Page")
	public void user_lands_on_NHSBSA_help_Page() throws InterruptedException {
	    fhp = new Page21_FinalHelpPage(driver);
	    ul = new Utils();
	    ul.ListComparison();
	    
	    
	}


}
