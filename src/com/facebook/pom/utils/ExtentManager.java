package com.facebook.pom.utils;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	private static ExtentReports extent;
	
	public static ExtentReports getInstance(String testName){
		//String testName = m.getName();
		if(extent==null){
			Date dt = new Date();
			String fileName=testName + "--" + dt.toString().replace(" ","-").replace(":","_")+".html";
			String reportpath = System.getProperty("user.dir")+"//ExtentReports//"+fileName;
			extent = new ExtentReports(reportpath,true,DisplayOrder.NEWEST_FIRST);
			
			extent.loadConfig(new File(System.getProperty("user.dir")+ "ReportsConfig.xml"));
			//Optional
			extent.addSystemInfo("Selenium Version", "3.5.1").addSystemInfo("Environment","QA");
		}		
		return extent;		
	}

}
