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

public class TestClient extends base{
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
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    ln.Cliente().click();
	    ln.AgregarClient().click();
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    ln.RFCClient().sendKeys("FUNK671228PH6");
	    ln.ClientName().sendKeys("Maurcio");
	    ln.ClientPhone().sendKeys("1234568");
	    ln.EmailClient().sendKeys("xxxxx@gmail.com");
	    ln.ClintCountry().sendKeys("Mexico");
	    ln.ClientState().sendKeys("NL");
	    ln.ClientMunicipio().sendKeys("MTY");
	    ln.ClientColonia().sendKeys("Anahuac");
	    ln.ClientCalle().sendKeys("San Nicolas");
	    ln.ActivateClient().click();
		ln.GuardarClient().click();
		ln.SignOut().click();
		ln.CloseBotton().click();
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}

}
