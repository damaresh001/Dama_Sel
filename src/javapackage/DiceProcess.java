package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DiceProcess {
	public static void main(String[] args) throws Exception {
		
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\damar\\Desktop\\New folder (2)\\QA\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.dice.com/jobs?q=salesforce&countryCode=US&radius=30&radiusUnit=mi&page=1&pageSize=20&filters.postedDate=ONE&filters.employmentType=FULLTIME&language=en&eid=S2Q_,gKQ_,bw_0");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[@id='8827d37fdc05d4244f26ef741f2e832b']")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//apply-button-wc[@class='hydrated']")).click();
	Thread.sleep(2000);
	
	
	
}
}