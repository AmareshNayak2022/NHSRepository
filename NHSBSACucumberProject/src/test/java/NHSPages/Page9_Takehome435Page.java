package NHSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import NHSUtils.TestBase;

public class Page9_Takehome435Page extends TestBase {
	public static WebDriver driver;
	
	public Page9_Takehome435Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

}
