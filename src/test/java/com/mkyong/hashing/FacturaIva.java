package com.mkyong.hashing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.FacturaPage;
import pageObjects.SearchPage;
import resources.base;

public class FacturaIva extends base{
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void basePageNavigation() throws IOException, InterruptedException {
		 
		LandingPageBuson ld = new LandingPageBuson(driver);
		ld.ingPortalAdv().click();
		ld.ingPortalProc().click();
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		ld.ingdropPortal().click();
		ld.ingCrearCopr().click();
		ld.ingFactura().click();
		FacturaPage fact = new FacturaPage(driver);
		fact.Facturabasica().click();
		SearchPage search = new SearchPage(driver);
		search.BasicaSelectFiscal().click();
		search.PersonasMorales().click();
		search.RFC().sendKeys("FUNK671228PH6");
		search.SelectCFDI().click();
		search.CfdiGastosGenerales().click();
		search.formaPago().sendKeys("1");
		search.SelectformaPago1().click();
		search.SelectFormaPago2().click();
		search.SelectMethodPago().click();
		search.MethodPago1Exhibicion().click();
		search.AgregarConsept().click();
		search.ClaveDelProducto().sendKeys("10215612");
		search.CantidadConsept().sendKeys("4");
		search.ClaveDeUnidad().sendKeys("H87");
		search.DescripticionConsept().sendKeys("Factura Electronica");
		search.ValorUnitarioConsept().sendKeys("60");
		search.TransladoButton().click();
		search.SelectImpTranslado().click();
		Thread.sleep(2000);
		search.IvaTranslado().click();
		Thread.sleep(2000);
		search.SelectTipoFactorTransla().click();
		Thread.sleep(2000);
		search.CuotaTransladoFact().click();
		search.TasaoCuotaTranslado().sendKeys("0.8000");
		search.AgregarTranslado().click();
		search.AddConsept().click();
		search.EmitirFactura().click();
		ld.SignOut().click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ld.CloseBotton().click();
		
		
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}

}

