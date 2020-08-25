package com.mkyong.busonfiscal;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import resources.base;

public class EmailPasswordCorrectTest2 extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void correoContrasena2() throws IOException, InterruptedException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		boolean isDisplayed = driver.findElement(By.xpath("//div[contains(text(),'KARLA FUENTE ')]")).isDisplayed();
		if(isDisplayed==true) {
			System.out.println("Continue the operation");
		}else {
			Thread.sleep(2000);
		LandingPage g = new LandingPage(driver);
		Thread.sleep(2000);
		g.MenuButton().click();
		g.ButtonFunk().click();
		}	
		
		Thread.sleep(2000);
		ld.Search().click();
		Thread.sleep(2000);
		ld.ListaRFC().sendKeys("CACX7605101P8");
		Thread.sleep(2000);
		ld.SearchRFC().click();
		Thread.sleep(2000);
		ld.ValidacionOK().click();
		Thread.sleep(2000);
		ld.ListaRFC().clear();
		Thread.sleep(2000);
		ld.CloseSearch().click();
		Thread.sleep(2000);
		ld.SignOut().click();
		Thread.sleep(2000);
		ld.CloseBotton().click();
		}
		
	@AfterTest
	    public void closeBrowser() {
		    driver.quit();
		
	}
 
}

