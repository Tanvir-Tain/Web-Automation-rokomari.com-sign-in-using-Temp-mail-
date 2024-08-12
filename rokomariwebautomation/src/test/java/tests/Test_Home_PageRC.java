package tests;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import DriverPackage.BaseDriver;
import Pages.AddToCartPage;
import Pages.FilterPage;
import Pages.HomePage;
import Pages.Shiping_Process_Page;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import model.CommonMethods;
import model.Locators;
@Epic("Registration")
@Feature("Sign In with Temporary mail ")
@Story("In this testcase we tried to test Sign In  option is working or not"+"Then we sign In with Temporary mail address with OTP automatically ")
public class Test_Home_PageRC extends BaseDriver {
	
	HomePage objectHomePage =new HomePage();
	CommonMethods obCommonMethods =new CommonMethods();
	
	FilterPage filterPage  = new FilterPage();
	Locators locators = new Locators();
	CommonMethods  cmnMethods = new CommonMethods();
	
	
	@Test(priority = 1 ,description = "Sign In from rokomari.com")
	@Description("Test Description: This test will try to Sign In from rokomari.com with temporaryu mail address ")
	public void homepagetestmethod() throws InterruptedException {
		
		objectHomePage.closePopupBannaer();
		objectHomePage.homepagetitlle();
		Thread.sleep(3000);
		objectHomePage.signin();
		obCommonMethods.takeScreenShot("Home page After successfully Sign In ");
		//obCommonMethods.Tempmail();
	}
	@Test(priority = 2 ,description = "Filter product as trouser from low to high price as branded for man ")
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
	
	AddToCartPage objAddToCartPage =new AddToCartPage();
	@Test(priority = 3 ,description = "Product is added on curt")
	@Description("Test Description: This test will try to add product in curt option   "
			+ " and then take screeen short ")
	public void Add_to_Curt_Test_Mathod() throws InterruptedException {
		objAddToCartPage.addtocurtmathod();
	}
	Shiping_Process_Page spg = new Shiping_Process_Page();
	
	@Test(priority = 4 ,description = "After adding product in add to curt shipping process will be check ")
	@Description("Test Description: This test will try to test shipping process will work perfectlly or not ")
	public void Shiping_Process_Test_Mathod() throws InterruptedException {
		
		spg.Shiping_Process_Page_Mathod();
		spg.ShipingAddress();
		spg.paymenetmathod();
	
	}
}
