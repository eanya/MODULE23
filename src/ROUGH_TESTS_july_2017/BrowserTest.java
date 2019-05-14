package ROUGH_TESTS_july_2017;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.facebook.pages.LandingPage;
import com.facebook.pages.LaunchPage;
import com.facebook.pages.LoginPage;
import com.facebook.pom.testcases.base.TestBase1;
import com.facebook.pom.utils.ExtentManager;
import com.facebook.pom.utils.ExtentManager1;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BrowserTest extends TestBase1 {
	
	//WebDriver driver;
	//ExtentReports extent;
	//ExtentTest extest;
	String btype="Mozilla";
	
	@Test
	public void checkBrowser() {
		      
		//ExtentReports extent = null;
	       extest =   extent.startTest("CheckBrowser", "Does Browser Work?");
		 
		extest.log(LogStatus.INFO, "Starting Logging Test");
		extest.log(LogStatus.INFO, "Opening Browser");
		init(btype);
		extest.log(LogStatus.PASS, "Opening Browser PASSED");
		LaunchPage launchpage = new LaunchPage(driver,extest);
		//LaunchPage launchpage = PageFactory.initElements(driver, LaunchPage.class);
		PageFactory.initElements(driver, launchpage);
		LoginPage logipage = launchpage.goToHomePage();
		//PageFactory.initElements(driver, logipage);
		driver.manage().deleteAllCookies();
		extest.log(LogStatus.INFO, "Loggin In");
		LandingPage landingPage = (LandingPage) logipage.doLogin("Emma.anyanwu@consultant.com", "SPrivate1");
		extest.log(LogStatus.PASS, "Loggin In PASSED");
		landingPage.goToProfilePage();
		landingPage.takeScreenShot();
		//logipage.getTopMenu().logout();
		//logipage.menu.logout();
		
		//driver.get(FBConstants.TESTBROWSERLING);
		//ExtentReports extent = ExtentManager1.getInstance();
		//ExtentTest test = extent.startTest("checkBrowser_OLD","checking to make sure browsers");
		//test.log(LogStatus.INFO, "Starting LogginTest");
		//test.log(LogStatus.INFO, "Opening Browser");
		//test.log(LogStatus.PASS, "Opening Browser PASSED");
		//extent.endTest(extest);
		//extent.flush();		
	}
	@AfterMethod
	public void quit(){
    if(extent!=null){
    extent.endTest(extest);
    extent.flush();
      }
  }

}
