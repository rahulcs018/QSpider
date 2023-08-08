package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","J:\\Basic Selenium\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.actitime.com/login.do");
		
		//maximizing the screen
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		
		//id Locator
		//driver.findElement(By.id("username")).sendKeys("admin");
		
		//name locator
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//classname locator
		//driver.findElement(By.className("initial")).click();
		
		Thread.sleep(4000);
		
		//linktext locator
		//driver.findElement(By.linkText("View Time-Track")).click();
		
		//partiallinked text loactor
		//driver.findElement(By.partialLinkText("View Ti")).click();
		
		//css selector using id
		//driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
		
		
	//	driver.findElement(By.cssSelector("[name=\"pwd\"]")).sendKeys("manager");
		
		
		//driver.findElement(By.cssSelector("[class=\"initial\"]")).click();
		
		//htmltag#attributevalue         id#
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		
		//htmltag.attribute value       class.
		driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");
		
		//driver.findElement(By.cssSelector([class="textField pwdfield"])).sendKeys("manager");
		
		
		//htmltag#attributevalue
		driver.findElement(By.cssSelector("a#loginButton")).click();
		
		//driver.findElement(By.cssSelector("[id=\"loginButton\"]")).click();


	}

}
