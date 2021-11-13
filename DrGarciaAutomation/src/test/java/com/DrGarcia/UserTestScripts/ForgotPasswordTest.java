package com.DrGarcia.UserTestScripts;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.DrGarcia.BasePackage.TestBase;
import com.DrGarcia.UserPageLibrary.ForgotPassword;
import com.DrGarcia.UserPageLibrary.HomePage;
import com.DrGarcia.UserPageLibrary.LandingPage;
import com.DrGarcia.UserPageLibrary.Login;

public class ForgotPasswordTest extends TestBase{

	public ForgotPasswordTest() throws IOException {
		super();

	}

	public static Login lg1;
	public static LandingPage landPage;
	public static ForgotPassword forgot;
	static HomePage homepage;
	
	@BeforeMethod
    public void setUp() throws IOException {
    	initialization();
    	lg1=new Login();
    	landPage=new LandingPage();
    	forgot=new ForgotPassword();
    	
    			
    	
    }
	
	@Test
	public void forgotPassword() throws IOException {
		landPage.user();
		lg1.forgot();
		forgot.forgotClick();
		
	}
}
