package Pages;
import model.*;

import java.util.ArrayList;

import DriverPackage.*;

public class AddToCartPage {

	CommonMethods objCommonMethods = new CommonMethods();
	Locators objLocators = new Locators();
	
	public void addtocurtmathod() throws InterruptedException 
	{
	
//	objCommonMethods.customhoberandviewdetails(objLocators.Frist_Product_Hober, objLocators.Frist_Product_View_Details);
//	Thread.sleep(2000);
//	objCommonMethods.Click_Button(objLocators.Addtocurtbutton);
//	Thread.sleep(2000);
//	PageDriver.getCurrentDriver().navigate().back();
//	objCommonMethods.customhoberandviewdetails(objLocators.Second_Product_Hober, objLocators.Second_Product_View_Details);
//	objCommonMethods.Click_Button(objLocators.Addtocurtbutton);
//	//objCommonMethods.Click_Button(objLocators.curt_Button_Clieck);
	
	Thread.sleep(2000);
	objCommonMethods.Scroll_View(objLocators.chinatr1);
	Thread.sleep(2000);
	objCommonMethods.Click_Button(objLocators.chinatr1);
	Thread.sleep(2000);
	
	ArrayList<String> tabbs = new ArrayList<>(PageDriver.getCurrentDriver().getWindowHandles());
	PageDriver.getCurrentDriver().switchTo().window(tabbs.get(1));
	objCommonMethods.Click_Button(objLocators.Addtocurtbutton);
	PageDriver.getCurrentDriver().close();
	ArrayList<String> tabs = new ArrayList<>(PageDriver.getCurrentDriver().getWindowHandles());
	PageDriver.getCurrentDriver().switchTo().window(tabs.get(0));
	objCommonMethods.Scroll_View(objLocators.chinatr2);
	Thread.sleep(2000);
	objCommonMethods.Click_Button(objLocators.chinatr2);
	Thread.sleep(2000);
	ArrayList<String> tabrs = new ArrayList<>(PageDriver.getCurrentDriver().getWindowHandles());
	PageDriver.getCurrentDriver().switchTo().window(tabrs.get(1));
	objCommonMethods.Click_Button(objLocators.Addtocurtbutton);
	PageDriver.getCurrentDriver().close();
	ArrayList<String> tabrrs = new ArrayList<>(PageDriver.getCurrentDriver().getWindowHandles());
	PageDriver.getCurrentDriver().switchTo().window(tabrrs.get(0));
	PageDriver.getCurrentDriver().navigate().refresh();
	
	}
	


}
