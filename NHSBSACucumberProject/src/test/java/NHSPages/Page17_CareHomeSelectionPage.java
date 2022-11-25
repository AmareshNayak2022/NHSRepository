package NHSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import NHSUtils.TestBase;

public class Page17_CareHomeSelectionPage extends TestBase {
	public static WebDriver driver;
	public Page17_CareHomeSelectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

}
