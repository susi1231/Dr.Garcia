package com.DrGarcia.UserPageLibrary;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.DrGarcia.BasePackage.TestBase;

public class CourseDetail extends TestBase {

	public CourseDetail() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	//session video-1
	@FindBy(xpath = "//div[@class='play-icon']")
	WebElement sessionVideos;
	 
	//(//img[@class='card-img'])[1]
	
    //checking title
	@FindBy(xpath = "//h1[.='course detail']")
	WebElement title;
	
	//playbutton
	@FindBy(xpath = "//div[@class='vp-controls']/button/div[2]")
    WebElement playButton;
	
	//download pdf
	@FindBy(xpath = "//a[.='Download PDF']")
	WebElement downloadPdf;
	
	//frame
	@FindBy(xpath = "//iframe[@id='maincourse']")
	WebElement frame;
	
	//like symbol
	@FindBy(xpath = "//button[@class='like-button rounded-box']")
	WebElement like;
	
	public void playbutton() throws InterruptedException {
	//driver.switchTo().frame(frame);
	driver.navigate().refresh();
	driver.switchTo().frame("maincourse");
	//Thread.sleep(6000);
	//WebDriverWait wait=new WebDriverWait(driver, 10);
	//wait.until(ExpectedConditions.
	Actions act=new Actions(driver);
	act.moveToElement(playButton).click().perform();
	//playButton.click();
	}

}
