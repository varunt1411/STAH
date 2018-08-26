package com.cucumber.common;

import org.openqa.selenium.WebDriver;

import com.cucumber.pages.LoginPage;

import cucumber.api.java.en.Given;

public class CommonSteps extends DriverFactory implements commonstepstoimplement {
	

	@Given("^customer logs ins to the application$")
	public void open_Applicationandlogsin() throws Throwable {
		
		 LoginPage lp = new LoginPage();
		 lp.open_Application_and_Enter_url();
	  
	  
	}

	@Override
	public void open_Applicationandlogsin1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void open_Applicationandlogsin2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void open_Applicationandlogsin3() {
		// TODO Auto-generated method stub
		
	}
 

}
