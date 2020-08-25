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
import org.testng.annotations.Test;

import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import resources.base;

public class ReportesEmitidosCancelacionTest3 extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void reportesEmitidosCancelacion2() throws IOException, InterruptedException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
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
		
		Thread.sleep(3000);
		ld.SideBar().click();
		Thread.sleep(2000);
		ld.Emitidos().click();
		ld.EmitidoRFC().sendKeys("CACX7605101P8");
		Thread.sleep(2000);
		ld.BuscarEmitidos().click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollTo(0,300)");
		Thread.sleep(2000);
		ld.EmitidoFirstOpt().click();
		try {
			boolean displayedPending = driver.findElement(By.xpath("//span[contains(text(),'Pendiente de aprobación')]")).isDisplayed();
			boolean displayedSent = driver.findElement(By.xpath("//span[contains(text(),'Entregado SAT')]")).isDisplayed();
			boolean displayedCanceled = driver.findElement(By.xpath("//span[contains(text(),'Cancelado')]")).isDisplayed();
			if(displayedPending==true) {
			ld.EstatusEmitido().click();
			//Thread.sleep(1000);
			ld.IdentificarStatusEmit().click();
			//Thread.sleep(2000);
			ld.CorreoEstatus().sendKeys("lisandro.silva@diverza.com");
			//Thread.sleep(3000);
			ld.Notificar().click();
			//Thread.sleep(2000);
			ld.AceptarStatus().click();
			}else if(displayedSent == true){
                //Thread.sleep(2000);			
			ld.EstatusEmitido().click();
				//Thread.sleep(2000);
			ld.IdentificarStatusEmit().click();
				//Thread.sleep(3000);
			ld.AceptarStatus().click();
				//Thread.sleep(3000);
			ld.CancelarComprobante().click();
			    //Thread.sleep(1000);
			ld.IdentificarStatusCancelacion().click();
			    //Thread.sleep(4000);
			ld.SolicitarCancelacion().click();
			    //Thread.sleep(3000);
			ld.AceptarCancelacion().click();
			}else if(displayedCanceled == true){
				//Thread.sleep(2000);
			ld.AceptarCancelacion().click();
			}
		}
			catch(Exception e) {
				System.out.println("Estatus comprobante con error");
			}
		//Thread.sleep(2000);
		ld.SignOut().click();
		
		//Thread.sleep(2000);
		ld.CloseBotton().click();
		}
		
	
	@AfterTest
		public void closeBrowser() {
			driver.quit();
			
		}
		
	}
	
	
	
 


