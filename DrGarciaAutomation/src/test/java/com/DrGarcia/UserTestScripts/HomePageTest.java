package com.DrGarcia.UserTestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.DrGarcia.BasePackage.TestBase;
import com.DrGarcia.UserPageLibrary.HomePage;
import com.DrGarcia.UserPageLibrary.Login;

public class HomePageTest extends TestBase{

	public HomePageTest() throws IOException {
		super();
	}
	
	public static HomePage hp;
	public static Login lg1;

	
	@BeforeMethod
    public void setUp() throws IOException, InterruptedException {
    	initialization();
    	lg1=new Login();
    	lg1.login(prop.getProperty("useremail"), prop.getProperty("password"));
    	//hp=new HomePage();
    }
	
	@Test(priority = 1)
	public void userIconNameCheck() {
		String userTitle=hp.checkUserName();
		Assert.assertEquals(userTitle, "Sushi Test");
	}
	 
	
	
	/*@Test(priority = 2)
	public void homePageTitleTest() {
		String title=hp.verifyHomePageTitle();
		Assert.assertEquals(title, "US BIOMAG | Homepage");
	}
	*/
	@Test(priority = 2)
	public void logout() throws IOException {
		hp.clickOnLogout();
		//Assert.assertEquals(actual, expected);
		
	}
}
