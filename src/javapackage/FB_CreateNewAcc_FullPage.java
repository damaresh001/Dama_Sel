package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_CreateNewAcc_FullPage {

	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\damar\\Desktop\\New folder (2)\\QA\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
		
	//Takes to Fb.com
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	 //Clicks on Create New Account
	driver.findElement(By.xpath("//a[@rel='async']")).click();
	Thread.sleep(2000);
	
	//Enters FName
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("damaresh");
	Thread.sleep(2000);
	
	//Enters L.Name
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("reddy");
	Thread.sleep(2000);
	
	//Enters MobileNo. or Email
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("damaresh009@gmail.com");
		Thread.sleep(2000);
	
		//Re-Enters MobileNo. or Email
		driver.findElement(By.xpath("//input[@aria-label='Re-enter email']")).sendKeys("damaresh009@gmail.com");
		Thread.sleep(2000);
			
	//Enters Password 
	driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Dama@80999");
	Thread.sleep(2000);
	
	//Clicks on Gender Male Button
	driver.findElement(By.xpath("//input[@value='1']")).click();
	Thread.sleep(2000);
	
	//Clicks on Gender FeMale Button
	driver.findElement(By.xpath("//input[@value='2']")).click();
	Thread.sleep(2000);
	
	////Clicks on Gender Custom Button
	driver.findElement(By.xpath("//input[@value='-1']")).click();
	Thread.sleep(2000);
	
	
	}
	
}
