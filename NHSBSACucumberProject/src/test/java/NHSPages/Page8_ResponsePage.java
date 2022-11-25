package NHSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NHSUtils.TestBase;

public class Page8_ResponsePage extends TestBase {
	public static WebDriver driver;
	public Page8_ResponsePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='radio-yes']")
	static WebElement responseYes;
	@FindBy(xpath="//input[@id='radio-no']")
	static WebElement reponseNo;
	@FindBy(xpath="//input[@id='next-button']")
	static WebElement clickNext;
	
	public static void responseYes() {
		responseYes.click();
		
	}
	public static void responseNo() {
		reponseNo.click();
		
	}
	public static void clickNext() {
		clickNext.click();
		
	}

}
