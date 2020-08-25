package com.mkyong.hashing;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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

public class TestCertificados extends base{
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
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		ld.ConfigBotton().click();
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollTo(0,1500)");
	    ld.Certificados().click();
	    ld.AddCertificado().click();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    //ld.PrincipalSucursalCert().click();
	    //ld.SucursalCertif().click();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    JavascriptExecutor j =(JavascriptExecutor)driver;
		j.executeScript("document.getElementById('certificate_cer_file').value='/Users/lisandrosilva/Desktop/funk671228ph6.cer';");
		
		
	   // ld.UploadCerificate().click();
	    ld.AddArchivoCer().sendKeys("//Users//lisandrosilva//Desktop//funk671228ph6.cer");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   // ld.UploadCerificate().click();
	    ld.AddArchivoKey().sendKeys("//Users//lisandrosilva//Desktop//Claveprivada_FIEL_FUNK671228PH6_20190528_164238 copy.key");
	    ld.AddPassword().sendKeys("12345678a");
	    ld.SignOut().click();
	    ld.CloseBotton().click();
	    
	    
	    
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}
	
}
