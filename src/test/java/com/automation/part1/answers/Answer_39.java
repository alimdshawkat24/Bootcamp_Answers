package com.automation.part1.answers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Write a TestNG test to navigate to a website, click on a link to navigate to a different page, and verify the presence of certain elements on the new page.

public class Answer_39 {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//a[@class = 'mailicon']")).click();
	}
	
	@Test
	public void verifyLogin() {
		
		WebElement signInButton = driver.findElement(By.xpath("//input[@class = 'signinbtn']"));
		
		if(signInButton.isEnabled()) {
			System.out.println("The Web Element is Enabled!");
		}
		else {
			System.out.println("The Web Element is not Enabled!");
		}
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
