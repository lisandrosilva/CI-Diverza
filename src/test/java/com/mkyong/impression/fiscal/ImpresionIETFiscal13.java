package com.mkyong.impression.fiscal;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
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
import pageObjects.SearchPage;
import resources.base;

public class ImpresionIETFiscal13 extends base{
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
		ld.ImpresionBasica().click();
		Thread.sleep(2000);
		ld.TemplateName().sendKeys("Lisandro7");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[data-id='template_orientation']")).click();
		List<WebElement> til = driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu inner')]//li//a//span"));
		System.out.println(til.size());
		for(int i=0; i<til.size(); i++) {
			System.out.println(til.size());
			if(til.get(i).getText().contains("Vertical")) {
				til.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[data-id='template_pagination']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu inner')]//li//a//span"));
		System.out.println(list.size());
		for (int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Inferior Derecha")) {
				list.get(i).click();
				break;
			}
			
		}
		driver.findElement(By.cssSelector("[data-id='template_decimals']")).click();
		List<WebElement> lit = driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu inner')]//li//a//span"));
		System.out.println(lit.size());
		for (int i=0; i<lit.size();i++) {
			System.out.println(lit.get(i).getText());
			if(lit.get(i).getText().equals("6")) {	
			lit.get(i).click();
			break;
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"template_logo\"]")).sendKeys("/Users/lisandrosilva/Downloads/e-logo/e-logo.jpg");
		Thread.sleep(2000);
		ld.TemplateNote().sendKeys("Own Template");
		Thread.sleep(2000);
		ld.CrearTemplate().click();
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
 


