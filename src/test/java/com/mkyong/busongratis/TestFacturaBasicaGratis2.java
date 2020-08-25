package com.mkyong.busongratis;

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

public class TestFacturaBasicaGratis2 extends base{
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
		g.ButtonSUL().click();
		Thread.sleep(2000);
		ld.ingCrearCopr().click();
		Thread.sleep(2000);
		ld.ingFactura().click();
	    Thread.sleep(1000);
	    g.SelectRegGratis().click();
	    Thread.sleep(2000);
	    g.RegimeMoral().click();
	    g.SucursalGratis().sendKeys("alias");
	    g.SucursalGratis().sendKeys(Keys.ENTER);
	    g.CodigoPostalGratis().sendKeys("66457");
	    SearchPage s = new SearchPage(driver); 
	    s.RFC().sendKeys("AAA010101AAA");
	    Thread.sleep(2000);
	    g.SelectCFDIGratis().click();
	    Thread.sleep(2000);
	    g.CFDIGastosGeneralesGratis().click();
	    
	    s.formaPago().sendKeys("1");
	    g.FormaDePagoGratis().click();
	    Thread.sleep(1000);
	    g.PagoEfectivoGratis().click();
	    Thread.sleep(1000);
	    s.SelectMethodPago().click();
	    Thread.sleep(1000);
	    s.MethodPago1Exhibicion().click();
	    Thread.sleep(2000);
		s.AgregarConsept().click();
		s.ClaveDelProducto().sendKeys("10215612");
		s.CantidadConsept().sendKeys("4");
		s.ClaveDeUnidad().sendKeys("H87");
		s.DescripticionConsept().sendKeys("Factura Electronica");
		s.ValorUnitarioConsept().sendKeys("60");
		g.AddConseptGratis().click();
		Thread.sleep(2000);
		s.AgregarConsept().click();
		s.ClaveDelProducto().sendKeys("10215612");
		s.CantidadConsept().sendKeys("4");
		s.ClaveDeUnidad().sendKeys("H87");
		s.DescripticionConsept().sendKeys("Factura Electronica");
		s.ValorUnitarioConsept().sendKeys("60");
		g.AddConseptGratis().click();
		Thread.sleep(5000);
		s.EmitirFactura().click();
		
		}
    @AfterTest
	    public void closeBrowser() {
		  driver.close();
	
	  }
	
  }
 


