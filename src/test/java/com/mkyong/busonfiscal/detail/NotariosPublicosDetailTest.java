package com.mkyong.busonfiscal.detail;

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
import pageObjects.busonfiscal.CommonInfo;
import pageObjects.busonfiscal.CommonLocal;
import resources.base;

public class NotariosPublicosDetailTest extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void notariosPublicosDetail() throws IOException, InterruptedException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		boolean isDisplayed = driver.findElement(By.xpath("//div[contains(text(),'KARLA FUENTE ')]")).isDisplayed();
		if(isDisplayed==true) {
			System.out.println("Contninue the operation");
		}else {
			//Thread.sleep(2000);
			LandingPage g = new LandingPage(driver);
			//Thread.sleep(2000);
			g.MenuButton().click();
			g.ButtonFunk().click();
			
		}
		ld.SideBar().click();
		ld.ingCrearCopr().click();
		//Thread.sleep(2000);
		ld.ingFactura().click();
		//Thread.sleep(1000);
		FacturaPage fact = new FacturaPage(driver);
		fact.FacturaNotarioPublico().click();
		//Thread.sleep(1000);
		SearchPage ps = new SearchPage(driver);
		ps.BasicaSelectFiscal().sendKeys("612");
		ps.BasicaSelectFiscal().sendKeys(Keys.ENTER);
		ps.RFC().sendKeys("XAXX010101000");
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
        CommonInfo n = new CommonInfo(driver);
        CommonPage c = new CommonPage(driver);
		n.ButtonRetNotarioPublico().click();
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
		c.TasaOcutaRetenido().sendKeys("0.160000");
		n.AddRetenNotario().click();
		//Thread.sleep(1000);
		n.ButtonTransladoNotarioPublico().click();
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
		c.TasaOcuTaTranslado().sendKeys("0.160000");
		n.AddTransNotario().click();
		//Thread.sleep(1000);
		n.ButtonPedimentoNotarioPublico().click();
		//Thread.sleep(1000);
		c.AnoValidacionPedimento().sendKeys("18");
		c.AduanaPedimento().sendKeys("24");
		c.PatentePedimento().sendKeys("1487");
		c.ProgressionPedimento().sendKeys("8022338");
		n.AddNumPedNotario().click();
		//Thread.sleep(1000);
		n.ButtonPartsComprNotarioPublico().click();
		c.ClaveDelProductCompr().sendKeys("10101507");
		c.CantidadComponente().sendKeys("999999");
		c.DescriptComponente().sendKeys("Ovejas");
		n.AddPartOCompNotario().click();
		//Thread.sleep(2000);
		n.ButtonInfAduaneraNotario().click();
		c.AnoAduanera().sendKeys("18");
		c.AduanaDespacho().sendKeys("24");
		c.NumeroAduanaPatente().sendKeys("1487");
		c.AnoProgressAduana().sendKeys("8015956");
		//Thread.sleep(1000);
		n.ButtonInfAdNotario().click();
		c.DescriptInformacion().sendKeys("Great");
		c.RefAdicInfo().sendKeys("abcdef");
		//Thread.sleep(1000);
		n.ButtonDatosPersonNotario().click();
		c.ExtraDatoNombre().sendKeys("Caducidad");
		c.ExtraValorDato().sendKeys("31-Diciembre-2019");
        
        ps.AddConsept().click();
        ps.NumeroInstNotarial().sendKeys("99999");
        ps.DateNotarial().sendKeys("20-08-2018");
        ps.MontoInstNotarial().sendKeys("8000");
        ps.IvaInstNotarial().sendKeys("80");
        ps.SubTotalInstNotarial().sendKeys("4800");
        ps.CurpInstNotarial().sendKeys("PACG810404HYNTHR04");
        ps.NumeroDelNotario().sendKeys("999");
        ps.EntidadNotarial().sendKeys("01");
        ps.EntidadNotarial().sendKeys(Keys.ENTER);
        ps.IMUEBLENotarial().sendKeys("01");
        ps.IMUEBLENotarial().sendKeys(Keys.ENTER);
        ps.CalleNotarial().sendKeys("Barragan");
        ps.MunicipioNotarial().sendKeys("San Nicolas");
        ps.EstadoNotarial().sendKeys("19");
        ps.EstadoNotarial().sendKeys(Keys.ENTER);
        //Thread.sleep(3000);
        ps.PaisNotarial().sendKeys("MEX");
        ps.PaisNotarial().sendKeys(Keys.ENTER);
        ps.CodigoPostalNotarial().sendKeys("66457");
        ps.NombreNotarial().sendKeys("Zeferino");
        ps.ApellidoPaternoNotarial().sendKeys("Tiburcio");
        ps.RFCNotarial().sendKeys("AAA010101AAA");
        ps.CurpEnajNotarial().sendKeys("PACG810404HYNTHR04");
        ps.NombreAdquiNotarial().sendKeys("Miguel Delgado");
        ps.RFCAdquiNotarial().sendKeys("AAA010101AAA");
        //Thread.sleep(1000);
        WebElement AdendaEle = driver.findElement(By.xpath("//input[@id='show-adenda-diverza']"));
		JavascriptExecutor jsi = (JavascriptExecutor)driver;
		jsi.executeScript("arguments[0].click();",AdendaEle);
       //n.ButtonAdendaInfoAdic().click();
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
		//n.ButtonCompRelaNOTARIO().click();
		WebElement Relacionado = driver.findElement(By.xpath("//label[@for='show-related-cfdi']"));
		JavascriptExecutor j = (JavascriptExecutor)driver;
	    j.executeScript("arguments[0].click();", Relacionado);
		c.SelectTipoDRelacionado().sendKeys("02");
		c.SelectTipoDRelacionado().sendKeys(Keys.ENTER);
		c.AgregarRelacionado().click();
		c.FolioFiscalRelacionado().sendKeys("560a8451-a29c-41d4-a716-544676554400");
		c.AddRelacionado().click();
        //Thread.sleep(2000);
        
        ps.EmitirFactura().click();
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
 


