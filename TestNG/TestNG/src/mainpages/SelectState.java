package mainpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectState {
	WebDriver driver;
	WebDriverWait wait;
	private By State = By.cssSelector("img[Src='/assets/img/states/tn.png']");
public SelectState(WebDriver driver,WebDriverWait wait) {
this.driver = driver;
this.wait = wait;
}
	
public WebElement ClickState() {
	return wait.until(ExpectedConditions.visibilityOfElementLocated(State)); 
}
}