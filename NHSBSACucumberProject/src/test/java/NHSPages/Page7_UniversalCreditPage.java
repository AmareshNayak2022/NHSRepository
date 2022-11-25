package NHSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NHSUtils.TestBase;

public class Page7_UniversalCreditPage extends TestBase{
	public static WebDriver driver;
	public Page7_UniversalCreditPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='yes-universal']")
	static WebElement yesUniversal;
	@FindBy(xpath="//input[@id='not-yet']")
	static WebElement notYet;
	@FindBy(xpath="//input[@id='different-benefit']")
	static WebElement differentBenefit;
	@FindBy(xpath="//input[@id='next-button']")
	static WebElement clickNext;
	
	public static void yesUniversal() {
		yesUniversal.click();
		
	}
	public static void notYet() {
		notYet.click();
		
	}
	public static void differentBenefit() {
		differentBenefit.click();
		
	}
	public static void clickNext() {
		clickNext.click();
		
	}

}
