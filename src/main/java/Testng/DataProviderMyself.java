package Testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMyself {

	@Test(dataProvider="data")
    public void openBrower(String URL) {
    	System.setProperty("webdriver.chrome.driver", "J:\\Basic Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(URL);
        driver.close();
}
    @DataProvider(name="data")
    public Object[][] provider() {
    	
    	 Object[][] value=new  Object[2][1];
    	 value[0][0]="https://www.facebook.com/";
    	 value[1][0]="https://www.google.com/";
    	
    	  return value;
    	
    }
    
}