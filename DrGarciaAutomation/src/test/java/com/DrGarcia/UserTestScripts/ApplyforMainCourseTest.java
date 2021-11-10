package com.DrGarcia.UserTestScripts;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.DrGarcia.BasePackage.TestBase;
import com.DrGarcia.UserPageLibrary.ApplyForMainCourse;
import com.DrGarcia.UserPageLibrary.ApplyForMainCourse;
import com.DrGarcia.UserPageLibrary.CoursePage;
import com.DrGarcia.UserPageLibrary.HomePage;
import com.DrGarcia.UserPageLibrary.LandingPage;
import com.DrGarcia.UserPageLibrary.Login;
import com.DrGarcia.UserPageLibrary.Payment;

public class ApplyforMainCourseTest extends TestBase{

	public ApplyforMainCourseTest() throws IOException {
		super();
		
	}

	
    public static Payment pay;
    public static CoursePage coursepag;
    public static ApplyForMainCourse applyCourse;
    public static LandingPage lp;
    public static Login lg;
   // public static HomePage homepage;
    
    
    @BeforeMethod
    public void setUp() throws IOException {
    	initialization();
    	pay=new Payment();
    	lp=new LandingPage();
    	coursepag=new CoursePage();
    	applyCourse=new ApplyForMainCourse();
    	lg=new Login();
    }
    
    @Test
    public void purchaseCourse() throws IOException, InterruptedException {
    lp.user();
    //LoginPageTest.loginTest();
    lg.login(prop.getProperty("useremail"), prop.getProperty("password"));
    lp.course();
    coursepag.applycourse();
    applyCourse.purchaseCourse();
    pay.payment();
   
    }
    
    @AfterMethod
    public void close() {
    	//driver.close();
    }
}
