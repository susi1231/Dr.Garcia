package com.DrGarcia.UserTestScripts;

import java.io.IOException;

import org.testng.Assert;
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
public class WatchSessionTest extends TestBase {

	public WatchSessionTest() throws IOException {
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
    }
	
	@Test
	public void watch() throws IOException, InterruptedException {
	homepage.clickOnMycourse();
	course.navigate();
	Thread.sleep(3000);
	courseDetail.playbutton();
	
		
	}

}
