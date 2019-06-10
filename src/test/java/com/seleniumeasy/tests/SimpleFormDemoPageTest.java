package com.seleniumeasy.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.seleniumeasy.base.TestBase;
import com.seleniumeasy.pages.SimpleFormDemoPage;

public class SimpleFormDemoPageTest extends TestBase{
	
	SimpleFormDemoPage simpleFormDemoPage;
	
	public SimpleFormDemoPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		simpleFormDemoPage = new SimpleFormDemoPage();
	}
	
	@Test(priority=0)
	public void validateEnteredMsg(){
		String actualViewMsg = simpleFormDemoPage.enterAndShowMsg();
		Assert.assertEquals(actualViewMsg, "Welcome To SelenimEasy Demo Form");
	}
	
	@Test(priority=1)
	public void validateAddition(){
		int sum = simpleFormDemoPage.addTwoValues();
		int expectedValue = Integer.parseInt("30");
		Assert.assertEquals(sum, expectedValue);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
