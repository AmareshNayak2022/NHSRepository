package NHSPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NHSUtils.TestBase;

public class Page10_TakeHome935Page extends TestBase {
	
	public static WebDriver driver;
	public Page10_TakeHome935Page(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='radio-yes']")
	static WebElement takeHome935Yes;
	@FindBy(xpath="//input[@id='radio-no']")
	static WebElement takeHome935No;
	@FindBy(xpath="//input[@id='next-button']")
	static WebElement clickNext;
	
	public static void takeHome935Yes() {
		takeHome935Yes.click();
		
	}
	public static void takeHome935No() {
		takeHome935No.click();
		
	}
	public static void clickNext() {
		clickNext.click();
		
	}
	
	

}
