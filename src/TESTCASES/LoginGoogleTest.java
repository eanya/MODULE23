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
		waitForPageLoad();
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
		/**waitForPageLoad();
		if(isElementPresent(lgp.forgotPwd_xp)){
			//reportPass
			System.out.println("report Pass");
		}else{
			//reportFail
			System.out.println("report Fail");
		}**/
		
		// We trying to use while loop and see it working
		int x =0;
		while(isElementPresent(lgp.forgotPwd_xp) & x<5){
			 
			try {
				System.out.println("Enter isElement Preset While Loop");
				Thread.sleep(1000);
				System.out.println("Exit isElement Preset While Loop");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Enter isElement Preset Catch block");
				e.printStackTrace();
			  }
			x++;
			}
		
		
		
	}
	
	@Test
	public void signInTextTest (){
		if(!lgp.verifySignInTest(lgp.signinText_cssx,"with your Google AccountX")){
			
			//WebElement ko = lgp.signinText_cssx;
			//reportFailure
			System.out.println("Failure reported");
			reportFail("Shit failed");
		};
		reportPass("signInTextTest  passed");
	}
	
	@AfterMethod
	public void tearDown(){
	if(exRep !=null){
	   exRep.endTest(exTest);
	}
		
	exRep.flush();
		driver.quit();
	}

}
