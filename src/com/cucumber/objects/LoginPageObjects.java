package com.cucumber.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	
	public LoginPageObjects(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "username") 
	private WebElement txtbx_FirstName;
		
	public WebElement getTxtbx_FirstName() {
		return txtbx_FirstName;
	}

	public void setTxtbx_FirstName(WebElement txtbx_FirstName) {
		this.txtbx_FirstName = txtbx_FirstName;
	}
	

	
	
}
