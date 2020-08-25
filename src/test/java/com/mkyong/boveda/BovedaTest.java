package com.mkyong.boveda;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import resources.base;

public class BovedaTest extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void bovedaFiscal1() throws IOException, InterruptedException, AWTException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		boolean isDisplayed = driver.findElement(By.xpath("//div[contains(text(),'ESFERA Empresa de cv ')]")).isDisplayed();
		if(isDisplayed==true) {
			System.out.println("Continue the operation");
		Thread.sleep(2000);
		}else {
		LandingPage g = new LandingPage(driver);
		Thread.sleep(2000);
		g.ButtonFunk().click();
		g.BottonEsfera().click();
		}
		Thread.sleep(3000);
		ld.SideBar().click();
		Thread.sleep(2000);
		ld.MenuDropDown().click();
		Thread.sleep(2000);
		ld.BovedaFiscal().click();
		Thread.sleep(2000); 
	    // Por Estatus
	    driver.findElement(By.xpath("//button[@data-id='document_receipt_type']")).click();
	    List<WebElement> li = driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu inner')]//li//a//span"));
	    for(int i=0; i<li.size(); i++) {
	    	System.out.println(li.size());
	    	if(li.get(i).getText().contains("Ingreso")) {
	    		li.get(i).click();
	    		break;
	    	}
	    }
	    Thread.sleep(2000);
	    ld.FindConciliacion().click();
	    Thread.sleep(2000);
	    ld.VerPDF().click();
	    Thread.sleep(3000);
	   // driver.switchTo().window("Conector");
		}
	
	@AfterTest	
	     public void closeBrowser() {
		    driver.quit();
		
	}
}
 


