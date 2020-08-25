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

public class TestFacturaDetallistaJes extends base{
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
		ld.ingFactura().click();
		FacturaPage f = new FacturaPage(driver);
		f.FacturaDetallista().click();
		SearchPage ch = new SearchPage(driver);
		ch.BasicaSelectFiscal().sendKeys("603");
		ch.BasicaSelectFiscal().sendKeys(Keys.ENTER);
		ch.RFC().sendKeys("FUNK671228PH6");
		ch.SelectCFDI().sendKeys("G03");
		ch.SelectCFDI().sendKeys(Keys.ENTER);
		ch.formaPago().sendKeys("1");
		ch.SelectformaPago1().sendKeys("01");
		ch.SelectformaPago1().sendKeys(Keys.ENTER);
		ch.SelectMethodPago().click();
		Thread.sleep(3000);
		ch.MethodPago1Exhibicion().click();
	    ch.AgregarConsept().click();
	    ch.ClaveDelProducto().sendKeys("10215612");
	    ch.CantidadConsept().sendKeys("10");
	    ch.ClaveDeUnidad().sendKeys("H87");
	    ch.DescripticionConsept().sendKeys("Factura Detallista");
	    ch.ValorUnitarioConsept().sendKeys("30");
	    ch.AddConsept().click();
	    Thread.sleep(2000);
	    ch.FuncionMSNDetallista().click();
	    Thread.sleep(1000);
	    ch.FuncOriginalDeta().click();
		ch.TipoTransactionDetallista().sendKeys("INVOICE");
		ch.TipoTransactionDetallista().sendKeys(Keys.ENTER);
		ch.NumeroDePedidoDetallista().sendKeys("1234567");
		ch.GNLDetallista().sendKeys("7504000107903");
		ch.CodigoRefAdDetallista().sendKeys("AAE");
		ch.CodigoRefAdDetallista().sendKeys(Keys.ENTER);
		ch.NumeroDetallista().sendKeys("9999999999");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollTo(0,800)");
	    ch.EmitirFactura().click();
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
 


