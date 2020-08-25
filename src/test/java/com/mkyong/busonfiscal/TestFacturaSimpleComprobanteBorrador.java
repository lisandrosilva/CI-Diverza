package com.mkyong.busonfiscal;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import resources.base;

public class TestFacturaSimpleComprobanteBorrador extends base{
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void basePageNavigation() throws IOException, InterruptedException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		LandingPage g = new LandingPage(driver);
		Thread.sleep(2000);
		g.ButtonFunk().click();
		g.ButtonJes().click();
		Thread.sleep(3000);
		ld.ingCrearCopr().click();
		Thread.sleep(2000);
		ld.ingFactura().click();
		FacturaPage fp = new FacturaPage(driver);
		fp.Facturabasica().click();
		Thread.sleep(2000);
	    SearchPage s = new SearchPage(driver);
	    
	    
	    
	    Thread.sleep(1000);
	    
	    s.BasicaSelectFiscal().sendKeys("612");
	    Thread.sleep(2000);
	    s.BasicaSelectFiscal().sendKeys(Keys.ENTER);
	    
	    s.RFC().sendKeys("AAA010101AAA");
	    Thread.sleep(2000);
	   
	    s.SelectCFDI().sendKeys("G03");
	    Thread.sleep(1000);
	    s.SelectCFDI().sendKeys(Keys.ENTER);
	   
	    
	    s.formaPago().sendKeys("1");
	    s.SelectformaPago1().sendKeys("01");
	    s.SelectformaPago1().sendKeys(Keys.ENTER);
	    ld.SaveDraft().click();
	    Thread.sleep(2000);
	    ld.DraftBox().sendKeys("Factura Por Terminar");
	    Thread.sleep(2000);
	    ld.SaveText().click();
	    Thread.sleep(3000);
	    ld.OkButton().click();
	    Thread.sleep(3000);
	    ld.Borradores().click();
	    Thread.sleep(3000);
	    ld.SignOut().click();
	    Thread.sleep(3000);
	    ld.CloseBotton().click();
	    
		}
	//@AfterTest
	     //public void closeBrowser() {
		//driver.close();
	
	}
	
	//}
 


