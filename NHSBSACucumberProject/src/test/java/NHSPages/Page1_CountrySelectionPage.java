package NHSPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NHSUtils.TestBase;

public class Page1_CountrySelectionPage extends TestBase {
	
	public static WebDriver driver;
	
	public Page1_CountrySelectionPage(WebDriver driver){
	    this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath="//input[@id='radio-england']")
	static WebElement selectEngland;
	@FindBy(xpath="//input[@id='radio-scotland']")
	static WebElement selectScotland;
	@FindBy(xpath="//input[@id='radio-wales']")
	static WebElement selectWales;
	@FindBy(xpath="//input[@id='radio-nire']")
	static WebElement selectNorthernIreland;
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
	public static void clickNextbutton() {
		clickNext.click();
		
	}

}
