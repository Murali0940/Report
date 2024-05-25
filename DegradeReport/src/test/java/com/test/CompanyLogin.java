package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.baseclass.methods.BaseClass;

public class CompanyLogin extends BaseClass {

	static WebDriver driver;

	@Test(description = "This TC will perform valid login")
	public void loginToApplication() throws Throwable {
		setupApplication(driver);
		String compusername = "Atkgi";
		String password = "1234";
		String url = "https://www.alfadock-pack.com/";
		driver.get(url);
		System.out.println("The currrent url is : " + driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("The currrent Title is : " + driver.getTitle());
		// driver.manage().window().maximize();
		driver.get("https://www.alfadock-pack.com/");
		System.out.println("The currrent url is : " + driver.getCurrentUrl());
		Select sl = new Select(driver.findElement(By.xpath("//select[@id='mySelect']")));
		sl.selectByValue("English");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(compusername);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("logmein")).click();
		Thread.sleep(5000);
	}

}
