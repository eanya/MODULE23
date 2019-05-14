package com.facebook.pom.testcases.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.facebook.pom.utils.Constants;
import com.facebook.pom.utils.FBConstants;

public class TestBase {
	public static WebDriver driver;
	public static  Properties  prop;
	
	public TestBase(){
		
		System.out.println("Entering TestBase");
		
		try {
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+ "\\src\\com\\module23\\config\\config.properties");
		    prop = new Properties();
		    prop.load(fs);
		
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
	
	

}
