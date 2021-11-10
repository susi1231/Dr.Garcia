package com.DrGarcia.UserPageLibrary;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DrGarcia.BasePackage.TestBase;

public class ApplyForKnowledgeVideo extends TestBase {

	public ApplyForKnowledgeVideo() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	//name
    @FindBy(xpath = "//input[@id='InputName']")
    WebElement name;
    
    //email
    @FindBy(xpath = "//input[@id='InputEmail']")
    WebElement email;
    
    //InputPhone
    @FindBy(xpath = "//input[@id='InputPhone']")
    WebElement phone;
    
    //Country
    @FindBy(xpath = "//input[@id='InputCountry']")
    WebElement country;
    
    //InputState
    @FindBy(xpath = "//input[@id='InputState']")
    WebElement state;
    
    //city
    @FindBy(xpath = "//input[@id='InputCity']")
    WebElement city;

    //pincode
    @FindBy(xpath = "//input[@id='InputPincode']")
    WebElement zipcode;
    
    //promo code
    @FindBy(xpath = "//input[@id='InputPromocode']")
    WebElement promocode;
    
    //Applypromocode
    @FindBy(xpath = "//input[@id='InputApplypromocode']")
    WebElement applyPromo;
    
    //checkBox
    @FindBy(xpath = "//input[@id='Check1']")
    WebElement checkBox;
    
    //Button for Buy the Course 
    @FindBy(xpath = "//button[.='Buy the Course']")
    WebElement buyButton;
    
    public Payment purchaseCourse() throws IOException, InterruptedException {
    	country.sendKeys("india");
    	state.sendKeys("karnataka");
    	city.sendKeys("bangalore");
    	zipcode.sendKeys("500086");
    	//promocode.sendKeys("First");
    	//applyPromo.click();
    	checkBox.click();
    	Thread.sleep(5000);
    	buyButton.click();
    	return new Payment();
    	
    }
}

