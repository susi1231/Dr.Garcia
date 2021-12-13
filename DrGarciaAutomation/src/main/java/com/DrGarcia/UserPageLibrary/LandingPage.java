package com.DrGarcia.UserPageLibrary;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.DrGarcia.BasePackage.TestBase;

public class LandingPage extends TestBase{

	// Initializing the Page Objects:
	public LandingPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
    //usericon
	@FindBy(xpath = "//div[@class='dropdown']")
	WebElement userIcon;
	////img[@class='w-75']
	////a[@role='button']
	////a[@class='nav-link page-scroll hidesidebar']  &  //div[@class='dropdown']
	
	//usericon dummy

	
	//3dots
	@FindBy(xpath = "//a[@class='nav-link page-scroll']/span")
	WebElement dots;
	
	//headerIcon
	@FindBy(xpath = "//img[@class='w-50 pl-3']")
	WebElement headerIcon;
	
	//checkout Course
	@FindBy(xpath = "//button[.='Checkout Course ']")
	WebElement checkOutCourse;
	
	//course page with 3dots
	@FindBy(xpath = "//a[.='COURSE']")
    WebElement course;
	
	//aboutus page with 3dots
		@FindBy(xpath = "//a[.='ABOUT US']")
	    WebElement aboutUs;
		
	//FAQ page with 3dots
		@FindBy(xpath = "//a[.='FAQ']")
	    WebElement faq;
		
	//MEDIA / BLOGS page with 3dots
		@FindBy(xpath = "//a[.='MEDIA / BLOGS']")
	    WebElement media;
		
	//CONTACT US page with 3dots
		@FindBy(xpath = "//a[.='CONTACT US']")	
		WebElement contactUs;
		
		
   //footer page logo
		@FindBy(xpath = "(//img[@class='img-fluid'])[3]")
		WebElement logoFooter;
		
   //footer social link @Linkedinn
		@FindBy(xpath = "//a[contains(@href,'linkedin')]")
		WebElement linkedinn;
		
   //footer social link @Facebook
		@FindBy(xpath = "//a[contains(@href,'facebook')]//i")
		WebElement facebook;
		
   //footer Newsletter Textfield
		@FindBy(xpath ="//input[@name='email']")
		WebElement newsletterEmail;
		
	//footer newsletter Sumbit button
		@FindBy(xpath = "//button[.='Submit']")
		WebElement newsletterSubmit;
		
	//footer newsletter thanks message
		@FindBy(xpath = "//span[contains(@class, 'subscribemessage')]/span")
		WebElement thanksMessage;
		
	//footer helenzys link
		@FindBy(xpath = "//a[contains(@href,'helenzys')]")
		WebElement helenzys;
		
	
		
		
	public Login user() throws IOException {
		Actions act=new Actions(driver);
		act.moveToElement(userIcon).click().perform();
	    //userIcon.click();
		return new Login();
	}
	
	public CoursePage course() throws IOException {
		Actions act=new Actions(driver);
		act.moveToElement(dots).click().perform();
		//dots.click();
		course.click();
		return new CoursePage();
	}
	
	public AboutUs AboutUspage() throws IOException {
		Actions act=new Actions(driver);
		act.moveToElement(dots).click().perform();
		
		//dots.click();
		aboutUs.click();
		return new AboutUs();
	}
	
	public void logoFooter() {
		logoFooter.getText();
		
	}
	
	public ContactUs contact() throws IOException {
		Actions act=new Actions(driver);
		act.moveToElement(dots).click().perform();
		//dots.click();
		contactUs.click();
		return new ContactUs();
	}
	
	public void testNewsletter(String useremail) {
		newsletterEmail.sendKeys(useremail);
		newsletterSubmit.click();
		String message=thanksMessage.getText();
		Assert.assertEquals(message, "Thanks for your subscribtion", "failed due to You are Already Subscribed");
	}
	
		
	public void footerFacebook() throws InterruptedException {
	facebook.click();
	Set<String> allwh = driver.getWindowHandles();
	Iterator<String> itr = allwh.iterator();
	String pwh = itr.next();
	String cwh = itr.next();
	Thread.sleep(3000);
	driver.switchTo().window(cwh);
	String facebookTitle = driver.getTitle();
	Assert.assertEquals(facebookTitle, "American Biomagnetism- Usbiomag.com - Home | Facebook");
	}
	
	public void youtube() throws InterruptedException {
		//linkedinn.click();
		youtube.click();
		Set<String> allwh = driver.getWindowHandles();
		Iterator<String> itr = allwh.iterator();
		String pwh = itr.next();
		String cwh = itr.next();
		Thread.sleep(3000);
		driver.switchTo().window(cwh);
		String youtubeTitle = driver.getTitle();
		Assert.assertEquals(youtubeTitle, "Dr. Garcia- Biomagnetism - YouTube");		
		}
	//youtube webelement
	@FindBy(xpath = "//i[@class='fa fa-youtube-play']")
	WebElement youtube;
		
		
	
	//recent posts
	@FindBy(xpath = "//div[@class='show-featured clearfix']/div[2]//a")
	WebElement recentPosts; 
	
	public void recentPosts() {
		//String recentpostLandingpage=recentPosts.getText();
		recentPosts.click();
		String recentposts=driver.getTitle();
		Assert.assertEquals(recentposts, "US BIOMAG | ARTICLE");
		//System.out.println(recentpost);
	}
	
	//recentpost webelement
	@FindBy(xpath = "//div[@class='container py-4']/h2")
	WebElement recentpostTitle;
	
	
	
	//terms & conditions
	@FindBy(xpath = "//a[.='Terms and Condition']")
	WebElement termsConditions;
	
	//privacy policy
	@FindBy(xpath = "//a[.='Privacy Policy']")
	WebElement privacyPolicy;
	
	//powered by helenzys
	@FindBy(xpath = "//a[.='Powered by Helenzys ']")
	WebElement poweredByHelenzys;
	
	public void poweredByHelenzys() {
		poweredByHelenzys.click();
		Set<String> allwh = driver.getWindowHandles();
		Iterator<String> itr = allwh.iterator();
		String pwh = itr.next();
		String cwh = itr.next();
		driver.switchTo().window(cwh);
		String linkedinnTitle = driver.getTitle();
			Assert.assertEquals(linkedinnTitle, "Helenzys Inc - IT Services | Consulting | Digital Solutions");	
	}
	
	public void termsConditions() {
		termsConditions.click();
		Assert.assertEquals(driver.getTitle(), "US BIOMAG | Terms & Condition");
		
	}
	
	public void privacyPolicy() {
		privacyPolicy.click();
		Assert.assertEquals(driver.getTitle(), "US BIOMAG | Privacy Policy");
	}
	/*
	public void recentPostsAll() {
		List<WebElement> all = driver.findElements(By.xpath("//div[@class='show-featured clearfix']/div[2]//a"));
		int count=all.size();
		for (int i = 0; i < count; i++) {
			String text=all.get(i).getText();
			System.out.println(text);
			Assert.assertEquals(all, text);
		}
		//Assert.assertEquals(recentpostTitle, "Dr. Garcia Biomagnetism | LinkedIn");
		//System.out.println(recentpost);
	}
	*/
	
	//Client Testimonals videos
	@FindBy(xpath = "(//i[@class='fa fa-play-circle fa-4x vimeo-circle'])[3]")
	WebElement testimonalVideoPlay;
	
	//cleient Testimonal frame video
	@FindBy(xpath = "(//iframe[@title='vimeo-player'])[3]")
	WebElement testmonalIframe;
	
	
	public void testimonalPlay() throws InterruptedException {
		/*
		//firstTestimonal.click();
		Actions act=new Actions(driver);
		act.moveToElement(firstTestimonal).click().perform();
		//testimonalVideoPlay.click();
		Actions act1=new Actions(driver);
		act1.moveToElement(testimonalVideoPlay).click().perform();
		driver.switchTo().frame(testmonalIframe);
		frame.click();
		*/
		Actions act=new Actions(driver);
		act.moveToElement(thirdTestimonal).click().perform();
		Actions act1=new Actions(driver);
		act1.moveToElement(testimonalVideoPlay).click().perform();
		driver.switchTo().frame(testmonalIframe);
		Thread.sleep(5000);
		Actions act2=new Actions(driver);
		act2.moveToElement(frameplay).click().perform();
		//frame.click();
		
	}
	@FindBy(xpath = "//div[@class='vp-controls']/button/div[1]")
	WebElement frameplay;
	
	//play first testimonal 
	@FindBy(xpath = "//label[@id='slide1']/img")
	WebElement firstTestimonal;
	
	//dummy data to test
	@FindBy(xpath = "//label[@id='slide3']/img")
	WebElement thirdTestimonal;
	
	}
	
