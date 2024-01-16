package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorByID {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "E:\\Gaurav Sir Automation class lec\\Ca PracticeSelenium\\chromedriver-win32\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.setBinary("E:\\Gaurav Sir Automation class lec\\Ca PracticeSelenium\\chrome-win32\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement	emailid= driver.findElement(By.id("email"));
	
		emailid.sendKeys("prajaktapatil41@gmail.com");
		
		WebElement password =driver.findElement(By.id("pass"));
		
		password.sendKeys("abc");
		
		//Locator by Class
		Thread.sleep(1000);
		
		WebElement loginbutton = driver.findElement(By.className("u_0_5_Hq"));
		
			loginbutton.click();
			
			//linkText locator
			
			WebElement forgetlink = driver.findElement(By.linkText("Forgot password?"));
			
			forgetlink.click();
	}

}
