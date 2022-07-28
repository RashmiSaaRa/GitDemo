package com.training.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReportLog {
	WebDriver driver;

	@Test (priority = 1)
	public void OpenBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
	        Reporter.log("Launching Google Chrome Driver for this test"); 
	        
	        driver.get("https://login.salesforce.com/");
	        
	        Reporter.log("SalesForce Login Page");
Reporter.log("Chcking git demo");
Reporter.log("Upadting file for gitdemo");

}
}