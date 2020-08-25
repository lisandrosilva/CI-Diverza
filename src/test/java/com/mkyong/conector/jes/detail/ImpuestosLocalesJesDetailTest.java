package com.mkyong.conector.jes.detail;

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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.CommonPage;
import pageObjects.FacturaPage;
import pageObjects.LandingPage;
import pageObjects.SearchPage;
import pageObjects.busonfiscal.CommonLocal;
import resources.base;

// Emitir Una Factura Impuestos Locales

public class ImpuestosLocalesJesDetailTest extends base{
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
		boolean isDisplayed = driver.findElement(By.xpath("//div[contains(text(),'JIMENEZ ESTRADA SALAS A A')]")).isDisplayed();
		System.out.println("Element is displayed");
		if(isDisplayed == true) {
			System.out.println("Continue with the operation");
		}else {
		LandingPage g = new LandingPage(driver);
		Thread.sleep(2000);
		g.MenuButton().click();
		g.ButtonJes().click();
		Thread.sleep(2000);
		ld.ServiciosMenu().click();
		Thread.sleep(2000);
		ld.ConectorFiscal().click();
		}
		Thread.sleep(2000);
		ld.ingCrearCopr().click();
		Thread.sleep(2000);
		ld.ingFactura().click();
		Thread.sleep(1000);
		FacturaPage ft = new FacturaPage(driver);
		ft.FacturaImpuestos().click();
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
        CommonLocal l = new CommonLocal(driver);
        l.ButtonLocalTaxes().click();
        Thread.sleep(1000);
        l.SelectLocalImp().sendKeys("Prueba");
        l.SelectLocalImp().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        l.LocalTaxes().sendKeys("ISH");
        l.LocalTaxes().sendKeys(Keys.ENTER);
        l.AgregarLocalTaxes().click();
        Thread.sleep(1000);
		l.ButtonLocalRetention().click();
		Thread.sleep(1000);
		l.SelectLocalTaxes().click();
		l.IVALocalTaxes().click();
		Thread.sleep(1000);
		l.SelectFactorTaxes().click();
		l.TasaF().click();
		l.CuotaOtasaLocal().sendKeys("0.8");
		l.RetenidoAsist().click();
		Thread.sleep(1000);
		l.ButtonTranLocal().click();
		l.SelectLocalTransf().click();
		Thread.sleep(1000);
		l.IvaTransfer().click();
		Thread.sleep(1000);
		l.SelectTransfertype().click();
		Thread.sleep(1000);
		l.CuotaTransf().click();
		l.TasaCuotaTransf().sendKeys("0.160000");
		l.AgregarTransAsist().click();
		Thread.sleep(1000);
		l.ButtonPediLocal().click();
		l.ValidYearLocalPed().sendKeys("18");
		l.AduanaDespLocalPed().sendKeys("24");
		l.PatentNumLocalPed().sendKeys("1487");
		l.YearPlusProgr().sendKeys("8015991");
		l.AgregarPedAsist().click();
		Thread.sleep(1000);
		l.ButtonPartsCompLocal().click();
		l.ClaveProdLocal().sendKeys("10101512");
		l.CantidadLocal().sendKeys("446817");
		l.DescriptLocal().sendKeys("Conejos");
		l.AgregarParteAsist().click();
		Thread.sleep(1000);
		l.ButtonInfAduanera().click();
		l.AnoValidAduanera().sendKeys("18");
		l.AduanaDespacho().sendKeys("24");
		l.NumeroPatente().sendKeys("1487");
		l.AnoNumProg().sendKeys("8016004");
		l.ButtonInfAdLocal().click();
		l.DescriptOtroIdioma().sendKeys("Inglish");
		l.AdicRefByConsept().sendKeys("abcdg");
		l.AgregarInfoAduanaAsist().click();
		Thread.sleep(1000);
		l.ButtonDatosPerson().click();
		l.ExtraAtribDatoPers().sendKeys("Cantidad");
		l.ValorExtraDatoPers().sendKeys("999999");
		l.AgregarDatosPersAsist().click();
        ps.AddConsept().click();
        CommonPage c = new CommonPage(driver);
        c.ButtonAdendaDiverza().click();
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
		c.ButtonComprRelacionado().click();
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
		driver.quit();
		
	}
	
	}
 


