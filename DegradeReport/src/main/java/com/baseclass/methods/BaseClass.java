package com.baseclass.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	protected WebDriver driver = null;

	public void webDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	

	@BeforeSuite
	public void setupApplication(WebDriver driver) {
		Reporter.log("=====Browser Session Started=====", true);
		WebDriverManager.chromedriver().clearDriverCache().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		Reporter.log("=====Application Started=====", true);
		
	}
	
	@AfterSuite
	public void closeApplication(WebDriver driver)
	{
		driver.quit();
		Reporter.log("=====Browser Session End=====", true);
		
	}
	
	
	

}
