package com.DrGarcia.UserPageLibrary;

import java.awt.peer.LabelPeer;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.DrGarcia.BasePackage.TestBase;
@Listeners(com.DrGarcia.BasePackage.ListenerImplementation.class)
public class Login extends TestBase {

	public Login() throws IOException {
		super();
		PageFactory.initElements(driver, this);

	}
	LandingPage lp=new LandingPage();
	
	//email
	@FindBy(xpath = "(//div[@class='col-md-12'])[1]/input")
	WebElement emailType;
	
	//password
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordType;
	
	//loginbutton
	@FindBy (xpath = "//button[contains(text(), 'Login')]")
	WebElement loginButton;
	
	//forgot password
	@FindBy(xpath = "//a[contains(text(), 'Forgot Your Password')]")
	WebElement forgotPassword;
	

	//regester account
	@FindBy(xpath = "//a[contains(text(), 'REGISTER')]")
	WebElement regester;

	
	
	//side header
	@FindBy(xpath = "//h1[.='US BIOMAG']")
	WebElement sideHeader;
	
	//top brand logo
	@FindBy(xpath = "//img[@alt='Dr Garcia Logo']")
	WebElement topLogo;
	
    
	
	public HomePage login(String email, String password) throws IOException, InterruptedException{
		lp.user();
		emailType.sendKeys(email);
		passwordType.sendKeys(password);
		loginButton.click();
		return new HomePage();
	}
	
	public ForgotPassword forgot() throws IOException {
		forgotPassword.click();
		return new ForgotPassword();
	}
	
    
	
}
