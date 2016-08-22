package com.sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TESTSEL {
	String driverPath = "<path to gecko driver executable>";

	public static void main(String[] args) {
	//	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.gmail.com");
	}
}
