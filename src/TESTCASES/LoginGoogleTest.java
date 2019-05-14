package TESTCASES;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.pom.testcases.base.TestBase;
import com.google.pages.LoginGooglePage;

public class LoginGoogleTest extends TestBase {
	public LoginGooglePage lgp;
	
	//public LoginGoogleTest(){
		//super();
	//}
	
	@BeforeMethod
	public void setUp(){
		initGoogle("mozilla");
		lgp = new LoginGooglePage();
		
	}
	
	
/**	@Test
	public void signInElemenTest(){
		 if(!lgp.isSignTextPresent()){
			//reportFailure 
			System.out.println("Failure reported");
		 };		
	}**/
	
	@Test
	public void isElementPresent(){
		if(isElementPresent(lgp.forgotPwd_xp)){
			//reportPass
			System.out.println("report Pass");
		}else{
			//reportFail
			System.out.println("report Fail");
		}
	}
	
	@Test
	public void signInTextTest (){
		if(!lgp.verifySignInTest(lgp.signinText_cssx,"with your Google Account")){
			
			//WebElement ko = lgp.signinText_cssx;
			//reportFailure
			System.out.println("Failure reported");
		};
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
