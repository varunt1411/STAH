package com.cucumber.common;

import com.cucumber.pages.LoginPage;

import cucumber.api.java.en.Given;

public interface commonstepstoimplement {
	

	
	@Given("^this is common step 2$")
	void open_Applicationandlogsin1();
	
	@Given("^this is common step 2$")
	void open_Applicationandlogsin2();
	
	@Given("^this is common step 4$")
	void open_Applicationandlogsin3();
		

}
