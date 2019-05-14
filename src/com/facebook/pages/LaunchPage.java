package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.facebook.pages.base.BasePage;
import com.facebook.pom.utils.FBConstants;
import com.relevantcodes.extentreports.ExtentTest;

public class LaunchPage extends BasePage{
	
	//WebDriver driver;
	
   public LaunchPage(WebDriver driver, ExtentTest extest){	  
	   super(driver,extest);
	// this.driver=driver;
	   System.out.println("Activate Launch Page Constructor");
	  // driver.get("https://gmail.com");
   }
	
	
	public LoginPage goToHomePage(){
		driver.get(FBConstants.LAUNCHPAGELINK);
		//return new LoginPage();
		LoginPage loginPage = new LoginPage(driver,test);
		PageFactory.initElements(driver, loginPage);
		//return loginPage;
		//return PageFactory.initElements(driver, LoginPage.class);
		return loginPage;

   }
}