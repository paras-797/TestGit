package com.csg.tau.TestProject.TestScript;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleMethods {
	
	public void method() {

	}
	
	@Test
	public void btest() throws InterruptedException {
		
		System.out.println("btest");

	}
	@Test
	public void ctest() throws InterruptedException {

		System.out.println("ctest");

	}
	@Test(invocationCount=5)
	public void atest() throws InterruptedException {
		System.out.println("atest");


	}		

	@Test
	public void ztest() throws InterruptedException {
		System.out.println("ztest");

	}

	@Test
	public void ktest() throws InterruptedException {

		System.out.println("ktest");

	}

	@Test
	public void ltest() throws InterruptedException {

		System.out.println("ltest");

	}
}
