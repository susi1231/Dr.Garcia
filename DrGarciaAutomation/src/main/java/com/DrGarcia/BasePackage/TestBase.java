package com.DrGarcia.BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestBase {

	public static WebDriver driver;
	
	public static Properties prop;
	
	public TestBase() throws IOException {
		prop=new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/DrGarcia"
				+ "/config/config.properties");
		prop.load(ip);
	}
	//(System.getProperty("user.dir")+ "/src/main/java/com/crm"
	//+ "/qa/config/config.properties");
	//C:\Users\kalyan\git\MeetMyServiceAutomation\MeetMyServiceAutomation\src\main\java\com\meetmyservice\config
	///MeetMyServiceAutomation/src/main/java/com/meetmyservice/config/config.properties
	
	public static void initialization() {
		String browserName=prop.getProperty("browser");
	if (browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browserName.equals("FF")){
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");	
		driver = new FirefoxDriver(); 
	}
	/*
	public static void initialization() {
		String browserName=prop.getProperty("browser");
	if (browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
	}
	*/
	/*
	public static void initialization() {
		String browserName=prop.getProperty("browser");
	if (browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
	}
	*/
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	}
	/*static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	*/
	
	 /*public static void main(String[] args) throws IOException {
	 FileInputStream ip=new FileInputStream("C:\\Users\\kalyan\\git\\MeetMyServiceAutomation\\MeetMyServiceAutomation\\src\\main\\java\\com\\meetmyservice\\config\\config.properties");
	 Properties p=new Properties();
	 p.load(ip);
	 String url=p.getProperty("url");
	 WebDriver driver=new ChromeDriver();
	 driver.get(url);

	 }
	 */
	
	
	public void SelectOption(WebElement element, int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
				
	}
	
	public void SelectOption(WebElement element, String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
				
	}
	
	public String getPropertyValue(String key) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\kalyan\\git\\Automation\\Dr.Garcia\\DrGarciaAutomation\\src\\main\\java\\com\\DrGarcia\\Config\\config.properties");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
	    return value;
		
	}
	   
	/*public static void clickById(WebDriver driver, String id) {
		Actions act=new Actions(driver);
		act.moveToElement()
	}
	*/
	/*
	 * Properties
	 * webdriver
	 * wait
	 * maximise
	 * delete all cookies
	 * thread
	 * get url
	 * 
	 */
}

