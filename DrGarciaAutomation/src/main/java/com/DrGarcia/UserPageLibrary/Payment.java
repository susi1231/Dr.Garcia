package com.DrGarcia.UserPageLibrary;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.DrGarcia.BasePackage.TestBase;

public class Payment extends TestBase {

	public Payment() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	//object of soft assert
	SoftAssert softAssert=new SoftAssert();
	//owner name
	@FindBy(xpath = "//input[@id='owner']")
	WebElement ownerName;
	
	//cvv
	@FindBy(xpath = "//input[@id='cvv']")
	WebElement cvv;
	
	//cvv
	@FindBy(xpath = "//input[@id='cardNumber']")
	WebElement cardName;
		
	//expirary Month
	@FindBy(xpath = "//select[@id='expiration-month']")
	WebElement expiryMonth;
	
	//expirary year
	@FindBy(xpath = "//select[@id='expiration-year']")
	WebElement expiryYear;
	
	//BUtton for confirm payment 
	@FindBy(xpath = "//button[@class='btn btn-success themeButton']")
	WebElement confirmPayment;
	
	////div[@id='cover']/../..//div[@class='form-group']/button
	////div[@id='pay-now']        &   //button[.='Confirm Payment']
	////button[@id='confirm-purchase']
	//button[@class='btn btn-success themeButton']
	
	
	@FindBy(xpath = "//h1[.='payment-complete']")
	WebElement comparePaymentMessage;
	
	public boolean checkPaymentMessage() {
		//landPage.userIcon.click();
		return comparePaymentMessage.isDisplayed();	
	}
	
	public void payment() throws IOException {
	ownerName.sendKeys("Simon");
	cvv.sendKeys("123");
	cardName.sendKeys("4111 1111 1111 1111");
	SelectOption(expiryMonth, "Nov");
	SelectOption(expiryYear, "2023");
	Actions act=new Actions(driver);
	act.moveToElement(confirmPayment).click().build().perform();
	//confirmPayment.click();
    //softAssert.assertEquals(comparePaymentMessage, "payment-complete");
	//Assert.assertEquals(comparePaymentMessage, "PAYMENT-COMPLETE");
	//return new ApplyForMainCourse();
    softAssert.assertTrue(checkPaymentMessage());
    
    softAssert.assertAll();
	}
	

}
