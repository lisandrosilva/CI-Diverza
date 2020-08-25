package com.mkyong.conciliacion.conector;

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

public class ConciliacionTest18 extends base{
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
		boolean isDisplayed = driver.findElement(By.xpath("//div[contains(text(),'Martin Arbaiza Quiroz')]")).isDisplayed();
		if(isDisplayed==true) {
			System.out.println("Continue the operation");
		}else {
		Thread.sleep(2000);
		LandingPage g = new LandingPage(driver);
		Thread.sleep(2000);
		g.ButtonFunk().click();
		Thread.sleep(1000);
		g.BottonMartin().click();
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
	    	if(list.get(i).getText().contains("Comprobantes de Ingreso")) {
	    		list.get(i).click();
	    		break;
	    	}
	    }
	    ld.ConsultarConsil().click();
	    System.out.println(list.size());
	    // Por Estatus
	    driver.findElement(By.xpath("//button[@data-id='document_received_payment_way_id']")).click();
	    List<WebElement> li = driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu inner')]//li//a//span"));
	    for(int i=0; i<li.size(); i++) {
	    	System.out.println(li.size());
	    	if(li.get(i).getText().contains("Dinero electrónico")) {
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
 


