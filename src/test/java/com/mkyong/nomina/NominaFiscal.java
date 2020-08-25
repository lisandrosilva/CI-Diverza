package com.mkyong.nomina;

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

public class NominaFiscal extends base{
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
		ld.NominaFiscal().click();
		Thread.sleep(3000);
		ld.ImportarNomina().click();
		Thread.sleep(3000);
		ld.cargarNomina().click();

	    WebElement element = driver.findElement(By.xpath("//*[@id=\"paysheet_xlsx_file\"]"));
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].click();",element);
	    Thread.sleep(1000);
	    ((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('form-control')", element);
		element.sendKeys("/Users/lisandrosilva/Downloads/nominafiscal-template_1_2_cfdi33_v1.32.xlsx");
	    Thread.sleep(3000);
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
	    ld.ContinuarNomina().click();
		Thread.sleep(20000);
		ld.EmitirNomina().click();
		Thread.sleep(2000);
		ld.ListaProceNomina().click();
		Thread.sleep(2000);
		ld.SignOut().click();
		Thread.sleep(2000);
		ld.CloseBotton().click();
		
		}
	
	@AfterTest
	     public void closeBrowser() {
		    driver.close();
		
	}
}
 


