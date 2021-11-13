package com.DrGarcia.UserPageLibrary;

import java.io.IOException;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import com.DrGarcia.BasePackage.TestBase;

public class MyCourse extends TestBase {

	public MyCourse() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	//click on course 
	@FindBy(xpath = "(//h6[.='Bio Magnetism'])[1]")
	WebElement course;
	
	//
	@FindBy(xpath="(//img[@class='card-img'])[1]")  
	WebElement coursePlay;
	
	public CourseDetail navigate() throws IOException {
		Actions act=new Actions(driver);
		act.moveToElement(course).click().perform();
		//course.click();
		Actions act1=new Actions(driver);
		act1.moveToElement(coursePlay).click().perform();
		//coursePlay.click();
		return new CourseDetail();
	}

}
