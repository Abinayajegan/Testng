package mainpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	private By EmailFeild    = By.name("email");
	private By PasswordFeild = By.name("password");
	private By LoginButton   = By.className("btn-inverse");
	
	public LoginPage(WebDriver driver) {
	    
	   this.driver = driver;
	 
	}
	public WebElement EmailFeild() {
		return driver.findElement(EmailFeild);
	}
	public WebElement PasswordFeild() {
		return driver.findElement(PasswordFeild);
	}
	public WebElement LoginButton() {
		return driver.findElement(LoginButton);
	}
		
}