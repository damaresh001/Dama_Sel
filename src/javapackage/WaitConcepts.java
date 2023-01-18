package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcepts {


	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\damar\\Desktop\\New folder (2)\\QA\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		

		driver.get("https://facebook.com/");
		
	//implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input [@id = 'email']")).sendKeys("damaresh005@gmail.com");
		
		//Explicit Wait
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input [@id = 'pass']"))).sendKeys("Dama@80999");
		
		
		
	}
}
