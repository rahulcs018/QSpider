package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","J:\\Basic Selenium\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.flipkart.com/");
		//driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
       
		
		//driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		
		//dot function
		driver.findElement(By.xpath("//button[.='✕']")).click();
         Thread.sleep(4000);
        
         
         //driver.findElement(By.xpath("//img[@alt=\'Fashion\']")).click();
         
        // driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
        // driver.findElement(By.xpath("//input[contains(@class,'textField pwdfield')]")).sendKeys("manager");
        // driver.findElement(By.xpath("//div[text()='Login ']")).click();
         
      // xpath contains Attribute
 		//driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
         
         
         
	}

}
