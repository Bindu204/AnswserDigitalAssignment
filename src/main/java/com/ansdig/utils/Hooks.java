package com.ansdig.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	public static WebDriver hooksdriver;
	
	static {
		WebDriverManager.chromedriver().setup();
	}
	
	@Before
	public void initBrowser() {
		
		hooksdriver = new ChromeDriver();

	}

	@After
	public void closeBrowser() {
		hooksdriver.close();

	}

	public static WebDriver getDriver() {
		return hooksdriver;
	}
}
