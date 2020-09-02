package com.mkyong.busongratis;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.CommonPage;
import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import pageObjects.busonfiscal.CommonInfo;
import pageObjects.busonfiscal.CommonLocal;
import resources.base;

public class TestFacturaCartaPorteGratisComImpuesto extends base{
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 //CARTA PORTE NO PUEDE AGREGAR IMPUESTOS
		 
	 }
	@Test 
	public void basePageNavigation() throws IOException, InterruptedException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		LandingPage g = new LandingPage(driver);
		boolean isDisplayed = driver.findElement(By.xpath("//*[text()='Nombre ApellidoP ApellidoM']")).isDisplayed();
		if(isDisplayed==true) {
			System.out.println("Continue the operation");
		}else {
			//LandingPage g = new LandingPage(driver);
			Thread.sleep(2000);
			g.MenuButton().click();
			g.BottonApellido().click();
		}
		
		Thread.sleep(2000);
		ld.ingCrearCopr().click();
		Thread.sleep(2000);
		ld.ingCartaPorte().click();
		SearchPage s = new SearchPage(driver);
	    Thread.sleep(2000);
		g.SelectRegGratis().click();
		Thread.sleep(2000);
		g.RegimeMoral().click();
		g.SucursalGratis().sendKeys("alias");
		g.SucursalGratis().sendKeys(Keys.ENTER);
		g.CodigoPostalGratis().sendKeys("66457");
		s.RFC().sendKeys("FUNK671228PH6");
		Thread.sleep(2000);
		g.SelectCFDIGratis().click();
		Thread.sleep(2000);
	    g.CFDIGastosGeneralesGratis().click();
		    
		s.formaPago().sendKeys("1");
		
		s.AgregarConsept().click();
	    s.ClaveDelProducto().sendKeys("10215612");
	    s.CantidadConsept().sendKeys("200");
	    s.ClaveDeUnidad().sendKeys("H87");
	    s.DescripticionConsept().sendKeys("Factura");
	    s.ValorUnitarioConsept().sendKeys("1");
	    CommonLocal l = new CommonLocal(driver);
	    CommonPage c = new CommonPage(driver);
	    CommonInfo n = new CommonInfo(driver);
	    n.ButtonRetenidoVs().click();
	    g.BaseRetenidoGratis().sendKeys("200");
	    l.SelectLocalTaxes().click();
    	l.IVALocalTaxes().click();
		Thread.sleep(1000);
		l.SelectFactorTaxes().click();
		l.TasaF().click();
		l.CuotaOtasaLocal().sendKeys("0.160000");
		g.ImporteRetenidoGratis().sendKeys("32");
	    n.AddRetendidoG().click();
	    Thread.sleep(1000);
	    n.ButtonTransVs().click();
	    l.SelectLocalTransf().click();
	    Thread.sleep(1000);
	    l.IvaTransfer().click();
	    Thread.sleep(1000);
	    l.SelectTransfertype().click();
		Thread.sleep(1000);
		g.BaseTransladoGratis().sendKeys("200");
	    l.TasaTransf().click();
	    l.TasaCuotaTransf().sendKeys("0.160000");
	    g.ImporteTransladoGratis().sendKeys("32");
	    n.AddTransladoG().click();
	        Thread.sleep(1000);
	        n.ButtonNumeroPediVs().click();
	        l.ValidYearLocalPed().sendKeys("18");
			l.AduanaDespLocalPed().sendKeys("24");
			l.PatentNumLocalPed().sendKeys("1487");
			l.YearPlusProgr().sendKeys("8015991");
	        n.AddNumeroPedG().click();
	       
	    s.AddConsept().click();
	    Thread.sleep(2000);
	        
	       
		s.EmitirFactura().click();
		}
	@AfterTest
	   public void closeBrowser() {
		   driver.close();
	
	}
 }
 


