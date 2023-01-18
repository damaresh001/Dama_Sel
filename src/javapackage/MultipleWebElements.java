package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleWebElements {
	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\damar\\Desktop\\New folder (2)\\QA\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
	
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			//FB Create new Acc page
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			Thread.sleep(3000);
			
			
			WebElement birthMonth=driver.findElement(By.xpath("//select[@id=month]"));
			Thread.sleep(2000);
			
			//Creating Object of Select class
			Select month = new Select(birthMonth); 
			Thread.sleep(2000);
			
			System.out.println(month.getFirstSelectedOption().getText());
			Thread.sleep(2000);
			
			//Select class ref, Because getOptions() of Select class
			List<WebElement> dropdown=month.getOptions();
			Thread.sleep(2000);
			
			System.out.println(dropdown.size()); //12
			
			for(int i=0; i<dropdown.size();i++) {
				
				String dropdownValue=dropdown.get(i).getText();
				
				if(dropdownValue.equalsIgnoreCase("Mar")) {
					dropdown.get(i).click();//Mar
					
					
					
					
					//Picks Multiple WebElements with Contains 
					List<WebElement> radios=driver.findElements(By.xpath("//input [contains(@type,'ra')]"));
					Thread.sleep(3000);
					System.out.println(radios.size());//3 Size of the number of elements
					
					//Male button Signup Page FB
					System.out.println(radios.get(1).isEnabled());//true because Male button is enabled
					Thread.sleep(3000);
			
					radios.get(1).click();//Male
					System.out.println(radios.get(1).isSelected());//true because Male button is selected
					
					radios.get(1).click();//Male
					System.out.println(radios.get(2).isSelected());//false because Male is get(1) but gave get(2)is selected
					
					//Female button Signup Page FB
					System.out.println(radios.get(2).isEnabled());//true because FeMale button is enabled
					Thread.sleep(3000);
			
					radios.get(2).click();//Male
					System.out.println(radios.get(2).isSelected());//true because FeMale button is selected
					
					radios.get(2).click();//Female
					Thread.sleep(2000);
					System.out.println(radios.get(1).isSelected());//false because Female is get(2) but gave get(1)is selected		
				}
				
				
				
			}
			
			
	
	}
}
