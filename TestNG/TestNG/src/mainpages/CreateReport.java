package mainpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CreateReport {
public	WebDriver driver;
	WebDriverWait wait;
	
private By applicationFeild = By.id("applicationNumber");
private By ownerNameFeild  = By.id("ownerName");
private By applicantFeild  = By.id("applicantName");
private By branchdpdw      = By.xpath("//*[@id=\"branch\"]/div/div[1]/div");
private By dropdownvalue   = By.xpath("//*[@id=\"branch\"]/div/div[2]");

public CreateReport(WebDriver driver, WebDriverWait wait) {
	this.driver = driver;
	this.wait = wait;
	
}
public WebElement ClickSubmit() throws InterruptedException {
	return wait.until(ExpectedConditions.visibilityOfElementLocated(applicationFeild));
}
public WebElement ownerNameFeild() {
	return driver.findElement(ownerNameFeild);

}
public WebElement applicantFeild() {
	return driver.findElement(applicantFeild);
}
public WebElement branchdpdw () {
	
	return driver.findElement(branchdpdw);
}

public WebElement dropdownvalue() {
	return driver.findElement(dropdownvalue);
	
}
}
//public String ToastMessage() {
//	  WebElement tostpopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
//	  String toastMessage = tostpopup.getText();
//	  System.out.println("Message:"  + toastMessage);
//	  
//	    Pattern ptrn = Pattern.compile("Maatrum Ref\\. No\\.: (MPR-\\d+-\\d+)");
//	    Matcher matcher = ptrn.matcher(toastMessage);
//	    
//	    if (matcher.find()) {
//	        return matcher.group(1); // Extract the matched MPR ID
//	    }
//	    
//	    return null; // MPR ID not found
//	}
//
//}


