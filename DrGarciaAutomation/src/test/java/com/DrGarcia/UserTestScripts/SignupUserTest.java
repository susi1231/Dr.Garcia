package com.DrGarcia.UserTestScripts;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.DrGarcia.BasePackage.TestBase;
import com.DrGarcia.UserPageLibrary.HomePage;
import com.DrGarcia.UserPageLibrary.Login;
import com.DrGarcia.UserPageLibrary.SignupUser;

public class SignupUserTest extends TestBase{
	

	public SignupUserTest() throws IOException {
		super();
	}

	public static SignupUser sign;
	HomePage homepage;
	
	@BeforeMethod
    public void setUp() throws IOException {
    	initialization();
    	sign=new SignupUser();
    }
	
	/*@Test(priority = 1)
	public void loginPageTitleTest() {
		String title=lg1.validateLoginPageTitle();
		
		Assert.assertEquals(title, "Meet My Service");
	}
	*/
	
	
	/*@Test(priority = 1)
	public void loginTest() throws IOException, InterruptedException {
		homepage=lg1.login(prop.getProperty("useremail"), prop.getProperty("password"));
		
		
		
		
	}
	*/
	@Test
	public void signupTest() throws InterruptedException, IOException {
		sign.Signup();
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void closebrowser() {
		//driver.quit();
	}
}