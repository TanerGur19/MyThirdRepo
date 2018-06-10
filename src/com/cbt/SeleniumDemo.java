package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/tanergur/Documents/SeleniumDep/driver/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://amazon.com");
		
		
		WebDriver driver1= new ChromeDriver();
		
		driver1.get("https://cybertekschool.com");
		
		
		WebDriver driver2= new ChromeDriver();
		
		driver2.get("https://ebay.com");
		
		
		WebDriver driver3= new ChromeDriver();
		
		driver3.get("https://cybertekschool.com");
		
	}
	
	
	
}
