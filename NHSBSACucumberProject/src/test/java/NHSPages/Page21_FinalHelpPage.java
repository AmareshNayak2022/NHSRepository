package NHSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NHSUtils.TestBase;

public class Page21_FinalHelpPage extends TestBase{
	public static WebDriver driver;
	
	public Page21_FinalHelpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//h1[@id='result-heading']")
	static WebElement mainHelpText;
	
	@FindBy(xpath="//h1[@id='result-reason']")
	static WebElement resultReason;
	
	
	public static void mainHelpTextshow() {
		System.out.println(mainHelpText.getText());
		
	}
	
	public static void resultReasonshow() {
		System.out.println(resultReason.getText());
		
	}

}
