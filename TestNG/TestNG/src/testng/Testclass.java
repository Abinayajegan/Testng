 
package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testclass {
	@DataProvider(name = "login")
	public String[][] getData()
	{
		String[][] data = new String [2][2];
		data[0][0] = "abinayaj@inventsoftlabs.com";
		data[0][1] = "Abinaya@123";
		data[1][0] = "abinayaj@invent.com";
		data[1][1] = "Abinaya@123";
		return data;
	 }
	@Test(dataProvider = "login")
	public void login(String Email, String Password)
	{
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://legaldev.maatrum.com/login?returnURL=%2Fapp%2Fdashboard");
	driver.findElement(By.name("email")).sendKeys(Email);
	driver.findElement(By.name("password")).sendKeys(Password);
	driver.findElement(By.cssSelector(".btn-inverse")).click();
	//driver.quit();
	}
	}


