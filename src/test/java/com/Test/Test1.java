package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test1 extends BaseClass{
	
	@Test
	public void verifyLogin_FB() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
				
		Library.custom_sendKeys(login.getTxt_email(),excel.getStringDataFrom_Excel("Login_Page", 1, 0),"Email Id");
		Library.custom_sendKeys(login.getTxt_password(),excel.getStringDataFrom_Excel("Login_Page", 1, 1),"Password");
		Library.custom_click(login.getBtn_login(),"Login Button");
		
		//verify 
		String title=driver.getTitle(); // actual title
		String ExpectedTitle="Facebook";
		
		Assert.assertEquals(title, ExpectedTitle);
		
	Library.custom_HandleIframe_name(driver, "Selenium");	
	Library.custom_HandleIframe_MainPage(driver);
	
	Library.custom_HandleDropDown(login.getTxt_email(), "Selenium");
	
	
	}

}
