package com.facebook.pom.utils;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager1 {
	private static ExtentReports extent;
	
	public static ExtentReports getInstance(){
		Date date = new Date();
		String filename = date.toString().replace(":","_").replace(" ","_");
		String Reportpath = System.getProperty("user.dir")+FBConstants.ExtentReports+filename+".html";
		extent = new ExtentReports(Reportpath,true,DisplayOrder.NEWEST_FIRST);
		extent.loadConfig(new File(System.getProperty("user.dir")+"ReportsConfig.xml"));
		//optional
		extent.addSystemInfo("Selenium version","3.5.1").addSystemInfo("Environment","QA");
		
		return extent;
		
	}

}
