package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkedinProcess {


public static void main(String[] args) throws Exception {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\damar\\Desktop\\New folder (2)\\QA\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		

		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("damareshwarreddy1@gmail.com");
		
		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("Dama@6666");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Salesforce");
		
		
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Jobs']")).click();
		
		
		
		
		
		List<WebElement> radios=driver.findElements(By.xpath("//span [contains(@tabindex,'-1')]"));
		Thread.sleep(3000);
		System.out.println(radios.size());
		
		driver.findElement(By.xpath("//button[text()='Date Posted']")).click();
		
		List<WebElement> radios1=driver.findElements(By.xpath("//input [contains(@type,'ra')]"));
		Thread.sleep(3000);
		System.out.println(radios1.size());
		
		
		
		driver.findElement(By.xpath("//input[@value='r86400']")).click();
		Thread.sleep(2000);
		
		
		
		//System.out.println(radios1.get(1).isEnabled());//true because Male button is enabled
		//Thread.sleep(3000);

		
		
		
	
		
		
		
		
	
				

}
}
