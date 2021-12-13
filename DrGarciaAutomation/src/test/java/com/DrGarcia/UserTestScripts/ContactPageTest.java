package com.DrGarcia.UserTestScripts;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.DrGarcia.BasePackage.TestBase;
import com.DrGarcia.UserPageLibrary.ContactUs;
import com.DrGarcia.UserPageLibrary.HomePage;
import com.DrGarcia.UserPageLibrary.LandingPage;
import com.DrGarcia.UserPageLibrary.Login;

@Listeners(com.DrGarcia.BasePackage.ListenerImplementation.class)
public class ContactPageTest extends TestBase{

	public ContactPageTest() throws IOException {
		super();
	}
	public static Login lg1;
	public static LandingPage landingpage;
	static HomePage homepage;
	
	
	@BeforeMethod
    public void setUp() throws IOException, InterruptedException {
    	initialization();
    	lg1=new Login();
    	landingpage=new LandingPage();
    	lg1.login(prop.getProperty("useremail"), prop.getProperty("password"));
    }
	
	@Test
	public void contactPage() throws IOException, InterruptedException {
		
		
		landingpage.contact();
		ContactUs contact=new ContactUs();
		contact.contactModule(prop.getProperty("signupName"),prop.getProperty("useremail"), prop.getProperty("signupPhone"));
		
	}
	@Test
	public void testimonalVideos() throws IOException, InterruptedException {
		landingpage.testimonalPlay();
	}

}
