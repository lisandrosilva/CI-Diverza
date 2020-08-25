package com.mkyong.conector.jes;

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

public class ServiciosParcealesDeContruccionJesTest extends base{
	public WebDriver driver;
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
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		boolean isDisplayed = driver.findElement(By.xpath("//div[contains(text(),'JIMENEZ ESTRADA SALAS A A')]")).isDisplayed();
		System.out.println("Element is displayed");
		if(isDisplayed == true) {
			System.out.println("Continue with the operation");
		}else {
		LandingPage g = new LandingPage(driver);
		//Thread.sleep(2000);
		g.MenuButton().click();
		g.ButtonJes().click();
		//Thread.sleep(2000);
		ld.ServiciosMenu().click();
		//Thread.sleep(2000);
		ld.ConectorFiscal().click();
		}
		ld.SideBar().click();
		//Thread.sleep(2000);
		ld.ingCrearCopr().click();
		//Thread.sleep(2000);
		ld.ingFactura().click();
		//Thread.sleep(1000);
		FacturaPage fact = new FacturaPage(driver);
		fact.FacturaServiciosConstrucion().click();
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
        //Thread.sleep(1000);
        ps.AgregCompleConstruccion().click();
        ps.AuthoConstruccion().sendKeys("9999999999");
        ps.CalleConstruccion().sendKeys("San Pedro");
        ps.MunicipioCostruccion().sendKeys("San Pedro");
        ps.EstadoConstruccion().sendKeys("19");
        ps.EstadoConstruccion().sendKeys(Keys.ENTER);
        ps.CodigoPostalConstr().sendKeys("66457");
        ps.AddContruccion().click();
        //Thread.sleep(3000);
       
     
        ps.EmitirFactura().click();
        WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Documento emitido correctamente.')]")));
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Documento emitido correctamente.')]")).getText());
        ld.SignOut().click();
        ld.CloseBotton().click();
		
	    }
	@AfterTest
	public void closeBrowser() {
		driver.quit();
		
	}
	
	}
 


