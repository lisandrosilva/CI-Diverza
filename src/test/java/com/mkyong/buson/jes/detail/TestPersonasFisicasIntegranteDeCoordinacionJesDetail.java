package com.mkyong.buson.jes.detail;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.CommonPage;
import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import pageObjects.busonfiscal.CommonInfo;
import resources.base;

public class TestPersonasFisicasIntegranteDeCoordinacionJesDetail extends base{
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
		LandingPage g = new LandingPage(driver);
		Thread.sleep(2000);
		g.ButtonFunk().click();
		g.ButtonJes().click();
		Thread.sleep(2000);
		ld.ingCrearCopr().click();
		Thread.sleep(2000);
		ld.ingFactura().click();
		Thread.sleep(1000);
		FacturaPage fact = new FacturaPage(driver);
		fact.FacturaPersonasFisicas().click();
		Thread.sleep(1000);
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
        Thread.sleep(1000);
        ps.MethodPago1Exhibicion().click();
        ps.AgregarConsept().click();
        ps.ClaveDelProducto().sendKeys("10215612");
        ps.CantidadConsept().sendKeys("80");
        ps.ClaveDeUnidad().sendKeys("H87");
        ps.DescripticionConsept().sendKeys("Factura");
        ps.ValorUnitarioConsept().sendKeys("75");
        CommonInfo n = new CommonInfo(driver);
        CommonPage c = new CommonPage(driver);
        n.ButtonRetePersonas().click();
        c.ImpuestRetenido().click();
		c.IVARetenido().click();
		Thread.sleep(1000);
		c.FactorRetenido().click();
		Thread.sleep(1000);
		c.TasaRetenido().click();
		Thread.sleep(1000);
		c.TasaOcutaRetenido().clear();
		c.TasaOcutaRetenido().sendKeys("16.0000");
        Thread.sleep(1000);
        n.ButtonTransPersonas().click();
        c.TaxTranslado().click();
		Thread.sleep(1000);
		c.IVATranslado().click();
		Thread.sleep(1000);
		c.TypeFactorTranslado().click();
		Thread.sleep(1000);
		c.TasaTranslado().click();
		Thread.sleep(1000);
		c.TasaOcuTaTranslado().clear();
		c.TasaOcuTaTranslado().sendKeys("16.0000");
        Thread.sleep(1000);
        n.ButtonNumePedPersonas().click();
        c.AnoValidacionPedimento().sendKeys("18");
		c.AduanaPedimento().sendKeys("24");
		c.PatentePedimento().sendKeys("1487");
		c.ProgressionPedimento().sendKeys("8022338");
        Thread.sleep(1000);
        n.ButtonDatsDePartesOcompPersonas().click();
        c.ClaveDelProductCompr().sendKeys("10101507");
		c.CantidadComponente().sendKeys("999999");
		c.DescriptComponente().sendKeys("Ovejas");
        Thread.sleep(1000);
        n.ButtonInfoPartesAduanPersonas().click();
        c.AnoAduanera().sendKeys("18");
		c.AduanaDespacho().sendKeys("24");
		c.NumeroAduanaPatente().sendKeys("1487");
		c.AnoProgressAduana().sendKeys("8015956");
        Thread.sleep(1000);
        n.ButtonAdcInfoPersonas().click();
        c.DescriptInformacion().sendKeys("Great");
		c.RefAdicInfo().sendKeys("abcdef");
        Thread.sleep(1000);
        n.ButtonDatsPersnPersonas().click();
        Thread.sleep(1000);
        c.ExtraDatoNombre().sendKeys("Caducidad");
		c.ExtraValorDato().sendKeys("31-Diciembre-2019");
		Thread.sleep(1000);
		ps.AddConsept().click();
		ps.ClavePersonasFisicas().sendKeys("abcdef");
		ps.PlacaPersonasFisicas().sendKeys("12345adc");
		n.ButtonInfAdcAdendaPersonas().click();
        c.DatosGeneralesAdenda().click();
		c.ImportLetraGeneral().sendKeys("abcde");
		c.NumeroDeOrdenGeneral().sendKeys("12345");
		c.ObservacionesGeneral().sendKeys("LookingGood");
		Thread.sleep(1000);
		c.DatosTranpAdenda().click();
		Thread.sleep(1000);
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
		Thread.sleep(1000);
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
		Thread.sleep(1000);
		c.PaisClient().sendKeys("Mexico");
		c.CodigoPostalClient().sendKeys("44467");
		Thread.sleep(1000);
		c.DatosPersAdenda().click();
		Thread.sleep(1000);
		c.AgregarPersonalAdenda().click();
		c.NombreDelDato().sendKeys("Adenda");
		c.ValorDelDato().sendKeys("60");
		Thread.sleep(1000);
		c.AddDatosExtras().click();
		n.ButtonComprRelaPersonas().click();

		Thread.sleep(1000);
		c.SelectTipoDRelacionado().sendKeys("02");
		c.SelectTipoDRelacionado().sendKeys(Keys.ENTER);
		c.AgregarRelacionado().click();
		c.FolioFiscalRelacionado().sendKeys("560a8451-a29c-41d4-a716-544676554400");
		c.AddRelacionado().click();
		Thread.sleep(2000);
        ps.EmitirFactura().click();
		Thread.sleep(6000);
		ld.SignOut().click();
		Thread.sleep(3000);
		ld.CloseBotton().click();
		
	    }
	@AfterTest
	   public void closeBrowser() {
		driver.close();
		
	}
	
	}
 


