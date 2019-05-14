package com.facebook.pages.base;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.facebook.pages.TopMenu;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BasePage {
	
	public WebDriver driver;
	public TopMenu menu;
	public ExtentTest test;
	
	public BasePage(){
		System.out.println("BasePage EMPTY Constructor");		
	}
	
	public BasePage(WebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test=test;
		menu = new TopMenu(driver,test);
		PageFactory.initElements(driver, menu);
		//menu = PageFactory.initElements(driver, TopMenu.class);		
	}
	
	public void verifyTitle(String expectedTitle){
		test.log(LogStatus.INFO,"Entering VerifyTitle");
		
	}
	public Boolean isElementPresent(){
		//Write TakeScreenShot Code Here
		return false;
	}
	
	public void takeScreenShot(){
		//Write TakeScreenShot Code Here 
		Date date = new Date();
		String screenFile = date.toString().replace(":","__").replace(" ","__")+".png";
		String filePath = System.getProperty("user.dir")+"//Screeshot//"+screenFile;
		System.out.println("print filepathe " + filePath);
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile,new File(filePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.INFO,test.addScreenCapture(filePath));
		
		
	}
	
	
	public void takeScreenShot1(){
		
		Date d = new Date();
		String screenfilename = d.toString().replace(":","__").replace(" ","__")+".png";
		String filepath=System.getProperty("user.dir")+"//ScreenSHOT//"+screenfilename;
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile,new File( filepath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		test.log(LogStatus.INFO,test.addScreenCapture("C://$_58.jpg"));
		
	}
	
	public TopMenu getTopMenu(){
		test.log(LogStatus.INFO,"Entering getTopMenu");
		//if(menu==null){
			//menu=new TopMenu(driver);
		//}
		return menu;
	}

}
