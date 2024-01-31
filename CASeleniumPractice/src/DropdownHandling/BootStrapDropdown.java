package DropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootStrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver", "E:\\Gaurav Sir Automation class lec\\Ca PracticeSelenium\\chromedriver-win32\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.setBinary("E:\\Gaurav Sir Automation class lec\\Ca PracticeSelenium\\chrome-win32\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://zoom.us/signup");
		
		driver.manage().window().maximize();
		
		WebElement lang = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		
		lang.click();
		
		Thread.sleep(1000);
		
		WebElement english = driver.findElement(By.xpath("(//li[contains(@id,'dropdown_item_dropdown-menu-')])[2]"));
		
		english.click();
		
		
	}

}
