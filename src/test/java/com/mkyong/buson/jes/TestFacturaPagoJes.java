package com.mkyong.buson.jes;

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

public class TestFacturaPagoJes extends base{
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
		Thread.sleep(2000);
		ld.ingCrearCopr().click();
		Thread.sleep(2000);
		ld.ingPagos().click();
		SearchPage s = new SearchPage(driver);
		s.BasicaSelectFiscal().sendKeys("603");
		s.BasicaSelectFiscal().sendKeys(Keys.ENTER);
		s.RFC().sendKeys("AAA010101AAA");
		s.AgregarCompPago().click();
		s.FechaDePago().sendKeys("27-01-2020");
		s.FormaPagoP().sendKeys("01");
		s.FormaPagoP().sendKeys(Keys.ENTER);
		//s.TipoDeCambioPago().sendKeys("1");
		s.MontoDePago().sendKeys("100");
		Thread.sleep(3000);
		s.TaggleSwitchPago().click();
		s.DocRelacPago().sendKeys("234546d0-5a38-4431-8edb-0f331c10a6d5");
		//s.CambioPago().sendKeys("1");
		s.MethodPagoPago().click();
		s.PPDPago().click();
		s.ImpSaldoAntePago().sendKeys("100");
		s.ImportePago().sendKeys("100");
		s.ImporteSaldoInsolutPago().sendKeys("1");
		s.AddPagoComplement().click();
		s.EmitirFactura().click();
		Thread.sleep(6000);
		ld.SignOut().click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		ld.CloseBotton().click();
		
	    }
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}
	
	}
 


