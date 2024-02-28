package mainpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectClient {
	  WebDriver driver;
	    WebDriverWait wait;
private By maatrum = By.cssSelector("img[src='/assets/img/clients/mat.png']");
public SelectClient(WebDriver driver,WebDriverWait wait) {
  	this.driver = driver;
	    this.wait = wait;
	    }
	
	public  WebElement MaattumImg() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(maatrum));
		
	}
	
}
