package NHSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import NHSUtils.TestBase;

public class Page20_Savings16000Page extends TestBase {
	public static WebDriver driver;
	public Page20_Savings16000Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

}
