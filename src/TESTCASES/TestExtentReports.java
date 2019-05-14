package TESTCASES;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.facebook.pom.testcases.base.TestBase1;
import com.facebook.pom.utils.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestExtentReports extends TestBase1 {
	Method m ;
	@Test
	public void testExtent(){
		
		// String tstnm = m.getName();
		 System.out.println(m.getName());
		
	//	init("IE");
	//	ExtentReports extentX = ExtentManager.getInstance(tstnm);
	//	ExtentTest extestX =   extentX.startTest("ProfileTest", "Does Browser Work?");
	//	extestX.log(LogStatus.INFO, "Starting the Launch");
	}

}
