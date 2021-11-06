package com.DrGarcia.BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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

