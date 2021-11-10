package com.DrGarcia.UserPageLibrary;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DrGarcia.BasePackage.TestBase;

public class SignupUser extends TestBase {
	
	// Initializing the Page Objects:
	public SignupUser() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	//object of landing page
	LandingPage lp=new LandingPage();
	Login log=new Login();
	
	//name
    @FindBy(xpath = "//input[@class='form-control name rounded-0 ']")
    WebElement name;
    
    //email
    @FindBy(xpath = "//input[@name='email']")
    WebElement emailid;
    
    //phoneNo
    @FindBy(xpath = "//input[@name='phone']")
    WebElement phoneNo;
    
    //age
    @FindBy(xpath = "//input[@name='age']")
    WebElement age;
    
    //password
    @FindBy(xpath = "//input[@name='password']")
    WebElement password;
    
    //confirmation password
    @FindBy(xpath = "//input[@name='password_confirmation']")
    WebElement confirmationPassword;
    
    //next button
    @FindBy(xpath = "//button[.='Next']")
    WebElement nextButton;
    
    
    //address
    @FindBy(xpath = "//input[@name='address']")
    WebElement address;
    
    //city
    @FindBy(xpath = "//input[@name='city']")
    WebElement city;
    
    //zipcode
    @FindBy(xpath = "//input[@name='zipcode']")
    WebElement zipCode;
    
    //country (only one country is there so we won't use this one)
    @FindBy(xpath = "//select[@name='country']")
    WebElement country;
    
    //state
    @FindBy(xpath = "//input[@name='state']")
    WebElement state;
    
    //previous button
    @FindBy(xpath = "//button[@id='prevBtn']")
    WebElement previousButton;
    
    //next button
    @FindBy(xpath = "//button[@id='nextBtn']")
    WebElement nextButton2;
    
    //login button
    @FindBy(xpath = "//a[.='LOGIN']")
    WebElement login;
    
    //how do u hear about us
    @FindBy(xpath = "//input[@value='Google']")
    WebElement google;
    
    //Highest education level completed
    @FindBy(xpath = "//input[@value='Bachelors']")
    WebElement bachelors;
    
  //next button
    @FindBy(xpath = "//button[@id='nextBtn']")
    WebElement nextButton3;
    
    //Why are you interested in learning about Biomagnetism?
    @FindBy(xpath = "//textarea[@name='biomagnetism_interest']")
    WebElement textAreaBiomagnetism;
    
    //Something fun to know about you ?
    @FindBy(xpath = "//textarea[@name='something_fun_to_know']")
    WebElement textAreaFun;
    
    //final submit button
    @FindBy(xpath = "//button[@id='nextBtn']")
    WebElement finalSubmit;
    
    /*
    //regester account
  	@FindBy(xpath = "//a[contains(text(), 'REGISTER')]")
  	WebElement regester;
  	*/
    
    public void Signup() throws InterruptedException, IOException {
    lp.user();
    //lp.userIcon.click();
    log.regester.click();
    	//regester.click();
	name.sendKeys("Test");
	emailid.sendKeys("kanisiritest013@gmail.com");
	phoneNo.sendKeys("9951714865");
	age.sendKeys("24");
	password.sendKeys("Sushi@123");
	confirmationPassword.sendKeys("Sushi@123");
	Thread.sleep(9000);
	nextButton.click();
	address.sendKeys("california");
	city.sendKeys("newyork");
	zipCode.sendKeys("523442");
	country.sendKeys("usa");
	state.sendKeys("abcd");
	nextButton2.click();
	google.click();
	bachelors.click();
	nextButton3.click();
	textAreaBiomagnetism.sendKeys("test purpose");
	textAreaFun.sendKeys("Test");
	finalSubmit.click();
	}
}
