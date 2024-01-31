package DropdownHandling;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrangeHRMDropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "E:\\Gaurav Sir Automation class lec\\Ca PracticeSelenium\\chromedriver-win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("E:\\Gaurav Sir Automation class lec\\Ca PracticeSelenium\\chrome-win32\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		Thread.sleep(2000);
		
	WebElement clickonAdmin = driver.findElement(By.xpath("(//*[@class='oxd-main-menu-item'])[1]"));
	
	clickonAdmin.click();
	
	Thread.sleep(1000);
	
	 WebElement username = driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]"));
	 
	 Thread.sleep(1000);
	 username.sendKeys("Admin");
	 
	 
	 driver.findElement(By.xpath("(//*[@class='oxd-select-text oxd-select-text--active'])[1]")).click();
	 Thread.sleep(1000);
	 
	 WebElement userRole = driver.findElement(By.xpath("(//*[text()='Admin'])[3]"));
	 
	 userRole.click();
	 
	 driver.findElement(By.xpath("(//*[@class='oxd-select-text oxd-select-text--active'])[2]")).click();
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//*[text()='Enabled'])[1]")).click();
	 
	 driver.findElement(By.xpath("//*[@type='submit']")).click();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
