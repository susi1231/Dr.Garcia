package com.DrGarcia.UserPageLibrary;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DrGarcia.BasePackage.TestBase;

public class LandingPage extends TestBase{

	// Initializing the Page Objects:
	public LandingPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
    //usericon
	@FindBy(xpath = "//div[@class='dropdown']")
	WebElement userIcon;
	////img[@class='w-75']
	////a[@role='button']
	////a[@class='nav-link page-scroll hidesidebar']  &  //div[@class='dropdown']
	
	//usericon dummy

	
	//3dots
	@FindBy(xpath = "//a[@class='nav-link page-scroll']/span")
	WebElement dots;
	
	//headerIcon
	@FindBy(xpath = "//img[@class='w-50 pl-3']")
	WebElement headerIcon;
	
	//checkout Course
	@FindBy(xpath = "//button[.='Checkout Course ']")
	WebElement checkOutCourse;
	
	//course page with 3dots
	@FindBy(xpath = "//a[.='COURSE']")
    WebElement course;
	
	//aboutus page with 3dots
		@FindBy(xpath = "//a[.='ABOUT US']")
	    WebElement aboutUs;
		
	//FAQ page with 3dots
		@FindBy(xpath = "//a[.='FAQ']")
	    WebElement faq;
		
	//MEDIA / BLOGS page with 3dots
		@FindBy(xpath = "//a[.='MEDIA / BLOGS']")
	    WebElement media;
		
	//CONTACT US page with 3dots
		@FindBy(xpath = "//a[.='CONTACT US']")	
		WebElement contactUs;
		
	public Login user() throws IOException {
		Actions act=new Actions(driver);
		act.moveToElement(userIcon).click().perform();
	    //userIcon.click();
		//userIcon.click();
		return new Login();
	}
	
	public CoursePage course() throws IOException {
		dots.click();
		course.click();
		return new CoursePage();
	}
	
		
	
}
