package mainpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Legalsite {
	WebDriver driver;
	WebDriverWait wait;
	private By search = By.id("mprDashboard_processing");
public Legalsite(WebDriver driver, WebDriverWait wait) {
	this.driver = driver;
	this.wait = wait;
}
public WebElement Search(String mprId) {
	return wait.until(ExpectedConditions.visibilityOfElementLocated(search));
sendKeys(mprId);
	
}
}