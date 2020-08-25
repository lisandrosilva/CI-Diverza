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

public class PagoEnEspeciesJesDetailTest extends base{
	public WebDriver driver;
	 @BeforeTest
	 public void initiaLiseBrowser() throws IOException {
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		 
		 
	 }
	@Test 
	public void pagosEnEspeciesDetailJes() throws IOException, InterruptedException {
		 
		       LandingPageBuson ld = new LandingPageBuson(driver);
		
		
		ld.ingPortal().sendKeys("lisandro.silva");
		ld.ingPortal1().sendKeys("Diverza1*");
		ld.ingPortal11().click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		boolean isDisplayed = driver.findElement(By.xpath("//div[contains(text(),'JIMENEZ ESTRADA SALAS A A')]")).isDisplayed();
		if(isDisplayed==true) {
			ld.ServiciosMenu().click();
			//Thread.sleep(1000);
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
		fact.FacturaPagosEspecies().click();
		//Thread.sleep(1000);
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
        //Thread.sleep(1000);
        ps.MethodPago1Exhibicion().click();
        ps.AgregarConsept().click();
        ps.ClaveDelProducto().sendKeys("10215612");
        ps.CantidadConsept().sendKeys("80");
        ps.ClaveDeUnidad().sendKeys("H87");
        ps.DescripticionConsept().sendKeys("Factura");
        ps.ValorUnitarioConsept().sendKeys("75");
        CommonLocal l = new CommonLocal(driver);
        CommonPage c = new CommonPage(driver);
        CommonInfo n = new CommonInfo(driver);
        n.ButtonRetenidoEspec().click();
        l.SelectLocalTaxes().click();
		l.IVALocalTaxes().click();
		//Thread.sleep(1000);
		l.SelectFactorTaxes().click();
		l.TasaF().click();
		l.CuotaOtasaLocal().sendKeys("0.8");
        n.AddRetendidoG().click();
        //Thread.sleep(1000);
        n.ButtonTransEspec().click();
        l.SelectLocalTransf().click();
		//Thread.sleep(1000);
		l.IvaTransfer().click();
		//Thread.sleep(1000);
		l.SelectTransfertype().click();
		//Thread.sleep(1000);
		l.TasaTransf().click();
		l.TasaCuotaTransf().sendKeys("0.8");
        n.AddTransladoG().click();
        //Thread.sleep(1000);
        n.ButtonNumePediEspec().click();
        l.ValidYearLocalPed().sendKeys("18");
      	l.AduanaDespLocalPed().sendKeys("24");
      	l.PatentNumLocalPed().sendKeys("1487");
      	l.YearPlusProgr().sendKeys("8015991");
        n.AddNumeroPedG().click();
        //Thread.sleep(1000);
        n.ButtonDatsPartsOcomEspc().click();
        l.ClaveProdLocal().sendKeys("10101512");
		l.CantidadLocal().sendKeys("446817");
		l.DescriptLocal().sendKeys("Conejos");
        l.AgregarParteAsist().click();
        //Thread.sleep(1000);
        n.ButtonInfoAduaneraPartsEspc().click();
        l.AnoValidAduanera().sendKeys("18");
		l.AduanaDespacho().sendKeys("24");
		l.NumeroPatente().sendKeys("1487");
		l.AnoNumProg().sendKeys("8016004");
        //Thread.sleep(1000);
		
        n.ButtonInfoAdicionalEspc().click();
        l.DescriptOtroIdioma().sendKeys("Inglish");
		l.AdicRefByConsept().sendKeys("abcdg");
		l.AgregarInfoAduanaAsist().click();
        //Thread.sleep(1000);
        n.ButtonDatosPersEspec().click();
        l.ExtraAtribDatoPers().sendKeys("Cantidad");
		l.ValorExtraDatoPers().sendKeys("999999");
		l.AgregarDatosPersAsist().click();
        ps.AddConsept().click();
        
        //Thread.sleep(2000);
        ps.ClaveDeInscrEspec().sendKeys("A&C8317286A1-18000101-020");
        ps.FolioNumberEspec().sendKeys("PE-12-12345");
        ps.NamePieceEspecie().sendKeys("Mozart");
        ps.TechProdEspecie().sendKeys("1");
        ps.AnoDeProdPiezaEspec().sendKeys("1967");
        ps.DimensPiezaEspec().sendKeys("10x12x8");
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
 


