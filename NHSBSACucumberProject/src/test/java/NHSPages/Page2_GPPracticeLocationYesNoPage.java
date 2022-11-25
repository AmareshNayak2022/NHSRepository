package NHSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NHSUtils.TestBase;

public class Page2_GPPracticeLocationYesNoPage extends TestBase {
	public static WebDriver driver;
	public Page2_GPPracticeLocationYesNoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@id='radio-yes']")
	static WebElement gpYes;
	
	@FindBy(xpath = "//input[@id='radio-no']")
	static WebElement gpNo;
	
	@FindBy(xpath = "//input[@id='next-button']")
	static WebElement clickNext;
	
	public static void selectGPPracticeYes() {
		gpYes.click();
		
	}
	public static void selectGPPracticeNo() {
		gpNo.click();
		
	}
	
	public static void clickNextbutton() {
		clickNext.click();
		
	}

}
