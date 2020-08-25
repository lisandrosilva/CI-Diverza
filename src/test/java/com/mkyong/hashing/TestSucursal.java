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

public class TestSucursal extends base{
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
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ln.ConfigBotton().click();
		ln.Sucursales().click();
		ln.AddSucursal().click();
		Thread.sleep(2000);
		ln.SucursalBranch().sendKeys("Distrito Federal De Jalisco");
		ln.SucursalAlias().sendKeys("Region");
		ln.SucursalZip().sendKeys("44567");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ln.GuardarSucursal().click();
		ln.SignOut().click();
		ln.CloseBotton().click();
		}
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}

}
