package NHSUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
		
	public static WebDriver driver;
	
	public static void initializationchrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		driver.manage().window().maximize();
	}
	
	public static void initializationfirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		driver.manage().window().maximize();
	}
	
	public static void popupremoval() {
		driver.findElement(By.xpath("//button[@id='nhsuk-cookie-banner__link_accept_analytics']")).click();
	}

}
