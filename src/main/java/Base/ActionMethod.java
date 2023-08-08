package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionMethod {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","J:\\Basic Selenium\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
//		driver.get("https://www.amazon.in/");
//        WebElement data = driver.findElement(By.xpath("//a[text()='Sell']"));
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(data).perform();
		
		
//		driver.get("https://demo.actitime.com/login.do");
//		WebElement UN = driver.findElement(By.xpath("//input[@id='username']"));
//		WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
//		WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
//		
//		Actions act = new Actions(driver);
//		act.sendKeys(UN,"admin").perform();
//		act.sendKeys(Pass,"manager").perform();
//		act.click(login).perform();
//      act.sendKeys(UN,"admin").sendKeys(Pass,"manager").click(login).perform();
		
		
//      act.sendKeys(UN,"admin").sendKeys(Pass,"manager").click(login).build().perform();
		
//		driver.get("https://www.amazon.in/");
//        WebElement data = driver.findElement(By.xpath("//a[text()='Sell']"));
//		
//   		Actions act = new Actions(driver);
//		    act.contextClick(data).perform();
		
//		driver.get("https://jqueryui.com/resources/demos/droppable/default.html ");
//		 WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
//		Thread.sleep(5000);
//		
//		Actions act=new Actions(driver);
//		act.dragAndDrop(drag, drop).perform();
		
		driver.get("https://jqueryui.com/droppable ");
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(5000);
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
		
		
	}

}
