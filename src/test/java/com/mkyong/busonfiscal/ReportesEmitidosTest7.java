package com.mkyong.busonfiscal;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import resources.base;

public class ReportesEmitidosTest7 extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void reportesEmitidos7() throws IOException, InterruptedException, AWTException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		boolean isDisplayed = driver.findElement(By.xpath("//div[contains(text(),'KARLA FUENTE ')]")).isDisplayed();
		if(isDisplayed==true) {
			System.out.println("Continue the operation");
		}else {
			Thread.sleep(2000);
		    LandingPage g = new LandingPage(driver);
		    Thread.sleep(2000);
		    g.MenuButton().click();
		    g.ButtonFunk().click();
		}
		
		Thread.sleep(3000);
		ld.SideBar().click();
		Thread.sleep(2000);
		ld.Emitidos().click();
		ld.EmitidoDataInicial().sendKeys("18-10-2019");
		ld.EmitidoDataFinal().sendKeys("24-01-2020");
		Thread.sleep(2000);
		ld.BuscarEmitidos().click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollTo(0,300)");
		Thread.sleep(2000);
		ld.EmitidoFirstOpt().click();
		//Thread.sleep(2000);
		//ld.EstatusEmitido().click();
		//Thread.sleep(2000);
		//ld.IdentificarStatusEmit().click();
		//Thread.sleep(2000);
		//ld.AceptarStatus().click();
		Thread.sleep(2000);
		ld.DescargarEmitido().click();
		ld.DescargarBoth().click();
		Thread.sleep(3000);
		ld.BottonDescarga().click();
		Thread.sleep(30000);
        Robot robot = new Robot();
        robot.mouseMove(85, 50);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
	    ld.SignOut().click();
        Thread.sleep(2000);
		ld.CloseBotton().click();
		}
		
		
	
	@AfterTest
    public void closeBrowser() {
	    driver.quit();
	
   }
	
	
}
 


