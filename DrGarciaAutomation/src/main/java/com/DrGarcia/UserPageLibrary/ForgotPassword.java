package com.DrGarcia.UserPageLibrary;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DrGarcia.BasePackage.TestBase;

public class ForgotPassword extends TestBase{

	public ForgotPassword() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	//forgot email address
	@FindBy(xpath = "(//input[@id='email'])[1]")
    WebElement email;
	
	//submit button
	@FindBy(xpath = "(//button)[1]")
    WebElement submitButton;
	
	//
	public void forgotClick(String useremail) {
		email.sendKeys(useremail);
		submitButton.click();
	}
}
