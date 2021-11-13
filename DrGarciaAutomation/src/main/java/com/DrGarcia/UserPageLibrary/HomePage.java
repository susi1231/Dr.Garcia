package com.DrGarcia.UserPageLibrary;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.DrGarcia.BasePackage.TestBase;

public class HomePage extends TestBase {

	//Initializing the Page Objects:
	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	//checking the title
	public String verifyHomePageTitle() {
	return driver.getTitle();
	}
	//created landingpage object so  that we can get properties
	LandingPage landPage=new LandingPage();
	
	//my account
	@FindBy(xpath = "//a[.='MY ACCOUNT']")
	WebElement myAccount;
	
	//my course page
	@FindBy(xpath = "//a[.='MY COURSE']")
	WebElement myCourse;
	
	//logout
	@FindBy(xpath = "//a[contains(text(),'LOGOUT')]")
	WebElement logout;
	
	//checking usericon
	@FindBy(xpath = "//h4[contains(text(),'Test')]")
	WebElement userNameLabel;
	
	//going inside myaccount
	public MyAccount clickOnMyAccount() {
		landPage.userIcon.click();
		myAccount.click();
		return new MyAccount();
		
	}
	//going inside mycourse
	public MyCourse clickOnMycourse() throws IOException {
		landPage.userIcon.click();
		myCourse.click();
		return new MyCourse();
		
	}
	//logout
	public LandingPage clickOnLogout() throws IOException {
		landPage.userIcon.click();
		logout.click();
		return new LandingPage();
		
	}
	
	public boolean checkUserName() {
		//landPage.userIcon.click();
		return userNameLabel.isDisplayed();	
	}
	
	//checking the title
	
	
	
	
	
}
