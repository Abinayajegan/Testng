package testpages;

import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import mainpages.AddNew;
import mainpages.CreateReport;
import mainpages.Legalsite;
import mainpages.LoginPage;
import mainpages.SelectClient;
import mainpages.SelectReport;
import mainpages.SelectState;


public class LoginTestpage{
	WebDriver driver;
	WebDriverWait wait;

	@BeforeTest
	public void test() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions notify = new ChromeOptions();
		notify.addArguments("--disable-notifications");
		notify.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(notify);
		driver.manage().window().maximize();
		driver.get("https://legaldev.maatrum.com/login");
		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		
	}

	@Test
	public void data() throws InterruptedException {
		LoginPage LP      = new LoginPage(driver);
		AddNew AD         = new AddNew(driver,wait);
		SelectClient SC   = new SelectClient(driver,wait);
		SelectState SS    = new SelectState(driver,wait);
		SelectReport SR   = new SelectReport(driver,wait);
		LP.EmailFeild().sendKeys("abinayaj@inventsoftlabs.com");
		LP.PasswordFeild().sendKeys("Abinaya@123");
		LP.LoginButton().click();

		//AD.Addbuttonclick();
		AD.Addbuttonclick().click();
		//SC.MaattumImg();
		SC.MaattumImg().click();
		// SS.ClickState();
		SS.ClickState().click();
		//SR.ClickReport();
		SR.ClickReport().click();

	}
	@Test
	public void reportdata() throws InterruptedException {
		CreateReport CR   = new CreateReport(driver,wait);
		//Actions actions = new Actions(driver);
		CR.ClickSubmit().sendKeys("12356");
		CR.ownerNameFeild().sendKeys("AutoTesting");
		CR.applicantFeild().sendKeys("AutoTesting");
		CR.branchdpdw().click();
		CR.dropdownvalue().click();

		}

		
	}


	//        String mprId = CR.ToastMessage();
	//        
	//
	//        if (mprId != null) {
	//            Legalsite LS = new Legalsite(driver, wait);
	//            LS.Search(mprId);
	//        } else {
	//            System.out.println("MPR ID not found in toast message.");
	//        }
	//       
	//       //driver.quit();



