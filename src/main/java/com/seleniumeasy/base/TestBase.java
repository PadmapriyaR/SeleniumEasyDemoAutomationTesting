package com.seleniumeasy.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\SeleniumProjectsWithNeon\\seleniumeasydemoautomation\\src\\main\\java\\com\\seleniumeasy\\config\\config.properties");
		prop.load(fis);
	}
	
	public void initialization(){
		String browsername = prop.getProperty("browser");
		String url = prop.getProperty("url");
		if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\SeleniumProjectsWithNeon\\seleniumeasydemoautomation\\src\\main\\java\\com\\selenuimeasy\\setup\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\SeleniumProjectsWithNeon\\seleniumeasydemoautomation\\src\\main\\java\\com\\selenuimeasy\\setup\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}

}
