package com.mkyong.busonfiscal;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import resources.base;

public class HomePageBuson extends base{
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
		Thread.sleep(2000);
		LandingPage g = new LandingPage(driver);
		Thread.sleep(2000);
		g.ButtonFunk().click();
		g.ButtonJes().click();
		Thread.sleep(2000);
		ld.ConfigBotton().click();
		ld.FolioSeries().click();
		Thread.sleep(2000);
		ld.AddFolio().click();
		ld.SerieFolio().sendKeys("TDT");
		ld.ValorInicialFolio().sendKeys("0");
		Thread.sleep(3000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('serial_end').value='9999999';");
		Thread.sleep(1000);
		ld.AgregarFolio().click();
		Thread.sleep(2000);
		ld.Sucursales().click();
		Thread.sleep(1000);
		ld.AddSucursal().click();
		ld.SucursalBranch().sendKeys("San Nicolas");
		ld.SucursalAlias().sendKeys("Prueba5");
		ld.SucursalZip().sendKeys("66457");
		Thread.sleep(1000);
		ld.ActivarSucursal().click();
		ld.GuardarSucursal().click();
		Thread.sleep(1000);
		ld.Certificados().click();
		Thread.sleep(1000);
		
		ld.AddCertificado().click();
		Thread.sleep(2000);
		ld.SelectSucursalCertificado().sendKeys("Prueba5");
		ld.SelectSucursalCertificado().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		
	    WebElement element = driver.findElement(By.xpath("//*[@id=\"certificate_cer_file\"]"));
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].click();",element);
	    Thread.sleep(1000);
	    ((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('form-control')", element);
		element.sendKeys("/Users/lisandrosilva/Downloads/Q1NEIEZVTksuemlw/CSD_KARLA_FUENTE_NOLASCO_FUNK671228PH6_20190528_174243s.cer");
	    Thread.sleep(3000);
	    
	    
	    WebElement Keyelement = driver.findElement(By.xpath("//*[@id=\"certificate_key_file\"]"));
	    JavascriptExecutor jsi = (JavascriptExecutor)driver;
	    jsi.executeScript("arguments[0].click();",Keyelement);
	    Thread.sleep(3000);
	    
	   
	    ((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('form-control')", Keyelement);
		Keyelement.sendKeys("/Users/lisandrosilva/Downloads/Q1NEIEZVTksuemlw/CSD_KARLA_FUENTE_NOLASCO_FUNK671228PH6_20190528_174243.key");
	    Thread.sleep(2000);
	    
	    
		ld.AddPassword().sendKeys("12345678a");
		Thread.sleep(2000);
		ld.UploadCertificate().click();
		Thread.sleep(3000);
		ld.SignOut().click();
		Thread.sleep(2000);
		ld.CloseBotton().click();
		
		}
	@AfterTest
	     public void closeBrowser() {
		    driver.close();
		
	}
 
}

