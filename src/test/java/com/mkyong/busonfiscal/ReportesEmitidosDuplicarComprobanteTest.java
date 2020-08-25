package com.mkyong.busonfiscal;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import resources.base;

public class ReportesEmitidosDuplicarComprobanteTest extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void duplicadoFacturaBasica() throws IOException, InterruptedException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		//DUPLICADO DE FACTURA SIMPLES
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		boolean isDisplayed = driver.findElement(By.xpath("//div[contains(text(),'KARLA FUENTE ')]")).isDisplayed();
		if(isDisplayed==true) {
			System.out.println("Continue the operation");
		}else {
			//Thread.sleep(2000);
			LandingPage g = new LandingPage(driver);
			//Thread.sleep(2000);
			g.MenuButton().click();
			g.ButtonFunk().click();
		}
		
		//Thread.sleep(3000);
		ld.SideBar().click();
		//Thread.sleep(2000);
		ld.Emitidos().click();
		ld.EmitidoRFC().sendKeys("CACX7605101P8");
		//Thread.sleep(2000);
		ld.BuscarEmitidos().click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollTo(0,300)");
		//Thread.sleep(2000);
		ld.EmitidoFirstOpt().click();
		//Thread.sleep(2000);
		ld.EstatusEmitido().click();
		//Thread.sleep(1000);
		ld.IdentificarStatusEmit().click();
		//Thread.sleep(2000);
		ld.AceptarStatus().click();
		Thread.sleep(2000);	
		ld.DuplicarEmitido().click();
		Thread.sleep(1000);
		ld.DuplicarFacturaSimples().click();
		Thread.sleep(2000);
		ld.DuplicacionEmitido().click();
		Thread.sleep(2000);
		ld.EmitirDuplicado().click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Documento emitido correctamente.')]")));
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Documento emitido correctamente.')]")).getText());
		ld.SignOut().click();
		
		ld.CloseBotton().click();
		}
		
		
	@AfterTest
		public void closeBrowser() {
			driver.quit();
			
		}
		
}
	
	
 


