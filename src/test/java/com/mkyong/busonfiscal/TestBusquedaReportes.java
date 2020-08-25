package com.mkyong.busonfiscal;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.FacturaPage;
import pageObjects.SearchPage;
import resources.base;

public class TestBusquedaReportes extends base{
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void basePageNavigation() throws IOException, InterruptedException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='btn-group bootstrap-select billing_receipt_type_select']")).click();
		Thread.sleep(3000);
		List<WebElement> dropdown = driver.findElements(By.xpath("//div[@class='btn-group bootstrap-select billing_receipt_type_select_dropup']/ul/li/a"));
			
		for (WebElement ele : dropdown)
			 
	       {
	 
	          
	 
	          System.out.println("Values " + ele.getAttribute("Ingreso"));
	 
	 
	 
	          
	 
	          if (ele.getAttribute("Ingreso").contains("Egreso")) {
	 
	           
	 
	             ele.click();
	 
	 
	 
	            
	 
	             break;
	 
	          }
		}
		
		//Thread.sleep(2000);
		//ld.SignOut().click();
		//Thread.sleep(2000);
		//ld.CloseBotton().click();
		
		
	//@AfterTest
	//public void closeBrowser() {
		//driver.close();
		
	
 
   }
	
}

