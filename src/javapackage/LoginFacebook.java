package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\damar\\Desktop\\New folder (2)\\QA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("damaresh009@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("dama80999");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		
		
		//driver.get("https://iphone1-dev-ed.my.salesforce.com/");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input [@id = 'username']")).sendKeys("damaresh005@gmail.com");
		
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input [@id = 'password']")).sendKeys("Dama@80999");
		
		
		
		
	}
	
}
