package com.DrGarcia.UserPageLibrary;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DrGarcia.BasePackage.TestBase;

public class CourseDetail extends TestBase {

	public CourseDetail() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	//session video-1
	@FindBy(xpath = "(//img[@class='card-img'])[1]")
	WebElement sessionVideos;
	 
    //checking title
	@FindBy(xpath = "//h1[.='course detail']")
	WebElement title;
	
	//playbutton
	@FindBy(xpath = "(//div[@class='play-icon'])[1]")
    WebElement playButton;
	
	//download pdf
	@FindBy(xpath = "//a[.='Download PDF']")
	WebElement downloadPdf;
	
	

}
