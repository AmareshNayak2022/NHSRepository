package NHSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NHSUtils.TestBase;

public class Page3_DentalPracticeCountryPage extends TestBase{
	public static WebDriver driver;
	public Page3_DentalPracticeCountryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='radio-england']")
	static WebElement selectEngland;
	@FindBy(xpath="//input[@id='radio-scotland']")
	static WebElement selectScotland;
	@FindBy(xpath="//input[@id='radio-wales']")
	static WebElement selectWales;
	@FindBy(xpath="//input[@id='radio-ni']")
	static WebElement selectNorthernIreland;
	@FindBy(xpath="//input[@id='radio-not-registered']")
	static WebElement clicknotRegistered;
	@FindBy(xpath="//input[@id='next-button']")
	static WebElement clickNext;
	
	public static void selectEnglandcountry() {
		selectEngland.click();
		
	}
	public static void selectScotlandcountry() {
		selectScotland.click();
		
	}
	public static void selectWalescountry() {
		selectWales.click();
		
	}
	public static void selectNorthernIrelandcountry() {
		selectNorthernIreland.click();
		
	}
	public static void clickNotRegistered() {
		clicknotRegistered.click();
		
	}
	public static void clickNextbutton() {
		clickNext.click();
		
	}

}
