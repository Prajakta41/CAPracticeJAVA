package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorByXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Gaurav Sir Automation class lec\\Ca PracticeSelenium\\chromedriver-win32\\chromedriver.exe");
				
				ChromeOptions co = new ChromeOptions();
				co.setBinary("E:\\Gaurav Sir Automation class lec\\Ca PracticeSelenium\\chrome-win32\\chrome.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prajaktapatil41@gmail.com");
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc@123");
				driver.findElement(By.xpath("//button[@name='login']")).click();
						
				
				//locator by conatins
				
				driver.findElement(By.xpath("//button[contains(@id, 'u_0_5_')]")).click();
		
	}

}
