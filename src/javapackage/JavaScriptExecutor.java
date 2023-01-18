package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\damar\\Desktop\\New folder (2)\\QA\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://facebook.com/");
				Thread.sleep(3000);
				
				driver.manage().window().maximize();
				
				//1. Enter the Data with the help of JavaScriptExecutor
				
				JavascriptExecutor jse=(JavascriptExecutor) driver; 
				jse.executeScript("document.getElementById('email').value='damaresh006@gmail.com'");
				
				Thread.sleep(3000);
				
			//2. Scroll Down
				jse.executeScript("window.scrollBy(0,400)");
				Thread.sleep(3000);
				
			//3. Scroll Up
				jse.executeScript("window.scrollBy(0,-400)");
				Thread.sleep(3000);	
				
			//4. Click on Create New Account with the help of JavascriptExecutor
				
				WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create New Account'"));
				
				jse.executeScript("arguments[0].click()",createNewAccount);
				
				
			//5. Click on Radio button	
				WebElement femaleRadio=driver.findElement(By.xpath("//input@value='1')"));
				
				jse.executeScript("arguments[0].click()",femaleRadio);
				
}
}