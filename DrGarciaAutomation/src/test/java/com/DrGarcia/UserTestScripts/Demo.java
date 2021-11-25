package com.DrGarcia.UserTestScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, IOException, InterruptedException 
	{
		Robot r = new Robot();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://54.85.128.201/home");
		driver.findElement(By.name("email")).sendKeys("kanisirisushi9@gmail.com"+Keys.TAB+"Sushi@1234567"+Keys.TAB+Keys.TAB+Keys.TAB+Keys.ENTER);
		File f = new File("./data/profilepic1.jpeg"); // give file name
		String ap = f.getAbsolutePath();

		driver.findElement(By.name("profileName")).sendKeys(Keys.CONTROL+"ac"+Keys.BACK_SPACE);
		driver.findElement(By.name("profileName")).sendKeys(ap+Keys.CONTROL+"ac");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-camera']/..")).click();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
