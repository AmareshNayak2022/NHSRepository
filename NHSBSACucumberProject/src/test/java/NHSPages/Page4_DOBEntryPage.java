package NHSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NHSUtils.TestBase;

public class Page4_DOBEntryPage extends TestBase{
	public static WebDriver driver;
	public Page4_DOBEntryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='dob-day']")
	static WebElement enterDay;
	@FindBy(xpath="//input[@id='dob-month']")
	static WebElement enterMonth;
	@FindBy(xpath="//input[@id='dob-year']")
	static WebElement enterYear;
	@FindBy(xpath="//input[@id='next-button']")
	static WebElement clickNext;
	
	public static void enterDay() {
		enterDay.sendKeys("06");
		
	}
	public static void enterMonth() {
		enterMonth.sendKeys("12");
		
	}
	public static void enterYear() {
		enterYear.sendKeys("1987");;
		
	}
	public static void clickNext() {
		clickNext.click();
		
	}

}
