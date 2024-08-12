
# Web Automation Test on rokomari.com [Supershop module] and Sign in using Temp mail 
## Video: https://youtu.be/i-FNH1g7W1s
## Required Tool
  
- Test tool:  Selenium Webdriver 
- Language: Java  
- Architecture: POM
- Framework: TestNG
- IDE: Eclipse  
  
## Pre Requisites:
  
- Open/install Java JDK 16 version on your PC  
- Install Maven on your PC  
- Install TestNG on your IDE  
- Install Eclipse/STS or any other IDE  
- Setup Java, Maven environment on your PC  
- Chrome Browse  

## Requirements:
- Set Configure build path libraries with JRE System Library 1.8 or above 
- Create a .env file in home directory and write...  

## The Steps executed in these Automation are:

### TestCase 01: Test_001_SignUp With Email 
- click on Sign up button
- Perform testng
- Provide gmail credential from Temp mail website 
- OTP verification from Temp mail .
- Take a screenshot 

### TestCase 02: Test_002_Select_Product_and_Filter
- Click on super store button 
- Wait for Complete Pageload
- Filter Category by selecting fashion, price-low to high, By companies and size.
- Wait for Complete Pageload
- Perform testng
- Take screenshot

### TestCase 03: Test_003_Product_Add_to_curt 
- Add two trouser pants in curt option.
- Click cart icon to go-to My-cart page 
- Wait for Complete Pageload
- Perform testng
- Take screenshot

### TestCase 04: Test_004_ShippingPage

- Click on Go to Shipping Page Button
- Wait for Complete Pageload
- Fill-up forms wih with name & phone number
-  Select Bangladesh from drop-down as a country
- Select Dhaka from drop-down as a City
- Select Mirpur2 from drop-down as an Area
- Provide address text in text field 
- Select COD as payment option
- Scroll-down & Highlights Confirm Order Button
- Perform testng
- Take Screenshot


## Run the script:
- Right Click on testng.xml file
- Then select Run as TestNG
- Run the Cases


## Report Generating:
- report is generated with Allure. 


## Authors

- [@Tanvir_Tain](https://github.com/Tanvir-Tain)

