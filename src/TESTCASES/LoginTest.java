package TESTCASES;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.facebook.pages.LaunchPage;
import com.facebook.pages.LoginPage;
import com.facebook.pom.testcases.base.TestBase;
import com.facebook.pom.testcases.base.TestBase1;
import com.facebook.pom.utils.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest extends TestBase1 {
	String btype="IE";
	//ExtentReports extentK;
	//ExtentTest extestK ;
	
	@Test
	public void dologinTest(){
		//init("IE");
	//	extest =   extent.startTest("LoginTest", "Does LoginTest Work?");
	//	extest.log(LogStatus.INFO, "Login Test Strting");
		 
		 
		 extent = ExtentManager.getInstance("dologinTest");
		 extest =   extent.startTest("LOGINTestXX", "Does Browser Work?");
		 extest.log(LogStatus.INFO, "Starting the Launch");
		 init("IE");
		//LaunchPage launchpage = new LaunchPage(driver, null);
		//LoginPage logpage = launchpage.goToHomePage();
		//logpage.doLogin("Emma.Anyanwu@consultant.com","Private1");
		//logpage.menu.logout();
		
		
	}
	 @AfterMethod
	 public void quit(){
		 if(extent!=null){
		 extent.endTest(extest);
		  }
		 extent.flush();
		  }
		

}
