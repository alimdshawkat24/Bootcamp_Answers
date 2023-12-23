package com.automation.part1.answers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Write a TestNG test to fill out a login form on a website and verify successful login with valid credentials.

public class Answer_38 {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	
	@Test
	public void verifyLogin() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		
		WebElement editYourAccountText = driver.findElement(By.xpath("//a[contains(text(), \"Edit your account information\") ]"));
		
		if(editYourAccountText.isDisplayed()) {
			System.out.println("Login Sccessful!");
		}
		else {
			System.out.println("Login Unsuccessful!");
		}
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
