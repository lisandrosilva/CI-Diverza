package com.mkyong.buson.jes.detail;

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
import org.openqa.selenium.WebElement;
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

public class FacturaAdendaMultiAssistenciaJesDetailTest extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void facturaAdendaMultAssistDetailJes() throws IOException, InterruptedException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		boolean isDisplayed = driver.findElement(By.xpath("//div[contains(text(),'JIMENEZ ESTRADA SALAS A A')]")).isDisplayed();
		if(isDisplayed==true) {
			ld.ServiciosMenu().click();
			//Thread.sleep(2000);
			ld.BuzonFiscal().click();
		}else {
		LandingPage g = new LandingPage(driver);
		//Thread.sleep(2000);
		g.MenuButton().click();
		//Thread.sleep(1000);
		g.ButtonJes().click();
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
	    
	    s.BasicaSelectFiscal().sendKeys("603");
	    //Thread.sleep(2000);
	    s.BasicaSelectFiscal().sendKeys(Keys.ENTER);
	    
	    s.RFC().sendKeys("MUL9607165C5");
	    //Thread.sleep(3000);
	   
	    s.SelectCFDI().sendKeys("G03");
	    s.SelectCFDI().sendKeys(Keys.ENTER);
	   
	    
	    s.formaPago().sendKeys("1");
	    s.SelectformaPago1().sendKeys("01");
	    s.SelectformaPago1().sendKeys(Keys.ENTER);
	    //Thread.sleep(1000);
	    s.SelectMethodPago().click();
	    //Thread.sleep(1000);
	    s.MethodPago1Exhibicion().click();
	    //Thread.sleep(2000);
		s.AgregarConsept().click();
		s.ClaveDelProducto().sendKeys("10215612");
		s.CantidadConsept().sendKeys("4");
		s.ClaveDeUnidad().sendKeys("H87");
		s.DescripticionConsept().sendKeys("Factura Electronica");
		s.ValorUnitarioConsept().sendKeys("60");
		//Thread.sleep(2000);
		CommonPage c = new CommonPage(driver);
		c.BottonImpuestosRet().click();
		//Thread.sleep(1000);
		c.ImpuestRetenido().click();
		//Thread.sleep(1000);
		c.IVARetenido().click();
		//Thread.sleep(1000);
		c.FactorRetenido().click();
		//Thread.sleep(1000);
		c.TasaRetenido().click();
		//Thread.sleep(1000);
		c.TasaOcutaRetenido().clear();
		c.TasaOcutaRetenido().sendKeys("16.0000");
		c.AddRetention().click();
		//Thread.sleep(1000);
		c.ButtonImpTranslados().click();
		//Thread.sleep(1000);
		c.TaxTranslado().click();
		//Thread.sleep(1000);
		c.IVATranslado().click();
		//Thread.sleep(1000);
		c.TypeFactorTranslado().click();
		//Thread.sleep(1000);
		c.TasaTranslado().click();
		//Thread.sleep(1000);
		c.TasaOcuTaTranslado().clear();
		c.TasaOcuTaTranslado().sendKeys("16.0000");
		c.AddTranslado().click();
		//Thread.sleep(1000);
		c.ButtonPedimento().click();
		//Thread.sleep(1000);
		c.AnoValidacionPedimento().sendKeys("18");
		c.AduanaPedimento().sendKeys("24");
		c.PatentePedimento().sendKeys("1487");
		c.ProgressionPedimento().sendKeys("8022338");
		c.Addpedimento().click();
		//Thread.sleep(1000);
		c.ButtonDatosDPartesOComp().click();
		c.ClaveDelProductCompr().sendKeys("10101507");
		c.CantidadComponente().sendKeys("999999");
		c.DescriptComponente().sendKeys("Ovejas");
		//Thread.sleep(2000);
		c.ButtonPartesAduaneras().click();
		c.AnoAduanera().sendKeys("18");
		c.AduanaDespacho().sendKeys("24");
		c.NumeroAduanaPatente().sendKeys("1487");
		c.AnoProgressAduana().sendKeys("8015956");
		//Thread.sleep(1000);
		c.ButtonAdicionalInfo().click();
		c.DescriptInformacion().sendKeys("Great");
		c.RefAdicInfo().sendKeys("abcdef");
		//Thread.sleep(1000);
		c.ButtonDatosPersonalizados().click();
		c.ExtraDatoNombre().sendKeys("Caducidad");
		c.ExtraValorDato().sendKeys("31-Diciembre-2019");
		//Thread.sleep(1000);
		s.AddConsept().click();
		//Thread.sleep(1000);
		CommonLocal n = new CommonLocal(driver);
		n.ClaveDelProvMultiAsist().sendKeys("102015");
		n.OrdenDePagoMultAsist().sendKeys("123456");
		n.IdentSinestMultAsist().sendKeys("B12345678");
		n.PaseMedicoMultiAsist().sendKeys("1234567891");
		n.CostoMultiAsist().sendKeys("0.08");
		n.IvaMultiAsist().sendKeys("0.08");
		//c.ButtonComprRelacionado().click();
		WebElement Relacionado = driver.findElement(By.xpath("//label[@for='show-related-cfdi']"));
		JavascriptExecutor j = (JavascriptExecutor)driver;
	    j.executeScript("arguments[0].click();", Relacionado);
		c.SelectTipoDRelacionado().sendKeys("02");
		c.SelectTipoDRelacionado().sendKeys(Keys.ENTER);
		c.AgregarRelacionado().click();
		c.FolioFiscalRelacionado().sendKeys("560a8451-a29c-41d4-a716-544676554400");
		c.AddRelacionado().click();
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
 


