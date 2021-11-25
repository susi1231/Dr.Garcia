package com.DrGarcia.BasePackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String passName = result.getName();
		//type cast the object to access the method
		TakesScreenshot t=(TakesScreenshot) driver;
		//take the screenshot in file format
		File src=t.getScreenshotAs(OutputType.FILE);
		//open the empty file in the current java project
		File dest=new File("./PassScreenshort/"+passName+".png");
		try {
			//copy & paste the screenshot and save the file in the above location
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.close();
	}
	

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		//type cast the object to access the method
		TakesScreenshot t=(TakesScreenshot) driver;
		//take the screenshot in file format
		File src=t.getScreenshotAs(OutputType.FILE);
		//open the empty file in the current java project
		File dest=new File("./FailScreenshort/"+name+".png");
		try {
			//copy & paste the screenshot and save the file in the above location
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//driver.close();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	@Override
	public void SelectOption(WebElement element, int index) {
		// TODO Auto-generated method stub
		super.SelectOption(element, index);
	}

	@Override
	public void SelectOption(WebElement element, String text) {
		// TODO Auto-generated method stub
		super.SelectOption(element, text);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public ListenerImplementation() throws IOException {
		super();
		
	}

}
