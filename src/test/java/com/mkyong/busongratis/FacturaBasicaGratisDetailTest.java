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
import resources.base;

public class FacturaBasicaGratisDetailTest extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void facturaBasicaGratisDetail() throws IOException, InterruptedException {
		 
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
		
		Thread.sleep(3000);
		ld.SideBar().click();
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
		CommonPage c = new CommonPage(driver);
		LandingPage l = new LandingPage(driver);
		c.BottonImpuestosRet().click();
		l.BaseRetenidoGratis().sendKeys("240");
		Thread.sleep(1000);
		c.ImpuestRetenido().click();
		Thread.sleep(1000);
		c.IVARetenido().click();
		Thread.sleep(1000);
		c.FactorRetenido().click();
		Thread.sleep(1000);
		c.TasaRetenido().click();
		Thread.sleep(1000);
		c.TasaOcutaRetenido().clear();
		c.TasaOcutaRetenido().sendKeys("0.160000");
		l.ImporteRetenidoGratis().sendKeys("32");
		Thread.sleep(1000);
		c.ButtonImpTranslados().click();
		l.BaseTransladoGratis().sendKeys("240");
		Thread.sleep(1000);
		c.TaxTranslado().click();
		Thread.sleep(1000);
		c.IVATranslado().click();
		Thread.sleep(1000);
		c.TypeFactorTranslado().click();
		Thread.sleep(1000);
		c.TasaTranslado().click();
		Thread.sleep(1000);
		c.TasaOcuTaTranslado().clear();
		c.TasaOcuTaTranslado().sendKeys("0.160000");
		l.ImporteTransladoGratis().sendKeys("32");
		Thread.sleep(1000);
		c.ButtonPedimento().click();
		Thread.sleep(1000);
		c.AnoValidacionPedimento().sendKeys("18");
		c.AduanaPedimento().sendKeys("24");
		c.PatentePedimento().sendKeys("1487");
		c.ProgressionPedimento().sendKeys("8022338");
		Thread.sleep(1000);
		c.ButtonDatosDPartesOComp().click();
		c.ClaveDelProductCompr().sendKeys("10101507");
		c.CantidadComponente().sendKeys("999999");
		c.DescriptComponente().sendKeys("Ovejas");
		Thread.sleep(2000);
		c.ButtonPartesAduaneras().click();
		c.AnoAduanera().sendKeys("18");
		c.AduanaDespacho().sendKeys("24");
		c.NumeroAduanaPatente().sendKeys("1487");
		c.AnoProgressAduana().sendKeys("8015956");
		Thread.sleep(2000);
		g.AddConseptGratis().click();
		g.ButtonCompRelaGratis().click();
		g.SelectTipoRelaGratis().click();
		g.SustituicionPrevios().click();
		c.AgregarRelacionado().click();
		c.FolioFiscalRelacionado().sendKeys("560a8451-a29c-41d4-a716-544676554400");
		c.AddRelacionado().click();
		Thread.sleep(5000);
		s.EmitirFactura().click();
		
		}
    @AfterTest
	  public void closeBrowser() {
		driver.quit();
	
	}
	
	  }
 


