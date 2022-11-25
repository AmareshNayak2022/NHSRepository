package NHSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import NHSUtils.TestBase;

public class Page18_HelpLocalCouncilPage extends TestBase{
	public static WebDriver driver;
	public Page18_HelpLocalCouncilPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

}
