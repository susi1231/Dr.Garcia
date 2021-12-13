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
	
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Login lg1;
	static HomePage homepage;
	
	@BeforeMethod
    public void setUp() throws IOException {
    	initialization();
    	lg1=new Login();
    }
	
	@Test
	public void loginTest() throws IOException, InterruptedException {
		homepage=lg1.login(prop.getProperty("useremail"), prop.getProperty("password"));
		String homepageTitle=homepage.verifyHomePageTitle();
		Assert.assertEquals(homepageTitle, "US BIOMAG | Homepage", "title fails because of Title MissMatch");
	}
	
	@AfterMethod
	public void closebrowser(ITestResult result) {
	driver.quit();
	}
	
}
