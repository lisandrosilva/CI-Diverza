package com.mkyong.busonfiscal;

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

import pageObjects.CommonPage;
import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import pageObjects.busonfiscal.CommonLocal;
import resources.base;

public class FacturaAdendaMultiAssistenciaTest2 extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void facturaAdendaMultiAssitencia2() throws IOException, InterruptedException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		boolean isDisplayed = driver.findElement(By.xpath("//div[contains(text(),'KARLA FUENTE ')]")).isDisplayed();
		if(isDisplayed==true) {
			System.out.println("Continue the operation");
		}else {
			//Thread.sleep(2000);
			LandingPage g = new LandingPage(driver);
			//Thread.sleep(2000);
			g.ButtonJes().click();
			g.ButtonFunk().click();
		}
		
		//Thread.sleep(3000);
		ld.SideBar().click();
		//Thread.sleep(2000);
		ld.ingCrearCopr().click();
		//Thread.sleep(2000);
		ld.ingFactura().click();
		FacturaPage fp = new FacturaPage(driver);
		fp.Facturabasica().click();
		//Thread.sleep(2000);
	    SearchPage s = new SearchPage(driver);
	    
	    
	    
	    //Thread.sleep(1000);
	    
	    s.BasicaSelectFiscal().sendKeys("612");
	   // Thread.sleep(2000);
	    s.BasicaSelectFiscal().sendKeys(Keys.ENTER);
	    
	    s.RFC().sendKeys("MUL9607165C5");
	   // Thread.sleep(3000);
	   
	    s.SelectCFDI().sendKeys("G03");
	    s.SelectCFDI().sendKeys(Keys.ENTER);
	   
	    
	    s.formaPago().sendKeys("1");
	    s.SelectformaPago1().sendKeys("01");
	    s.SelectformaPago1().sendKeys(Keys.ENTER);
	   // Thread.sleep(1000);
	    s.SelectMethodPago().click();
	   // Thread.sleep(1000);
	    s.MethodPago1Exhibicion().click();
	    //Thread.sleep(2000);
	    for(int i=0; i<3; i++) {
		s.AgregarConsept().click();
		s.ClaveDelProducto().sendKeys("10215612");
		s.CantidadConsept().sendKeys("4");
		s.ClaveDeUnidad().sendKeys("H87");
		s.DescripticionConsept().sendKeys("Factura Electronica");
		s.ValorUnitarioConsept().sendKeys("60");
		//Thread.sleep(2000);
		s.AddConsept().click();
	    }
		//Thread.sleep(3000);
		CommonLocal n = new CommonLocal(driver);
		n.ClaveDelProvMultiAsist().sendKeys("102015");
		n.OrdenDePagoMultAsist().sendKeys("123456");
		n.IdentSinestMultAsist().sendKeys("B12345678");
		n.PaseMedicoMultiAsist().sendKeys("1234567891");
		n.CostoMultiAsist().sendKeys("0.08");
		n.IvaMultiAsist().sendKeys("0.08");
		//Thread.sleep(2000);
		s.EmitirFactura().click();
		WebDriverWait wait = new WebDriverWait(driver,10);
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
 


