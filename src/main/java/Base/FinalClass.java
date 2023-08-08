package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FinalClass {
	public static void main(String[] args) {

		// Launching Browser
//		WebDriver driver;
//		WebDriverManager.edgedriver().setup();
//		driver=new EdgeDriver();
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
		
		//driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","J:\\Basic Selenium\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		

		// Launching Web Application
		driver.get("https://www.facebook.com/");

		// Title of the Webpage
		String title = driver.getTitle();
		System.out.println(title);

		// URL of the Web Appliation
		String URL = driver.getCurrentUrl();
		System.out.println(URL);

		// print sourcecode of the webpage
		String source = driver.getPageSource();
		System.out.println(source);

		// close only focused window
		driver.close();

		// close entire window
	    driver.quit();

	}
}
