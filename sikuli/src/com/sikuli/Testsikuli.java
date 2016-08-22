package com.sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Testsikuli {

	public static void main(String[] args) throws FindFailed {
		 

		WebDriver driver=new FirefoxDriver();

		driver.get("http://www.thecolor.com/Coloring/a-puppy-with-a-kitten.aspx");
		driver.manage().window().maximize();
		Screen screen=new Screen();
		
		screen.wait("1398665726055.png", 20);
				screen.click("1398666382715.png");
		screen.click("1398666248846.png");
		
		screen.click("1398666729252.png");
		screen.click("1398666188894.png");
		screen.click("1398665763634.png");
		screen.click("1398666592027.png");
		screen.click("1398666610951.png");
		screen.click("1398666308624.png");
		
		screen.click("1398666326406.png");
		
		screen.click("1398666570749.png");
	
		screen.click("1398666703708.png");
		
		screen.click("1398666382715.png");
	
		screen.click("1398666857321.png");
		
		screen.waitVanish("1398665763634.png");

	}

}