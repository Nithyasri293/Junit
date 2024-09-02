package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Sample1 {
	
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
	@Ignore
	@Test
	public void login() {
		Assert.assertTrue("email", false);
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.name("pass"));
        
		email.sendKeys("nithya29@gmail.com");
		password.sendKeys("125896454");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
	}
	
	@Test
	public void login1() {
		Assert.assertTrue("user", true);
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.name("pass"));
        
		email.sendKeys("nithya@gmail.com");
		password.sendKeys("125896454kjlhhk");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		

	}
	
	@After
	public void close() {
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
