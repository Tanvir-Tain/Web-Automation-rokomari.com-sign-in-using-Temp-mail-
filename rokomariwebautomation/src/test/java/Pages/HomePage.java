package Pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import DriverPackage.PageDriver;

import io.qameta.allure.Step;
import model.CommonMethods;
import model.Locators;

public class HomePage extends CommonMethods{
	
	CommonMethods obCommonMethods =  new CommonMethods();
	Locators objLocators = new Locators();
	@Step("Close POP up Banner")
	public void closePopupBannaer() throws InterruptedException {
		Thread.sleep(2000);
		try {
			clickOnAButtonJs(objLocators.hompagePopupBannarJs);
		} catch (Exception e) {
			System.out.println("Pop up is not present");
		}
	}
	@Step("Home page tittle test ")
	public void homepagetitlle() {
		
		String uuString = obCommonMethods.getTitle();
		assertEquals(obCommonMethods.getTitle(),objLocators.homepage_TittleString);
		System.out.println(uuString);
	}
	@Step("Sign In with Temporary mail address ")
	public void signin() throws InterruptedException {
		
		obCommonMethods.Click_Button(objLocators.home_Button_Sign_In_Button);
		
		Actions actions = new Actions(PageDriver.getCurrentDriver());
		WebDriverWait wait = new WebDriverWait(PageDriver.getCurrentDriver(),Duration.ofSeconds(20));
		Thread.sleep(1000); 
		PageDriver.getCurrentDriver().switchTo().newWindow(WindowType.TAB);
		PageDriver.getCurrentDriver().get("https://temp-mail.org/en/");
		
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.cssSelector("#mail"), "Loading"));
		 Thread.sleep(2000);//WebElement mailElement  = 
		WebElement mailElement  = PageDriver.getCurrentDriver().findElement(By.cssSelector("#mail"));
		mailElement.click();

		actions.keyDown(Keys.CONTROL).sendKeys("a");
		actions.keyUp(Keys.CONTROL).build().perform();
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL).build().perform();
		
		ArrayList<String> tabs = new ArrayList<>(PageDriver.getCurrentDriver().getWindowHandles());
		PageDriver.getCurrentDriver().switchTo().window(tabs.get(0));
		
		PageDriver.getCurrentDriver().findElement(By.xpath("//input[@placeholder='Email or phone']")).click();
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000); 
		
		PageDriver.getCurrentDriver().findElement(By.xpath("//button[@id='js--btn-next']")).click();

		Thread.sleep(4000); 
	
		ArrayList<String> tabbs = new ArrayList<>(PageDriver.getCurrentDriver().getWindowHandles());
		PageDriver.getCurrentDriver().switchTo().window(tabbs.get(1));
		
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//p[@class='emptyInboxTitle']"), "Your inbox is empty"));

		//Thread.sleep(7000); 
		
		WebElement  element = 	PageDriver.getCurrentDriver().findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[2]/div[2]/span[1]/a[1]"));
		//System.out.print(element.getText());
		
		String testString = element.getText();
		String[] parts = testString.split(" ");
		String lastWord = parts[parts.length - 1];
		PageDriver.getCurrentDriver().close();
		ArrayList<String> tabbbs = new ArrayList<>(PageDriver.getCurrentDriver().getWindowHandles());
		PageDriver.getCurrentDriver().switchTo().window(tabbbs.get(0));
		
		PageDriver.getCurrentDriver().findElement(By.xpath("//input[@placeholder='OTP']")).sendKeys(lastWord);
		PageDriver.getCurrentDriver().findElement(By.xpath("//body/div[@id='login-registration']/div[1]/section[1]/div[1]/div[2]/div[2]/form[2]/button[1]")).click();
		Thread.sleep(3000); 
		
	}
	

}
