package com.DrGarcia.UserTestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.DrGarcia.BasePackage.TestBase;
import com.DrGarcia.UserPageLibrary.HomePage;
import com.DrGarcia.UserPageLibrary.LandingPage;
import com.DrGarcia.UserPageLibrary.Login;




public class LoginPageTest extends TestBase{
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Login lg1;
	HomePage homepage;
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
	
	
	@Test(priority = 1)
	public void loginTest() throws IOException, InterruptedException {
		homepage=lg1.login(prop.getProperty("useremail"), prop.getProperty("password"));
		
		
		
		
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void closebrowser() {
		//driver.quit();
	}
	
}
