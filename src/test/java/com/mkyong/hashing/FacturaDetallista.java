package com.mkyong.hashing;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import pageObjects.SearchPage;
import resources.base;

public class FacturaDetallista extends base{
	@BeforeTest
	public void EmiteFactura() throws IOException {
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
		
	}
	@Test
	public void Detalle() {
		
		LandingPageBuson ld = new LandingPageBuson(driver);
		ld.ingPortalAdv().click();
		ld.ingPortalProc().click();
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		ld.ingdropPortal().click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ld.ConfigBotton().click();
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollTo(0,1500)");
	    ld.Certificados().click();
	    ld.AddCertificado().click();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    //ld.PrincipalSucursalCert().click();
	    //ld.SucursalCertif().click();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    ld.AddArchivoCer().sendKeys("/Applications/Certificados de signas digitales pruebas/CSDs Nuevos(2019)/Personas Fisicas/FIEL_FUNK671228PH6_20190528164238/funk671228ph6.cer");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    ld.AddArchivoKey().sendKeys("/Applications/Certificados de signas digitales pruebas/CSDs Nuevos(2019)/Personas Fisicas/FIEL_FUNK671228PH6_20190528164238/Claveprivada_FIEL_FUNK671228PH6_20190528_164238.key");
	    ld.AddPassword().sendKeys("12345678a");
	   // ld.UploadCerificate().click();
	    ld.SignOut().click();
	    ld.CloseBotton().click();
	    
	    
	    
	}
	
	@Test
	public void AltaSucursal() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
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
		ln.SucursalBranch().sendKeys("Distrito Federal");
		ln.SucursalAlias().sendKeys("Regio");
		ln.SucursalZip().sendKeys("44567");
		ln.GuardarSucursal();
		
		
		
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}
}
