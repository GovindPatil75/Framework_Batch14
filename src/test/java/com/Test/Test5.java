package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pages.HomePagePom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test5 extends BaseClass {
	
	@Test
	public void test5() {
		
		HomePagePom home=PageFactory.initElements(driver, HomePagePom.class);
	
		Library.custom_sendKeys(home.gettxt_title(), excel.getStringDataFrom_Excel("Homepage", 0, 0), "Title");
	   
		Library.custom_HandleDropDown(home.gettxt_title(), "Test");
	
	}

}
