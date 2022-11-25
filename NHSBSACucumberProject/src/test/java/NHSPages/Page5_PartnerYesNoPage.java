package NHSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NHSUtils.TestBase;

public class Page5_PartnerYesNoPage extends TestBase {
	public static WebDriver driver;
	public Page5_PartnerYesNoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='radio-yes']")
	static WebElement partnerYes;
	@FindBy(xpath="//input[@id='radio-no']")
	static WebElement partnerNo;
	@FindBy(xpath="//input[@id='next-button']")
	static WebElement clickNext;
	
	public static void partnerYes() {
		partnerYes.click();
		
	}
	public static void partnerNo() {
		partnerNo.click();
		
	}
	public static void clickNext() {
		clickNext.click();
		
	}

}
