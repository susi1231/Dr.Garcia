package com.DrGarcia.UserPageLibrary;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.DrGarcia.BasePackage.TestBase;

public class AboutUs extends TestBase{

	public AboutUs() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	//get more details page
	@FindBy(xpath="//a[contains(@class,'btn btn-light float')]")
	WebElement getMoreDetails;
	
	//BEST FROM DR. LUIS F GARCIA'S JOURNEY
	@FindBy(xpath = "//a[.='2019']")
	WebElement garciaJourney;
	
	//BEST FROM DR. LUIS F GARCIA'S JOURNEY Text Heading
	@FindBy(xpath = "//h3[contains(text(), 'seminar April 2019')]")
	WebElement garciaJourneyHeading;
	
	//title="Biomagnetism Therapy | Biomagnetism | usbiomag"
	
	public void moreDetails() throws InterruptedException {
		getMoreDetails.click();
		Set<String> allwh = driver.getWindowHandles();
		Iterator<String> itr = allwh.iterator();
		String pwh = itr.next();
		String cwh = itr.next();
		Thread.sleep(3000);
		driver.switchTo().window(cwh);
		String checkTitle = driver.getTitle();
		Assert.assertEquals(checkTitle, "Biomagnetism Therapy | Biomagnetism | usbiomag");
	}
	
	public void garciaJourney() throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(garciaJourney).click().perform();
		//Reporter.log("Result:" +compareHeading, true);
		Thread.sleep(5000);
		Assert.assertEquals(garciaJourneyHeading.getText(),"USA BIOMAGNETISM SEMINAR APRIL 2019");
	}
	
	

}
