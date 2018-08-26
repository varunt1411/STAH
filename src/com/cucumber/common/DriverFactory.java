package com.cucumber.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
		protected static WebDriver driver;
		String ProjectPath = "C:\\Users\\vthimmap\\ws1\\MyJCPFrameWork\\";
		
		public DriverFactory() {
		 initialize();
		}
		
		public void initialize() {
			if (driver == null)
				createNewDriverInstance();
		}
		
		private void createNewDriverInstance() {
			System.setProperty("webdriver.chrome.driver", ProjectPath + "BrowserDriver\\chromedriver_2.40.exe");
			driver = new ChromeDriver();
		}
		
		
		public WebDriver getDriver() {
			return driver;
		}
		
		public void destroyDriver() {
		
			driver.quit();
			driver = null;
		}
}



