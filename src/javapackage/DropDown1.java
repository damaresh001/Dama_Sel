package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown1 {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\damar\\Desktop\\New folder (2)\\QA\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		

		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("damaresh006@gmail.com");
		
		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("Dama@80999");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Salesforce");
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		//Click on Jobs
		driver.findElement(By.xpath("//button[text()='Jobs']")).click();
		
		//Date Posted
		List<WebElement> radios=driver.findElements(By.xpath("//span [contains(@tabindex,'-1')]"));
		Thread.sleep(5000);
		System.out.println(radios.size());
		
		driver.findElement(By.xpath("//button[text()='Date Posted']")).click();
		
		driver.findElement(By.xpath("//label[@for='timePostedRange-r86400']")).click();
		Thread.sleep(2000);
		
		
		
		//Job Type Contract
		List<WebElement> radio2=driver.findElements(By.xpath("//span [contains(@tabindex,'-1')]"));
		Thread.sleep(3000);
		System.out.println(radio2.size());
		
		driver.findElement(By.xpath("//button[@aria-label='Job Type filter. Clicking this button displays all Job Type filter options.']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Job Type']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='jobType-C']")).click();
		Thread.sleep(2000);
		
		//Onsite/Remote
		List<WebElement> radio3=driver.findElements(By.xpath("//span [contains(@tabindex,'-1')]"));
		Thread.sleep(1000);
		System.out.println(radio3.size());
		
		driver.findElement(By.xpath("//button[@aria-label='On-site/Remote filter. Clicking this button displays all On-site/Remote filter options.']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='On-site/Remote']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[@for='workplaceType-2']")).click();
		Thread.sleep(1000);
		
		//Exp
		List<WebElement> radio7=driver.findElements(By.xpath("//span [contains(@tabindex,'-1')]"));
		Thread.sleep(1000);
		System.out.println(radio7.size());
		
		
		driver.findElement(By.xpath("//button[@aria-label='Experience Level filter. Clicking this button displays all Experience Level filter options.']")).click();
		Thread.sleep(1000);
		
		//Easy Apply
				List<WebElement> radio5=driver.findElements(By.xpath("//span [contains(@tabindex,'-1')]"));
				Thread.sleep(3000);
				System.out.println(radio5.size());
				
				//driver.findElement(By.xpath("//button[@aria-label='Easy Apply filter.']")).click();
				//Thread.sleep(3000);
				
				driver.findElement(By.xpath("//button[text()='Easy Apply']")).click();
				Thread.sleep(5000);
		
				//jobs list
				@SuppressWarnings("unchecked")
				List<WebElement> ul= (List<WebElement>) driver.findElement(By.xpath("//ul[@class='scaffold-layout__list-container']"));
			    Thread.sleep(3000);
			    
			   
				
				driver.findElement(By.xpath("//div[contains(@class,' jobs-search-two-pane__job-card-container--viewport-tracking-1')]")).click();
				Thread.sleep(5000);
				
				
				
		
		//Easy Apply
		//List<WebElement> radio5=driver.findElements(By.xpath("//span [contains(@tabindex,'-1')]"));
		//Thread.sleep(3000);
		//System.out.println(radio5.size());
		
		//driver.findElement(By.xpath("//button[@aria-label='Easy Apply filter.']")).click();
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//button[text()='Easy Apply']")).click();
		//Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
