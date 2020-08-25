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

public class HomePageBusonTest extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		 
		 
		 
	 }
	@Test 
	public void serviciosBuzon() throws IOException, InterruptedException, AWTException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		//driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		boolean isDisplayed = driver.findElement(By.xpath("//div[contains(text(),'KARLA FUENTE ')]")).isDisplayed();
		if(isDisplayed==true) {
			System.out.println("Contninue the operation");
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
		ld.ConfigBotton().click();
		ld.FolioSeries().click();
		Thread.sleep(2000);
		ld.AddFolio().click();
		Thread.sleep(1000);
		ld.SerieFolio().sendKeys("MTM");
		ld.ValorInicialFolio().sendKeys("0");
		Thread.sleep(3000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('serial_end').value='9999999';");
		Thread.sleep(1000);
		ld.AgregarFolio().click();
		Thread.sleep(3000);
		ld.SideBar().click();
		Thread.sleep(2000);
		ld.Sucursales().click();
		Thread.sleep(1000);
		ld.AddSucursal().click();
		Thread.sleep(1000);
		ld.SucursalBranch().sendKeys("San Nicolas");
		ld.SucursalAlias().sendKeys("Prueba13");
		ld.SucursalZip().sendKeys("66457");
		Thread.sleep(1000);
		ld.ActivarSucursal().click();
		ld.GuardarSucursal().click();
		Thread.sleep(3000);
		ld.SideBar().click();
		Thread.sleep(2000);
		ld.Certificados().click();
		Thread.sleep(2000);
		
		ld.AddCertificado().click();
		Thread.sleep(2000);
		ld.SelectSucursalCertificado().sendKeys("Prueba13");
		ld.SelectSucursalCertificado().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		
	    WebElement element = driver.findElement(By.xpath("//*[@id=\"certificate_cer_file\"]"));
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].click();",element);
	    Thread.sleep(1000);
	    ((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('form-control')", element);
		element.sendKeys("/Users/lisandrosilva/Downloads/Q1NEIEZVTksuemlw/CSD_KARLA_FUENTE_NOLASCO_FUNK671228PH6_20190528_174243s.cer");
	    Thread.sleep(3000);
	    Robot robot = new Robot();
	    robot.mouseMove(85, 50);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
	    
	    WebElement Keyelement = driver.findElement(By.xpath("//*[@id=\"certificate_key_file\"]"));
	    JavascriptExecutor jsi = (JavascriptExecutor)driver;
	    jsi.executeScript("arguments[0].click();",Keyelement);
	    Thread.sleep(3000);
	    ((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('form-control')", Keyelement);
		Keyelement.sendKeys("/Users/lisandrosilva/Downloads/Q1NEIEZVTksuemlw/CSD_KARLA_FUENTE_NOLASCO_FUNK671228PH6_20190528_174243.key");
	    Thread.sleep(2000);
	    Robot rob = new Robot();
	    rob.mouseMove(85, 50);
        rob.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        rob.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
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
		       driver.quit();
		
	}
 
}

