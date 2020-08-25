package com.mkyong.busonfiscal;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import resources.base;

public class TestClientProducto extends base{
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
		Thread.sleep(3000);
		ld.Cliente().click();
		Thread.sleep(3000);
		ld.AgregarClient().click();
		Thread.sleep(3000);
		ld.ClientName().sendKeys("Maura");
		ld.RFCClient().sendKeys("CACX7605101P8");
		Thread.sleep(3000);
		ld.ClientPhone().sendKeys("12345678");
		ld.EmailClient().sendKeys("xxxxx@gamil.com");
		ld.ClintCountry().sendKeys("Mexico");
		ld.ClientState().sendKeys("NL");
		ld.ClientMunicipio().sendKeys("MTY");
		ld.ClientColonia().sendKeys("Anahuac");
		ld.ClientCalle().sendKeys("San Nicolas");
		ld.ActivateClient().click();
		Thread.sleep(3000);
		ld.Producto().click();
		Thread.sleep(3000);
		ld.AddProducto().click();
		ld.ProductName().sendKeys("Ovejas");
		Thread.sleep(3000);
		ld.ClaveDelProducto().sendKeys("10101517");
		ld.ClaveUnidadProducto().sendKeys("53");
		ld.ValorUnitarioProd().sendKeys("800");
		ld.DescripcionProduct().sendKeys("Carne Asada");
		ld.ActivateProducto().click();
		ld.GuardarProduct().click();
		Thread.sleep(3000);
		ld.SignOut().click();
		ld.CloseBotton().click();
		}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}
	}
 


