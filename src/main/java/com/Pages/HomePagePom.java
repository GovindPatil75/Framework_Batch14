package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePagePom {
	
	// Element identify 
	
	@FindBy(how=How.XPATH,using="")
	private WebElement txt_title;
	
	
	public WebElement gettxt_title() {
		return txt_title;
	}

}
