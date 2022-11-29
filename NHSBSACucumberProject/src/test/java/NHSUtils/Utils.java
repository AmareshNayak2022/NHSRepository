package NHSUtils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utils extends TestBase{

	
	public void ListComparison() {
    List<WebElement> li=driver.findElements(By.xpath("//ul[@class=\"form-hint-list\"][1]/li"));
		
		ArrayList<String> listvalues=new ArrayList<String>();
		
		
		for(WebElement listvalue:li) {
			
			System.out.println(listvalue.getText());
			String s=listvalue.getText();
			listvalues.add(s);
			System.out.println(s);
		}
		
		ArrayList<String> listvalues1=new ArrayList<String>();
		listvalues1.add("NHS prescriptions");
		listvalues1.add("NHS dental check-ups and treatment");
		listvalues1.add("sight tests");
		listvalues1.add("NHS wigs and fabric supports");
		
		System.out.println(listvalues.equals(listvalues1));
		
		driver.manage().window().maximize();
		
		List<WebElement> li2=driver.findElements(By.xpath("//ul[@class=\"form-hint-list\"][2]/li"));
        ArrayList<String> listvalue4=new ArrayList<String>();
		
		
		for(WebElement listvalues4:li2) {
			
			System.out.println(listvalues4.getText());
			String s1=listvalues4.getText();
			listvalue4.add(s1);
			System.out.println(s1);
		}  
		
		ArrayList<String> listvalues5=new ArrayList<String>();
		
		listvalues5.add("£4.25 each week of your pregnancy from the 10th week");
		
		listvalues5.add("£8.50 each week for children from birth to 1 year old");
		
		listvalues5.add("£4.25 each week for children between 1 and 4 years old");
		
		System.out.println(listvalue4.equals(listvalues5));
	}
		
		

	}


