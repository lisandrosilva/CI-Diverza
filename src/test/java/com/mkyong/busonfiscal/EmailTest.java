package com.mkyong.busonfiscal;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.FacturaPage;
import pageObjects.SearchPage;
import resources.base;

public class EmailTest extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void correoSimples() throws IOException, InterruptedException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.fernando");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		Assert.assertTrue(true,"Usuario o contraseña incorrecta");
		
		
		}
	@AfterTest
	      public void closeBrowser() {
		       driver.quit();
		
	}
 
 }

