package NHSPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NHSUtils.TestBase;

public class StartPage extends TestBase {
	
	public static WebDriver driver;
	
	public StartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//input[@id='next-button']")
	static WebElement StartNow;
	
	public static void clickStartNowbutton() {
		StartNow.click();
		
	}

}
