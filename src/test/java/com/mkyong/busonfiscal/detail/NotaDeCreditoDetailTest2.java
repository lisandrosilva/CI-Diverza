package com.mkyong.busonfiscal.detail;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

import java.io.IOException;
import java.util.List;
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
import resources.base;

public class NotaDeCreditoDetailTest2 extends base{
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void notaDeCreditoDetail2() throws IOException, InterruptedException {
		 
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
		//Thread.sleep(2000);
		ld.ingCrearCopr().click();
		//Thread.sleep(2000);
		ld.ingNotadeCredito().click();
		SearchPage s = new SearchPage(driver);
		s.BasicaSelectFiscal().sendKeys("612");
		s.BasicaSelectFiscal().sendKeys(Keys.ENTER);
		s.RFC().sendKeys("FUNK671228PH6");
		s.SelectCFDI().sendKeys("G03");
		s.SelectCFDI().sendKeys(Keys.ENTER);
		s.formaPago().sendKeys("1");
		//Thread.sleep(1000);
		s.SelectformaPago1().sendKeys("01");
		s.SelectformaPago1().sendKeys(Keys.ENTER);
		//Thread.sleep(1000);
		s.SelectMethodPago().click();
		//Thread.sleep(1000);
		s.MethodPago1Exhibicion().click();
		CommonInfo n = new CommonInfo(driver);
		CommonPage c = new CommonPage(driver);
		for(int i=0; i<3; i++) {
		s.AgregarConsept().click();
		s.ClaveDelProducto().sendKeys("10215612");
		s.CantidadConsept().sendKeys("12");
		s.ClaveDeUnidad().sendKeys("H87");
		s.DescripticionConsept().sendKeys("Factura");
		s.ValorUnitarioConsept().sendKeys("80");
		//Thread.sleep(1000);

		n.ButtonRetNotaDeCredito().click();
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
		n.RetenidoAsist().click();
		//Thread.sleep(1000);
		n.ButtonTransNotaDeCredito().click();
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
		n.AgregarTransAsist().click();
		//Thread.sleep(1000);
		n.ButtonNumPediNotaDeCredito().click();
		c.AnoValidacionPedimento().sendKeys("18");
		c.AduanaPedimento().sendKeys("24");
		c.PatentePedimento().sendKeys("1487");
		c.ProgressionPedimento().sendKeys("8022338");
		n.AgregarPedAsist().click();
		//Thread.sleep(1000);
		n.ButtonDatosPartsOCompNotaDeCredito().click();
		c.ClaveDelProductCompr().sendKeys("10101507");
		c.CantidadComponente().sendKeys("999999");
		c.DescriptComponente().sendKeys("Ovejas");
		
		//Thread.sleep(1000);
		n.ButtonPartsInfoAduanaNotaDeCredito().click();
		c.AnoAduanera().sendKeys("18");
		c.AduanaDespacho().sendKeys("24");
		c.NumeroAduanaPatente().sendKeys("1487");
		c.AnoProgressAduana().sendKeys("8015956");
		n.AgregarInfoAduanaAsist().click();
		//Thread.sleep(1000);
		n.ButtonInfoAdicNotaDeCredito().click();
		c.DescriptInformacion().sendKeys("Great");
		c.RefAdicInfo().sendKeys("abcdef");
		n.AgregarInfoAdicAsist().click();
		//Thread.sleep(1000);
		n.ButtonDatosPersoNotaDeCredito().click();
		c.ExtraDatoNombre().sendKeys("Caducidad");
		c.ExtraValorDato().sendKeys("31-Diciembre-2019");
		n.AgregarDatosPersAsist().click();
		s.AddConsept().click();
		}
		//Thread.sleep(1000);
		WebElement AdendaEle = driver.findElement(By.xpath("//input[@id='show-adenda-diverza']"));
		JavascriptExecutor jsi = (JavascriptExecutor)driver;
		jsi.executeScript("arguments[0].click();",AdendaEle);
		//n.ButtonInfAdendaNotaDeCrdito().click();
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
		//n.ButtonComprRelacNotaDeCredito().click();
		WebElement Relacionado = driver.findElement(By.xpath("//label[@for='show-related-cfdi']"));
		JavascriptExecutor j = (JavascriptExecutor)driver;
	    j.executeScript("arguments[0].click();", Relacionado);
		c.SelectTipoDRelacionado().sendKeys("02");
		c.SelectTipoDRelacionado().sendKeys(Keys.ENTER);
		c.AgregarRelacionado().click();
		c.FolioFiscalRelacionado().sendKeys("560a8451-a29c-41d4-a716-544676554400");
		c.AddRelacionado().click();
		//Thread.sleep(1000);
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
 


