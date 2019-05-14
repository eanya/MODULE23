package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.pages.base.BasePage;
import com.facebook.pom.utils.FBConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//public class LoginPage{
public class LoginPage extends BasePage {

	//@FindBy(css="#loginbutton>input:first-child")WebElement loginButton;
	@FindBy(css=FBConstants.LOGINBUTTON)
	public WebElement loginButton;
	@FindBy(xpath="//*[@id='email']")
	public WebElement inputUsrn;
	@FindBy(xpath="//*[@id='pass']")
	public WebElement inputpwd;
	
	//WebDriver driver;
	public LoginPage(WebDriver driver,ExtentTest test){
		//this.driver = driver;
		super(driver, test);
	}
	
	public Object  doLogin(String usrname, String passowrd){
		driver.manage().deleteAllCookies();
		inputUsrn.sendKeys(usrname);
		inputpwd.sendKeys(passowrd);
		inputpwd.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id='u_0_q']")).click();
		//loginButton.click();
		//Validate Page
		//login()
		boolean isLoginSuccess = true;
		if(isLoginSuccess){
			test.log(LogStatus.INFO,"Login is A Successful");
		LandingPage landingPage = new LandingPage(driver,test);
		PageFactory.initElements(driver, landingPage);
		return landingPage;
		
		}
		else{
		test.log(LogStatus.INFO,"Login is UNSuccessful");
		LoginPage loginPage = new LoginPage(driver,test);
		PageFactory.initElements(driver,loginPage);
		return loginPage;
		}
		
	}

	public void verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		
	}

}
