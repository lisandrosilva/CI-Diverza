package com.mkyong.busonfiscal;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import resources.base;

public class NotaDeCreditoBorradorTest extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void notaDeCredito() throws IOException, InterruptedException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		boolean isDisplayed = driver.findElement(By.xpath("//div[contains(text(),'KARLA FUENTE ')]")).isDisplayed();
		if(isDisplayed==true) {
			System.out.println("Continue the operation");
		}else {
			//Thread.sleep(2000);
			LandingPage g = new LandingPage(driver);
			Thread.sleep(2000);
			g.MenuButton().click();
			g.ButtonFunk().click();
		}
		
		//Thread.sleep(3000);
		ld.SideBar().click();
		//Thread.sleep(2000);
		ld.ingCrearCopr().click();
		//Thread.sleep(2000);
		ld.ingNotadeCredito().click();
		SearchPage s = new SearchPage(driver);
		s.BasicaSelectFiscal().sendKeys("612");
		s.BasicaSelectFiscal().sendKeys(Keys.ENTER);
		s.RFC().sendKeys("FUNK671228PH6");
		s.SelectCFDI().sendKeys("G03");
		s.SelectCFDI().sendKeys(Keys.ENTER);
		s.formaPago().sendKeys("1");
		//Thread.sleep(1000);
		s.SelectformaPago1().sendKeys("01");
		s.SelectformaPago1().sendKeys(Keys.ENTER);
		ld.SaveDraft().click();
	    //Thread.sleep(2000);
	    ld.DraftBox().sendKeys("Factura Por Terminar");
	    //Thread.sleep(2000);
	    ld.SaveText().click();
	    //Thread.sleep(3000);
	    ld.OkButton().click();
	    //Thread.sleep(3000);
	    ld.SideBar().click();
	    //Thread.sleep(3000);
	    ld.Borradores().click();
//	    Thread.sleep(3000);
//		Thread.sleep(5000);
		ld.SignOut().click();
		
		ld.CloseBotton().click();
		}
		
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	
	}
}
 


