package com.facebook.pages;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

public class TopMenu {
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver){
		this.driver = driver;
	}
	
	public TopMenu(WebDriver driver2, ExtentTest test) {
		// TODO Auto-generated constructor stub
	}

	public void logout(){
		System.out.println("Logging Out From Site");
	}

	public void gotoSettings(){
		System.out.println("Going To Settings");
	}
	
	public void gotoSearch(){
		System.out.println("Going To gotoSearch");
	}
}
