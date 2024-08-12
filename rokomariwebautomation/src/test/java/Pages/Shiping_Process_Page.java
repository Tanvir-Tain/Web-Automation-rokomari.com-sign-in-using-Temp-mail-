package Pages;


import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.qameta.allure.Step;
import model.CommonMethods;
import model.Locators;

public class Shiping_Process_Page {
	
	CommonMethods objCommonMethods = new CommonMethods();
	Locators objLocators = new Locators();
	@Step ("test cases 001")
	@Test(priority=1)
	public void Shiping_Process_Page_Mathod() throws InterruptedException
	{
		Thread.sleep(2000);
		objCommonMethods.Click_Button(objLocators.curtButton);
		Thread.sleep(2000);
		objCommonMethods.Scroll_View(objLocators.scrlprm);
		Thread.sleep(3000);
		objCommonMethods.perform_And_Clieck(objLocators.continue_Shipping);
		//objCommonMethods.Click_Button(objLocators.continue_Shipping);
		Thread.sleep(2000);
		
	}
	@Step ("test cases 002")
	@Test(priority=2)
	public void ShipingAddress () throws InterruptedException {
	
		objCommonMethods.Click_Button(objLocators.name);
		objCommonMethods.getElement(objLocators.name).sendKeys("Dimond In the sky ");
		Thread.sleep(2000);
		objCommonMethods.Click_Button(objLocators.phonenumber);
		objCommonMethods.getElement(objLocators.phonenumber).sendKeys("01700000000");
		Thread.sleep(2000);
		objCommonMethods.Click_Button(objLocators.alterphonenumber);
		objCommonMethods.getElement(objLocators.alterphonenumber).sendKeys("01500000000");
		Thread.sleep(2000);
		Select jscountrySelect = new Select(objCommonMethods.getElement(objLocators.jscountry));
		jscountrySelect.selectByValue("1");
		Thread.sleep(2000);
		Select jscitySelect = new Select(objCommonMethods.getElement(objLocators.jscity));
		jscitySelect.selectByValue("2");
		Thread.sleep(2000);
		Select jsareaselect = new Select(objCommonMethods.getElement(objLocators.jsarea));
		jsareaselect.selectByValue("774");
		Thread.sleep(1000);
		objCommonMethods.getElement(objLocators.addessBy).sendKeys("Dhaka 1216 empty house and cancel order test purpose order checked ");
		Thread.sleep(2000);
		
	}
	@Step ("test cases 003")
	@Test(priority=3)
	public void paymenetmathod () throws InterruptedException {
		
		objCommonMethods.Scroll_View(objLocators.scrlcashdelevery);
		objCommonMethods.Click_Button(objLocators.cashondelevary);
		Thread.sleep(2000);
	}

}
