package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Parameter {

    @Test
    public void openWebpage() {
        ChromeOptions notify = new ChromeOptions();
        notify.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(notify);
        //WebDriverWait wait = new WebDriverWait(driver, 10); // You can adjust the timeout as needed
        driver.manage().window().maximize();
        driver.get("https://admindev.maatrum.com");

        driver.findElement(By.name("email")).sendKeys("sendkeyvalu");
        driver.findElement(By.name("email")).sendKeys("sendkeyvalu");

        driver.quit(); // Make sure to close the browser after the test
    }
}
