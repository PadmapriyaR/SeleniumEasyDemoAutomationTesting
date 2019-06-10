package com.seleniumeasy.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.seleniumeasy.base.TestBase;

public class SimpleFormDemoPage extends TestBase{

	@FindBy(xpath="//input[@id='user-message']")
	WebElement msgField;
	
	@FindBy(xpath="//*[@id='get-input']/button")
	WebElement showMsgBtn;
	
	@FindBy(id="display")
	WebElement viewMsg;
	
	@FindBy(id="sum1")
	WebElement aValue;
	
	@FindBy(id="sum2")
	WebElement bValue;
	
	@FindBy(id="displayvalue")
	WebElement additionalValue;
	
	@FindBy(xpath="//*[@id='gettotal']/button")
	WebElement getTotalBtn;
	
	public SimpleFormDemoPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public String enterAndShowMsg(){
		msgField.sendKeys("Welcome To SelenimEasy Demo Form");
		showMsgBtn.click();
		return viewMsg.getText();
	}
	
	public int addTwoValues(){
		aValue.sendKeys("10");
		bValue.sendKeys("20");
		getTotalBtn.click();
		return Integer.parseInt(additionalValue.getText());
	}

}
