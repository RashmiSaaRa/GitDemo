package com.training.tests;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
	public class CrossBrowserTesting {	 
	WebDriver driver;
	/**
	* This function will execute before each Test tag in testng.xml
	* @param browser
	* @throws Exception
	*/
	@BeforeTest
	@Parameters("browser") // check how to define this globally 
	public void setup(String browser) throws Exception{
	//Check if parameter passed from TestNG is 'firefox'
	if(browser.equalsIgnoreCase("firefox")){
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	//Check if parameter passed as 'chrome'
	else if(browser.equalsIgnoreCase("chrome")){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("edge")){
		 WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
	}
	else{
	//If no browser is passed throw exception
	throw new Exception("Incorrect Browser");
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testParameterWithXML() throws InterruptedException{
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	
	WebElement userName = driver.findElement(By.id("username"));
	//Fill user name
	userName.sendKeys("rashmi2@tek.com");
	Thread.sleep(4000);
	//Find password'
	WebElement password = driver.findElement(By.id("password"));
	//Fill password
	password.sendKeys("Rashmi$27");
	Thread.sleep(6000);
	WebElement Login= driver.findElement(By.id("Login"));
	//Hit search button
	Login.click();
	Thread.sleep(4000);
	}
	
	
	
 }

