package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElement_Learn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","J:\\Basic Selenium\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//getCssValue (WebElement)
		
		WebElement value = driver.findElement(By.xpath("//a[text()='Create new account']"));
//		boolean enable = value.isEnabled();
//		if(enable){
//			 System.out.println(" Name displayed");	
//		}else {
//			System.out.println(" not displayed");	
	//	}
	
//        String data = value.getCssValue("font-size");	
//        System.out.println("font ="+data);
//        String bc = value.getCssValue("background-color");	
//        System.out.println("Color "+bc);
//        String ht = value.getCssValue("line-height");	
//        System.out.println("height "+ht);
        
        // get text()
        
//          driver.findElement(By.xpath("//button[@name='login']")).click();
//        WebElement manual = driver.findElement(By.xpath("//div[@class='_9ay7']"));
//        String datat = manual.getText();
//        System.out.println(datat);
        
        value.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
//     Point XY = firstname.getLocation();
//     System.out.println(XY);
//     int X = XY.getX();
//     
//     int y= XY.getY();
//     System.out.println(X);
//     System.out.println(y);
     
       // firstname.sendKeys("Anshika");
      String dehh = firstname.getDomProperty("placeholder");
      System.out.println(dehh);
      String freg = firstname.getDomAttribute("class");
      System.out.println(freg);
      String tagg = firstname.getTagName();
      System.out.println(tagg);
      String access = firstname.getAccessibleName();
      System.out.println(access);
        //firstname.clear();
       
        
//        //DOM  Document Object model
//      boolean display= firstname.isDisplayed();
//      if(display) {
//    	  System.out.println("First Name displayed");
//      }else {
//    	  System.out.println("First Name not displayed");
//      }
//        firstname.sendKeys("Anshika");
//        //String dr = firstname.getDomAttribute("type");
//        String dr = firstname.getDomAttribute("src");
//         System.out.println(dr);
         
        
        
        
	}

}
