package model;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

import DriverPackage.PageDriver;
import io.qameta.allure.Allure;

public class CommonMethods {
	

	public String currentPageUrl() {
		return PageDriver.getCurrentDriver().getCurrentUrl();
	}
	
	public String getTitle() {
		return PageDriver.getCurrentDriver().getTitle();
	}
	
	public WebElement getElement (By element) {
		return PageDriver.getCurrentDriver().findElement(element);
	}
	
	
	public void Click_Button(By element) {
		getElement(element).click();
	}
	
	public void perform_And_Clieck(By element) throws InterruptedException {
		Actions actions = new Actions(PageDriver.getCurrentDriver());
		actions.moveToElement(PageDriver.getCurrentDriver().findElement(element)).perform();
		Click_Button(element);
		Thread.sleep(3000);
		
	}
	
	public void Scroll_View (By elementBy) throws InterruptedException
	{
		JavascriptExecutor JS = (JavascriptExecutor ) PageDriver.getCurrentDriver();
		JS.executeScript("arguments[0].scrollIntoView(true)",PageDriver.getCurrentDriver().findElement(elementBy));
		Thread.sleep(2000);
	}

	public void customhoberandviewdetails(By hoberBy ,By viwewdetails) {
		Actions actions = new Actions(PageDriver.getCurrentDriver());
		WebElement hoberElement = PageDriver.getCurrentDriver().findElement(hoberBy);
		actions.moveToElement(hoberElement).build().perform();
		WebElement viewclickElement =PageDriver.getCurrentDriver().findElement(viwewdetails);
		JavascriptExecutor executor= (JavascriptExecutor)PageDriver.getCurrentDriver();
		executor.executeScript("arguments[0].click();", viewclickElement);

		
	}
	public void clickOnAButtonJs(String script) {
		JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
		// WebElement el = (WebElement)(js.executeScript("return "+ script));
		// js.executeScript("arguments[0].click();" ,el);
		js.executeScript(script + ".click();");
	}
	
	public void takeScreenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(
				((TakesScreenshot) PageDriver.getCurrentDriver()).getScreenshotAs(OutputType.BYTES)));
	}

	
	
	
}
