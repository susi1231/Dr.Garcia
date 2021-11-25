package com.DrGarcia.UserPageLibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.DrGarcia.BasePackage.TestBase;

public class MyAccount extends TestBase{

	public MyAccount() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	LandingPage landpage=new LandingPage();
	//username check 
	@FindBy(xpath = "//h3[@class='text-bold mt-3 mb-0']")
	WebElement userNameTitle;
	
	
	//Inside personal details @YOurName
	@FindBy(xpath = "//input[@name='profileName']")
	WebElement yourName;
	
	//Inside personal details @Phonenumber
	@FindBy(xpath = "//input[@id='profileNumber']")
	WebElement Number;
	
	//change password
	@FindBy(xpath = "//a[.='Change Password']")
	WebElement changePassword;
	
	//save changes
	@FindBy(xpath = "//a[.='Save Changes']")
	WebElement saveChanges;
	
	
	public void changePassword(String password,String newpassword) throws InterruptedException {
	Actions act=new Actions(driver);
	act.moveToElement(changePassword).click().perform();            //changePassword.click();
	  Thread.sleep(3000);
	  currentPassword.sendKeys(password);
	  newPassword.sendKeys(newpassword);
	  ConfirmNewPassword.sendKeys(newpassword);
	  Thread.sleep(3000);
	  ConfirmChanges.click();
	  boolean display=updateProfileMessaage.isDisplayed();
	  Assert.assertEquals(display, true);
	}

	//Popup-change password
		@FindBy(xpath = "//input[@id='current-password']")
		WebElement currentPassword;
		
	//Popup new password
		@FindBy(xpath = "//input[@id='password']")
		WebElement newPassword;
		
	//Popup confirm new password
	    @FindBy(xpath = "//input[@id='password_confirmation']")
		WebElement ConfirmNewPassword;
	    
    //Popup confirm changes @submit button
	    @FindBy(xpath = "//button[.='confirm changes']")
		WebElement ConfirmChanges;
	    
	//Popup confirm changes @submit button
	    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible fade show']")
		WebElement updateProfileMessaage;
	    
	public void changeUser(String changeUserName) throws AWTException, InterruptedException, IOException {
	Actions act=new Actions(driver);
	act.moveToElement(yourName).click().perform();
	//yourName.click();
	Robot r=new Robot();
	yourName.sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
	yourName.sendKeys(changeUserName);	
	saveChanges.click();
	String expectedTitle = getPropertyValue("changeUserName");
	Assert.assertEquals(userNameTitle.getText(), expectedTitle);
	}
	
	public void profilePic() throws AWTException, InterruptedException {
		File f=new File("./data/profilepic1.jpeg");
		String absolutePath = f.getAbsolutePath();
		//C:\Users\kalyan\git\Automation\Dr.Garcia\DrGarciaAutomation\.\data\profilepic1.jpeg
		Actions act=new Actions(driver);
		act.moveToElement(yourName).click().perform();
		Robot r=new Robot();
		yourName.sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
		yourName.sendKeys(absolutePath+Keys.CONTROL+"ac");
		Actions actcamera=new Actions(driver);
		actcamera.moveToElement(cameraIcon).click().perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//cameraIcon.click();
		//cameraIcon.sendKeys("C:\\Users\\kalyan\\git\\Automation\\Dr.Garcia\\DrGarciaAutomation\\.\\data\\profilepic1.jpeg");
		/*
		String filepath="C:\\Users\\kalyan\\git\\Automation\\Dr.Garcia\\DrGarciaAutomation\\data\\profilepic1.jpeg";
		cameraIcon.click();
		cameraIcon.sendKeys(filepath);
		//Actions actcamera=new Actions(driver);
		//actcamera.moveToElement(cameraIcon).sendKeys(filepath).click().perform();
		
		 */
		/*
		File f=new File("./data/profilepic1.jpeg");
		String absolutePath = f.getAbsolutePath();
		System.out.println(absolutePath);
		Actions actcamera=new Actions(driver);
		actcamera.moveToElement(cameraIcon).sendKeys(absolutePath).click().perform();
		//cameraIcon.sendKeys(absolutePath);
		//ConfirmChanges.click();
		 /*
		 */
	}
	//Popup confirm changes @submit button
    @FindBy(xpath = "//i[@class='fa fa-camera']")
	WebElement cameraIcon;
    
    //logout webelement
    @FindBy(xpath = "//a[contains(text(), 'LOGOUT')]")
    WebElement logout;
    
    //logout method
    public LandingPage logoutUser() throws IOException {
    	landpage.user();
    	logout.click();
    	return new LandingPage();
    }

}
