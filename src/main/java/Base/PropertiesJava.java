package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PropertiesJava {

	public static void main(String[] args) throws Throwable {
		 
			System.setProperty("webdriver.chrome.driver","J:\\Basic Selenium\\chromedriver.exe");	
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
			FileInputStream file = new FileInputStream("/BasicSeleniumWithMaven/src/main/java/Base/test.properties");
			Properties pro=new Properties();
			pro.load(file);
			String URL = pro.getProperty("url");
			String user = pro.getProperty("username");
			String pass = pro.getProperty("password");
			
			
			
		    driver.get(URL);
		    driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys(user);
	        driver.findElement(By.xpath("//input[contains(@class,'textField pwdfield')]")).sendKeys(pass);

	}

}
