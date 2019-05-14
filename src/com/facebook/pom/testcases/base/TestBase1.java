package com.facebook.pom.testcases.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.facebook.pom.utils.ExtentManager;
import com.facebook.pom.utils.ExtentManager1;
import com.facebook.pom.utils.FBConstants;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestBase1 {
	
	public static WebDriver driver;
	String Btype;	
	public ExtentReports extent;// = ExtentManager1.getInstance();
	public ExtentTest extest;
	
	public void init(String Btype){
		extest = extent.startTest("init");
		extest.log(LogStatus.INFO,"Opening Browser");
		if(Btype.equals(FBConstants.Mozilla)){
			driver = new FirefoxDriver();
		}else if(Btype.equals("IE")){
			System.setProperty("webdriver.ie.driver",FBConstants.IEDRIVER);
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

}
