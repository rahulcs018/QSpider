package Base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Handling {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","J:\\Basic Selenium\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://www.amazon.in/");
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
//		driver.get("https://www.amazon.in/");
//		WebElement data = driver.findElement(By.xpath("//a[text()='Sell']"));
//		
//		Actions act=new Actions(driver);
//		act.moveToElement(data);
		
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma");
		//Thread.sleep(2000);
		// List<WebElement> suggestion = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		
		
//		 List<WebElement> link = driver.findElements(By.xpath("//a"));
//        int count=0;
//         for( WebElement all:suggestion) 
//         {
//        	String sugg = all.getText();
//        	System.out.println(sugg);
//        	 if(sugg.contains("flip flops for men"))
//        	 {
//        		 System.out.println(sugg+"Under If");
//        		 all.click();
//        		 break;
//        	 }
////        	String deff = all.getText();
////        	System.out.println(deff);
////        	count++;
//       }
////        System.out.println("Total no. of link" + count );
//        
	}

}
