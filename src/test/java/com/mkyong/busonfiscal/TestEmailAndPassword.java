package com.mkyong.busonfiscal;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import junit.framework.Assert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.FacturaPage;
import pageObjects.SearchPage;
import resources.base;

public class TestEmailAndPassword extends base{
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void basePageNavigation() throws IOException, InterruptedException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.fernando");
		ld.ingPortal1().sendKeys("Diverza2*");
		ld.ingPortal11().click();
		org.testng.Assert.assertTrue(true, "Usuario o contraseña incorrecta");
		
		
		}
	@AfterTest
	     public void closeBrowser() {
		      driver.close();
		
	}
 
 }

