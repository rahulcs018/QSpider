package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	ChromeDriver driver=null;

	@BeforeMethod
    public void openBrower() {
    	System.setProperty("webdriver.chrome.driver", "J:\\Basic Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		System.out.println("driver initiated");
		
		
		
	}
	
	@Test(dataProvider="dataURL",priority=1)
	public void urlTesting(String url) {
		driver.get(url);
	}
	
		
	@Test(dataProvider="data",priority=2)
	public void searchOnGoogle(String name) {
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys(name);
		search.submit();
		
	}
	
	@AfterMethod
		public void closeBrowser() {
			driver.close();
			System.out.println("driver closed");
 
		
	}
	
	  @DataProvider(name="data")
	    public Object[][] provider() {
	    	
	    	 Object[][] value=new  Object[1][1];
	    	 value[0][0]="Anshika";
	    	
	    	  return value;
	    	
	    }
	  
	  @DataProvider(name="dataURL")
	    public Object[][] URLprovider() {
	    	
	    	 Object[][] value=new  Object[1][1];
	    	 value[0][0]="https://www.facebook.com/";
	    	
	    	
	    	  return value;
	    	
	    }
}
