package com.DrGarcia.UserTestScripts;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.DrGarcia.BasePackage.TestBase;
import com.DrGarcia.UserPageLibrary.HomePage;
import com.DrGarcia.UserPageLibrary.Login;
import com.DrGarcia.UserPageLibrary.MyAccount;

public class MyAccountTest extends TestBase{

	public MyAccountTest() throws IOException {
		super();
		
	}
	public static MyAccount account;
	public static Login lg;
	static HomePage homepage;
	
	@BeforeMethod
    public void setUp() throws IOException, InterruptedException {
    	initialization();
    	lg=new Login();
    	account=new MyAccount();
    	homepage=lg.login(prop.getProperty("useremail"), prop.getProperty("password"));
    }
	/*
	@Test(priority = 2)
	public void changePasswordTest() throws IOException, InterruptedException {
	homepage.clickOnMyAccount();
	account.changePassword(prop.getProperty("password"), prop.getProperty("newpassword"));
	account.logoutUser();
	}
	*/
	
	@Test(priority = 1)
	public void userCheck() throws AWTException, IOException, InterruptedException {
		homepage.clickOnMyAccount();
		account.changeUser(prop.getProperty("changeUserName"));
		account.profilePic();
		
	}
	
	

}
