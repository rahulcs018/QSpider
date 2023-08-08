package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelLearn {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().create();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		FileInputStream rf = new FileInputStream(".\\src\\main\\resources\\detail.properties");
	    Properties uti = new Properties();
		uti.load(rf);
		String url=uti.getProperty("URL");
//		String username=uti.getProperty("username");
//		String password=uti.getProperty("password");
		driver.get(url);
//		driver.manage().window().maximize();
//	
////		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
//		
//		
//		
		FileInputStream fis = new FileInputStream("J:\\Anshika\\selenium\\test.xlsx");
	 
		Workbook excel = WorkbookFactory.create(fis);
		Sheet tab=excel.getSheet("testdata");
			
		Row row=tab.getRow(4);
		Cell cel=row.getCell(0);
		
		String username=cel.getStringCellValue();
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);

		Row row1=tab.getRow(4);
		Cell cel2=row1.getCell(1);
		String password=cel2.getStringCellValue();
		//driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
		
		LoginPage login=new LoginPage(driver);
		login.demoLogin("admin", "rihuy");
		
		
		
		
	}

}
