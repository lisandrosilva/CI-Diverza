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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.CommonPage;
import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import pageObjects.busonfiscal.CommonInfo;
import pageObjects.busonfiscal.CommonLocal;
import resources.base;

public class ComercioExteriorJesDetailTest extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void comercioExteriorDetailJes() throws IOException, InterruptedException {
		 
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
		//Thread.sleep(1000);
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
		fact.FacturaComercioExterior().click();
		//Thread.sleep(1000);
		SearchPage ps = new SearchPage(driver);
		CommonLocal l = new CommonLocal(driver);
		CommonPage c = new CommonPage(driver);
		CommonInfo n = new CommonInfo(driver);
		ps.BasicaSelectFiscal().sendKeys("603");
		ps.BasicaSelectFiscal().sendKeys(Keys.ENTER);
		ps.RFC().sendKeys("FUNK671228PH6");
		//Thread.sleep(1000);
		ps.CFDIComercioExt().click();
		//Thread.sleep(1000);
		ps.AdquiDeMercCFDI().click();	
        ps.formaPago().sendKeys("1");
        ps.SelectformaPago1().sendKeys("01");
        ps.SelectformaPago1().sendKeys(Keys.ENTER);
        ps.SelectMethodPago().click();
        //Thread.sleep(1000);
        ps.MethodPago1Exhibicion().click();
        ps.AgregarConsept().click();
        ps.ClaveDelProducto().sendKeys("60121001");
        ps.NumIDComercioExt().sendKeys("999999");
        ps.CantidadConsept().sendKeys("80");
        ps.ClaveDeUnidad().sendKeys("KGM");
        ps.DescripticionConsept().sendKeys("Reparacion De Lavadora");
        ps.ValorUnitarioConsept().sendKeys("1230.00");
        n.ButtonTransComerExterior().click();
        l.SelectLocalTransf().click();
		l.IvaTransfer().click();
		//Thread.sleep(1000);
		l.SelectTransfertype().click();
		//Thread.sleep(1000);
		l.TasaTransf().click();
		l.TasaCuotaTransf().sendKeys("0.160000");
        n.AddTransladoG().click();
        //Thread.sleep(1000);
        n.ButtonDatosDePartesOcompComExt().click();
        l.ClaveProdLocal().sendKeys("10101512");
		l.CantidadLocal().sendKeys("446817");
		l.DescriptLocal().sendKeys("Conejos");
        l.AgregarParteAsist().click();
        //Thread.sleep(1000);
        n.ButtonInfoAdicComExterior().click();
        l.DescriptOtroIdioma().sendKeys("Inglish");
		l.AdicRefByConsept().sendKeys("abcdg");
		n.AddInfoAdicG().click();
        //Thread.sleep(1000);
        n.ButtonDatosPersoComExterior().click();
        l.ExtraAtribDatoPers().sendKeys("Cantidad");
		l.ValorExtraDatoPers().sendKeys("999999");
		l.AgregarDatosPersAsist().click();
        ps.AddConsept().click();
        ps.OperaComerExt().click();
        //Thread.sleep(1000);
        ps.ExportOperation().click();
        ps.ClaveDePedimentoComerc().click();
        //Thread.sleep(1000);
        ps.ImportDefPedimentoComer().click();
        ps.CertifOrigExport().click();
        //Thread.sleep(1000);
        ps.NonCertiExpo().click();
       // Thread.sleep(2000);
        ps.ClaveIncoTermExport().sendKeys("CFR");
        ps.ClaveIncoTermExport().sendKeys(Keys.ENTER);
        ps.SubdivisionFacturaExp().click();
        //Thread.sleep(1000);
        ps.NonSubdFactExport().click();
        ps.EquiValentExport().sendKeys("20000");
        //Thread.sleep(1000);
        ps.AgregarMercancia().click();
        ps.MercanciaIDNumb().sendKeys("999999");
        ps.CurrencyMercancia().sendKeys("1000");
        ps.MercanciaIDNumb().sendKeys(Keys.ENTER);
        ps.MercanciaDescript().sendKeys("AUDI");
        ps.AddDescriptMercancia().click();
        ps.AddMercancia().click();
        //Thread.sleep(3000);
        WebElement Emissor = driver.findElement(By.xpath("//input[@id='show-ce_emitter']"));
	    JavascriptExecutor j = (JavascriptExecutor)driver;
	    j.executeScript("arguments[0].click();",Emissor);
        //n.ButtonEmisorComExterior().click();
        n.SelectClaveEstadoEmisor().sendKeys("BCS");
        n.SelectClaveEstadoEmisor().sendKeys(Keys.ENTER);
        n.CodiPEmisor().sendKeys("66457");
        n.CalleEmisor().sendKeys("Aguas Calientes");
        //Thread.sleep(3000);
        WebElement Destinatario = driver.findElement(By.xpath("//input[@id='show-ce_destiny']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();",Destinatario);
        //n.ButtonDestinoExterior().click();
        n.AddDestinatario().click();
        //Thread.sleep(2000);
        n.SelectPaisDestinatario().sendKeys("MEX");
        n.SelectPaisDestinatario().sendKeys(Keys.ENTER);
        n.CodigoPostDestinatario().sendKeys("66120");
        n.CalleDestinatario().sendKeys("Monte Mayor");
        n.AgregarDestinatario().click();
        n.AddDestiny().click();
        //Thread.sleep(3000);
        WebElement Receptor = driver.findElement(By.xpath("//input[@id='show-ce_receiver']"));
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].click();",Receptor);
        //n.ButtonReceptorExtensor().click();
        n.SelectPaisReceptor().sendKeys("MEX");
        n.SelectPaisReceptor().sendKeys(Keys.ENTER);
        n.CodigoPostReceptor().sendKeys("66457");
        n.CalleReceptor().sendKeys("Morones Prieto");
        n.ButtonAdendaExtInfo().click();
        c.DatosGeneralesAdenda().click();
		c.ImportLetraGeneral().sendKeys("abcde");
		c.NumeroDeOrdenGeneral().sendKeys("12345");
		c.ObservacionesGeneral().sendKeys("LookingGood");
		//Thread.sleep(1000);
		c.DatosTranpAdenda().click();
		//Thread.sleep(1000);
		c.NumeroEntregaTransporte().sendKeys("12345");
		c.DateEntregaTransporte().sendKeys("15 de Julio");
		c.DriverName().sendKeys("Julio");
		c.LugarDestino().sendKeys("Nuevo Laredo");
		c.StreetTransport().sendKeys("GarzaSada");
		c.InteriorOrExteriorNum().sendKeys("12345");
		c.ColoniaTransp().sendKeys("Residencias");
		c.CidadTransp().sendKeys("Apodaca");
		c.Estado().sendKeys("Nuevo Leon");
		c.Pais().sendKeys("Mexico");
		c.CodigoPost().sendKeys("23345");
		//Thread.sleep(1000);
		c.DatosClientAdenda().click();
		c.NumeroDelClient().sendKeys("12345");
		c.NumeroOrClaveDelComp().sendKeys("123456");
		c.TelefComprador().sendKeys("123456");
		c.EmailContacto().sendKeys("xxxx@hotmail.com");
		c.StreetClient().sendKeys("Punto Valle");
		c.InteriorOrExteriorNum().sendKeys("123456");
		c.ColoniaClient().sendKeys("Garcia");
		c.MunicipioClient().sendKeys("Garcia");
		c.EstadoClient().sendKeys("Cuidad Mexico");
		//Thread.sleep(1000);
		c.PaisClient().sendKeys("Mexico");
		c.CodigoPostalClient().sendKeys("44467");
		//Thread.sleep(1000);
		c.DatosPersAdenda().click();
		//Thread.sleep(1000);
		c.AgregarPersonalAdenda().click();
		c.NombreDelDato().sendKeys("Adenda");
		c.ValorDelDato().sendKeys("60");
		//Thread.sleep(1000);
		c.AddDatosExtras().click();
		//n.ButtonCompRelaExterior().click();
		WebElement Relacionado = driver.findElement(By.xpath("//label[@for='show-related-cfdi']"));
		JavascriptExecutor je = (JavascriptExecutor)driver;
	    je.executeScript("arguments[0].click();", Relacionado);
		c.SelectTipoDRelacionado().sendKeys("02");
		c.SelectTipoDRelacionado().sendKeys(Keys.ENTER);
		c.AgregarRelacionado().click();
		c.FolioFiscalRelacionado().sendKeys("560a8451-a29c-41d4-a716-544676554400");
		c.AddRelacionado().click();

        ps.EmitirFactura().click();
        ld.SignOut().click();
        ld.CloseBotton().click();
        
		
		
		
	    }
	@AfterTest
	   public void closeBrowser() {
		    driver.quit();
		
	}
	
	}
 


