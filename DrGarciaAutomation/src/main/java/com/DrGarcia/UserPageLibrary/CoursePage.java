package com.DrGarcia.UserPageLibrary;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DrGarcia.BasePackage.TestBase;

public class CoursePage extends TestBase {

	public CoursePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	LandingPage lp=new LandingPage();
	
	//apply for a main course
	@FindBy(xpath = "//button[.='Apply for Course ']")
	WebElement applyCourse;
	
	//apply for $90 knowledge videos
	@FindBy(xpath = "(//input[@class='btn btn-primary uppercase buybutton'])[5]")
	WebElement knowledgeVideo90;
	
	
	
	public ApplyForMainCourse applycourse() throws IOException {
		Actions act=new Actions(driver);
		act.moveToElement(applyCourse).perform();
		//applyCourse.click();
		return new ApplyForMainCourse();
	}
	
	public ApplyForKnowledgeVideo applyknowledgecourse() throws IOException {
		//Thread.sleep(6000);
		knowledgeVideo90.click();
		return new ApplyForKnowledgeVideo();
	}

}
