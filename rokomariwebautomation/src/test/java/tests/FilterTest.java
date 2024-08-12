
package tests;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import DriverPackage.BaseDriver;
import Pages.FilterPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import model.CommonMethods;
import model.Locators;

@Epic("Filter Test")
@Feature("Shorting Product")
@Story("In this testcase we tried to test Filter option is working or not")
public class FilterTest extends BaseDriver{
	FilterPage filterPage  = new FilterPage();
	Locators locators = new Locators();
	CommonMethods  cmnMethods = new CommonMethods();
	
	@Test(description = "Filter product as trouser from low to high price as branded for man ")
	@Description("Test Description: This test will try to filter products  "
			+ " and then take screeen short ")
	public void CreateFilter() throws InterruptedException {
	 
		filterPage.Filterbyshop();
		filterPage.Filterbygender();
		filterPage.Filterbyprice();
		filterPage.Filterbybrand();
		filterPage.Filterbysize();
		Thread.sleep(2000);
		cmnMethods.takeScreenShot("Filter Result");
	}
	
}