package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.pages.base.BasePage;
import com.facebook.pom.testcases.base.TestBase1;
import com.relevantcodes.extentreports.ExtentTest;

public class LandingPage extends BasePage {
	@FindBy(xpath="//*[@id='navItem_100013249511309']/a/span/img")
	public WebElement ProfilePicture;
	
	//WebDriver driver;
	//ExtentTest test;
	
	public LandingPage (WebDriver driver, ExtentTest test){
		super(driver, test);
		//this.driver= driver;		
	}
	
	public ProfilePage goToProfilePage(){
		//Code to goto ProfilePage 		 
		//ProfilePage profilePage = new ProfilePage();
		ProfilePicture.click();
		ProfilePage ProfPage = new ProfilePage(driver, test);
		PageFactory.initElements(driver,ProfPage);
		return ProfPage;
		//return PageFactory.initElements(driver, ProfilePage.class);
	}

	public void verifyTitle(String exppectedTitle) {
		// TODO Auto-generated method stub
		
	}

}
