package com.mkyong.conciliacion;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
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

public class ConciliacionTest11 extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void conciliacionFiscal1() throws IOException, InterruptedException, AWTException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		boolean isDisplayed = driver.findElement(By.xpath("//div[contains(text(),'JIMENEZ ESTRADA SALAS A A')]")).isDisplayed();
		if(isDisplayed==true) {
		Thread.sleep(2000);
		LandingPage g = new LandingPage(driver);
		Thread.sleep(2000);
		g.ButtonFunk().click();
		g.ButtonJes().click();
		}else {
			System.out.println("Contninue the operation");
		}
		Thread.sleep(3000);
		ld.SideBar().click();
		Thread.sleep(2000);
		ld.MenuDropDown().click();
		Thread.sleep(2000);
		ld.ConciliacionMenu().click();
		Thread.sleep(2000);
		ld.SideBar().click();
		Thread.sleep(2000);
	    ld.ConciliarButton().click();
	    Thread.sleep(2000);
	    ld.SelecionarBase().click();
	    Thread.sleep(2000);
	    List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'list')]//li"));
	    for(int i=0; i<list.size(); i++) {
	    	System.out.println(list.size());
	    	if(list.get(i).getText().contains("Movimientos")) {
	    		list.get(i).click();
	    		break;
	    	}
	    }
	    ld.ConsultarConsil().click();
	    System.out.println(list.size());
	    // Por Estatus
	    driver.findElement(By.xpath("//span[contains(text(),'Estatus (Movimiento)')]")).click();
	    List<WebElement> li = driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu inner')]//li//a//span"));
	    for(int i=0; i<li.size(); i++) {
	    	System.out.println(li.size());
	    	if(li.get(i).getText().contains("Pagado")) {
	    		li.get(i).click();
	    		break;
	    	}
	    }
	    ld.FindConciliacion().click();
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
 


