package com.google.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.pom.testcases.base.TestBase;

public class LoginGooglePage extends TestBase {
	
	@FindBy(css="#headingSubtext > content")
	public List<WebElement> signinText_css;
	
	@FindBy(css="#headingSubtext > content")
	public WebElement signinText_cssx;
	
	@FindBy(css = "#identifierId")
	public WebElement emailInput;
	
	@FindBy(xpath="//button[contains(text(),'Forgot email?')]")
	public WebElement forgotPwd_xp;
	@FindBy(css="button[text()*='Forgot email?']")
	public WebElement forgotPwd_css;
	
	
	public LoginGooglePage(){
		System.out.println("Enter PageFactory.Init");
		PageFactory.initElements(driver,this);	
		System.out.println("Exiting PageFactory.Init");
	}
	
	public boolean isSignTextPresent(){	
		//System.out.println("Exiting isSignInText Present");
		System.out.println("Enter isSignText Present");
		if(signinText_css.size()>0){
			return true;
		} 
		System.out.println("Exiting isSignInText Present");	
		return false;
	}
	public boolean verifySignInTest(WebElement locator,String expected){
		String actual = locator.getText();
		//String actual = signinText_cssx.getTagName();
		if(actual.equals(expected)){
			return true;
		}else{
			return false;
		}
		
		
	}

}
