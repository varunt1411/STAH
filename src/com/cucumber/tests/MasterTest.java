package com.cucumber.tests;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cucumber.common.DriverFactory;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features="TestCases/Login2.feature",glue={"com.cucumber.pages"},plugin={"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"})
public class MasterTest extends DriverFactory {
	
	public static WebDriver driver;
	private TestNGCucumberRunner testRunner;

	
	@BeforeClass
	public void setUP()
	{
		
		DriverFactory driverF = new DriverFactory();
		testRunner = new TestNGCucumberRunner(MasterTest.class);
		
	}
	@Test(description="login",dataProvider="features")
	public void login(CucumberFeatureWrapper cFeature)
	{
		testRunner.runCucumber(cFeature.getCucumberFeature());
	}
	@DataProvider(name="features")
	public Object[][] getFeatures()
	{
		return testRunner.provideFeatures();
	}
	@AfterClass
	public void tearDown()
	{
		testRunner.finish();
		destroyDriver();
	}
	@AfterClass
    public static void setup() {
        Reporter.loadXMLConfig(new File("Config/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Mac OSX");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
	
}
