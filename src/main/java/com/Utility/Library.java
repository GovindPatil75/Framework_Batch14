package com.Utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;
	
	public static void custom_sendKeys(WebElement element,String value,String Fieldname) {
		try {
		   element.sendKeys(value);
		   test.log(Status.PASS, Fieldname+"==succefully value send=="+value);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
		}
	}

	public static void custom_click(WebElement element,String Fieldname) {
		
		try {
		element.click();
		test.log(Status.PASS, "clicked succefully =="+Fieldname);
		}catch(Exception e) {
			
			test.log(Status.FAIL, e.getMessage());
			
		}
	}
	
	// Alert
	public static Alert custom_HandleAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
	
	// Iframe
	public static void custom_HandleIframe_name(WebDriver driver, String Name) {
		driver.switchTo().frame(Name);
	}
	
	public static void custom_HandleIframe_Webelement(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public static void custom_HandleIframe_MainPage(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	// dropdown
	
	public static void custom_HandleDropDown(WebElement element,String value) {
		
		Select select=new Select(element);
		select.selectByVisibleText(value);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
