package com.mkyong.busonfiscal.detail;

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
import pageObjects.busonfiscal.CommonLocal;
import resources.base;

public class TestFacturaCartaPorteDetail extends base{
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
		Thread.sleep(3000);
		ld.ingCrearCopr().click();
		Thread.sleep(2000);
		ld.ingCartaPorte().click();
		SearchPage s = new SearchPage(driver);
		s.CartaPorteBasica().click();
		s.BasicaSelectFiscal().sendKeys("612");
		s.BasicaSelectFiscal().sendKeys(Keys.ENTER);
		s.RFC().sendKeys("FUNK671228PH6");
		s.SelectCFDI().sendKeys("G03");
		s.SelectCFDI().sendKeys(Keys.ENTER);
		s.formaPago().sendKeys("1");
		s.SelectformaPago1().sendKeys("01");
		s.SelectformaPago1().sendKeys(Keys.ENTER);
		 s.AgregarConsept().click();
	        s.ClaveDelProducto().sendKeys("10215612");
	        s.CantidadConsept().sendKeys("80");
	        s.ClaveDeUnidad().sendKeys("H87");
	        s.DescripticionConsept().sendKeys("Factura");
	        s.ValorUnitarioConsept().sendKeys("75");
	        CommonLocal l = new CommonLocal(driver);
	        CommonPage c = new CommonPage(driver);
	        CommonInfo n = new CommonInfo(driver);
	        /*
	        n.ButtonRetenidoVs().click();
	        l.SelectLocalTaxes().click();
			l.IVALocalTaxes().click();
			Thread.sleep(1000);
			l.SelectFactorTaxes().click();
			l.TasaF().click();
			l.CuotaOtasaLocal().sendKeys("8");
	         n.AddRetendidoG().click();
	         Thread.sleep(1000);
	         n.ButtonTransVs().click();
	         l.SelectLocalTransf().click();
			 Thread.sleep(1000);
			 l.IvaTransfer().click();
			 Thread.sleep(1000);
			 l.SelectTransfertype().click();
			 Thread.sleep(1000);
			 l.TasaTransf().click();
			 l.TasaCuotaTransf().sendKeys("8");
	         n.AddTransladoG().click();
	        */
	        Thread.sleep(1000);
	        n.ButtonNumeroPediVs().click();
	        l.ValidYearLocalPed().sendKeys("18");
			l.AduanaDespLocalPed().sendKeys("24");
			l.PatentNumLocalPed().sendKeys("1487");
			l.YearPlusProgr().sendKeys("8015991");
	        n.AddNumeroPedG().click();
	        Thread.sleep(1000);
	        n.ButtonDatsPartsCompVs().click();
	        l.ClaveProdLocal().sendKeys("10101512");
			l.CantidadLocal().sendKeys("446817");
			l.DescriptLocal().sendKeys("Conejos");
	        l.AgregarParteAsist().click();
	        Thread.sleep(1000);
	        n.ButtonPartsAduaneraVs().click();
	        l.AnoValidAduanera().sendKeys("18");
			l.AduanaDespacho().sendKeys("24");
			l.NumeroPatente().sendKeys("1487");
			l.AnoNumProg().sendKeys("8016004");
			
	        Thread.sleep(1000);
	        n.ButtonInfoAdcVs().click();
	        l.DescriptOtroIdioma().sendKeys("Inglish");
			l.AdicRefByConsept().sendKeys("abcdg");
			l.AgregarInfoAduanaAsist().click();
	        Thread.sleep(1000);
	        n.ButtonDatosPersonVs().click();
	        l.ExtraAtribDatoPers().sendKeys("Cantidad");
			l.ValorExtraDatoPers().sendKeys("999999");
			l.AgregarDatosPersAsist().click();
	        s.AddConsept().click();
	        Thread.sleep(2000);
	        
	        n.ButtonInfoAdendaCarta().click();
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
			n.ButtonCompRelaCarta().click();
			Thread.sleep(1000);
			c.SelectTipoDRelacionado().sendKeys("04");
			c.SelectTipoDRelacionado().sendKeys(Keys.ENTER);
			c.AgregarRelacionado().click();
			c.FolioFiscalRelacionado().sendKeys("560a8451-a29c-41d4-a716-544676554400");
			c.AddRelacionado().click();

		    s.EmitirFactura().click();
		    Thread.sleep(6000);
		    ld.SignOut().click();
		    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		    ld.CloseBotton().click();
		}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	
	}
}
 


