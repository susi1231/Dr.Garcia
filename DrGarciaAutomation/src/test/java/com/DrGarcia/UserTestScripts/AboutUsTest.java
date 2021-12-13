package com.DrGarcia.UserTestScripts;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.DrGarcia.BasePackage.TestBase;
import com.DrGarcia.UserPageLibrary.AboutUs;
import com.DrGarcia.UserPageLibrary.HomePage;
import com.DrGarcia.UserPageLibrary.LandingPage;
import com.DrGarcia.UserPageLibrary.Login;

@Listeners(com.DrGarcia.BasePackage.ListenerImplementation.class)
public class AboutUsTest extends TestBase{

	public AboutUsTest() throws IOException {
		super();
		
	}
	public static Login lg1;
	public static HomePage homepage;
	public static AboutUs about;
	public static LandingPage land;
	
	@BeforeMethod
    public void setUp() throws IOException, InterruptedException {
    	initialization();
    	lg1=new Login();
    	homepage=new HomePage();
    	about=new AboutUs();
    	land=new LandingPage();
    	lg1.login(prop.getProperty("useremail"), prop.getProperty("password"));
    }
	
	/*
	@Test
	public void aboutUs() throws InterruptedException, IOException {
		land.AboutUspage();
		about.moreDetails();
		
	}
	*/
	@Test
	public void aboutUs1() throws InterruptedException, IOException {
		land.AboutUspage();
		about.garciaJourney();
		
	}
	

}
