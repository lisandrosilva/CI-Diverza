package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacturaPage {
	
	public WebDriver driver;
	
        By Facturabasica= By.cssSelector("[href*='/receipts/i/new']");
        
        By FacturaDetallista = By.xpath("//*[@id=\"new_receipt_list\"]/li[5]/div/a");
        
        By FacturaImpuestos = By.xpath("//*[@id=\"new_receipt_list\"]/li[6]/div/a");
        
        By FacturaInstituiciones = By.xpath("//*[@id=\"new_receipt_list\"]/li[7]/div/a");
        
        By FacturaDonativos = By.xpath("//*[@id=\"new_receipt_list\"]/li[8]/div/a");
        
        By FacturaINE = By.cssSelector("[href*='/receipts/i/ine/new']");
        
        By FacturaVehiculos =By.xpath("//*[@id=\"new_receipt_list\"]/li[10]/div/a");
        
        By FacturaVehiculoUsado = By.xpath("//*[@id=\"new_receipt_list\"]/li[11]/div/a");
        
        By FacturaNotarioPublico = By.xpath("//*[@id=\"new_receipt_list\"]/li[12]/div/a");
        
        By FacturaServiciosParcealesConstrucion = By.xpath("//*[@id=\"new_receipt_list\"]/li[13]/div/a");
        
        By FacturaComercioExterior = By.xpath("//*[@id=\"new_receipt_list\"]/li[14]/div/a");
        
        By FacturaObrasArtes = By.xpath("//*[@id=\"new_receipt_list\"]/li[16]/div/a");
        
        By FacturaPagoEspecies = By.xpath("//*[@id=\"new_receipt_list\"]/li[17]/div/a");
        
        By FacturaPersonasFisicas = By.xpath("//*[@id=\"new_receipt_list\"]/li[18]/div/a");
        
        By FacturaTuristaPassagero = By.xpath("//*[@id=\"new_receipt_list\"]/li[19]/div/a");
        
        By FacturaLeyendasFiscales = By.xpath("//*[@id=\"new_receipt_list\"]/li[20]/div/a");
        
        By CartaPorteTranslado = By.cssSelector("[href='/receipts/t/new']");
        
        By CartaPorteComercioExterior = By.cssSelector("[href='/receipts/t/ce/new']");
        
        
        
        
        public WebElement CartaPorteComercioExterior() {
        	return driver.findElement(CartaPorteComercioExterior);
        }
        public WebElement CartaPorteTranslado() {
        	return driver.findElement(CartaPorteTranslado);
        }
       
        public FacturaPage(WebDriver driver2) {
			
        	this.driver= driver2;
		}

		public WebElement Facturabasica()
		{
			return driver.findElement(Facturabasica);
			 
          
		
		}
		public WebElement FacturaDetallista()
		{
			return driver.findElement(FacturaDetallista);
		}
		public WebElement FacturaImpuestos()
		{
			return driver.findElement(FacturaImpuestos);
		}	 
		public WebElement FacturaInstituiciones()
		{
			return driver.findElement(FacturaInstituiciones);
		}	 
		public WebElement FacturaDonactivos()
		{
			return driver.findElement(FacturaDonativos);
		}	
		public WebElement FacturaINE() {
			return driver.findElement(FacturaINE);
		}
	
        public WebElement FacturaVehiculos() {
	           return driver.findElement(FacturaVehiculos);
        }
        public WebElement FacturaVehiculoUsado() {
	           return driver.findElement(FacturaVehiculoUsado);
        }
        public WebElement FacturaNotarioPublico() {
	           return driver.findElement(FacturaNotarioPublico);
        }
        public WebElement FacturaServiciosConstrucion() {
	           return driver.findElement(FacturaServiciosParcealesConstrucion);
        }
        public WebElement FacturaComercioExterior() {
	           return driver.findElement(FacturaComercioExterior);
        }
        public WebElement FacturaObrasArtes() {
	           return driver.findElement(FacturaObrasArtes);
	           
        }
        public WebElement FacturaPagosEspecies() {
	           return driver.findElement(FacturaPagoEspecies);
	           
       }
        public WebElement FacturaPersonasFisicas() {
	           return driver.findElement(FacturaPersonasFisicas);
	           
       }
        public WebElement FacturaTuristaPassagero() {
	           return driver.findElement(FacturaTuristaPassagero);
	           
      }
        public WebElement FacturaLeyendasFiscales() {
	           return driver.findElement(FacturaLeyendasFiscales);
	           
   }
		
}
