package com.automation.part1.answers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Write a TestNG test to navigate to a website and verify the title of the page.

public class Answer_37 {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}
	
	@Test
	public void titleVerification() {
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("The title of the page is correct.");
		} else {
			System.out.println("The title of the page is incorrect.");
		}
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
