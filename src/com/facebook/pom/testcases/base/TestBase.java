package com.facebook.pom.testcases.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

import com.facebook.pom.utils.Constants;
import com.facebook.pom.utils.ExtentManager;
import com.facebook.pom.utils.FBConstants;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestBase {
	public static WebDriver driver;
	public static  Properties  prop;
	public static ExtentReports exRep; //= ExtentManager.getInstance("TestBase");
	public static  ExtentTest exTest;
	
	public TestBase(){
		exRep = ExtentManager.getInstance("TestBase");
		
		System.out.println("Entering TestBase");
		exTest = exRep.startTest("TestBase");
		
		try {
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+ "\\src\\com\\module23\\config\\config.properties");
			exTest.log(LogStatus.INFO,"Entering prop.load (properties)");
			prop = new Properties();
		    prop.load(fs);
		    exTest.log(LogStatus.INFO,"Exiting prop.load (properties)");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	System.out.println("Exiting TestBase");	
	
	
		
	}
	
	
	
	
	public void init(String Btype){
		if(Btype.equals("Mozilla")){
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + FBConstants.FFDRIVER);
			driver = new FirefoxDriver();
		}else if (Btype.equals("IE")){
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir") + FBConstants.IEDRIVER);
			driver = new InternetExplorerDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT,TimeUnit.SECONDS);
		//String env = prop.getProperty("env");
		//driver.get(prop.getProperty("url_"+env));
		
	}
	
	public void initGoogle(String Btype){
		if(Btype.equals("mozilla")){
			System.out.println("enter ff openbrowser");
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "\\Driver\\geckodriverv0.19.0.exe");
			driver = new FirefoxDriver();
		}else if (Btype.equals("IE")){
			System.out.println("enter IE openbrowser");
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir") + FBConstants.IEDRIVER);
			driver = new InternetExplorerDriver();
		}
		System.out.println("exit openbrowser");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT,TimeUnit.SECONDS);
		String env = prop.getProperty("env");
		driver.get(prop.getProperty("url_"+env));
		waitForPageLoad();
		System.out.println("Exiting driver.getUrl");
		
	}
	
	/******************* Page Wait ******************************************/
	
	public void waitForPageLoad(){
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		while(!js.executeScript("return document.readyState").toString().equals("complete")){
			
			try {
				System.out.println("Enter Thread.sleep");
				Thread.sleep(2000);
				System.out.println("Exit Thread.sleep");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Enter Thread.sleep Catch Block");
			}
			
			
			
		}
		
		
	}
	
	
	
	
	
	/*******************Validations ***************************************/
	
	public static boolean verifyTitle(){
		return false;
	}
	
	public static boolean isElementPresent(WebElement locator){
		WebElement element = null;
	    element = locator;
	    if(element.isDisplayed())
		return true;
	    else
	    return false;
		
	}
	
	public static boolean verifyText(){
		
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/************************Reporting*******************************************/
	
	public void reportPass(String msg){
		exTest.log(LogStatus.PASS,msg);
		
	}
	
	public void reportFail(String msg){
		exTest.log(LogStatus.FAIL, msg);
		takeScreenShot();
		Assert.fail();
	}
	
	 
	
	public void takeScreenShot(){
		//testcasename_iteration.jpg
		Date d = new Date();
		String filePath= System.getProperty("user.dir")+ "//ScreenSHOT//" + d.toString().replace(":","_").replace(" ","_")+".png";
		File targetFile= new File(filePath);
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, targetFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		exTest.log(LogStatus.INFO,"ScreenShots->" + exTest.addScreenCapture(filePath));
	}
}
