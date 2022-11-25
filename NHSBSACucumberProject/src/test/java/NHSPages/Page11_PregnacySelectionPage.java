package NHSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import NHSUtils.TestBase;

public class Page11_PregnacySelectionPage extends TestBase{
	public static WebDriver driver;
	public Page11_PregnacySelectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

}
