package Base;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","J:\\Basic Selenium\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
	    driver.get("https://www.naukri.com");
	    driver.manage().window().maximize();
	   WebElement job = driver.findElement(By.xpath("//div[text()='Jobs']"));
	   
	    Actions act = new Actions(driver);
	    act.moveToElement(job).build().perform();
	    
	 driver.findElement(By.xpath("//div[text()='Jobs by skill']")).click();
	 driver.findElement(By.xpath("//div[text()='Services']")).click();
	
	 
	 String main = driver.getWindowHandle();
	 System.out.println(main);
	 
	 Set<String> all = driver.getWindowHandles();
	 System.out.println(all);
	 
	Iterator<String> itr = all.iterator();
	String st=itr.next();
	System.out.println(st);
	 
	 for(String id:all) {
		 
		if(!id.equals(main)) {
			
			driver.switchTo().window(id);
			driver.findElement(By.xpath("//span[.='FIND JOBS']"));
			
		}
		 
	 }
	    
		

	}

}
