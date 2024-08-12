package tests;
import org.testng.annotations.Test;

import Pages.*;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import model.CommonMethods;
@Epic("Add to curt Module ")
@Feature("Product is add to curt option ")
@Story("In this testcase we tried to test add to differnet product to curt option  "+"Then we we check add to curt option is working or not  ")
public class Test_Add_to_Curt {
	CommonMethods obCommonMethods =new CommonMethods();
	AddToCartPage objAddToCartPage =new AddToCartPage();
	@Test(priority = 1 , description = "In this testcase we tried to test add to differnet product to curt option  "+"Then we we check add to curt option is working or not  ")
	public void Add_to_Curt_Test_Mathod() throws InterruptedException {
		objAddToCartPage.addtocurtmathod();
		obCommonMethods.takeScreenShot("Screen short is shown after sucessfully added product");
	}
}
