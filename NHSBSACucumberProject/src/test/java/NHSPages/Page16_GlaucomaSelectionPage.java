package NHSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import NHSUtils.TestBase;

public class Page16_GlaucomaSelectionPage extends TestBase {
	public static WebDriver driver;
	public Page16_GlaucomaSelectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

}
