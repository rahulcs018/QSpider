package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderPops {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","J:\\Basic Selenium\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
	    driver.get("https://www.makemytrip.com/flights ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(2000);
		
		
		WebElement monthDisp1=driver.findElement(By.xpath("(//div[@class='DayPicker-Month']/descendant::div)[1]/div"));
		WebElement NextButton=driver.findElement(By.xpath("//*[@aria-label='Next Month']"));
		
		while(!(monthDisp1.getText().equals("February 2024"))) {
			NextButton.click();
		}
		
		driver.findElement(By.xpath("//div[text()='February 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='20']")).click();

	}

}
