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

public class CartaPorteComercioExteriorDetailTest extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void cartaPorteComercioExteriorDetail() throws IOException, InterruptedException {
		 
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
		//Thread.sleep(1000);
		FacturaPage fact = new FacturaPage(driver);
		fact.CartaPorteTranslado().click();
		fact.CartaPorteComercioExterior().click();
		//Thread.sleep(1000);
		CommonInfo n = new CommonInfo(driver);
		SearchPage ps = new SearchPage(driver);
		CommonLocal l = new CommonLocal(driver);
		CommonPage c = new CommonPage(driver);
		ps.BasicaSelectFiscal().sendKeys("612");
		ps.BasicaSelectFiscal().sendKeys(Keys.ENTER);
		ps.RFC().sendKeys("XEXX010101000");
		ps.RazonSocialExt().sendKeys("Generico");
		//Thread.sleep(1000);
		ps.CFDIComercioExt().click();
		//Thread.sleep(1000);
		ps.SelectPaisComercioExterior().sendKeys("USA");
		ps.SelectPaisComercioExterior().sendKeys(Keys.ENTER);
		ps.NumeroComercioExt().sendKeys("889010357");
		//Thread.sleep(2000);
		ps.CurrencyComercioExt().sendKeys("USD");
		ps.CurrencyComercioExt().sendKeys(Keys.ENTER);
		ps.TipoDeCambioExt().sendKeys("18.84");
		
		
        ps.AgregarConsept().click();
        ps.ClaveDelProducto().sendKeys("10101500");
        ps.NumIDComercioExt().sendKeys("C8");
        ps.CantidadConsept().sendKeys("1200");
        ps.ClaveDeUnidad().sendKeys("C81");
        ps.DescripticionConsept().sendKeys("Prueba");
        ps.ValorUnitarioConsept().sendKeys("1.75");
        
        ps.AddConsept().click();
        n.ButtonSelectMotivoTranslado().sendKeys("01");
        n.ButtonSelectMotivoTranslado().sendKeys(Keys.ENTER);
        ps.OperaComerExt().click();
       // Thread.sleep(1000);
        ps.ExportOperation().click();
        ps.ClaveDePedimentoComerc().click();
        //Thread.sleep(1000);
        ps.ImportDefPedimentoComer().click();
        ps.CertifOrigExport().click();
        //Thread.sleep(1000);
        ps.NonCertiExpo().click();
        //Thread.sleep(2000);
        ps.ClaveIncoTermExport().sendKeys("CFR");
        ps.ClaveIncoTermExport().sendKeys(Keys.ENTER);
        ps.SubdivisionFacturaExp().click();
        //Thread.sleep(1000);
        ps.NonSubdFactExport().click();
        ps.EquiValentExport().sendKeys("20000");
        ps.AgregarMercancia().click();
        //Thread.sleep(4000);
        ps.MercanciaIDNumb().sendKeys("C8");
        ps.MercanciaIDNumb().sendKeys(Keys.ENTER);
        ps.ClaveFraccionAncel().sendKeys("94059102");
        ps.CantidadBienesAduana().sendKeys("1200");
        ps.ClaveUnidadMerca().sendKeys("01");
        ps.ClaveUnidadMerca().sendKeys(Keys.ENTER);
        //ps.CurrencyMercancia().sendKeys("1000");
        ps.PrecoUnitarioExterior().sendKeys("1.75");
        ps.MercanciaIDNumb().sendKeys(Keys.ENTER);
        ps.MercanciaDescript().sendKeys("PAVO");
        ps.AddDescriptMercancia().click();
        ps.AddMercancia().click();
        //Thread.sleep(1000);
        WebElement Emissor = driver.findElement(By.xpath("//input[@id='show-ce_emitter']"));
	    JavascriptExecutor jsi = (JavascriptExecutor)driver;
	    jsi.executeScript("arguments[0].click();",Emissor);
        
        n.CurpComercioExt().sendKeys("PACG810404HYNTHR04");
        n.PaisEmisor().sendKeys("MEX");
        n.PaisEmisor().sendKeys(Keys.ENTER);
        n.SelectClaveEstadoEmisor().sendKeys("VER");
        n.SelectClaveEstadoEmisor().sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("document.getElementById('receipt_external_commerce_ce_municipio').value='061';");
        n.CodiPEmisor().sendKeys("96980");
        n.LocalidadEmisor().sendKeys("Las Choapas");
        n.ColoniaEmisor().sendKeys("Campo Nuevo");
        n.NumeroExtEmisor().sendKeys("12345");
        n.NumeroIntEmisor().sendKeys("12345");
        n.ReferenciaEmisor().sendKeys("abcdf");
        n.CalleEmisor().sendKeys("OK");
        /*
        Thread.sleep(2000);
        n.ButtonDestinaComeTransl().click();
        n.AddDestinatario().click();
        Thread.sleep(2000);
        n.SelectPaisDestinatario().sendKeys("MEX");
        n.SelectPaisDestinatario().sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        n.EstadoDestinatario().click();
        Thread.sleep(2000);
        n.EstadoDestinatario().sendKeys("NLE");
        n.EstadoDestinatario().sendKeys(Keys.ENTER);
        n.CodigoPostDestinatario().sendKeys("66120");
        n.CalleDestinatario().sendKeys("Monte Mayor");
        n.AgregarDestinatario().click();
        n.AddDestiny().click();
        */
        
       // Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("/html/body/section/section/div/form/div[5]/div[2]/div[5]/div/label"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",element);
        
        n.SelectPaisReceptor().sendKeys("CAN");
        //Thread.sleep(2000);
        n.EstadoReceptor().sendKeys("ON");
        n.EstadoReceptor().sendKeys(Keys.ENTER);
        n.MunicipioReceptor().sendKeys("ON");
        n.SelectPaisReceptor().sendKeys(Keys.ENTER);
        n.CodigoPostReceptor().sendKeys("A9B 7D3");
        n.CalleReceptor().sendKeys("ok");
        /*
        n.ButtonInfoAdendaTranslado().click();
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
		*/
		//n.ButtonCompRelaTranslado().click();
        WebElement Relacionado = driver.findElement(By.xpath("//label[@for='show-related-cfdi']"));
		JavascriptExecutor je = (JavascriptExecutor)driver;
	    je.executeScript("arguments[0].click();", Relacionado);
		c.SelectTipoDRelacionado().sendKeys("02");
		c.SelectTipoDRelacionado().sendKeys(Keys.ENTER);
		c.AgregarRelacionado().click();
		c.FolioFiscalRelacionado().sendKeys("560a8451-a29c-41d4-a716-544676554400");
		
		c.AddRelacionado().click();
         
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
 


