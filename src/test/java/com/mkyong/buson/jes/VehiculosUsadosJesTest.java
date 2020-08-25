package com.mkyong.buson.jes;

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

public class VehiculosUsadosJesTest extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void vehiculosUsadosJes() throws IOException, InterruptedException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		boolean isDisplayed = driver.findElement(By.xpath("//div[contains(text(),'JIMENEZ ESTRADA SALAS A A')]")).isDisplayed();
		if(isDisplayed==true) {
			ld.ServiciosMenu().click();
			//Thread.sleep(2000);
			ld.BuzonFiscal().click();
		}else {
		LandingPage g = new LandingPage(driver);
		//Thread.sleep(2000);
		g.MenuButton().click();
		g.ButtonJes().click();
	    }
		//Thread.sleep(3000);
		ld.SideBar().click();
		//Thread.sleep(2000);
		ld.ingCrearCopr().click();
		//Thread.sleep(2000);
		ld.ingFactura().click();
		//Thread.sleep(1000);
		FacturaPage fact = new FacturaPage(driver);
		fact.FacturaVehiculoUsado().click();
		//Thread.sleep(1000);
		SearchPage ps = new SearchPage(driver);
		ps.BasicaSelectFiscal().sendKeys("603");
		ps.BasicaSelectFiscal().sendKeys(Keys.ENTER);
		ps.RFC().sendKeys("FUNK671228PH6");
		ps.SelectCFDI().sendKeys("G03");
        ps.SelectCFDI().sendKeys(Keys.ENTER);	
        ps.formaPago().sendKeys("1");
        ps.SelectformaPago1().sendKeys("01");
        ps.SelectformaPago1().sendKeys(Keys.ENTER);
        ps.SelectMethodPago().click();
        //Thread.sleep(1000);
        ps.MethodPago1Exhibicion().click();
        ps.AgregarConsept().click();
        ps.ClaveDelProducto().sendKeys("10215612");
        ps.CantidadConsept().sendKeys("80");
        ps.ClaveDeUnidad().sendKeys("H87");
        ps.DescripticionConsept().sendKeys("Factura");
        ps.ValorUnitarioConsept().sendKeys("75");
        ps.AddConsept().click();
        //Thread.sleep(2000);
        ps.AgregarComplVehiUsado().click();
        ps.MontoAquiVehiUsado().sendKeys("70.000");
        ps.MontoEnajVehicUsado().sendKeys("20.000");
        ps.ClaveVehiUsado().sendKeys("2519171");
        ps.MarcaVehicUsado().sendKeys("Mazda");
        ps.TipoVehicUsado().sendKeys("SUV");
        ps.ModeloVehicUsado().sendKeys("2014");
        ps.ValorVehicUsado().sendKeys("80.000");
        //Thread.sleep(1000);
        ps.AddUsedVehicle().click();
        //Thread.sleep(2000);
        

        ps.EmitirFactura().click();
        WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Documento emitido correctamente.')]")));
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Documento emitido correctamente.')]")).getText());
        ld.SignOut().click();
        //Thread.sleep(3000);
        ld.CloseBotton().click();
		
		
		
	    }
	@AfterTest
	public void closeBrowser() {
		driver.quit();
		
	}
	
	}
 


