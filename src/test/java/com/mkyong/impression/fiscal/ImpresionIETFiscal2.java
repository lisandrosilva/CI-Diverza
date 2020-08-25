package com.mkyong.impression.fiscal;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import pageObjects.SearchPage;
import resources.base;

public class ImpresionIETFiscal2 extends base{
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void basePageNavigation() throws IOException, InterruptedException, AWTException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		Thread.sleep(3000);
		ld.MenuDropDown().click();
		Thread.sleep(3000);
		ld.ImpresionFiscal().click();
		Thread.sleep(4000);
		ld.Plantillas().click();
		Thread.sleep(2000);
		ld.FormatoCartaImpBasic().click();
		Thread.sleep(2000);
		ld.FormatoCartaHorizBasic().click();
		Thread.sleep(2000);
		
		ld.ImpresionBasica().click();
		Thread.sleep(2000);
		
		ld.TemplateName().sendKeys("Julio  Zepeda");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"template_logo\"]")).sendKeys("/Users/lisandrosilva/Downloads/e-logo/e-logo.jpg");
		Thread.sleep(2000);
		ld.TemplateNote().sendKeys("Own Template");
		Thread.sleep(2000);
		ld.CrearTemplate().click();
		Thread.sleep(2000);
		//ld.SignOut().click();
		Thread.sleep(2000);
		//ld.CloseBotton().click();
		
		}
	
	//@AfterTest
	     //public void closeBrowser() {
		    //driver.close();
		
	}
//}
 


