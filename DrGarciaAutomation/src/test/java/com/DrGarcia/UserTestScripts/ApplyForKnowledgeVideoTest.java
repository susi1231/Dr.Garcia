package com.DrGarcia.UserTestScripts;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.DrGarcia.BasePackage.TestBase;
import com.DrGarcia.UserPageLibrary.ApplyForKnowledgeVideo;
import com.DrGarcia.UserPageLibrary.ApplyForMainCourse;
import com.DrGarcia.UserPageLibrary.CoursePage;
import com.DrGarcia.UserPageLibrary.HomePage;
import com.DrGarcia.UserPageLibrary.LandingPage;
import com.DrGarcia.UserPageLibrary.Login;
import com.DrGarcia.UserPageLibrary.Payment;

public class ApplyForKnowledgeVideoTest extends TestBase {

	public ApplyForKnowledgeVideoTest() throws IOException {
		super();
	}
	
	public static Payment pay;
    public static CoursePage coursepag;
    public static ApplyForKnowledgeVideo applyCourse;
    public static LandingPage lp;
    public static Login lg;
    public static HomePage homepage;
    
    
    @BeforeMethod
    public void setUp() throws IOException {
    	initialization();
    	pay=new Payment();
    	lp=new LandingPage();
    	coursepag=new CoursePage();
    	applyCourse=new ApplyForKnowledgeVideo();
    	lg=new Login();
    }
    
    @Test
    public void purchaseCourse() throws IOException, InterruptedException {
    lp.user();
    homepage=lg.login(prop.getProperty("useremail"), prop.getProperty("password"));
    lp.course();
    coursepag.applyknowledgecourse();
    applyCourse.purchaseCourse();
    pay.payment();
   
    }
    
    
}


