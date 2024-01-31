package DropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class normalDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "E:\\Gaurav Sir Automation class lec\\Ca PracticeSelenium\\chromedriver-win32\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.setBinary("E:\\Gaurav Sir Automation class lec\\Ca PracticeSelenium\\chrome-win32\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[contains(@id,'u_0_b_')]")).sendKeys("praj");
		
		driver.findElement(By.xpath("//*[contains(@id,'u_0_d_')]")).sendKeys("Shelke");
		
		driver.findElement(By.xpath("//*[contains(@id,'u_0_g_')]")).sendKeys("1234567");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc");
		
	WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
	
	
	Select sel = new Select(Month);
	
		
		
	     //get options of dropdown in list
		 List<WebElement> d = sel.getOptions();
		 System.out.println("options are: " );
		 for (WebElement i: d)
		 {
	         System.out.println(i.getText());
	     }
		
		//return true if multi-select dropdown
		 Boolean b=sel.isMultiple();
		 System.out.println("Boolen value for dropdown: ");
		 if(b== true)
		 {
			 System.out.print("true multiselect opetion is enable");
		 }
		 else
		 {
			 System.out.println("false multiselect option is not avaliable");
		 }
		 
		 sel.selectByVisibleText("Jan");
		 
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		
		 Select sel1 = new Select(day);
		 
		  List<WebElement> date = sel1.getOptions();
		  
		  for(WebElement i: date)
		  {
			  System.out.println(i.getText());
		  }
		  
		  sel1.selectByValue("23");
		
		  
		 WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		  
		  Select sel3 = new Select(year);
		  
		  List<WebElement> year1 = sel3.getOptions();
		  
		  for(WebElement i: year1)
		  {
			  System.out.println(i.getText());
		  }
		 
		  sel3.selectByIndex(1);
		 
		 
		 
	}

}
