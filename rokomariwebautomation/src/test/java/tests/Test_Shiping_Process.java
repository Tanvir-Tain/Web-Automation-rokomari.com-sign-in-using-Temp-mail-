package tests;


import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pages.Shiping_Process_Page;
import io.qameta.allure.Description;
import model.CommonMethods;


public class Test_Shiping_Process {
	Shiping_Process_Page spg = new Shiping_Process_Page();
	CommonMethods obCommonMethods =new CommonMethods();
	@Test(priority=1 ,description = "After adding product in add to curt shipping process will be check ")
	@Description("Test Description: This test will try to test shipping process will work perfectlly or not ")
	public void Shiping_Process_Test_Mathod() throws InterruptedException {
		
		spg.Shiping_Process_Page_Mathod();
		spg.ShipingAddress();
		spg.paymenetmathod();
		obCommonMethods.takeScreenShot("Screen short is shown after fulling delivery information");
	
	}

}
