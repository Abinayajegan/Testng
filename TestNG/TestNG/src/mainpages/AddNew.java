package mainpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNew 
{
	public WebDriver driver;
    public WebDriverWait wait;
    private By addButton = By.cssSelector(".btn.sm-btn.green.margin-top-15.ng-tns-c7-0.ng-star-inserted");

 public AddNew(WebDriver driver,WebDriverWait wait) 
	    {
    	this.driver = driver;
//	    this.wait = wait;
	    
	    }
	    
 public WebElement Addbuttonclick() 
 {
	 return wait.until(ExpectedConditions.visibilityOfElementLocated(addButton));
    }
}


    
 
