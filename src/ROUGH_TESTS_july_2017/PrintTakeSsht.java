package ROUGH_TESTS_july_2017;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.facebook.pages.base.BasePage;
import com.facebook.pom.testcases.base.TestBase1;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class PrintTakeSsht extends BasePage {
	public PrintTakeSsht() {
	System.out.println("this is the PrintTakeShht Constructor");	
	}

	public PrintTakeSsht(WebDriver driver, ExtentTest test) {
		super(driver, test);
		//TODO Auto-generated constructor stub
	}
    @Test
	public void testscreenshot() {
    	//TestBase1 tb1 = new TestBase1();
    	//tb1.extest.log(LogStatus.INFO,"starting takescreenshot");
		takeScreenShot();

	}

}
