package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Sample {
	
	static WebDriver driver;
	@BeforeClass
	public static void browser() {
		driver=new ChromeDriver();
		System.out.println("Welcome");
	}
	
	@AfterClass
	public static void quit() {
		driver.quit();
		System.out.println("Ended");

	}
	@Before
	public void url() {
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void login() {
		Assert.assertTrue(false);
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.name("pass"));
        
		email.sendKeys("nithya29bns@gmail.com");
		password.sendKeys("125896454");
		password.clear();
		password.sendKeys("bjhgdjhdj12");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
	}
	
	@After
	public void close() {
		String title = driver.getTitle();
		System.out.println(title);
		

	}
	
	
	@Test
	public void login2() {
		Assert.assertTrue(true);
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.name("pass"));
        
		email.sendKeys("nithu@gmail.com");
		password.sendKeys("1258964444");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
	}

}
