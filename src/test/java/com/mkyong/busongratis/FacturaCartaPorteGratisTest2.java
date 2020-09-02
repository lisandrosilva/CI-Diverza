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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.CommonPage;
import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import pageObjects.busonfiscal.CommonInfo;
import pageObjects.busonfiscal.CommonLocal;
import resources.base;

public class FacturaCartaPorteGratisTest2 extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void cartaPorteGratisSimpl2() throws IOException, InterruptedException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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
		
		ld.SideBar().click();
		//Thread.sleep(2000);
		ld.ingCrearCopr().click();
		//Thread.sleep(2000);
		ld.ingCartaPorte().click();
		SearchPage s = new SearchPage(driver);
	    //Thread.sleep(2000);
		g.SelectRegGratis().click();
		//Thread.sleep(2000);
		g.RegimeMoral().click();
		g.SucursalGratis().sendKeys("alias");
		g.SucursalGratis().sendKeys(Keys.ENTER);
		g.CodigoPostalGratis().sendKeys("66457");
		s.RFC().sendKeys("FUNK671228PH6");
		//Thread.sleep(2000);
		g.SelectCFDIGratis().click();
		//Thread.sleep(2000);
	    g.CFDIGastosGeneralesGratis().click();
		    
		s.formaPago().sendKeys("1");
		
		s.AgregarConsept().click();
	    s.ClaveDelProducto().sendKeys("10215612");
	    s.CantidadConsept().sendKeys("80");
	    s.ClaveDeUnidad().sendKeys("H87");
	    s.DescripticionConsept().sendKeys("Factura");
	    s.ValorUnitarioConsept().sendKeys("75");
	      
	    s.AddConsept().click();
	   // Thread.sleep(2000);
		s.AgregarConsept().click();
	    s.ClaveDelProducto().sendKeys("10215612");
	    s.CantidadConsept().sendKeys("80");
	    s.ClaveDeUnidad().sendKeys("H87");
	    s.DescripticionConsept().sendKeys("Factura");
	    s.ValorUnitarioConsept().sendKeys("75");
	      
	    s.AddConsept().click();   
	       
		s.EmitirFactura().click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Documento emitido correctamente.')]")));
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Documento emitido correctamente.')]")).getText());
		}
	@AfterTest
	   public void closeBrowser() {
		   driver.quit();
	
	}
 }
 


