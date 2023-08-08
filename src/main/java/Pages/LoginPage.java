package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement password;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[text()='Enter Time-Track']")
	private WebElement viewLink;
	
	public void demoLogin(String user, String pwd) {
		username.sendKeys(user);
		password.sendKeys(pwd);
		loginButton.click();
		viewLink.click();
		
	}
	
	
	

}
