package com.DrGarcia.UserPageLibrary;

import java.io.IOException;

import org.openqa.selenium.WebElement;
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
	
	//3dots
	@FindBy(xpath = "//a[@class='nav-link page-scroll']/span")
	WebElement dots;
	
	//headerIcon
	@FindBy(xpath = "//img[@class='w-50 pl-3']")
	WebElement headerIcon;
	
	//checkout Course
	@FindBy(xpath = "//button[.='Checkout Course ']")
	WebElement checkOutCourse;
	
	public Login user() throws IOException {
		userIcon.click();
		return new Login();
	}
	
}
