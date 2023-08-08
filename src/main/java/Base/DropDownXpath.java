package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownXpath {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","J:\\Basic Selenium\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement value = driver.findElement(By.xpath("//a[text()='Create new account']"));
        value.click();
     //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
      
        
        WebElement signup = driver.findElement(By.xpath("//div[@class='_1lch']/child::button"));
        
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        
        WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(5));
        wt.until(ExpectedConditions.visibilityOf(signup));
           
        Select daylist = new Select(day);
        daylist.selectByIndex(1);
        
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select monthlist = new Select(month);
       // monthlist.selectByValue("3");
        monthlist.selectByVisibleText("Apr");
        

        
        

	}

}
