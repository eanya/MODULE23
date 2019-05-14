package TESTCASES;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;













import com.facebook.pages.LandingPage;
import com.facebook.pages.LaunchPage;
import com.facebook.pages.LoginPage;
import com.facebook.pages.ProfilePage;
import com.facebook.pom.testcases.base.TestBase;
import com.facebook.pom.testcases.base.TestBase1;
import com.facebook.pom.utils.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ProfileTest extends TestBase1 {
//	WebDriver driver = null;
	
	@Test
	public void profileTest(){
		//driver = new FirefoxDriver();
		
		//Method m = null;
		// String tstnm = m.getName();
		
		extent = ExtentManager.getInstance("profileTest ");
		extest =   extent.startTest("ProfileTest", "Does Browser Work?");
		extest.log(LogStatus.INFO, "Starting the Launch");
		//init("IE");
		
		int a = 1;
		int b = 0;
		try {
			int result = a/b;
		} catch (Exception e) {
			extest.log(LogStatus.FAIL, "Arithmetic Exception"); 
		} 
		
		
		
		
		/*LaunchPage Lp = new LaunchPage(driver, extest);
		PageFactory.initElements(driver,Lp);
		extest.log(LogStatus.INFO, "Starting going to HomePage");
		LoginPage loginPage = Lp.goToHomePage();
		Object Page=loginPage.doLogin("emma.anyanwu@consultant.com","Private1");
		
		if(Page instanceof LoginPage)
			Assert.fail();
		
		else if (Page instanceof LandingPage){
			
			System.out.println("Login is Been Successful");
			extest.log(LogStatus.PASS, "Login is PASSED");
		}
		LandingPage landingPage = (LandingPage)Page;**/
		
		// I want to verify title before I login 
		//loginPage.verifyTitle("Facebook Login");
		//LandingPage landingPage = (LandingPage) loginPage.doLogin("xxx", "xxxx");
		//landingPage.verifyTitle("Welcome to Facebook");
		//ProfilePage ProfPage = landingPage.goToProfilePage();
		//ProfPage.verifyTitle("profile");
		//ProfPage.verifyProfile();
	}
 @AfterMethod
 public void quit(){
 if(extent!=null){
 extent.endTest(extest);
  }
 extent.flush();
  }
}
