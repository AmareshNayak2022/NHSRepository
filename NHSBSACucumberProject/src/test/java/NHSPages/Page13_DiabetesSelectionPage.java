package NHSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import NHSUtils.TestBase;

public class Page13_DiabetesSelectionPage extends TestBase {
	
	public static WebDriver driver;
	public Page13_DiabetesSelectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

}
