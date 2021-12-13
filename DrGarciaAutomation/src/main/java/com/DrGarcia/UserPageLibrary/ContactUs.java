package com.DrGarcia.UserPageLibrary;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.DrGarcia.BasePackage.TestBase;

@Listeners(com.DrGarcia.BasePackage.ListenerImplementation.class)
public class ContactUs extends TestBase {

	public ContactUs() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	LandingPage lp=new LandingPage();
	
	@FindBy(xpath="//input[@id='formGroupNameInput']")
	WebElement name;
	
	@FindBy(xpath = "//input[@id='formGroupEmailInput']")
    WebElement email;
	
	@FindBy(xpath = "//input[@id='formGroupPhoneInput']")
    WebElement phoneNo;
	
	@FindBy(xpath = "//textarea[@id='formGroupMessageInput']")
    WebElement message;
	
	//checkbox frame
	@FindBy(xpath = "//iframe[@title='reCAPTCHA']")
	WebElement checkboxFrame;
	
	//checkbox button
	@FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
	WebElement checkboxButton;
	
	@FindBy(xpath = "//input[@id='btnsubmit']")
	WebElement submitButton;
	
	public void contactModule(String namefill, String emailfill, String phone) {
		name.sendKeys(namefill);
		email.sendKeys(emailfill);
		phoneNo.sendKeys(phone);
		message.sendKeys("Test message");
        driver.switchTo().frame(checkboxFrame);
		checkboxButton.click();
		driver.switchTo().parentFrame();
		submitButton.click();
	}
	
	
	
}
