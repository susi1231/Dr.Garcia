package com.DrGarcia.UserTestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.DrGarcia.BasePackage.ListenerImplementation;
import com.DrGarcia.BasePackage.TestBase;
import com.DrGarcia.UserPageLibrary.HomePage;
import com.DrGarcia.UserPageLibrary.LandingPage;
import com.DrGarcia.UserPageLibrary.Login;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import net.bytebuddy.implementation.attribute.AnnotationAppender.Target.OnType;



@Listeners(com.DrGarcia.BasePackage.ListenerImplementation.class)
public class LoginPageTest extends TestBase{
	
	public ExtentReports extent;
	public ExtentTest extentTest;
	ListenerImplementation l=new ListenerImplementation();
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Login lg1;
	static HomePage homepage;
	
	@BeforeTest
	public void setExtent() {
		extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/Dr_Garcia.html", true);
		extent.addSystemInfo("Environment", "QA");
	}
	
	@AfterTest
	public void endReport() {
		extent.flush();
		extent.close();
	}
	
	@BeforeMethod
    public void setUp() throws IOException {
    	initialization();
    	lg1=new Login();
    }
	
	/*@Test(priority = 1)
	public void loginPageTitleTest() {
		String title=lg1.validateLoginPageTitle();
		
		Assert.assertEquals(title, "Meet My Service");
	}
	*/
	
	
	@Test
	public void loginTest() throws IOException, InterruptedException {
		homepage=lg1.login(prop.getProperty("useremail"), prop.getProperty("password"));
		String homepageTitle=homepage.verifyHomePageTitle();
		Assert.assertEquals(homepageTitle, "US BIOMAG | Homepage", "title fails because of Title MissMatch");
		
		/*
		 * SoftAssert s=new SoftAssert();
		s.assertEquals(driver.getTitle(), "US BIOMAG | Homepage");
		s.assertAll();
		 */
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void closebrowser(ITestResult result) {
		if (result.getStatus()==ITestResult.FAILURE) {
			extentTest.log(LogStatus.FAIL, "Test case failed is"+ result.getName());  //to add name in extent report
			extentTest.log(LogStatus.FAIL, "Test case failed is"+result.getThrowable()); // to add error/exception in extent report
			//extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(l.onTestFailure(result));
		}
		
	driver.quit();
	}
	
}
