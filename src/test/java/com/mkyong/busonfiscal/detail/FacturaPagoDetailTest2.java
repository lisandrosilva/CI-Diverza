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
import resources.base;

public class FacturaPagoDetailTest2 extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void facturaDetallistaDetail2() throws IOException, InterruptedException {
		 
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
		ld.ingPagos().click();
		SearchPage s = new SearchPage(driver);
		s.BasicaSelectFiscal().sendKeys("612");
		s.BasicaSelectFiscal().sendKeys(Keys.ENTER);
		s.RFC().sendKeys("AAA010101AAA");
		for(int i=0; i<3; i++) {
		s.AgregarCompPago().click();
		s.FechaDePago().sendKeys("27-01-2020");
		s.FormaPagoP().sendKeys("01");
		s.FormaPagoP().sendKeys(Keys.ENTER);
		//s.TipoDeCambioPago().sendKeys("1");
		s.MontoDePago().sendKeys("3000");
		//Thread.sleep(3000);
		s.TaggleSwitchPago().click();
		s.DocRelacPago().sendKeys("234546d0-5a38-4431-8edb-0f331c10a6d5");
		//s.CambioPago().sendKeys("1");
		s.MethodPagoPago().click();
		s.PPDPago().click();
		s.FolioPago().sendKeys("676");
		s.NumeroDeParcialidad().sendKeys("1");
		s.ImpSaldoAntePago().sendKeys("2700.00");
		s.ImportePago().sendKeys("1700.00");
		s.ImporteSaldoInsolutPago().sendKeys("1000");
		s.AgregarComprDePago().click();
		s.AddPagoComplement().click();
		}
		CommonInfo n = new CommonInfo(driver);
		CommonPage c = new CommonPage(driver);
		WebElement AdendaEle = driver.findElement(By.xpath("//input[@id='show-adenda-diverza']"));
	    JavascriptExecutor jsi = (JavascriptExecutor)driver;
	    jsi.executeScript("arguments[0].click();",AdendaEle);
		//n.ButtonInfoAdendaPago().click();
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
		WebElement ComprobanteRelacionado = driver.findElement(By.xpath("//input[@id='show-related-cfdi']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();",ComprobanteRelacionado);
		//n.ButtonComprRelaPago().click();
		//Thread.sleep(1000);
		c.SelectTipoDRelacionado().sendKeys("04");
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
 


