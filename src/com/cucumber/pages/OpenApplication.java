package com.cucumber.pages;
 
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.basics.FileManager;
import org.testng.Assert;


import com.cucumber.common.DriverFactory;
import com.cucumber.common.FileReaderManager;
import com.cucumber.common.PropertyReader;
import com.cucumber.objects.LoginPageObjects;
import com.cucumber.tests.MasterTest;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
 
public class OpenApplication extends DriverFactory 
{
	
	
	@Given("^Open Application and Enter url$")
	public void open_Application_and_Enter_url() throws Throwable {
		PropertyReader prop = new PropertyReader();
		//driver.get(prop.getApplicationUrl());
		driver.get(FileReaderManager.getInstance().getPropReader().getApplicationUrl());
	  
	}

}