package com.sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class geckodriver {
	String driverPath = "/Users/anandmahajan/Desktop/";
	public WebDriver driver;
	
	@Test
	public void launchBrowser() {
		System.out.println("launching firefox browser"); 
		System.setProperty("webdriver.gecko.driver",driverPath+"geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.navigate().to("http://www.google.com");
	}

	@Test
	public void openApplication() {
		driver.get("http://www.google.com");
	}
	
	@Test
	public void closeDriver() {
		if(driver!=null) {
			driver.close();
		}
	}
}
