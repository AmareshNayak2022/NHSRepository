package NHSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import NHSUtils.TestBase;

public class Page12_InjurySelection extends TestBase{
	public static WebDriver driver;
	public Page12_InjurySelection(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
