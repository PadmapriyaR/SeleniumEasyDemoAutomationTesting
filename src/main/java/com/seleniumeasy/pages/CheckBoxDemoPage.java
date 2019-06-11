package com.seleniumeasy.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.seleniumeasy.base.TestBase;

public class CheckBoxDemoPage extends TestBase {
	
	@FindBy(xpath="//*[@id='navbar-brand-centered']/ul[1]/li[1]/a")
	WebElement inputForms;
	
	@FindBy(xpath="//*[@id='navbar-brand-centered']/ul[1]/li[1]/ul/li[2]/a")
	WebElement checkBoxDemo;
	
	@FindBy(id="isAgeSelected")
	WebElement singleCheck;
	
	@FindBy(id="txtAge")
	WebElement txtMsg;
	
	@FindBy(id="check1")
	WebElement checkAllBtn;
	
	public CheckBoxDemoPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToCheckboxDemoPage(){
		inputForms.click();
		checkBoxDemo.click();
	}
	
	public String singleCheckboxDemo(){
		singleCheck.click();
		return txtMsg.getText();
	}
	
	public String multiCheckboxDemo(){
		checkAllBtn.click();
		return checkAllBtn.getAttribute("value");
	}

}
