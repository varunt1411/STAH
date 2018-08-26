package com.cucumber.pages;
 
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cucumber.common.CommonSteps;
import com.cucumber.common.DriverFactory;
import com.cucumber.objects.LoginPageObjects;
import com.cucumber.tests.MasterTest;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
 
public class LoginPage extends CommonSteps 
{
	
	
	@Given("^Open Application and Enter url$")
	public void open_Application_and_Enter_url() throws Throwable {
	  driver.get("https://demo.openmrs.org/openmrs/login.html");
	  
	}
 
	@When("^enter username$")
	public void enter_username() throws Throwable {
		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.getTxtbx_FirstName().sendKeys("Admin");
		//MasterTest.driver.findElement(By.id("username")).sendKeys("Admin");
	}
 
	@When("^enter password$")
	public void enter_password() throws Throwable {
		MasterTest.driver.findElement(By.id("password")).sendKeys("Admin123");
		MasterTest.driver.findElement(By.id("Inpatient Ward")).click();
		MasterTest.driver.findElement(By.id("loginButton")).click();
	}
 
	@Then("^verify Msg$")
	public void verify_Msg() throws Throwable {
	   boolean result =  MasterTest.driver.findElement(By.tagName("h4")).getText().contains("Logged");
	   Assert.assertTrue(result);
	}
}