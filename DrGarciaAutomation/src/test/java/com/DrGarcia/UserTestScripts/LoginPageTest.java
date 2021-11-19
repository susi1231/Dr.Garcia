package com.DrGarcia.UserTestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.DrGarcia.BasePackage.TestBase;
import com.DrGarcia.UserPageLibrary.HomePage;
import com.DrGarcia.UserPageLibrary.LandingPage;
import com.DrGarcia.UserPageLibrary.Login;



@Listeners(com.DrGarcia.BasePackage.ListenerImplementation.class)
public class LoginPageTest extends TestBase{
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Login lg1;
	static HomePage homepage;
	/*static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	*/
	
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
	public void closebrowser() {
	driver.quit();
	}
	
}
