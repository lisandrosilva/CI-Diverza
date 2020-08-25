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
import pageObjects.busonfiscal.CommonInfo;
import pageObjects.busonfiscal.CommonLocal;
import resources.base;

public class TestVentaDeVehiculosJesDetail extends base{
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
		FacturaPage fact = new FacturaPage(driver);
		fact.FacturaVehiculos().click();
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
        ps.ClaveDeUnidad().sendKeys("19");
        ps.DescripticionConsept().sendKeys("Factura");
        ps.ValorUnitarioConsept().sendKeys("75");
        ps.ClaveVehicular().sendKeys("12345678");
        ps.NIVVehicular().sendKeys("12345678");
        ps.AgregarVentaVehicular().click();
        Thread.sleep(1000);
        CommonInfo c = new CommonInfo(driver);
        CommonLocal l = new CommonLocal(driver);
        //c.ButtonParteV().click();
       // c.CantidadV().sendKeys("4");
       // c.DescriptV().sendKeys("Mercedes");
       // c.AddPartV().click();
       // Thread.sleep(1000);
       // c.ButtonInfoAduanaParteV().click();
       // c.NumeroDePartsV().sendKeys("87");
      //  c.DatePartsV().clear();
       // c.DatePartsV().sendKeys("2-14-2018");
       // Thread.sleep(4000);
       // c.AddInfoAduaneraV().click();
        Thread.sleep(1000);
        c.ButtonRetenidoV().click();
        l.SelectLocalTaxes().click();
	    l.IVALocalTaxes().click();
	    Thread.sleep(1000);
	    l.SelectFactorTaxes().click();
		l.TasaF().click();
		l.CuotaOtasaLocal().sendKeys("0.8");
        c.AddRetendidoG().click();
       Thread.sleep(1000);
       c.ButtonTransladoV().click();
       l.SelectLocalTransf().click();
		Thread.sleep(1000);
		l.IvaTransfer().click();
		Thread.sleep(1000);
		l.SelectTransfertype().click();
		Thread.sleep(1000);
		l.TasaTransf().click();
		l.TasaCuotaTransf().sendKeys("0.8");
        c.AddTransladoG().click();
       c.ButtonNumeroPedimentoV().click();
        l.ValidYearLocalPed().sendKeys("18");
		l.AduanaDespLocalPed().sendKeys("24");
		l.PatentNumLocalPed().sendKeys("1487");
		l.YearPlusProgr().sendKeys("8015991");
       c.AddNumeroPedG().click();
       c.ButtonDatosPartesOcompV().click();
        l.ClaveProdLocal().sendKeys("10101512");
		l.CantidadLocal().sendKeys("446817");
		l.DescriptLocal().sendKeys("Conejos");
        c.AddPartOCompNotario().click();
       Thread.sleep(1000);
       c.ButtonInfoAduaDatsPartsV().click();
        l.AnoValidAduanera().sendKeys("18");
		l.AduanaDespacho().sendKeys("24");
		l.NumeroPatente().sendKeys("1487");
		l.AnoNumProg().sendKeys("8016004");
       c.AddParteG().click();
       Thread.sleep(1000);
       c.ButtonInfoAdcV().click();
       l.DescriptOtroIdioma().sendKeys("Inglish");
	   l.AdicRefByConsept().sendKeys("abcdg");
       c.AddInfoAdicG().click();
       Thread.sleep(1000);
       c.ButtonDatsPersoV().click();
       l.ExtraAtribDatoPers().sendKeys("Cantidad");
	   l.ValorExtraDatoPers().sendKeys("999999");
       c.AddExtraDtaG().click();
        ps.AddConsept().click();
        Thread.sleep(2000);
        CommonPage p = new CommonPage(driver);
        c.ButtonAdendaInfoAdicionalV().click();
 		p.DatosGeneralesAdenda().click();
 		p.ImportLetraGeneral().sendKeys("abcde");
 		p.NumeroDeOrdenGeneral().sendKeys("12345");
 		p.ObservacionesGeneral().sendKeys("LookingGood");
 		Thread.sleep(1000);
 		p.DatosTranpAdenda().click();
 		Thread.sleep(1000);
 		p.NumeroEntregaTransporte().sendKeys("12345");
 		p.DateEntregaTransporte().sendKeys("15 de Julio");
 		p.DriverName().sendKeys("Julio");
 		p.LugarDestino().sendKeys("Nuevo Laredo");
 		p.StreetTransport().sendKeys("GarzaSada");
 		p.InteriorOrExteriorNum().sendKeys("12345");
 		p.ColoniaTransp().sendKeys("Residencias");
 		p.CidadTransp().sendKeys("Apodaca");
 		p.Estado().sendKeys("Nuevo Leon");
 		p.Pais().sendKeys("Mexico");
 		p.CodigoPost().sendKeys("23345");
 		Thread.sleep(1000);
 		p.DatosClientAdenda().click();
 		p.NumeroDelClient().sendKeys("12345");
 		p.NumeroOrClaveDelComp().sendKeys("123456");
 		p.TelefComprador().sendKeys("123456");
 		p.EmailContacto().sendKeys("xxxx@hotmail.com");
 		p.StreetClient().sendKeys("Punto Valle");
 		p.InteriorOrExteriorNum().sendKeys("123456");
 		p.ColoniaClient().sendKeys("Garcia");
 		p.MunicipioClient().sendKeys("Garcia");
 		p.EstadoClient().sendKeys("Cuidad Mexico");
 		Thread.sleep(1000);
 		p.PaisClient().sendKeys("Mexico");
 		p.CodigoPostalClient().sendKeys("44467");
 		Thread.sleep(1000);
 		p.DatosPersAdenda().click();
 		Thread.sleep(1000);
 		p.AgregarPersonalAdenda().click();
 		p.NombreDelDato().sendKeys("Adenda");
 		p.ValorDelDato().sendKeys("60");
 		Thread.sleep(1000);
 		p.AddDatosExtras().click();
 		c.ButtonCompRelav().click();
 		Thread.sleep(1000);
 		p.SelectTipoDRelacionado().sendKeys("02");
 		p.SelectTipoDRelacionado().sendKeys(Keys.ENTER);
 		p.AgregarRelacionado().click();
 		p.FolioFiscalRelacionado().sendKeys("560a8451-a29c-41d4-a716-544676554400");
 		p.AddRelacionado().click();
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
 


