package com.sikuli;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class doubleclick {
 
	WebDriver driver;
	
	@BeforeClass
	public void setup(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void testDoubleClick() throws InterruptedException{
		driver.navigate().to("http://api.jquery.com/dblclick/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://facebook.com'");
		
		driver.switchTo().frame(0);
		WebElement element =driver.findElement(By.cssSelector("html>body>div"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
		doubleClick(element);
		WebElement ele =driver.findElement(By.cssSelector(".dbl"));
		Thread.sleep(5000);
		if(ele.isDisplayed()){
			System.out.println("Colour changed successfully after we double clicked");
		}
		
	}
	
	public void doubleClick(WebElement element){
		try {
			Actions action =new Actions(driver).doubleClick(element);
		    action.build().perform();
		    System.out.println("Double clicked the elelment");
		
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page doucmnet"+e.getStackTrace());
			
		}catch (NoSuchElementException e) {
			System.out.println("Element"+ element +"was not fount in DOM"+ e.getStackTrace());
		}
		catch (Exception e) {
			System.out.println("Element"+ element +"was not clickable"+ e.getStackTrace());
	}
}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}