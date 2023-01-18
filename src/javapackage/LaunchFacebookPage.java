package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebookPage {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\damar\\Desktop\\New folder (2)\\QA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Email or phone number']")).sendKeys("damaresh009@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dama@80999");
		Thread.sleep(2000);		
				
		driver.findElement(By.xpath("//button[@value='1']")).click();
		Thread.sleep(2000);	
			
						
		
	}
}

