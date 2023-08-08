package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenLearn {
	public static void main(String[] args) throws Throwable {

		// WebDriver driver = new ChromeDriver();

		// System.setProperty("webdriver.chrome.driver",
		// "J:\\Software\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		  
	
	FileInputStream rf = new FileInputStream(".\\src\\main\\resources\\detail.properties");
	Properties uti = new Properties();
	uti.load(rf);
	String url=uti.getProperty("URL");
	String username=uti.getProperty("username");
	String password=uti.getProperty("password");
	
		
		WebDriverManager.edgedriver().create();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get(url);
		
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		driver.findElement(By.xpath("(//div[@class='checkbox inactive'])[2]")).click();
		driver.findElement(By.xpath("//div[@class='delete button']")).click();
		
		
		
		//driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\DELL\\Desktop\\Batch Link.txt");
		
		
		
		
		
		//Drag and drop method
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("http://jqueryui.com/droppable");
//		driver.switchTo().frame(0);
//		Actions act = new Actions(driver);
//		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
//		act.dragAndDrop(drag, drop).perform();
		
		

		
    // Make my trip method
		
//	driver.get("https://www.makemytrip.com/");
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]")).click();
//	driver.findElement(By.xpath("//span[text()='Departure']")).click();
//	driver.findElement(By.xpath("//div[text()='March 2023']"
//			   + "/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='25']")).click();
//	driver.findElement(By.xpath("//*[text()='Return']")).click();
//	driver.findElement(By.xpath("//div[text()='April 2023']" +"/ancestor:://div[@class='DayPicker-Month']/descendant:://p[text()='19']")).click();

     // popup method
		
	//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	driver.findElement(By.xpath("//span[text()='Departure']")).click();
	//driver.findElement(By.xpath("//div[text()='March 2023']"
	//   + "/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='23']")).click();
		//Window.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.xpath("//button[text()='click']")).click();
//		String currentWindowName = driver.getWindowHandle();
//		System.out.println(currentWindowName);
		//Set<String> Windows = driver.getWindowHandles();
		
//		for(String Refer:Windows) {
//			driver.switchTo().window(Refer);
//			String Title= driver.getTitle();
//			if(Title.equals("Selenium")) {
//				System.out.println("Do not do anything....");
//			}
//			else
//			{
//				driver.close();
//			}
//		}
//   
//	
	}
//
}
