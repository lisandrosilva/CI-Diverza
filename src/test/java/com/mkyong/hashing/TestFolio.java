package com.mkyong.hashing;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import pageObjects.SearchPage;
import resources.base;

public class TestFolio extends base{
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
	    ln.ConfigBotton().click();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    ln.FolioSeries().click();
	    ln.AddFolio().click();
	    Thread.sleep(2000);
	    ln.SerieFolio().sendKeys("BILI");
	    Thread.sleep(2000);
	    ln.ValorInicialFolio().sendKeys("1");
	    Thread.sleep(2000);
	    ln.ValorFinalFolio().sendKeys("9999999");
	    Thread.sleep(4000);
	    ln.AgregarFolio().click();
	    ln.SignOut().click();
	    ln.CloseBotton().click();
		
		
		
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
		
	}

}
