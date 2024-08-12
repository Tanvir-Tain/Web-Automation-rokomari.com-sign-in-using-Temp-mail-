package Pages;

import io.qameta.allure.Step;
import model.CommonMethods;
import model.Locators;


public class FilterPage extends CommonMethods {
	
	Locators locators = new Locators();
	
//	public String getCurrentUrl() {
//		return currentPageUrl();
//		
//	}
	@Step("Filterring by Catagory ")
public void Filterbyshop() throws InterruptedException {

	//currentPageUrl();
	Click_Button(locators.superstoreButton);
	Thread.sleep(2000);
	Scroll_View(locators.ShopbyCategoriesview);
	

	}
	@Step("Filterring by Gender ")
public void Filterbygender() throws InterruptedException {
	
	perform_And_Clieck(locators.fasion);
	Thread.sleep(5000);
	perform_And_Clieck(locators.boy);
		
	}
	@Step("Filterring by Price")
public void Filterbyprice() throws InterruptedException {
	Scroll_View(locators.sortview);
	perform_And_Clieck(locators.lowToHigh);
}
	@Step("Filterring by brand ")
public void Filterbybrand() throws InterruptedException {
	Scroll_View(locators.companiesview);
	perform_And_Clieck(locators.Asilizascompany);
	Scroll_View(locators.companiesview);
	perform_And_Clieck(locators.SmugAsCompany);
}

	@Step("Filterring by size ")
public void Filterbysize() throws InterruptedException {

	Scroll_View(locators.sizeview);
	perform_And_Clieck(locators.sizeAsXL);
		
}
	
	

}
