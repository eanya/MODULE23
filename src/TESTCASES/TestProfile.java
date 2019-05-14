package TESTCASES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



import com.facebook.pages.LaunchPage;
import com.facebook.pom.testcases.base.TestBase;

public class TestProfile extends TestBase {
	@Test
	public void testProfile(){
	WebDriver driver = new FirefoxDriver();
	PageFactory.initElements(driver, LaunchPage.class);
		
	}

}
