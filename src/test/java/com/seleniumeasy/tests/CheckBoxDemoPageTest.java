package com.seleniumeasy.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.seleniumeasy.base.TestBase;
import com.seleniumeasy.pages.CheckBoxDemoPage;
import com.seleniumeasy.pages.SimpleFormDemoPage;

public class CheckBoxDemoPageTest extends TestBase {

	CheckBoxDemoPage checkBoxDemoPage;
	
	public CheckBoxDemoPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		checkBoxDemoPage = new CheckBoxDemoPage();
		checkBoxDemoPage.navigateToCheckboxDemoPage();
	}
	
	@Test(priority=0)
	public void verifyTextMsg(){
		String actualMsg = checkBoxDemoPage.singleCheckboxDemo();
		Assert.assertEquals(actualMsg, "Success - Check box is checked");
	}
	
	@Test(priority=1)
	public void validateBtnValue(){
		String changedBtnName = checkBoxDemoPage.multiCheckboxDemo();
		Assert.assertEquals(changedBtnName, "Uncheck All");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
