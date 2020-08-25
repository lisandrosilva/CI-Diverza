package com.mkyong.hashing;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import pageObjects.SearchPage;
import resources.base;

public class TestComprobantesEmitidos extends base{
	@BeforeTest
	public void EmiteFactura() throws IOException {
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
		
	}

	    

	@Test
	public void AltaSucursal() throws InterruptedException {
		LandingPageBuson ln = new LandingPageBuson(driver);
		ln.ingPortalAdv().click();
		ln.ingPortalProc().click();
		ln.ingPortal().sendKeys("lisandro.silva");
		ln.ingPortal1().sendKeys("Diverza1*");
		ln.ingPortal11().click();
	    ln.ingdropPortal().click();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    ln.ComprobanteEmitido().click();
	    ln.EmitidoDataInicial().sendKeys("22-12-2019");
	    ln.EmitidoDataFinal().sendKeys("22-01-2020");
		ln.BuscarEmitidos().click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollTo(0,300)");
		ln.CheckBoxComprobanteEmitido().click();
		ln.EstatusEmitido().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ln.IdentificarStatusEmit().click();
		Thread.sleep(2000);
		ln.AceptarStatus().click();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		ln.ExportarEmitido().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ln.ExportarPaginaActEm().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ln.DescargarEmitido().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ln.DescargarEmitidoPDF().click();
		ln.BottonDescarga().click();
		Thread.sleep(2000);
		ln.SignOut().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ln.CloseBotton().click();
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}

}
