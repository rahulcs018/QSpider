package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","J:\\Basic Selenium\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement path = driver.findElement(By.xpath("//span[@class='icp-color-base']"));
		js.executeScript("arguments[0].scrollIntoView();",path);
		Thread.sleep(2000);
		path.click();
		
		
	

	
//		for(int i=0;i<5;i++) {
//			js.executeScript("window.scrollBy(0,1000)");
//			Thread.sleep(2000);
//		}
//		for(int i=0;i<3;i++) {
//			js.executeScript("window.scrollBy(0,-1000)");
//			Thread.sleep(2000);
//
//	}

}
}
