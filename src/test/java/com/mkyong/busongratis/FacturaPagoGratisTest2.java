package com.mkyong.busongratis;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import resources.base;

public class FacturaPagoGratisTest2 extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void pagoGratis2() throws IOException, InterruptedException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		LandingPage g = new LandingPage(driver);
		boolean isDisplayed = driver.findElement(By.xpath("//*[text()='Nombre ApellidoP ApellidoM']")).isDisplayed();
		if(isDisplayed==true) {
			System.out.println("Continue the operation");
		}else {
			//LandingPage g = new LandingPage(driver);
			Thread.sleep(2000);
			g.MenuButton().click();
			g.BottonApellido().click();
		}
		
		ld.SideBar().click();
		//Thread.sleep(2000);
		ld.ingCrearCopr().click();
		//Thread.sleep(2000);
		ld.ingPagos().click();
		SearchPage s = new SearchPage(driver);
		//Thread.sleep(2000);
		g.SelectRegGratis().click();
		//Thread.sleep(2000);
		g.RegimeMoral().click();
		g.SucursalGratis().sendKeys("alias");
		g.SucursalGratis().sendKeys(Keys.ENTER);
		g.CodigoPostalGratis().sendKeys("66457");
		s.RFC().sendKeys("AAA010101AAA");
		s.AgregarCompPago().click();
		s.FechaDePago().sendKeys("27-01-2020");
		g.FormaPagoPGR().click();
		g.PagoEfectivoGratis().click();
		//s.TipoDeCambioPago().sendKeys("1");
		s.MontoDePago().sendKeys("3000");
		//Thread.sleep(3000);
		s.TaggleSwitchPago().click();
		s.DocRelacPago().sendKeys("234546d0-5a38-4431-8edb-0f331c10a6d5");
		//s.CambioPago().sendKeys("1");
		s.MethodPagoPago().click();
		s.PPDPago().click();
		s.FolioPago().sendKeys("676");
		s.NumeroDeParcialidad().sendKeys("1");
		s.ImpSaldoAntePago().sendKeys("2100.00");
		s.ImportePago().sendKeys("1100.00");
		s.ImporteSaldoInsolutPago().sendKeys("1000");
		s.AgregarComprDePago().click();
		s.AddPagoComplement().click();
		//Thread.sleep(3000);
		s.AgregarCompPago().click();
		s.FechaDePago().sendKeys("27-01-2020");
		g.FormaPagoPGR().click();
		g.PagoEfectivoGratis().click();
		//s.TipoDeCambioPago().sendKeys("1");
		s.MontoDePago().sendKeys("3000");
		//Thread.sleep(3000);
		s.TaggleSwitchPago().click();
		s.DocRelacPago().sendKeys("234546d0-5a38-4431-8edb-0f331c10a6d5");
		//s.CambioPago().sendKeys("1");
		s.MethodPagoPago().click();
		s.PPDPago().click();
		s.FolioPago().sendKeys("676");
		s.NumeroDeParcialidad().sendKeys("1");
		s.ImpSaldoAntePago().sendKeys("2100.00");
		s.ImportePago().sendKeys("1100.00");
		s.ImporteSaldoInsolutPago().sendKeys("1000");
		s.AgregarComprDePago().click();
		s.AddPagoComplement().click();
		s.EmitirFactura().click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Documento emitido correctamente.')]")));
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Documento emitido correctamente.')]")).getText());
	    }
	@AfterTest
	  public void closeBrowser() {
		driver.quit();
		
	}
	
	  }
 


