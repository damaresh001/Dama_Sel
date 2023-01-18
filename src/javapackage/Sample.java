package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
		
		public static void main (String[] args) throws Exception {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\damar\\Desktop\\New folder (2)\\QA\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@rel='async']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("damaresh");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Reddy");
			Thread.sleep(3000);
			
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			System.out.println(driver.getClass());
			System.out.println(driver.getWindowHandle());
			System.out.println(driver.getPageSource());
			
		}
		
		
		
	}