package mainpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectReport {
	WebDriver driver;
	WebDriverWait wait;
	private By Report = By.cssSelector("img[src='/assets/img/report-type/mpr3.png\']");
	public SelectReport(WebDriver driver,WebDriverWait wait) {
		this.driver = driver;
		this.wait   = wait;
	}


	public WebElement ClickReport() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated
				(Report));
	}
}
