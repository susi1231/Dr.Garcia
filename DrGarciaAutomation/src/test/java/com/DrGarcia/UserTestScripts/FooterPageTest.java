package com.DrGarcia.UserTestScripts;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.DrGarcia.BasePackage.TestBase;
import com.DrGarcia.UserPageLibrary.ApplyForKnowledgeVideo;
import com.DrGarcia.UserPageLibrary.CourseDetail;
import com.DrGarcia.UserPageLibrary.CoursePage;
import com.DrGarcia.UserPageLibrary.HomePage;
import com.DrGarcia.UserPageLibrary.LandingPage;
import com.DrGarcia.UserPageLibrary.Login;
import com.DrGarcia.UserPageLibrary.MyCourse;
import com.DrGarcia.UserPageLibrary.Payment;

@Listeners(com.DrGarcia.BasePackage.ListenerImplementation.class)
public class FooterPageTest extends TestBase{

	public FooterPageTest() throws IOException {
		super();
		
	}
 
	public static Payment pay;
    public static CoursePage coursepag;
    public static ApplyForKnowledgeVideo applyCourse;
    public static LandingPage lp;
    public static Login lg;
    public static HomePage homepage;
    public static MyCourse course;
    public static CourseDetail courseDetail;
    
    
    
	@BeforeMethod
    public void setUp() throws IOException, InterruptedException {
    	initialization();
    	pay=new Payment();
    	lp=new LandingPage();
    	coursepag=new CoursePage();
    	applyCourse=new ApplyForKnowledgeVideo();
    	lg=new Login();
    	course=new MyCourse();
    	courseDetail=new CourseDetail();
    	homepage=lg.login(prop.getProperty("useremail"), prop.getProperty("password"));
    	Thread.sleep(4000);
    }
	
	@Test(priority = 3)
	public void checkYoutubeLink() throws InterruptedException {
		lp.youtube();
	}
	
	@Test(priority = 7)
	public void recentPost() {
		lp.recentPosts();
	}
	
	@Test(priority =1)
	public void newsLetter() {
	lp.testNewsletter(prop.getProperty("useremail"));
	}
	
	@Test(priority = 2)
	public void checkFacebooklink() throws InterruptedException {
		lp.footerFacebook();
	}
	
	
	@Test(priority = 4)
	public void privacyPolicy() {
		lp.privacyPolicy();
	}
	
	@Test(priority = 5)
	public void termsConditions() {
		lp.termsConditions();
	}
	
	@Test(priority = 6)
	public void poweredByHelenzys() {
		lp.poweredByHelenzys();
	}
	
	
	
	
}