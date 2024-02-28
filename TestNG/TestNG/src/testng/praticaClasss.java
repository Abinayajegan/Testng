package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class praticaClasss {
    @Parameters({"emailID","Password"})
	@Test
	public void test() {
	
		ChromeOptions notify = new ChromeOptions();
		notify.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(notify);
		driver.manage().window().maximize();
		driver.get("https://admindev.maatrum.com/login");
		String sendkeyvalu = "abinayaj@inventsoftlabs.com";
//		driver.findElement(By.name("email")).sendKeys("sendkeyvalu");
		System.out.println("Passing Emai id : " + sendkeyvalu);
		String passwd = "Abinaya@123";
//		driver.findElement(By.name("password")).sendKeys("passwd");
		System.out.println("Passing password : " + passwd);
		driver.findElement(By.className("btn-inverse")).click();
		driver.quit();

	}

}
