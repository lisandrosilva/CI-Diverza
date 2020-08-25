package com.mkyong.busonfiscal;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import resources.base;

public class TestReportesEmitidos1 extends base{
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
		LandingPage g = new LandingPage(driver);
		Thread.sleep(2000);
		g.ButtonFunk().click();
		g.ButtonJes().click();
		Thread.sleep(3000);
		ld.Emitidos().click();
		ld.EmitidoRFC().sendKeys("CACX7605101P8");
		Thread.sleep(2000);
		ld.BuscarEmitidos().click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollTo(0,300)");
		Thread.sleep(2000);
		ld.EmitidoFirstOpt().click();
		Thread.sleep(2000);
		ld.EstatusEmitido().click();
		Thread.sleep(1000);
		ld.IdentificarStatusEmit().click();
		Thread.sleep(3000);
		ld.AceptarStatus().click();
		Thread.sleep(3000);
		ld.DescargarEmitido().click();
		ld.DescargarEmitidoPDF().click();
		Thread.sleep(2000);
		ld.BottonDescarga().click();
		Thread.sleep(20000);
        Robot robot = new Robot();
        robot.mouseMove(85, 50);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
		ld.SignOut().click();
		ld.CloseBotton().click();
		
		}
	@AfterTest
    public void closeBrowser() {
	    driver.close();
	
   }
	
	
	
}
 


