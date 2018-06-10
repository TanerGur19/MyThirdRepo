package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPrac1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/tanergur/Documents/SeleniumDep/driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://etsy.com");
		
		
		
		
	}
	
	
	
}
