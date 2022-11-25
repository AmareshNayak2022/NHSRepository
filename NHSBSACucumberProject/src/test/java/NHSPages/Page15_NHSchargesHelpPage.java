package NHSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import NHSUtils.TestBase;

public class Page15_NHSchargesHelpPage extends TestBase {
	public static WebDriver driver;
	public Page15_NHSchargesHelpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

}
