package com.mkyong.busonfiscal.detail;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.bson.Document;
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

public class TestFacturaDetallistaDetallista extends base{
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		 
		 
		 
	 }
	@Test 
	public void basePageNavigation() throws IOException, InterruptedException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
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
		ld.ingFactura().click();
		FacturaPage f = new FacturaPage(driver);
		f.FacturaDetallista().click();
		SearchPage ch = new SearchPage(driver);
		ch.BasicaSelectFiscal().sendKeys("612");
		ch.BasicaSelectFiscal().sendKeys(Keys.ENTER);
		ch.RFC().sendKeys("FUNK671228PH6");
		ch.SelectCFDI().sendKeys("G03");
		ch.SelectCFDI().sendKeys(Keys.ENTER);
		ch.formaPago().sendKeys("1");
		ch.SelectformaPago1().sendKeys("01");
		ch.SelectformaPago1().sendKeys(Keys.ENTER);
		ch.SelectMethodPago().click();
		//Thread.sleep(3000);
		ch.MethodPago1Exhibicion().click();
	    ch.AgregarConsept().click();
	    ch.ClaveDelProducto().sendKeys("95122306");
	    ch.CantidadConsept().sendKeys("20");
	    ch.ClaveDeUnidad().sendKeys("KGM");
	    ch.DescripticionConsept().sendKeys("Prueba");
	    ch.ValorUnitarioConsept().sendKeys("50.00");
	    CommonLocal l = new CommonLocal(driver);
        CommonPage c = new CommonPage(driver);
        CommonInfo n = new CommonInfo(driver);
        CommonPage p = new CommonPage(driver);
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
        l.DescriptOtroIdioma().sendKeys("English");
		l.AdicRefByConsept().sendKeys("abcdg");
		l.AgregarInfoAduanaAsist().click();
        Thread.sleep(1000);
        n.ButtonDatosPersonVs().click();
        l.ExtraAtribDatoPers().sendKeys("Cantidad");
		l.ValorExtraDatoPers().sendKeys("999999");
		l.AgregarDatosPersAsist().click();
	    ch.AddConsept().click();
	    Thread.sleep(2000);
	    ch.FuncionMSNDetallista().click();
	    Thread.sleep(1000);
	    ch.FuncOriginalDeta().click();
		ch.TipoTransactionDetallista().sendKeys("INVOICE");
		ch.TipoTransactionDetallista().sendKeys(Keys.ENTER);
		ch.NumeroDePedidoDetallista().sendKeys("1234567");
		ch.GNLDetallista().sendKeys("7504000107903");
		ch.CodigoRefAdDetallista().sendKeys("AAE");
		ch.CodigoRefAdDetallista().sendKeys(Keys.ENTER);
		ch.NumeroDetallista().sendKeys("9999999999");
		p.ButtonEntregaMercDetail().click();
		p.DeliveryDataDetail().sendKeys("04-05-2018");
    	Thread.sleep(1000);
		
		p.DeliveryFolioDetail().sendKeys("B21");
		p.DeliveryFolioDetail().sendKeys(Keys.ENTER);
		p.ButtonInspDetail().click();
		p.SelectTipoInstrDetail().sendKeys("AAB");
		p.SelectTipoInstrDetail().sendKeys(Keys.ENTER);
		p.InstruccionDetail().sendKeys("Pago");
		p.ButtonVendedorDetail().click();
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("document.getElementById('[seller][gln]').value='7504000107903';");

		p.SelectTipoDIDSecDeatail().click();
		Thread.sleep(1000);
		p.NumeroInternoSecDetail().click();
		
		p.IDSecundarVendedor().sendKeys("12345");
		
		
		p.ButtonInformacionEnviarMercancia().click();
		p.GNLEnviarMercanciaDetallista().sendKeys("7504000107903");
//		Thread.sleep(1000);
		//p.LugarDentrega().sendKeys("OAX");
		//p.DomicilioEntregaDetail().sendKeys("OAX");
		//p.DeliveryCityDetail().sendKeys("Guadalajara");
		//p.DeliveryPostCodeDetail().sendKeys("69120");
		p.ButtonInfoEmisorDetail().click();
		p.GNLEmisorCfdi().sendKeys("7504000107903");
		p.SelectTipoEmisorCfdiDetail().click();
		p.IdentifTributariaCfdiDetail().click();
		p.IDEmisor().sendKeys("ID234");
		p.NombreEmisor().sendKeys("Guzman");
		p.DomicilioEmisor().sendKeys("OAX");
		p.CidadEmisor().sendKeys("OAX");
		p.CodigoPostalEmisor().sendKeys("69104");
		p.ButtonInfoAduanaDetail().click();
		Thread.sleep(1000);
		p.GNLAduana().sendKeys("7504000107903");
		p.ButtonInfoDeMonedaDetail().click();
		p.SelectTipoDeMonedaDetallista().click();
		p.PesoMexicanoDetail().click();
		p.FunccionMonedaDetail().sendKeys("PAYMENT");
		p.FunccionMonedaDetail().sendKeys(Keys.ENTER);
		p.ButtonInfoTerminosDePago().click();
		p.SelectRefTiempoDePago().click();
		p.DateOfInvoice().click();
		p.SelectTerminoRelacPago().click();
		p.ReferenceAfterRelaPago().click();
		p.SelectCondicionPago().sendKeys("END_OF_MONTH");
		p.SelectCondicionPago().sendKeys(Keys.ENTER);
		p.SelectCalifPercentage().click();
		p.AllowanceByPaymentOnTime().click();
		p.Percentage().sendKeys("30");
		p.ButtonInfoDescuentoGlobalCargoDetail().click();
		p.SelectIndCargoDescuento().click();
		p.AllowanceGlobal().click();
		p.SelectImpDescuento().click();
		p.Reclamacion().click();
		p.SelectTipoDeDescuento().sendKeys("AA");
		p.SelectTipoDeDescuento().sendKeys(Keys.ENTER);
		p.PercentageGlobal().sendKeys("25");
		p.ButtonConseptDetallista().click();
		
		p.NumeroSeqConsDetail().sendKeys("1234");
		p.CodigoEANConseptDetail().sendKeys("999999");
		p.SelectTipoIdAdicional().click();
		p.BuyerAsigned().click();
		p.DescriptConsptDetail().sendKeys("Detallista");
		p.SelectLanguage().click();
		p.Ingles().click();
		p.CantidadConseptDetail().sendKeys("100");
		p.MedidaConseptDetail().sendKeys("4x6x8");
		p.CantidadAdicioConsDetail().sendKeys("8");
		Thread.sleep(2000);
		p.SelectCodigTipoDeCantidad().click();
		p.NumeroUnidadConsept().click();
		p.ImporteNeto().sendKeys("12345");
		p.SelectTipoDeRef().click();
		p.NumeroDeOrdenComprobante().click();
		p.PedimentoConseptDetail().sendKeys("8005488");
		p.DateConseptDetail().sendKeys("03-12-2018");
		p.NameConseptDetail().sendKeys("Patricio");
		p.Identificador().sendKeys("12345");
		p.SelectCodigNumID().click();
		p.BJCodigoSeriado().click();
		p.NumeroDPaquetes().sendKeys("46");
		p.DescripcionEmpaq().sendKeys("Bolsas");
		p.SelectTipoDeEmpaq().sendKeys("PALLET");
		p.SelectTipoDeEmpaq().sendKeys(Keys.ENTER);
		p.SelectMethPg().click();
		p.Prepaid().click();
		p.NumeroDeLote().sendKeys("1234");
		p.FechaDeProduccion().sendKeys("03-09-2016");
		p.SelectIndicDeCargoOProduccion().click();
		p.Descuento().click();
		p.SelectImpuestoDelDescOCargo().sendKeys("fuera de factura");
		p.SelectImpuestoDelDescOCargo().sendKeys(Keys.ENTER);
		p.SelectTipoDeDescCargo().sendKeys("AA");
		p.SelectTipoDeDescCargo().sendKeys(Keys.ENTER);
		p.PercentageCargo().sendKeys("30");
		p.SelectTipoDeArancelImpuesto().sendKeys("GST");
		p.SelectTipoDeArancelImpuesto().sendKeys(Keys.ENTER);
		p.NumeroRef().sendKeys("12345");
		p.Percent().sendKeys("25");
		p.Monto().sendKeys("80");
		p.SelectIdentImpuestRet().click();
		p.ImpuestoRetenido().click();
		p.MontoTotalLineasArtesDetail().click();
		p.MontoLineasArt().sendKeys("120");
		p.ButtonInfMontoTotalDCargoODescDetail().click();
		p.SelectCargosDesConsol().click();
		p.AllowanceMontoTotal().click();
		Thread.sleep(3000);
		p.SelectTipoDeDescuento().sendKeys("AA");
		p.SelectTipoDeDescuento().sendKeys(Keys.ENTER);
		p.ButtonInfAdicionalDetail().click();
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
		p.ButtonCfdiRelacionDetail().click();
		Thread.sleep(1000);
		c.SelectTipoDRelacionado().sendKeys("02");
		c.SelectTipoDRelacionado().sendKeys(Keys.ENTER);
		c.AgregarRelacionado().click();
		c.FolioFiscalRelacionado().sendKeys("560a8451-a29c-41d4-a716-544676554400");
		c.AddRelacionado().click();
		
	    ch.EmitirFactura().click();
	    Thread.sleep(6000);
		ld.SignOut().click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		ld.CloseBotton().click();
		
	    }
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}
	
	}
 


