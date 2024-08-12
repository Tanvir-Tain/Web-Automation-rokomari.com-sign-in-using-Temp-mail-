package model;

import org.openqa.selenium.By;


public class Locators {
	
	
	//home page
		public String homePageUrl = "https://www.rokomari.com/book";
		public String tempmail = "https://temp-mail.org/en/"; 
		public String hompagePopupBannarJs = "document.querySelector(\"div[id='js--entry-popup'] i[class='ion-close-round']\")";
		public String homepage_TittleString = "Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com" ;
	
		
	//signIn
		
		public By home_Button_Sign_In_Button  = By.xpath("//a[normalize-space()='Sign in']");
		
	
	//Filter Categories 
		public By superstoreButton = By.xpath("//a[contains(text(),'সুপার স্টোর')]");
		public By ShopbyCategoriesview = By.xpath("//p[contains(text(),'Shop by Categories')]");
		public By fasion           = By.xpath("//body/section[@id='category-home']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/a[3]/i[1]");
		public By boy			   = By.xpath("//span[contains(text(),'Boys')]");
		public By sortview		    = By.xpath("//p[contains(text(),'Sort')]");
		public By lowToHigh		   =By.xpath("//label[normalize-space()='Price - Low to High']");
		
		public By companiesview	   =By.xpath("//p[contains(text(),'By Companies')]");
		public By Asilizascompany	=By.xpath("//label[contains(text(),'ASILZ')]");
		public By SmugAsCompany	   =By.xpath("//label[contains(text(),'Smug')]");
		public By sizeview	   =By.xpath("//p[contains(text(),'Size Variation')]");
		public By sizeAsXL	   = By.xpath("//label[normalize-space()='XL']");
		
		
	// Add to curt 
		public By Addtocurtbutton = By.xpath("//span[contains(text(),'Add to Cart')]");
		
		public By chinatr1 = By.xpath("//body[1]/div[7]/div[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[5]/div[1]/a[1]/div[1]/img[1]");
		public By chinatr2 = By.xpath("//div[@title='SMUG Stylish Trousers for Men - Made of Soft and Comfortable Chinese Fabric - Joggers - Deep Gray Smug']//div[1]//img[1]");
		
		
		public By Frist_Product_Hober = By.xpath("//h4[contains(text(),'SMUG Stylish Trouser Red mix contrast (China) Fabr')]");
		public By Second_Product_Hober =By.xpath("//div[@title='SMUG Stylish Trousers (Chinese) - Soft and Comfortable Joggers - Grey Smug']//div[2]//h4[1]");
		
		public By Frist_Product_View_Details =By.xpath("//div[@title='SMUG Stylish Trouser Red mix contrast (China) Fabric soft and comfortable - Black Smug']//a[@class='btn home-details-btn btn-block transparent-background'][normalize-space()='View Details']");
		public By Second_Product_View_Details =By.xpath("//div[@title='SMUG Stylish Trousers (Chinese) - Soft and Comfortable Joggers - Grey Smug']//a[@class='btn home-details-btn btn-block transparent-background'][normalize-space()='View Details']");
		
		
	// Cut Icon button clieck
		
		public By curt_Button_Clieck = By.xpath("//span[@class='js--cart-quantity']");
		
	// Shipping Process
		public By curtButton = By.xpath("//img[@alt='cart']");
		// Check Out
		public By scrlprm = By.xpath("//b[normalize-space()='Promo Code or Voucher Code']");
		//public By continue_Shipping = By.xpath("//span[normalize-space()='Check Out']");
		public By continue_Shipping = By.xpath("//body/div[@id='cart-page-new']/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]/span[1]");
		//public By proced_to_check_Out = By.xpath("//span[normalize-space()='Proceed to Check Out']");
		
		
	// Address Info 
		
		// public By = By.xpath();
		
		public By name  = By.xpath("//div[@class='shipping-form-container']//input[@id='name']");
		public By phonenumber= By.xpath("//fieldset[@class='group']//input[@id='phone']");
		public By alterphonenumber  = By.xpath("//fieldset[@class='group']//input[@id='phone2']");
		public By jscountry = By.xpath("//select[@id='js--country']");
		public By jscity  = By.xpath("//select[@id='js--city']");
		public By jsarea = By.xpath("//select[@id='js--area']");
		public By addessBy  = By.xpath("(//textarea[@id='address'])[1]");
		
		public By scrlcashdelevery = By.xpath("//p[contains(text(),'ক্যাশ অন ডেলিভারি')]");
		public By cashondelevary  = By.xpath("//label[@for='COD']");
	//public By scrlcashdlvy = By.xpath("//p[contains(text(),'ক্যাশ অন ডেলিভারি')]");
	
		
}
