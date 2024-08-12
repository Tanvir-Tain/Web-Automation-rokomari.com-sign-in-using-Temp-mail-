package tests;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import DriverPackage.BaseDriver;
import Pages.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import model.CommonMethods;
@Epic("Registration")
@Feature("Sign In with Temporary mail ")
@Story("In this testcase we tried to test Sign In  option is working or not"+"Then we sign In with Temporary mail address with OTP automatically ")
public class Test_HomePage extends BaseDriver {
	
	HomePage objectHomePage =new HomePage();
	CommonMethods obCommonMethods =new CommonMethods();
	
	
	
	@Test(description = "Sign In from rokomari.com")
	@Description("Test Description: This test will try to Sign In from rokomari.com with temporaryu mail address ")
	public void homepagetestmethod() throws InterruptedException {
		
		objectHomePage.closePopupBannaer();
		objectHomePage.homepagetitlle();
		objectHomePage.signin();
		obCommonMethods.takeScreenShot("Home page After successfully Sign In ");
		//obCommonMethods.Tempmail();
	}
	
	
	
}
