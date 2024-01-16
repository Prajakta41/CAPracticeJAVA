package BasicsSignUp;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FacbookSignUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "E:\\\\Gaurav Sir Automation class lec\\\\Ca PracticeSelenium\\\\chromedriver-win32\\\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.setBinary("E:\\\\Gaurav Sir Automation class lec\\\\Ca PracticeSelenium\\\\chrome-win32\\\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b_')]")).sendKeys("praj");
		
		driver.findElement(By.xpath("//input[contains(@id, 'u_0_d_')]")).sendKeys("shelke");
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_g_')]")).sendKeys("8421584766");
		
		driver.findElement(By.xpath("//input[contains(@id,'password_step_')]")).sendKeys("Praj@8patil");
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_4_')]")).click();
		
		driver.findElement(By.xpath("//button[contains(@id,'u_0_s_')]")).click();

	}

}
