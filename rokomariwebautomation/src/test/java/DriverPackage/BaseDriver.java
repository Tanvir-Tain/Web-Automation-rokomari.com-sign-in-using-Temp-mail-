package DriverPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import io.qameta.allure.Step;
import model.Locators;



public class BaseDriver {

	
	public static WebDriver driver;
	@Step("Stat the application")
	@BeforeSuite
	public void setUp() {
		Locators lc = new Locators();
	
		
		String browser = System.getProperty("browser", "chrome");
		if (browser.contains("opera")) {
			WebDriverManager.operadriver().setup();
			driver = (WebDriver) new OperaDriverManager();
			
		}
		else if (browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(browser.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		PageDriver.getInstance().setDriver(driver);
		driver.get(lc.homePageUrl);
		driver.manage().window().maximize();
	
	}
	@Step("End the application")

	@AfterSuite
	public void tearDown() {
		PageDriver.getCurrentDriver().quit();
	}

	// allure generate ./allure-results --clean
	//allure open ./allure-report
	
}
